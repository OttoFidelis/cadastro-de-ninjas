package dev.javajavations.cadastro_de_ninjas.missoes;

import java.util.List;

import dev.javajavations.cadastro_de_ninjas.ninjas.NinjaModel;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="tb_missao")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class MissaoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String dificuldade;
    private String status;

    @OneToMany(mappedBy = "missao")
    private List<NinjaModel> ninjas;
}