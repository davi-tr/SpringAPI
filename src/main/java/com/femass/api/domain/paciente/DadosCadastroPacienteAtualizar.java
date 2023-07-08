package com.femass.api.domain.paciente;

import com.femass.api.domain.endereco.DadosEndereco;
import jakarta.validation.constraints.NotNull;

public record DadosCadastroPacienteAtualizar(

        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEndereco endereco) {

}
