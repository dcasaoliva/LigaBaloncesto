package demo.Repository;

import demo.Model.Jugador;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by david.casaoliva on 05/10/2015.
 */
public interface JugadorRepository extends  PagingAndSortingRepository<Jugador, Long>{

}

