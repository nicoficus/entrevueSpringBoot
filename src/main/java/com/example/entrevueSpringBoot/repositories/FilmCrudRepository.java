package com.example.entrevueSpringBoot.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.entrevueSpringBoot.models.Film;

@Repository
public interface FilmCrudRepository extends CrudRepository<Film, Long>
{

}
