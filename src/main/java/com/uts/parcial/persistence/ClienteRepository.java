package com.uts.parcial.persistence;

import com.uts.parcial.domain.User;
import com.uts.parcial.domain.repository.UserRepository;
import com.uts.parcial.persistence.crud.ClienteCrudRepository;
import com.uts.parcial.persistence.entity.Usuario;
import com.uts.parcial.persistence.mapper.ClientMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ClienteRepository implements UserRepository {
    @Autowired
    private ClienteCrudRepository crudRepository;
    @Autowired
    private ClientMapper clientMapper;

    @Override
    public List<User> getAll(){
        List<Usuario> usuarios = (List<Usuario>) crudRepository.findAll();
        return clientMapper.toUsers(usuarios);
    }
}
