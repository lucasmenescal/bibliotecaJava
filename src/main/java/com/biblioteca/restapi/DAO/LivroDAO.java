package com.biblioteca.restapi.DAO;
import com.biblioteca.restapi.entidade.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroDAO extends JpaRepository<Livro, Long> {
    
}
