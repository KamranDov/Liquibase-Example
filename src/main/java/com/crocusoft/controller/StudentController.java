package com.crocusoft.controller;

import com.crocusoft.domain.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @PostMapping
    public String createStudent() {
        return "Student created";
    }
}
