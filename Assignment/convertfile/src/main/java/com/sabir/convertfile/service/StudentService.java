package com.sabir.convertfile.service;

import com.sabir.convertfile.model.Student;
import com.sabir.convertfile.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Student save(Student student){

        return studentRepository.save(student);
    }
}
