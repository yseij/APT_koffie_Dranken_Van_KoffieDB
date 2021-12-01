package com.example.java.controller;

import com.example.java.model.Koffie;
import com.example.java.repository.KoffieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class KoffieController {
    private KoffieRepository koffieRepository;

    @GetMapping("docker_database_1")
    public List<Koffie> getKoffie() {
        return this.koffieRepository.findAll();
    }
}
