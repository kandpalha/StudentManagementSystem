package com.vsics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.vsics.entity.Student;
import com.vsics.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}
@Autowired
private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		/*Student student1=new Student("Riya","Sharma","riya@gmail.com");
		studentRepository.save(student1);
		Student student2=new Student("Seema","Awasthi","seema@gmail.com");
		studentRepository.save(student2);
		Student student3=new Student("Raj","Mishra","raj@gmail.com");
		studentRepository.save(student3);*/
	}

}
