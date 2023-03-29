package com.example.helloworld.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.stereotype.Service;

import com.example.helloworld.entity.Aluno;
import com.example.helloworld.repository.AlunoRepository;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository alunoRepository;
    
    public List<Aluno> listarTodos(){
        return alunoRepository.findAll();
    }

    
    public void excluir(Long id){
        Aluno aluno = alunoRepository.findById(id).get();
        alunoRepository.delete(aluno);
    }

    public Aluno salvar(Aluno aluno){
        return alunoRepository.saveAndFlush(aluno);
    }

    public Aluno atualizar(Aluno aluno) {
        return alunoRepository.saveAndFlush(aluno);
    }
    
}
