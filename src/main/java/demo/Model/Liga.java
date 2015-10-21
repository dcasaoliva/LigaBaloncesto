package demo.Model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by david.casaoliva on 19/10/2015.
 */
@Entity
public class Liga{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;

    @OneToMany(mappedBy = "liga")
    private Set<Temporada> temporadas=new HashSet<>();

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

    public Set<Temporada> getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(Set<Temporada> temporadas) {
        this.temporadas = temporadas;
    }

    @Override
    public String toString() {
        return "Liga{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
