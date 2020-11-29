package com.uts.parcial.persistence.crud;

import com.uts.parcial.persistence.entity.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface ClienteCrudRepository extends CrudRepository<Usuario, String> {
}
