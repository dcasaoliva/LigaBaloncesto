package demo;

import demo.Service.EquipoService;
import demo.Service.JugadorService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LigaBasquetApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(LigaBasquetApplication.class, args);

        EquipoService equipoService = context.getBean(EquipoService.class);
        equipoService.testEquipo();

        JugadorService jugadorService = context.getBean(JugadorService.class);
        jugadorService.testJugador();





    }
}
