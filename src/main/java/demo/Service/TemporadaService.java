package demo.Service;

import demo.Model.Liga;
import demo.Model.Temporada;
import demo.Repository.EquipoRepository;
import demo.Repository.LigaRepository;
import demo.Repository.TemporadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.Set;

/**
 * Created by david.casaoliva on 19/10/2015.
 */

@Service
@Transactional
public class TemporadaService {

    @Autowired
    protected TemporadaRepository temporadaRepository;

    @Autowired
    private EquipoRepository equipoRepository;

    @Autowired
    private LigaRepository ligaRepository;

    public void testTemporada(){

        Temporada temporada1 = new Temporada();
        temporada1.setNombre("Temporada ACB 2014-2015");
        temporada1.setInicioTemp(new Date(1409522400000L));
        temporada1.setFinalTemp(new Date(1404079200000L));
        temporada1.setLiga(ligaRepository.findByNombre("Liga ACB"));
        temporadaRepository.save(temporada1);

        Temporada temporada2 = new Temporada();
        temporada2.setNombre("Temporada ACB 2015-2016");
        temporada2.setInicioTemp(new Date(1404079200000L));
        temporada2.setFinalTemp(new Date(1469829600000L));
        temporada2.setLiga(ligaRepository.findByNombre("Liga ACB"));
        temporadaRepository.save(temporada2);

        temporada1.getEquipos().add(equipoRepository.findByNombre("FC Barcelona"));
        temporada1.getEquipos().add(equipoRepository.findByNombre("Los Angeles Lakers"));
        temporada1.getEquipos().add(equipoRepository.findByNombre("Cantabria Basquet Club"));
        temporada1.getEquipos().add(equipoRepository.findByNombre("Buffalo Bulls"));
        temporada1.getEquipos().add(equipoRepository.findByNombre("FC Bayern Basketball"));
        temporada1.getEquipos().add(equipoRepository.findByNombre("Orlando Magic"));

        temporada2.getEquipos().add(equipoRepository.findByNombre("FC Barcelona"));
        temporada2.getEquipos().add(equipoRepository.findByNombre("Los Angeles Lakers"));
        temporada2.getEquipos().add(equipoRepository.findByNombre("Cantabria Basquet Club"));
        temporada2.getEquipos().add(equipoRepository.findByNombre("Buffalo Bulls"));
        temporada2.getEquipos().add(equipoRepository.findByNombre("FC Bayern Basketball"));
        temporada2.getEquipos().add(equipoRepository.findByNombre("Orlando Magic"));


    }


}
