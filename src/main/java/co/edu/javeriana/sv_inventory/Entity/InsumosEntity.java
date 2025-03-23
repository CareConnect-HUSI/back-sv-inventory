package co.edu.javeriana.sv_inventory.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Insumos")
public class InsumosEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String cantidad;
    private String fecha;
    private String encargadoRegistro;

   
    public InsumosEntity() {
    }

    public InsumosEntity(Long id, String nombre, String cantidad, String fecha, String encargadoRegistro) {
        this.id = id;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.fecha = fecha;
        this.encargadoRegistro = encargadoRegistro;
    }

    public Long getId() {
        return this.id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getCantidad() {
        return this.cantidad;
    }

    public String getFecha() {
        return this.fecha;
    }

    public String getEncargadoRegistro() {
        return this.encargadoRegistro;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setEncargadoRegistro(String encargadoRegistro) {
        this.encargadoRegistro = encargadoRegistro;
    }

}
