package com.biblioteca.restapi;
import java.util.List;
import com.biblioteca.restapi.DAO.LivroDAO;
import com.biblioteca.restapi.entidade.Livro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/livro")
public class LivroREST {

    @Autowired
    private LivroDAO livroDAO;

    @GetMapping
    public List<Livro> listar() {
        return livroDAO.findAll();
    }

    @PostMapping
    public void salvar(@RequestBody Livro livro) {
        livroDAO.save(livro);
    }

    @PutMapping
    public void alterar(@RequestBody Livro livro) {
        if (livro.getId() > 0) {

            livroDAO.save(livro);
        }
    }

    @DeleteMapping
    public void deletar(@RequestBody Livro livro){
        livroDAO.delete(livro);
    }
}
