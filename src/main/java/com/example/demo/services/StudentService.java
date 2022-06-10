package com.example.demo.services;

import com.example.demo.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudents() {
        return List.of(
                new Student(
                        1L,
                        "Faraz Jahangir",
                        "24"
                ),
                new Student(
                        2L,
                        "Izaan Jahangir",
                        "22"
                )
        );
    }
}
