package com.example.entrevueSpringBoot.mappers;

import org.mapstruct.Mapper;

import com.example.entrevueSpringBoot.dtos.FilmDto;
import com.example.entrevueSpringBoot.models.Film;

@Mapper(componentModel = "spring")
public interface FilmMapper
{

	Film fromFilmDto(FilmDto filmDto);

	FilmDto toFilmDto(Film film);

}
