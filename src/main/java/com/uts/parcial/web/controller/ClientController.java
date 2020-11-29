package com.uts.parcial.web.controller;

import com.uts.parcial.persistence.ClienteRepository;
import com.uts.parcial.persistence.entity.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("clientes")
public class ClientController {
    @Autowired
    private ClienteRepository repo;
    @GetMapping("/all")
    public List<Usuario> getAll(){
        List<Usuario> lista = repo.findAll();

        return lista;
    }
}
