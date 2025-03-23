package co.edu.javeriana.sv_inventory.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.javeriana.sv_inventory.Entity.InsumosPacienteEntity;
import co.edu.javeriana.sv_inventory.Repository.InsumosPacienteRepository;

@Service
public class InsumosPacienteService {

    @Autowired
    private InsumosPacienteRepository repository;

    public InsumosPacienteEntity save(InsumosPacienteEntity entity) {
        return repository.save(entity);
    }

    public List<InsumosPacienteEntity> getByPacienteId(Long pacienteId) {
        return repository.findByPacienteId(pacienteId);
    }
}
