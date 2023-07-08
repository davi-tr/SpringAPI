package com.femass.api.domain.medico;

import com.femass.api.domain.endereco.DadosEndereco;
import jakarta.validation.constraints.NotNull;

public record DadosCadastroMedicoAtualizar(

        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEndereco endereco) {

}
