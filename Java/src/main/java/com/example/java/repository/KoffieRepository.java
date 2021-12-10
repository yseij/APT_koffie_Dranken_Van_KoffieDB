package com.example.java.repository;

import com.example.java.model.Koffie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface KoffieRepository extends JpaRepository<Koffie, Long> {
    List<Koffie> findAll();
}
