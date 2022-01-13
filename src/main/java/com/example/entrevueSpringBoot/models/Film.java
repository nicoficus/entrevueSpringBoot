package com.example.entrevueSpringBoot.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@Entity
@EqualsAndHashCode(of = { "id" })
@NoArgsConstructor
public class Film
{
	@Id
	@GeneratedValue
	private Long id;

	@Column(nullable = false, length = 255)
	private String titre;

	@Column(length = 1000)
	private String description;

	@OneToMany(cascade = CascadeType.ALL)
	private List<Acteur> acteurs;
}
