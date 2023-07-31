package com.femass.api.domain.consulta.validacoes.agendamento;

import com.femass.api.domain.ValidacaoException;
import com.femass.api.domain.consulta.ConsultaRepository;
import com.femass.api.domain.consulta.DadosAgendamentoConsulta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ValidadorMedicoComOutraConsulta implements ValidadorAgendamentoDeConsulta{

    @Autowired
    private ConsultaRepository repository;

    public void validar(DadosAgendamentoConsulta dados){
        var medicoPossuiOutroConsultaNoMesmoHorario = repository.existsByMedicoIdAndDataAndMotivoCancelamentoIsNull(dados.idMedico(), dados.data());
        if(medicoPossuiOutroConsultaNoMesmoHorario){
            throw new ValidacaoException("Médico já possui outra consulta agendada nesse horário");
        }
    }

}
