package demo.Exception;

        import org.springframework.http.HttpStatus;
        import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by poo2 on 30/06/2015.
 */
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class EquipoException extends RuntimeException{
    public EquipoException(Long id) {
        super("NO EXIST EQUIPO WITH ID: "+ id);
    }
}