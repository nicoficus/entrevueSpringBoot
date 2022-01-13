package com.example.entrevueSpringBoot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entrevueSpringBoot.dtos.FilmDto;
import com.example.entrevueSpringBoot.exceptions.FilmNotFoundException;
import com.example.entrevueSpringBoot.mappers.FilmMapper;
import com.example.entrevueSpringBoot.models.Film;
import com.example.entrevueSpringBoot.repositories.FilmCrudRepository;

@Service
public class FilmService
{

	@Autowired
	private FilmMapper filmMapper;

	@Autowired
	private FilmCrudRepository filmRepository;

	public FilmDto getFilmById(final Long id)
	{
		// @formatter:off
		return filmMapper.toFilmDto(
			filmRepository.findById(id).orElseThrow(() -> 
				new FilmNotFoundException("No film found with [id=" + id + "]")
			)
		);
		// @formatter:on
	}

	public FilmDto createFilm(final FilmDto filmDto)
	{
		final Film film = filmMapper.fromFilmDto(filmDto);

		return filmMapper.toFilmDto(filmRepository.save(film));
	}

}
