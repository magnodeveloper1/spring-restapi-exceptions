package ao.magnodev.develop;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ErrorHandling {

    @ExceptionHandler
    ProblemDetail handle(IllegalStateException ise) {
        var pd = ProblemDetail.forStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
        pd.setDetail(ise.getMessage());
        return pd;
    }
}
