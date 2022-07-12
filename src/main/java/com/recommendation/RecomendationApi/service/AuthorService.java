package com.recommendation.RecomendationApi.service;


import java.util.List;

import com.recommendation.RecomendationApi.model.Author;

public interface AuthorService {

	Author addAuthor(Author author);
	
	List<Author> getAllAuthors();

}
