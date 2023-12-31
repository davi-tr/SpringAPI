package com.femass.api.domain.paciente;

import com.femass.api.domain.endereco.Endereco;

public record DadosUnicoPaciente(String nome, String email, String telefone, String cpf, Endereco endereco) {
    public DadosUnicoPaciente(Paciente paciente){
        this(paciente.getNome(), paciente.getEmail(), paciente.getTelefone(), paciente.getCpf(), paciente.getEndereco());
    }
}
