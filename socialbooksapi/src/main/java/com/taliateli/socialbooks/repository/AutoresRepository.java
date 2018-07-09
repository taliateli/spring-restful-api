package com.taliateli.socialbooks.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.taliateli.socialbooks.domain.Autor;

public interface AutoresRepository extends JpaRepository<Autor, Long> {
	
	

}
