package com.femass.api.medico;

import com.femass.api.endereco.DadosEndereco;
import jakarta.validation.constraints.NotNull;

public record DadosCadastroMedicoAtualizar(

        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEndereco endereco) {

}
