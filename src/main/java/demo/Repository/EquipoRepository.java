package demo.Repository;

import demo.Model.Equipo;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by david.casaoliva on 14/10/2015.
 */
public interface EquipoRepository extends PagingAndSortingRepository<Equipo, Long> {

}