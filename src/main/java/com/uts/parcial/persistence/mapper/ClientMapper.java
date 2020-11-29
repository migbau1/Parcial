package com.uts.parcial.persistence.mapper;

import com.uts.parcial.domain.User;
import com.uts.parcial.persistence.entity.Usuario;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ClientMapper {
    @Mappings({
            @Mapping(source = "idCliente", target = "idClient"),
            @Mapping(source = "nombre", target = "name"),
            @Mapping(source = "correo", target = "email"),
            @Mapping(source = "contacto", target = "contact"),
            @Mapping(source = "fechaCreacion", target = "createDate")
    })
    User toUser(Usuario usuario);

    List<User> toUsers(List<Usuario> usuarios);

    @InheritInverseConfiguration
    @Mapping(target = "password", ignore = true)
    Usuario toUsuario(User user);
}
