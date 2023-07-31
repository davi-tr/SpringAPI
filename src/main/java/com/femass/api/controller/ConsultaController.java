package com.femass.api.controller;


import com.femass.api.domain.consulta.AgendaDeConsultas;
import com.femass.api.domain.consulta.DadosAgendamentoConsulta;
import com.femass.api.domain.consulta.DadosCancelamentoConsulta;
import com.femass.api.domain.consulta.DadosDetalhamentoConsulta;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("consultas")
public class ConsultaController {


    @Autowired
    private AgendaDeConsultas agenda;
    @PostMapping
    @Transactional
    public ResponseEntity agendar(@RequestBody @Valid DadosAgendamentoConsulta dados) {
       var dto =  agenda.agendar(dados);

        return ResponseEntity.ok(dto);
    }
    @DeleteMapping
    @Transactional
    public ResponseEntity cancelar(@RequestBody @Valid DadosCancelamentoConsulta dados) {
        agenda.cancelar(dados);
        return ResponseEntity.ok().build();
    }

}
