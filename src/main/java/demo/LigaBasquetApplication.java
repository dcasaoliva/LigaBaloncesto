package demo;

import demo.Service.JugadorService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LigaBasquetApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(LigaBasquetApplication.class, args);

        JugadorService jugadorService = context.getBean(JugadorService.class);

    }
}
