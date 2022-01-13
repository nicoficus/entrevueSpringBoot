package com.example.entrevueSpringBoot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entrevueSpringBoot.dtos.FilmDto;
import com.example.entrevueSpringBoot.exceptions.FilmNotFoundException;
import com.example.entrevueSpringBoot.services.FilmService;

@RestController
@RequestMapping(value = "/api/film")
public class FilmRestController
{

	@Autowired
	private FilmService filmService;

	@GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<FilmDto> getFilmById(@PathVariable final Long id)
	{
		return ResponseEntity.status(HttpStatus.OK).body(filmService.getFilmById(id));
	}

	@PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<FilmDto> createFilm(@RequestBody final FilmDto filmDto)
	{
		return ResponseEntity.status(HttpStatus.CREATED).body(filmService.createFilm(filmDto));
	}

	@ExceptionHandler(value = FilmNotFoundException.class)
	public ResponseEntity<String> handleBlogAlreadyExistsException(final FilmNotFoundException filmNotFoundException)
	{
		return new ResponseEntity<String>(filmNotFoundException.getMessage(), HttpStatus.NOT_FOUND);
	}

}
