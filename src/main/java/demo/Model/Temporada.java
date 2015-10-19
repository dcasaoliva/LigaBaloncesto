package demo.Model;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by david.casaoliva on 19/10/2015.
 */
@Entity
public class Temporada {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private Date inicioTemp;
    private Date finalTemp;

    @OneToMany(mappedBy = "liga")
    private Set<Liga> ligas=new HashSet<>();

    @ManyToMany (mappedBy = "equipo")
    private Set<Equipo> equipos=new HashSet<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getInicioTemp() {
        return inicioTemp;
    }

    public void setInicioTemp(Date inicioTemp) {
        this.inicioTemp = inicioTemp;
    }

    public Date getFinalTemp() {
        return finalTemp;
    }

    public void setFinalTemp(Date finalTemp) {
        this.finalTemp = finalTemp;
    }

    public Set<Liga> getLigas() {
        return ligas;
    }

    public void setLigas(Set<Liga> ligas) {
        this.ligas = ligas;
    }

    public Set<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(Set<Equipo> equipos) {
        this.equipos = equipos;
    }

    @Override
    public String toString() {
        return "Temporada{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", inicioTemp=" + inicioTemp +
                ", finalTemp=" + finalTemp +
                '}';
    }
}
