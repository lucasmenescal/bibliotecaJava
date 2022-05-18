package com.biblioteca.restapi.entidade;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String txEditor;

    private Integer dtEdicao;

    private Integer nrPaginas;

    private String txNomeLivro;

    private Date dtAquisição;

    public String getTxEditor() {
        return txEditor;
    }

    public void setTxEditor(String txEditor) {
        this.txEditor = txEditor;
    }

    public Integer getDtEdicao() {
        return dtEdicao;
    }

    public void setDtEdicao(Integer dtEdicao) {
        this.dtEdicao = dtEdicao;
    }

    public Integer getNrPaginas() {
        return nrPaginas;
    }

    public void setNrPaginas(Integer nrPaginas) {
        this.nrPaginas = nrPaginas;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTxNomeLivro() {
        return txNomeLivro;
    }

    public void setTxNomeLivro(String txNomeLivro) {
        this.txNomeLivro = txNomeLivro;
    }

    public Date getDtAquisição() {
        return dtAquisição;
    }

    public void setDtAquisição(Date dtAquisição) {
        this.dtAquisição = dtAquisição;
    }

}
