package demo.Repository;

import demo.Model.Jugador;
import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.Query;
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

    List<Jugador> findByEquipoLocalidad (String localidad);

    List<Jugador> findByEquipoNombreAndPosicion (String nombre, String posicion);

    Jugador findFirstByOrderByNumeroTotalCanastasDesc();

    List<Jugador> findFirst5ByOrderByNumeroTotalAsistenciasDesc();

    @Query("SELECT j FROM Jugador j WHERE j.equipo.nombre = :nombre ORDER BY j.numeroTotalCanastas DESC")
    List<Jugador> findFirstNombreOrderByNumeroTotalCanastasFromEquipo(@Param("nombre") String nombre);

}

