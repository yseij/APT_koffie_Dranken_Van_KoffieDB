package com.example.java.repository;

import com.example.java.model.Koffie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface KoffieRepository extends JpaRepository<Koffie, Long> {
    List<Koffie> findAllByNameStartsWith();
}
