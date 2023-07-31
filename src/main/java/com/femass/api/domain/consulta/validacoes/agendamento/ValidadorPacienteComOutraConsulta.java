package com.femass.api.domain.consulta.validacoes.agendamento;

import com.femass.api.domain.ValidacaoException;
import com.femass.api.domain.consulta.ConsultaRepository;
import com.femass.api.domain.consulta.DadosAgendamentoConsulta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ValidadorPacienteComOutraConsulta implements ValidadorAgendamentoDeConsulta{

    @Autowired
    private ConsultaRepository repository;

    public void validar(DadosAgendamentoConsulta dados){
    var primeiroHorario = dados.data().withHour(7);
    var ultimoHorario = dados.data().withHour(18);
    var pacientePossuiOutraConsultaNoDia = repository.existsPacienteByIdAndDataBetween(dados.idPaciente(), primeiroHorario, ultimoHorario);
    if(pacientePossuiOutraConsultaNoDia){
        throw new ValidacaoException("Paciente já possui uma consulta agendada nesse dia");
    }
    }
}
