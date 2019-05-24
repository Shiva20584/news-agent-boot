package com.abc.news.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.abc.news.dtos.NewsDto;
import com.abc.news.services.NewsService;

@RestController
@RequestMapping("/news")
public class NewsController {

	@Autowired
	private NewsService newsService;
	
	@RequestMapping(value = "", method = RequestMethod.POST)
	public void saveNews(@RequestBody NewsDto newsDto) {
		newsService.saveNews(newsDto);
	}
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String printNews() {
		return "hello";
	}
}
