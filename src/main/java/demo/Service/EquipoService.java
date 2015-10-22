package demo.Service;

import demo.Model.Equipo;
import demo.Repository.EquipoRepository;
import demo.Repository.JugadorRepository;
import demo.Repository.TemporadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by david.casaoliva on 14/10/2015.
 */

@Service
@Transactional
public class EquipoService {

    @Autowired
    private JugadorRepository jugadorRepository;

    @Autowired
    private EquipoRepository equipoRepository;

    @Autowired
    private TemporadaRepository temporadaRepository;

    public void testEquipo() {

        Equipo equipo1 = new Equipo();
        equipo1.setNombre("FC Barcelona");
        equipo1.setLocalidad("Barcelona");
        equipo1.setFechaCreacion(new Date(-626835600000L));
        equipoRepository.save(equipo1);

        Equipo equipo2 = new Equipo();
        equipo2.setNombre("Los Angeles Lakers");
        equipo2.setLocalidad("Los Angeles");
        equipo2.setFechaCreacion(new Date(-626835600000L));
        equipoRepository.save(equipo2);

        Equipo equipo3 = new Equipo();
        equipo3.setNombre("Cantabria Basquet Club");
        equipo3.setLocalidad("Santander");
        equipo3.setFechaCreacion(new Date(-626835600000L));
        equipoRepository.save(equipo3);

        Equipo equipo4 = new Equipo();
        equipo4.setNombre("Buffalo Bulls");
        equipo4.setLocalidad("Buffalo");
        equipo4.setFechaCreacion(new Date(-626835600000L));
        equipoRepository.save(equipo4);

        Equipo equipo5 = new Equipo();
        equipo5.setNombre("FC Bayern Basketball");
        equipo5.setLocalidad("Múnich");
        equipo5.setFechaCreacion(new Date(-626835600000L));
        equipoRepository.save(equipo5);

        Equipo equipo6 = new Equipo();
        equipo6.setNombre("Orlando Magic");
        equipo6.setLocalidad("Orlando");
        equipo6.setFechaCreacion(new Date(-626835600000L));
        equipoRepository.save(equipo6);


        System.out.println(equipoRepository.findByLocalidad ("Santander"));








   }

}
