package com.femass.api.domain.consulta;

import jakarta.validation.constraints.NotNull;
import org.aspectj.weaver.ast.Not;

public record DadosCancelamentoConsulta(
        @NotNull
        Long idConsulta,

        @NotNull
        MotivoCancelamento motivo
) {
}
