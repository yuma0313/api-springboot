package com.example.demo.app;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Blog;
import com.example.demo.repository.BlogRepository;
import com.example.demo.service.BlogService;

@RestController
@RequestMapping("/api")
public class BlogController {
	@Autowired
	private BlogService blogService;
	
	@Autowired
	private BlogRepository blogRepo;
	
	@GetMapping("/blogs")
	public List<Blog> getAllBlog() {
		List<Blog> blogList = blogRepo.findAll();
		
		return blogList;
	}
	
	@GetMapping("/blog/{id}")
	public Optional<Blog> getBlogById(@PathVariable("id") Integer id) {
		Optional<Blog> blogDetail = blogRepo.findById(id);
		
		return blogDetail;
	}
	
	@PostMapping("/create-blog")
	public Blog createBlog(@RequestBody Blog blog) {
		return blogService.createBlog(blog);
	}
	
	@PutMapping("/update-blog/{id}")
	public Blog updateBlog(@PathVariable("id") Integer id, @RequestBody Blog blog) {
		return blogService.updateBlog(blog, id);
	}
	
	@DeleteMapping("/delete-blog/{id}")
	public void deleteBlog(@PathVariable("id") Integer id) {
		blogRepo.deleteById(id);
	}
}
