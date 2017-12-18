package com.gundam.springboot.springbootweb;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BooksContoller {
	
	@GetMapping("/Books")
	public List<Book> retreiveAllBooks(){
		return Arrays.asList(new Book(11l,"SpringBootExpert","Srikanth"));
	}

}
