package co.edu.javeriana.sv_inventory.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.javeriana.sv_inventory.Entity.ActividadEntity;
import co.edu.javeriana.sv_inventory.Service.ActividadService;

@RestController
@RequestMapping("/actividad")
public class ActividadController {
    @Autowired
    private ActividadService actividadService;

    //http://localhost:8087/actividad/registrar-actividad
    @PostMapping("/registrar-actividad")
    public ResponseEntity<ActividadEntity> registrarActividad(@RequestBody ActividadEntity actividad) {
        ActividadEntity actividadGuardada = actividadService.guardarActividad(actividad);
        return new ResponseEntity<>(actividadGuardada, HttpStatus.CREATED);
    }

    //http://localhost:8087/actividad/ver-actividades
    @GetMapping("/ver-actividades")
    public ResponseEntity<List<ActividadEntity>> verActividades() {
        List<ActividadEntity> actividades = actividadService.verActividades();
        return new ResponseEntity<>(actividades, HttpStatus.OK);
    }
}
