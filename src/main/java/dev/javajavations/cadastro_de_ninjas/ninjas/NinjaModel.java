package dev.javajavations.cadastro_de_ninjas.ninjas;

import java.util.List;

import dev.javajavations.cadastro_de_ninjas.missoes.MissaoModel;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="tb_ninja")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class NinjaModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private int idade;

    @ManyToOne
    @JoinColumn(name = "missao_id")
    private MissaoModel missao;
    
}