package co.edu.javeriana.sv_inventory.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.javeriana.sv_inventory.Entity.InsumosPacienteEntity;

public interface InsumosPacienteRepository extends JpaRepository<InsumosPacienteEntity, Long> {
    List<InsumosPacienteEntity> findByPacienteId(Long pacienteId);
}
