package com.example.university_app.controller;

import com.example.university_app.model.University;
import com.example.university_app.repository.UniversityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/universities")
public class UniversityController {

    @Autowired
    private UniversityRepository universityRepository;

    // GET all universities
    @GetMapping
    public List<University> getAllUniversities() {
        return universityRepository.findAll();
    }

    // POST a new university
    @PostMapping
    public University createUniversity(@RequestBody University university) {
        return universityRepository.save(university);
    }
}