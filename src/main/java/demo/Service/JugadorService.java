package demo.Service;

import demo.Model.Jugador;
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

    public void testJugador(){

        Jugador jugador1 = new Jugador();
        jugador1.setNombre("Pau Ribas");
        jugador1.setFechaNacimiento(new Date(541638000000L));
        jugador1.setNumeroTotalAsistencias(156);
        jugador1.setNumeroTotalCanastas(130);
        jugador1.setNumeroTotalRebotes(120);
        jugador1.setPosicion("alero");
        jugadorRepository.save(jugador1);

        Jugador jugador2 = new Jugador();
        jugador2.setNombre("Kevin Durant");
        jugador2.setFechaNacimiento(new Date(591487200000L));
        jugador2.setNumeroTotalAsistencias(80);
        jugador2.setNumeroTotalCanastas(90);
        jugador2.setNumeroTotalRebotes(200);
        jugador2.setPosicion("base");
        jugadorRepository.save(jugador2);

        Jugador jugador3 = new Jugador();
        jugador3.setNombre("Michael Jordan");
        jugador3.setFechaNacimiento(new Date(-185331600000L));
        jugador3.setNumeroTotalAsistencias(321);
        jugador3.setNumeroTotalCanastas(212);
        jugador3.setNumeroTotalRebotes(300);
        jugador3.setPosicion("pivot");
        jugadorRepository.save(jugador3);

        Jugador jugador4 = new Jugador();
        jugador4.setNombre("Kobe Bryant");
        jugador4.setFechaNacimiento(new Date(272671200000L));
        jugador4.setNumeroTotalAsistencias(198);
        jugador4.setNumeroTotalCanastas(292);
        jugador4.setNumeroTotalRebotes(360);
        jugador4.setPosicion("escolta");
        jugadorRepository.save(jugador4);

        Jugador jugador5 = new Jugador();
        jugador5.setNombre("Pau Gasol");
        jugador5.setFechaNacimiento(new Date(331682400000L));
        jugador5.setNumeroTotalAsistencias(521);
        jugador5.setNumeroTotalCanastas(314);
        jugador5.setNumeroTotalRebotes(321);
        jugador5.setPosicion("ala-pivot");
        jugadorRepository.save(jugador5);

        System.out.println(jugadorRepository.findByNombreContaining("Pau"));

        System.out.println(jugadorRepository.findByNumeroTotalCanastasGreaterThanEqual(100));

        System.out.println(jugadorRepository.findByPosicionIs("base"));


    }

}
