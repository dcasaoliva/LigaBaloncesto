package demo;

import demo.Service.EquipoService;
import demo.Service.JugadorService;
import demo.Service.LigaService;
import demo.Service.TemporadaService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LigaBasquetApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(LigaBasquetApplication.class, args);

        EquipoService equipoService = context.getBean(EquipoService.class);
        equipoService.testEquipo();

        LigaService ligaService = context.getBean(LigaService.class);
        ligaService.testLiga();

        TemporadaService temporadaService = context.getBean(TemporadaService.class);
        temporadaService.testTemporada();

        JugadorService jugadorService = context.getBean(JugadorService.class);
        jugadorService.testJugador();



    }
}
