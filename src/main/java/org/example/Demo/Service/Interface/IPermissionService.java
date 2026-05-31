package org.example.Demo.Service.Interface;

import org.example.Demo.Modal.DTO.Users.PermissionDTO;

import java.util.List;

public interface IPermissionService {
    PermissionDTO createPermission(PermissionDTO permissionDTO);

    PermissionDTO updatePermission(Long id, PermissionDTO permissionDTO);

    void deletePermission(Long id);

    PermissionDTO getPermission(Long id);

    List<PermissionDTO> getAllPermissions();
}
