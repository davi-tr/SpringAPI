package com.femass.api.medico;

import com.femass.api.endereco.Endereco;

public record DadosUnicoMedico(Long id, String nome, String email, String crm,String telefone, Especialidade especialidade, Endereco endereco) {
    public DadosUnicoMedico(Medico medico){
        this(medico.getId(), medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getTelefone(),medico.getEspecialidade(),medico.getEndereco());
    }

}
