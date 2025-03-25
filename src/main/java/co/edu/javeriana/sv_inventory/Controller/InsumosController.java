package co.edu.javeriana.sv_inventory.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.javeriana.sv_inventory.Entity.InsumosEntity;
import co.edu.javeriana.sv_inventory.Service.InsumosService;

@RestController
@RequestMapping("/inventario")
public class InsumosController {

    @Autowired
    private InsumosService insumosService;

    //http://localhost:8087/inventario
    @GetMapping
    public ResponseEntity<List<InsumosEntity>> getAll() {
        return ResponseEntity.ok(insumosService.getAllInsumos());
    }

    //http://localhost:8087/inventario/registro-inventario
    @PostMapping("/registro-inventario")
    public ResponseEntity<InsumosEntity> create(@RequestBody InsumosEntity insumo) {
        return ResponseEntity.ok(insumosService.saveInsumo(insumo));
    }

    //http://localhost:8087/inventario/1
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        insumosService.deleteInsumo(id);
        return ResponseEntity.noContent().build();
    }
}
