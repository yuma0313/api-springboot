package com.example.demo.service;

import com.example.demo.entity.Blog;

public interface BlogService {
	Blog createBlog(Blog blog);
	
	Blog updateBlog(Blog blog, Integer id);
}
