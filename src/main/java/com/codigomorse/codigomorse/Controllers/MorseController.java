package com.codigomorse.codigomorse.Controllers;

import com.codigomorse.codigomorse.Entities.MorseCode;
import com.codigomorse.codigomorse.Entities.Response;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
public class MorseController {
    @GetMapping("/morsetranslator")
    public Response morseTranslator(@RequestParam(value = "cadena",defaultValue = "") String cadena){
        try {
            MorseCode.validarCadena(cadena);
            Response response = new Response(cadena,"", "OK");
            response.setCadenaFinal(MorseCode.traducirMorse(cadena));

            return response;


        }catch (Exception e){
            Response response = new Response(cadena, "", e.getMessage());
            return response;
        }

    }
}
