package dev.javajavations.cadastro_de_ninjas.missoes;

import java.util.List;

import dev.javajavations.cadastro_de_ninjas.ninjas.NinjaModel;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_missao")
public class MissaoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String dificuldade;
    private String status;

    @OneToMany(mappedBy = "missao")
    private List<NinjaModel> ninjas;

    public MissaoModel(){}
    
    public MissaoModel(Long id, String nome, String dificuldade, String status) {
        this.id = id;
        this.nome = nome;
        this.dificuldade = dificuldade;
        this.status = status;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDificuldade() {
        return dificuldade;
    }
    public void setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

}