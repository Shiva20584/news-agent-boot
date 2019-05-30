package com.abc.news.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.abc.news.entities.NewsEntity;

public interface NewsRepository extends CrudRepository<NewsEntity, Long> {
	
	public List<NewsEntity> findByCreatorName(String creatorName); 
	
	public List<NewsEntity> findByCreatorNameAndTitle(String creator, String title);
}
