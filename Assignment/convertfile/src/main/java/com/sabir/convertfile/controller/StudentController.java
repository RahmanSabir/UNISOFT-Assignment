package com.sabir.convertfile.controller;

import com.sabir.convertfile.model.Student;
import com.sabir.convertfile.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student/")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("create")
    public String create(Model model){


        model.addAttribute("student", new Student());

        return "student/create.html";
    }

    @PostMapping("create")
    public Student save(Student student){

        Student student1 = studentService.save(student);

        return student;
    }
}
