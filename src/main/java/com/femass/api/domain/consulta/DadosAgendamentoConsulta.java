package com.femass.api.domain.consulta;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.femass.api.domain.medico.Especialidade;
import jakarta.validation.constraints.*;

import java.time.LocalDateTime;

public record DadosAgendamentoConsulta(
    Long idMedico,
    @NotNull
    Long idPaciente,

    @NotNull
    @Future
    @JsonFormat(pattern = "dd/MM/yyyy HH:mm")
    LocalDateTime data,

    Especialidade especialidade
    )
{

}
