package co.edu.javeriana.sv_inventory.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.javeriana.sv_inventory.Entity.InsumosEntity;
import co.edu.javeriana.sv_inventory.Repository.InsumosRepository;


@Service
public class InsumosService {

    @Autowired
    private InsumosRepository insumosRepository;

    public List<InsumosEntity> getAllInsumos() {
        return insumosRepository.findAll();
    }

    public InsumosEntity saveInsumo(InsumosEntity insumo) {
        return insumosRepository.save(insumo);
    }

    public void deleteInsumo(Long id) {
        insumosRepository.deleteById(id);
    }

    
}
