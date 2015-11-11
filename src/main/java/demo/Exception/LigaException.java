package demo.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by poo2 on 30/06/2015.
 */
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class LigaException extends RuntimeException {
    public LigaException(String error){
        super(error);
    }
    public LigaException(Long id) {
        super("NO EXIST LIGA WITH ID: "+ id);
    }
}