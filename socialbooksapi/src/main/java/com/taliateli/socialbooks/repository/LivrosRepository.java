package com.taliateli.socialbooks.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.taliateli.socialbooks.domain.Livro;

public interface LivrosRepository extends JpaRepository<Livro, Long> {


}
