package com.codigomorse.codigomorse.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Response {
    private String cadenaInicial;
    private String cadenaFinal;
    private String message;
}
