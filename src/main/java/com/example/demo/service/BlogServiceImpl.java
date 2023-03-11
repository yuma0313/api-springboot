package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Blog;
import com.example.demo.repository.BlogRepository;

@Service
public class BlogServiceImpl implements BlogService {
	@Autowired
	private BlogRepository blogRepo;
	
	@Override
	public Blog createBlog(Blog blog) {
		blog.setId(blog.getId());
		blog.setTitle(blog.getTitle());
		blog.setDetail(blog.getDetail());
		blog.setCreated_at(blog.getCreated_at());
		blog.setUpdated_at(blog.getUpdated_at());
		
		blogRepo.save(blog);
		
		return blog;
	}

	@Override
	public Blog updateBlog(Blog blog, Integer id) {
		blog.setId(id);
		blog.setTitle(blog.getTitle());
		blog.setDetail(blog.getDetail());
		blog.setCreated_at(blog.getCreated_at());
		blog.setUpdated_at(blog.getUpdated_at());
		
		blogRepo.save(blog);
		
		return blog;
	}

}
