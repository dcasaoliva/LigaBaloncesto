package demo.Service;

import demo.Model.Equipo;
import demo.Model.Jugador;
import demo.Repository.EquipoRepository;
import demo.Repository.JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;


/**
 * Created by david.casaoliva on 05/10/2015.
 */

@Service
@Transactional
public class JugadorService {

    @Autowired
    private JugadorRepository jugadorRepository;

    @Autowired
    private EquipoRepository equipoRepository;

    public void testJugador(){

        Jugador jugador1 = new Jugador();
        jugador1.setNombre("Pau Ribas");
        jugador1.setFechaNacimiento(new Date(541638000000L));
        jugador1.setNumeroTotalAsistencias(156);
        jugador1.setNumeroTotalCanastas(130);
        jugador1.setNumeroTotalRebotes(120);
        jugador1.setPosicion("alero");
        jugador1.setEquipo(equipoRepository.findByNombre("FC Barcelona"));
        jugadorRepository.save(jugador1);

        Jugador jugador2 = new Jugador();
        jugador2.setNombre("Kevin Durant");
        jugador2.setFechaNacimiento(new Date(591487200000L));
        jugador2.setNumeroTotalAsistencias(80);
        jugador2.setNumeroTotalCanastas(90);
        jugador2.setNumeroTotalRebotes(200);
        jugador2.setPosicion("base");
        jugador2.setEquipo(equipoRepository.findByNombre("FC Barcelona"));
        jugadorRepository.save(jugador2);

        Jugador jugador3 = new Jugador();
        jugador3.setNombre("Michael Jordan");
        jugador3.setFechaNacimiento(new Date(-185331600000L));
        jugador3.setNumeroTotalAsistencias(321);
        jugador3.setNumeroTotalCanastas(212);
        jugador3.setNumeroTotalRebotes(300);
        jugador3.setPosicion("pivot");
        jugador3.setEquipo(equipoRepository.findByNombre("FC Barcelona"));
        jugadorRepository.save(jugador3);

        Jugador jugador4 = new Jugador();
        jugador4.setNombre("Kobe Bryant");
        jugador4.setFechaNacimiento(new Date(272671200000L));
        jugador4.setNumeroTotalAsistencias(198);
        jugador4.setNumeroTotalCanastas(292);
        jugador4.setNumeroTotalRebotes(360);
        jugador4.setPosicion("escolta");
        jugador4.setEquipo(equipoRepository.findByNombre("FC Barcelona"));
        jugadorRepository.save(jugador4);

        Jugador jugador5 = new Jugador();
        jugador5.setNombre("Pau Gasol");
        jugador5.setFechaNacimiento(new Date(331682400000L));
        jugador5.setNumeroTotalAsistencias(521);
        jugador5.setNumeroTotalCanastas(314);
        jugador5.setNumeroTotalRebotes(321);
        jugador5.setPosicion("ala-pivot");
        jugador5.setEquipo(equipoRepository.findByNombre("FC Barcelona"));
        jugadorRepository.save(jugador5);

        Jugador jugador6 = new Jugador();
        jugador6.setNombre("LeBron James");
        jugador6.setFechaNacimiento(new Date(473209200000L));
        jugador6.setNumeroTotalAsistencias(156);
        jugador6.setNumeroTotalCanastas(130);
        jugador6.setNumeroTotalRebotes(120);
        jugador6.setPosicion("alero");
        jugador6.setEquipo(equipoRepository.findByNombre("Los Angeles Lakers"));
        jugadorRepository.save(jugador6);

        Jugador jugador7 = new Jugador();
        jugador7.setNombre("Ricky Rubio");
        jugador7.setFechaNacimiento(new Date(656460000000L));
        jugador7.setNumeroTotalAsistencias(80);
        jugador7.setNumeroTotalCanastas(90);
        jugador7.setNumeroTotalRebotes(200);
        jugador7.setPosicion("base");
        jugador7.setEquipo(equipoRepository.findByNombre("Los Angeles Lakers"));
        jugadorRepository.save(jugador7);

        Jugador jugador8 = new Jugador();
        jugador8.setNombre("Stephen Curry");
        jugador8.setFechaNacimiento(new Date(574297200000L));
        jugador8.setNumeroTotalAsistencias(321);
        jugador8.setNumeroTotalCanastas(212);
        jugador8.setNumeroTotalRebotes(300);
        jugador8.setPosicion("pivot");
        jugador8.setEquipo(equipoRepository.findByNombre("Los Angeles Lakers"));
        jugadorRepository.save(jugador8);

        Jugador jugador9 = new Jugador();
        jugador9.setNombre("Ante Tomić");
        jugador9.setFechaNacimiento(new Date(272671200000L));
        jugador9.setNumeroTotalAsistencias(198);
        jugador9.setNumeroTotalCanastas(292);
        jugador9.setNumeroTotalRebotes(360);
        jugador9.setPosicion("escolta");
        jugador9.setEquipo(equipoRepository.findByNombre("Los Angeles Lakers"));
        jugadorRepository.save(jugador9);

        Jugador jugador10 = new Jugador();
        jugador10.setNombre("Víctor Claver");
        jugador10.setFechaNacimiento(new Date(331682400000L));
        jugador10.setNumeroTotalAsistencias(521);
        jugador10.setNumeroTotalCanastas(314);
        jugador10.setNumeroTotalRebotes(321);
        jugador10.setPosicion("ala-pivot");
        jugador10.setEquipo(equipoRepository.findByNombre("Los Angeles Lakers"));
        jugadorRepository.save(jugador10);

        Jugador jugador11 = new Jugador();
        jugador11.setNombre("Jugador 11");
        jugador11.setFechaNacimiento(new Date(541638000000L));
        jugador11.setNumeroTotalAsistencias(156);
        jugador11.setNumeroTotalCanastas(130);
        jugador11.setNumeroTotalRebotes(120);
        jugador11.setPosicion("alero");
        jugador11.setEquipo(equipoRepository.findByNombre("Cantabria Basquet Club"));
        jugadorRepository.save(jugador11);

        Jugador jugador12 = new Jugador();
        jugador12.setNombre("Jugador 12");
        jugador12.setFechaNacimiento(new Date(591487200000L));
        jugador12.setNumeroTotalAsistencias(80);
        jugador12.setNumeroTotalCanastas(90);
        jugador12.setNumeroTotalRebotes(200);
        jugador12.setPosicion("base");
        jugador12.setEquipo(equipoRepository.findByNombre("Cantabria Basquet Club"));
        jugadorRepository.save(jugador12);

        Jugador jugador13 = new Jugador();
        jugador13.setNombre("Jugador 13");
        jugador13.setFechaNacimiento(new Date(-185331600000L));
        jugador13.setNumeroTotalAsistencias(321);
        jugador13.setNumeroTotalCanastas(212);
        jugador13.setNumeroTotalRebotes(300);
        jugador13.setPosicion("pivot");
        jugador13.setEquipo(equipoRepository.findByNombre("Cantabria Basquet Club"));
        jugadorRepository.save(jugador13);

        Jugador jugador14 = new Jugador();
        jugador14.setNombre("Jugador 14");
        jugador14.setFechaNacimiento(new Date(272671200000L));
        jugador14.setNumeroTotalAsistencias(198);
        jugador14.setNumeroTotalCanastas(292);
        jugador14.setNumeroTotalRebotes(360);
        jugador14.setPosicion("escolta");
        jugador14.setEquipo(equipoRepository.findByNombre("Cantabria Basquet Club"));
        jugadorRepository.save(jugador14);

        Jugador jugador15 = new Jugador();
        jugador15.setNombre("Jugador 15");
        jugador15.setFechaNacimiento(new Date(331682400000L));
        jugador15.setNumeroTotalAsistencias(521);
        jugador15.setNumeroTotalCanastas(314);
        jugador15.setNumeroTotalRebotes(321);
        jugador15.setPosicion("ala-pivot");
        jugador15.setEquipo(equipoRepository.findByNombre("Cantabria Basquet Club"));
        jugadorRepository.save(jugador5);

        Jugador jugador16 = new Jugador();
        jugador16.setNombre("Jugador 16");
        jugador16.setFechaNacimiento(new Date(473209200000L));
        jugador16.setNumeroTotalAsistencias(156);
        jugador16.setNumeroTotalCanastas(130);
        jugador16.setNumeroTotalRebotes(120);
        jugador16.setPosicion("alero");
        jugador16.setEquipo(equipoRepository.findByNombre("Buffalo Bulls"));
        jugadorRepository.save(jugador16);

        Jugador jugador17 = new Jugador();
        jugador17.setNombre("Jugador 17");
        jugador17.setFechaNacimiento(new Date(656460000000L));
        jugador17.setNumeroTotalAsistencias(80);
        jugador17.setNumeroTotalCanastas(90);
        jugador17.setNumeroTotalRebotes(200);
        jugador17.setPosicion("base");
        jugador17.setEquipo(equipoRepository.findByNombre("Buffalo Bulls"));
        jugadorRepository.save(jugador17);

        Jugador jugador18 = new Jugador();
        jugador18.setNombre("Jugador 18");
        jugador18.setFechaNacimiento(new Date(574297200000L));
        jugador18.setNumeroTotalAsistencias(321);
        jugador18.setNumeroTotalCanastas(212);
        jugador18.setNumeroTotalRebotes(300);
        jugador18.setPosicion("pivot");
        jugador18.setEquipo(equipoRepository.findByNombre("Buffalo Bulls"));
        jugadorRepository.save(jugador18);

        Jugador jugador19 = new Jugador();
        jugador19.setNombre("Jugador 19");
        jugador19.setFechaNacimiento(new Date(272671200000L));
        jugador19.setNumeroTotalAsistencias(198);
        jugador19.setNumeroTotalCanastas(292);
        jugador19.setNumeroTotalRebotes(360);
        jugador19.setPosicion("escolta");
        jugador19.setEquipo(equipoRepository.findByNombre("Buffalo Bulls"));
        jugadorRepository.save(jugador19);

        Jugador jugador20 = new Jugador();
        jugador20.setNombre("Jugador 20");
        jugador20.setFechaNacimiento(new Date(331682400000L));
        jugador20.setNumeroTotalAsistencias(521);
        jugador20.setNumeroTotalCanastas(314);
        jugador20.setNumeroTotalRebotes(321);
        jugador20.setPosicion("alero");
        jugador20.setEquipo(equipoRepository.findByNombre("Buffalo Bulls"));
        jugadorRepository.save(jugador20);

        Jugador jugador21 = new Jugador();
        jugador21.setNombre("Jugador 21");
        jugador21.setFechaNacimiento(new Date(331682400000L));
        jugador21.setNumeroTotalAsistencias(521);
        jugador21.setNumeroTotalCanastas(314);
        jugador21.setNumeroTotalRebotes(321);
        jugador21.setPosicion("base");
        jugador21.setEquipo(equipoRepository.findByNombre("FC Bayern Basketball"));
        jugadorRepository.save(jugador21);

        Jugador jugador22 = new Jugador();
        jugador22.setNombre("Jugador 22");
        jugador22.setFechaNacimiento(new Date(331682400000L));
        jugador22.setNumeroTotalAsistencias(521);
        jugador22.setNumeroTotalCanastas(314);
        jugador22.setNumeroTotalRebotes(321);
        jugador22.setPosicion("pivot");
        jugador22.setEquipo(equipoRepository.findByNombre("FC Bayern Basketball"));
        jugadorRepository.save(jugador22);

        Jugador jugador23 = new Jugador();
        jugador23.setNombre("Jugador 23");
        jugador23.setFechaNacimiento(new Date(331682400000L));
        jugador23.setNumeroTotalAsistencias(521);
        jugador23.setNumeroTotalCanastas(314);
        jugador23.setNumeroTotalRebotes(321);
        jugador23.setPosicion("ala-pivot");
        jugador23.setEquipo(equipoRepository.findByNombre("FC Bayern Basketball"));
        jugadorRepository.save(jugador23);

        Jugador jugador24 = new Jugador();
        jugador24.setNombre("Jugador 24");
        jugador24.setFechaNacimiento(new Date(331682400000L));
        jugador24.setNumeroTotalAsistencias(521);
        jugador24.setNumeroTotalCanastas(314);
        jugador24.setNumeroTotalRebotes(321);
        jugador24.setPosicion("ala-pivot");
        jugador24.setEquipo(equipoRepository.findByNombre("FC Bayern Basketball"));
        jugadorRepository.save(jugador24);

        Jugador jugador25 = new Jugador();
        jugador25.setNombre("Jugador 25");
        jugador25.setFechaNacimiento(new Date(331682400000L));
        jugador25.setNumeroTotalAsistencias(521);
        jugador25.setNumeroTotalCanastas(314);
        jugador25.setNumeroTotalRebotes(321);
        jugador25.setPosicion("ala-pivot");
        jugador25.setEquipo(equipoRepository.findByNombre("FC Bayern Basketball"));
        jugadorRepository.save(jugador25);

        Jugador jugador26 = new Jugador();
        jugador26.setNombre("Jugador 26");
        jugador26.setFechaNacimiento(new Date(331682400000L));
        jugador26.setNumeroTotalAsistencias(521);
        jugador26.setNumeroTotalCanastas(314);
        jugador26.setNumeroTotalRebotes(321);
        jugador26.setPosicion("ala-pivot");
        jugador26.setEquipo(equipoRepository.findByNombre("Orlando Magic"));
        jugadorRepository.save(jugador26);

        Jugador jugador27 = new Jugador();
        jugador27.setNombre("Jugador 27");
        jugador27.setFechaNacimiento(new Date(331682400000L));
        jugador27.setNumeroTotalAsistencias(521);
        jugador27.setNumeroTotalCanastas(314);
        jugador27.setNumeroTotalRebotes(321);
        jugador27.setPosicion("ala-pivot");
        jugador27.setEquipo(equipoRepository.findByNombre("Orlando Magic"));
        jugadorRepository.save(jugador27);

        Jugador jugador28 = new Jugador();
        jugador28.setNombre("Jugador 28");
        jugador28.setFechaNacimiento(new Date(331682400000L));
        jugador28.setNumeroTotalAsistencias(521);
        jugador28.setNumeroTotalCanastas(314);
        jugador28.setNumeroTotalRebotes(321);
        jugador28.setPosicion("ala-pivot");
        jugador28.setEquipo(equipoRepository.findByNombre("Orlando Magic"));
        jugadorRepository.save(jugador28);

        Jugador jugador29 = new Jugador();
        jugador29.setNombre("Jugador 29");
        jugador29.setFechaNacimiento(new Date(331682400000L));
        jugador29.setNumeroTotalAsistencias(521);
        jugador29.setNumeroTotalCanastas(314);
        jugador29.setNumeroTotalRebotes(321);
        jugador29.setPosicion("ala-pivot");
        jugador29.setEquipo(equipoRepository.findByNombre("Orlando Magic"));
        jugadorRepository.save(jugador29);

        Jugador jugador30 = new Jugador();
        jugador30.setNombre("Jugador 30");
        jugador30.setFechaNacimiento(new Date(331682400000L));
        jugador30.setNumeroTotalAsistencias(521);
        jugador30.setNumeroTotalCanastas(314);
        jugador30.setNumeroTotalRebotes(321);
        jugador30.setPosicion("ala-pivot");
        jugador30.setEquipo(equipoRepository.findByNombre("Orlando Magic"));
        jugadorRepository.save(jugador30);


        System.out.println(jugadorRepository.findByNombreContaining("Pau"));

        System.out.println(jugadorRepository.findByNumeroTotalCanastasGreaterThanEqual(100));

        System.out.println(jugadorRepository.findByNumeroTotalAsistenciasBetween(100,300));

        System.out.println(jugadorRepository.findByPosicionIs("base"));

        System.out.println(jugadorRepository.findByFechaNacimientoBefore(new Date(321682400000L)));

        System.out.println(jugadorRepository.findByFechaNacimientoBeforeAndNumeroTotalCanastasGreaterThanEqual(new Date(331682400000L),300));

        System.out.println(jugadorRepository.findByEquipoNombre("FC Bayern Basketball"));

        System.out.println(jugadorRepository.findByEquipoLocalidad("Santander"));

    }

}
