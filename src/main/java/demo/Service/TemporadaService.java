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
    private TemporadaRepository temporadaRepository;

    @Autowired
    private LigaRepository ligaRepository;

    @Autowired
    private EquipoRepository equipoRepository;

    public void testTemporada(){

        Temporada temporada1 = new Temporada();
        temporada1.setNombre("Temporada 1");
        temporada1.setInicioTemp(new Date(1409522400000L));
        temporada1.setFinalTemp(new Date(1404079200000L));
        temporada1.setLigas((Set<Liga>) ligaRepository.findByNombre("Liga ACB"));
        temporadaRepository.save(temporada1);


    }


}
