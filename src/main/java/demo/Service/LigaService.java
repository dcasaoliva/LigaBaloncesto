package demo.Service;

import demo.Model.Liga;
import demo.Model.Temporada;
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
public class LigaService {

    @Autowired
    private LigaRepository ligaRepository;

    @Autowired
    private TemporadaRepository temporadaRepository;

    public void testLiga(){

        Liga liga1 = new Liga();
        liga1.setNombre("Liga ACB");
        ligaRepository.save(liga1);



    }



}
