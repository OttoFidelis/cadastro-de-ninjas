package dev.javajavations.cadastro_de_ninjas;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@CrossOrigin(origins="*")
@RequestMapping
public class NinjaController {
    
    @GetMapping("/boasvindas") 
    public String boasVindas(){
        return "Essa é minha primeira mensagem nessa rota";
    }
}
