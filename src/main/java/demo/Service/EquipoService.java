package demo.Service;

import demo.Model.Equipo;
import demo.Repository.EquipoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * Created by david.casaoliva on 14/10/2015.
 */

@Service
@Transactional
public class EquipoService {

    @Autowired
    private EquipoRepository equipoRepository;

    public void testEquipo(){

        Equipo equipo1 = new Equipo();
        equipo1.setNombre("FC Barcelona");
        equipo1.setLocalidad("Barcelona");
        equipo1.setFechaCreacion(new Date(-2220573600000L));
        equipoRepository.save(equipo1);
    }





}
