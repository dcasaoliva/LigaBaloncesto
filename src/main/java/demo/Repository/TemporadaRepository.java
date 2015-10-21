package demo.Repository;

import demo.Model.Temporada;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Date;

/**
 * Created by david.casaoliva on 19/10/2015.
 */
public interface TemporadaRepository extends PagingAndSortingRepository<Temporada, Long> {

    Temporada findByNombre(String nombre);

}
