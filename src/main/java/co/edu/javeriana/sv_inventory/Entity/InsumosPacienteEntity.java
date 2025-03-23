package co.edu.javeriana.sv_inventory.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "insumos_paciente")
public class InsumosPacienteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long pacienteId;
    private Long insumoId;
    private String cantidad;
    private String fecha;
    private String encargadoRegistro;

    public InsumosPacienteEntity() {}

    public InsumosPacienteEntity(Long pacienteId, Long insumoId, String cantidad, String fecha, String encargadoRegistro) {
        this.pacienteId = pacienteId;
        this.insumoId = insumoId;
        this.cantidad = cantidad;
        this.fecha = fecha;
        this.encargadoRegistro = encargadoRegistro;
    }

    public Long getId() {
        return id;
    }

    public Long getPacienteId() {
        return pacienteId;
    }

    public void setPacienteId(Long pacienteId) {
        this.pacienteId = pacienteId;
    }

    public Long getInsumoId() {
        return insumoId;
    }

    public void setInsumoId(Long insumoId) {
        this.insumoId = insumoId;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getencargadoRegistro() {
        return encargadoRegistro;
    }

    public void setencargadoRegistro(String encargadoRegistro) {
        this.encargadoRegistro = encargadoRegistro;
    }

}
