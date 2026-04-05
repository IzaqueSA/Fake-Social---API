package com.interstrakt.fakesocial.fakesocial.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import com.interstrakt.fakesocial.fakesocial.domain.User;

public interface UsuarioRepository extends JpaRepository<User, Long> {

}
