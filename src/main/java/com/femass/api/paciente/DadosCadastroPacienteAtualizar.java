package com.femass.api.paciente;

import com.femass.api.endereco.DadosEndereco;
import jakarta.validation.constraints.NotNull;

public record DadosCadastroPacienteAtualizar(

        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEndereco endereco) {

}
