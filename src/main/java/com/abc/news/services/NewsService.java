package com.abc.news.services;

import org.springframework.stereotype.Service;

import com.abc.news.dtos.NewsDto;

@Service
public class NewsService {

	public void saveNews(NewsDto news) {
		System.out.println(news.toString());
	}
}
