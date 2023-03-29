package com.example.helloworld.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.helloworld.entity.Aluno;
import com.example.helloworld.service.AlunoService;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    private AlunoService alunoService;

    // localhost:8080/alunos - com verbo get
    @GetMapping("/listar-todos")
    public List<Aluno> listarTodos(){
        return alunoService.listarTodos();
    }

    // localhost:8080/alunos - com verbo post
    @PostMapping
    public Aluno salvar(@RequestBody Aluno aluno){
        return alunoService.salvar(aluno);
    }

    //localhost:8080/alunos/1
    @DeleteMapping("/{id}")
    public void excluir( @PathVariable("id") Long id){ //forma de pegar o valor da url e atribuir ao paramatro da funcao
        alunoService.excluir(id);
    }


    
}
