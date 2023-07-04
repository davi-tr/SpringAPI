package com.femass.api.controller;


import com.femass.api.medico.DadosCadastroMedico;
import com.femass.api.paciente.DadosCadastroPaciente;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/paciente")
public class PacienteController {

    @PostMapping
    public void cadastrar(@RequestBody DadosCadastroPaciente dados){
        System.out.println(dados);
    }
}
