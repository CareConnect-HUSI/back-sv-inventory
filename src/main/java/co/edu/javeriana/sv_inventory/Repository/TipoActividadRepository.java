package co.edu.javeriana.sv_inventory.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.edu.javeriana.sv_inventory.Entity.TipoActividadEntity;

@Repository
public interface TipoActividadRepository extends JpaRepository<TipoActividadEntity, Long> {
   TipoActividadEntity findByName(String name);
}
