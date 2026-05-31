package org.example.Demo.Mapper;

import org.example.Demo.Modal.DTO.Users.PermissionDTO;
import org.example.Demo.Modal.Entity.Users.Permission;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PermissionMapper {
    PermissionDTO toDTO(Permission permission);

    Permission toEntity(PermissionDTO permissionDTO);
}
