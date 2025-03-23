package co.edu.javeriana.sv_inventory.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.edu.javeriana.sv_inventory.Entity.InsumosEntity;

@Repository
public interface InsumosRepository extends JpaRepository<InsumosEntity, Long> {
}
