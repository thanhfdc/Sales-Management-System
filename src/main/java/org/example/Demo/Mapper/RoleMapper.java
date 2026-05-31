package org.example.Demo.Mapper;

import org.example.Demo.Modal.DTO.Users.RoleDTO;
import org.example.Demo.Modal.Entity.Users.Role;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RoleMapper {
    RoleDTO toDTO(Role role);

    Role toEntity(RoleDTO roleDTO);
}
