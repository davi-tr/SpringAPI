package com.femass.api.domain.consulta;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDateTime;

public interface ConsultaRepository extends JpaRepository<Consulta,Long> {


    boolean existsByMedicoIdAndDataAndMotivoCancelamentoIsNull(Long idMedico, LocalDateTime data);
    boolean existsPacienteByIdAndDataBetween(Long idPaciente, LocalDateTime primeiroHorario, LocalDateTime ultimoHorario);

    @Modifying
    @Query("""
        UPDATE Consulta c
        SET c.motivoCancelamento = :motivo
        WHERE c.id = :idConsulta
""")
    void cancelar(Long idConsulta, MotivoCancelamento motivo);
}
