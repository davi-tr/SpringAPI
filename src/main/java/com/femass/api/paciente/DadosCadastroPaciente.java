package com.femass.api.paciente;

import com.femass.api.endereco.DadosEndereco;
import com.femass.api.medico.Especialidade;

public record DadosCadastroPaciente(String nome, String email, String telefone, String cpf, DadosEndereco endereco) {
}
