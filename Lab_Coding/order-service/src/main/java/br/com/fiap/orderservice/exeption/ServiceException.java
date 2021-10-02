package br.com.fiap.orderservice.exeption;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class ServiceException extends Exception {
    public ServiceException(String msg) {
        super(msg);
    }
}