package com.recommendation.RecomendationApi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.recommendation.RecomendationApi.model.Author;
import com.recommendation.RecomendationApi.repository.AuthorRepository;

public class AuthorServiceImpl implements AuthorService{

	@Autowired
	AuthorRepository authorRepo;
	
	@Override
	public Author addAuthor(Author author) {
		// TODO Auto-generated method stub
		return authorRepo.save(author);
	}
	
	@Override
	public List<Author> getAllAuthors() {
		// TODO Auto-generated method stub
				return authorRepo.findAll();
			}
	}

