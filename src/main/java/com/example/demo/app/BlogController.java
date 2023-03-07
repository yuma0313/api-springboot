package com.example.demo.app;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BlogController {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@GetMapping("/index")
	public String index(Model model) {
		String sql = "SELECT title,detail FROM blog";
		List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
		
		model.addAttribute("message", "HelloWorld!!");
		model.addAttribute("list", list);
		
		//テストテスト
		
		return "index";
	}
}
