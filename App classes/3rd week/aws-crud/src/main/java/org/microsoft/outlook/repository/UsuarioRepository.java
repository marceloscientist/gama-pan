package org.microsoft.outlook.repository;

import org.microsoft.outlook.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
