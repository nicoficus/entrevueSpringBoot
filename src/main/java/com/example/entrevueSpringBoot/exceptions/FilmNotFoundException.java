package com.example.entrevueSpringBoot.exceptions;

/**
 * Runtime exception raised when no film was fetched from datasource with provided search criteria
 */
public class FilmNotFoundException extends RuntimeException
{

	private static final long serialVersionUID = -4258986772463164736L;

	public FilmNotFoundException(final String message)
	{
		super(message);
	}

}
