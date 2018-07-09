package com.taliateli.socialbooks.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.taliateli.socialbooks.domain.Comentario;

public interface ComentariosRepository extends JpaRepository<Comentario, Long> {

}
