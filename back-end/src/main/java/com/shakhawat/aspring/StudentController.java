package com.shakhawat.aspring;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@GetMapping("/")
	public String welcome() {
		return "Welcome to Spring Boot";
	}
	
	@CrossOrigin("http://localhost:4200")
	@GetMapping("/getStudentList")
	public List<Student> getStudentList(){
		
		Student[] data = {new Student("101", "Shakhawat Mollah", "25", "Male", "Narayangong", "A"), 
				new Student("102", "Ahsan Habib", "24", "Male", "Dhaka", "A+"),
				new Student("103", "Habib Khan", "26", "Male", "Sylhet", "B"),
				new Student("104", "Tawfiq Hasan", "25", "Male", "Gazipur", "A")};
		
		return Stream.of(data).collect(Collectors.toList());
	}

}
