package com.example.entrevueSpringBoot.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@EqualsAndHashCode(of = { "id" })
@NoArgsConstructor
public class ActeurDto
{

	private Long id;

	private String nom;

	private String prenom;

}
