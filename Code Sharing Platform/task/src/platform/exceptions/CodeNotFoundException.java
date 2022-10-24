package platform.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class CodeNotFoundException extends RuntimeException{
    public CodeNotFoundException() {
        throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }
}
