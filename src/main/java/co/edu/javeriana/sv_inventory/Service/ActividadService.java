package co.edu.javeriana.sv_inventory.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.javeriana.sv_inventory.Entity.ActividadEntity;
import co.edu.javeriana.sv_inventory.Repository.ActividadRepository;
import co.edu.javeriana.sv_inventory.Repository.TipoActividadRepository;

@Service
public class ActividadService {

    @Autowired
    private ActividadRepository actividadRepository;

    @Autowired
private TipoActividadRepository tipoActividadRepository;

    public ActividadEntity guardarActividad(ActividadEntity actividad) {
        Long tipoId = actividad.getTipoActividad().getId();
        actividad.setTipoActividad(tipoActividadRepository.findById(tipoId).orElseThrow());
        return actividadRepository.save(actividad);
    }
    
    public List<ActividadEntity> verActividades() {
        return actividadRepository.findAll();
    }
}
