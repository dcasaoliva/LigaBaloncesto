package demo.Controller;

import demo.Exception.JugadorException;
import demo.Model.Jugador;
import demo.Repository.JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by david.casaoliva on 04/11/2015.
 */


@RestController
@RequestMapping("/jugadores")

public class JugadorController {

    @Autowired
    private JugadorRepository jugadorRepository;

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public Jugador save(@RequestBody Jugador jugador) {
        return jugadorRepository.save(jugador);
    }

    @RequestMapping(method= RequestMethod.GET)
    public List<Jugador> findAll() {
        List<Jugador> jugadores = new ArrayList<Jugador>();
        Iterator<Jugador> iterator = jugadorRepository.findAll().iterator();

        while (iterator.hasNext()) {
            jugadores.add(iterator.next());
        }

        return jugadores;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Jugador getById(@PathVariable Long id) {
        Jugador jugador = jugadorRepository.findOne(id);

        if(jugador == null){throw new JugadorException("EL JUGADOR CON ID "+id+" NO EXISTE");}

        return jugador;
    }



}




