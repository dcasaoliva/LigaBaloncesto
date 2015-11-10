package demo.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by david.casaoliva on 05/10/2015.
 */
@Entity
public class Jugador {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nombre;
    private Date fechaNacimiento;
    private Integer numeroTotalCanastas;
    private Integer numeroTotalAsistencias;
    private Integer numeroTotalRebotes;
    private String posicion;

    public Long getId() {
        return id;
    }

    @JsonIgnore
    @ManyToOne
    private Equipo equipo;

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Integer getNumeroTotalCanastas() {
        return numeroTotalCanastas;
    }

    public void setNumeroTotalCanastas(Integer numeroTotalCanastas) {
        this.numeroTotalCanastas = numeroTotalCanastas;
    }

    public Integer getNumeroTotalAsistencias() {
        return numeroTotalAsistencias;
    }

    public void setNumeroTotalAsistencias(Integer numeroTotalAsistencias) {
        this.numeroTotalAsistencias = numeroTotalAsistencias;
    }

    public Integer getNumeroTotalRebotes() {
        return numeroTotalRebotes;
    }

    public void setNumeroTotalRebotes(Integer numeroTotalRebotes) {
        this.numeroTotalRebotes = numeroTotalRebotes;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", numeroTotalCanastas=" + numeroTotalCanastas +
                ", numeroTotalAsistencias=" + numeroTotalAsistencias +
                ", numeroTotalRebotes=" + numeroTotalRebotes +
                ", posicion='" + posicion + '\''+
               '}';
    }
}
