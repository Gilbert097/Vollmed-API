package med.voll.api.repository;

import med.voll.api.entity.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRespository extends JpaRepository<Paciente, Long> {
}
