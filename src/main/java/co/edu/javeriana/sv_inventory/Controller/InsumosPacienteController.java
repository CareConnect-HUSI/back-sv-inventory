package co.edu.javeriana.sv_inventory.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.javeriana.sv_inventory.Entity.InsumosPacienteEntity;
import co.edu.javeriana.sv_inventory.Service.InsumosPacienteService;

@RestController
@RequestMapping("/insumos-paciente")
@CrossOrigin
public class InsumosPacienteController {

    @Autowired
    private InsumosPacienteService service;

    //http://localhost:8080/insumos-paciente
    @PostMapping
    public ResponseEntity<InsumosPacienteEntity> create(@RequestBody InsumosPacienteEntity entity) {
        return ResponseEntity.ok(service.save(entity));
    }

    //http://localhost:8080/insumos-paciente/{pacienteId}
    @GetMapping("/{pacienteId}")
    public ResponseEntity<List<InsumosPacienteEntity>> getByPaciente(@PathVariable Long pacienteId) {
        return ResponseEntity.ok(service.getByPacienteId(pacienteId));
    }
}
