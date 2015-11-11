package demo.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by poo2 on 30/06/2015.
 */
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class TemporadaException extends RuntimeException {
    public TemporadaException(String error){
        super(error);
    }
    public TemporadaException(Long id) {
        super("NO EXIST LIGA WITH ID: "+ id);
    }
}