package com.example.helloworld.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.helloworld.entity.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno,Long>{
    
}
