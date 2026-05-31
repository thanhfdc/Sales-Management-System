package org.example.Demo.Repository;

import org.example.Demo.Modal.Entity.Users.RolePermission;
import org.example.Demo.Modal.Entity.Users.RolePermissionId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolePermissionRepository extends JpaRepository<RolePermission, RolePermissionId> {
}
