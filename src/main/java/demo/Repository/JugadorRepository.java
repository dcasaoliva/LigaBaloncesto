package demo.Repository;

import demo.Model.Jugador;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Date;
import java.util.List;

/**
 * Created by david.casaoliva on 05/10/2015.
 */
public interface JugadorRepository extends  PagingAndSortingRepository<Jugador, Long>{

    List<Jugador> findByNombreContaining(String nombre);

    List<Jugador> findByNumeroTotalCanastasGreaterThanEqual(int numeroTotalCanastas);

    List<Jugador> findByNumeroTotalAsistenciasBetween(int minnumeroTotalAsistencias, int maxnumeroTotalAsistencias);

    List<Jugador> findByPosicionIs(String posicion);

    List<Jugador> findByFechaNacimientoBefore (Date fechaNacimiento);

    List<Jugador> findByFechaNacimientoBeforeAndNumeroTotalCanastasGreaterThanEqual (Date fechaNacimiento, int numeroTotalCanastas);

    List<Jugador> findByEquipoNombre (String nombre);


}

