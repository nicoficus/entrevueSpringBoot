package com.example.entrevueSpringBoot.dtos;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@EqualsAndHashCode(of = { "id" })
@NoArgsConstructor
public class FilmDto
{

	private Long id;

	private String titre;

	private String description;

	private List<ActeurDto> acteurs;
	
}
