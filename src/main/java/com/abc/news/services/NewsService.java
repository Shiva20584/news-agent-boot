package com.abc.news.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.abc.news.dtos.NewsDto;
import com.abc.news.entities.NewsEntity;
import com.abc.news.repositories.NewsRepository;

@Service
public class NewsService {

	@Autowired
	private NewsRepository newsRepository;
	
	public void saveNews(NewsDto newsDto) {
		NewsEntity news = new NewsEntity();
		news.setTitle(newsDto.getHeading());
		news.setContent(newsDto.getBody());
		news.setCreatorName(newsDto.getPublisher());
		news.setTags(newsDto.getTags());
		
		newsRepository.save(news);
	}
	
	public List<NewsDto> getNewsByCreator(String creator){
		List<NewsEntity> news = newsRepository.findByCreatorName(creator);
		List<NewsDto> newsDtoList = new ArrayList<NewsDto>();
		if(!CollectionUtils.isEmpty(news)) {
			for(NewsEntity ne : news) {
				NewsDto newsDto = new NewsDto();
				newsDto.setBody(ne.getContent());
				newsDto.setHeading(ne.getTitle());
				newsDto.setId(ne.getId());
				newsDto.setPublisher(ne.getCreatorName());
				newsDto.setPublishedDate(ne.getCreatedAt().toString());
				
				newsDtoList.add(newsDto);
			}
		
		}
		
		return newsDtoList;
	}
}
