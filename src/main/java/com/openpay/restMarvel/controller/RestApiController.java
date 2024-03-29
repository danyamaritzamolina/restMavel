package com.openpay.restMarvel.controller;

import com.openpay.restMarvel.entity.CharacterDataWrapper;
import java.io.IOException;
import com.openpay.restMarvel.service.RestApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



/**
 * Clase Controller para definir endpoint para la conexion entre el front y el back
 * @author danya
 */
@RestController
@RequestMapping("/restapi")
public class RestApiController {
    private final RestApiService restApiService;
    @Autowired
    public RestApiController(RestApiService restApiService) {
        this.restApiService = restApiService;
    }
    /**
     * Metodo para consultar todas las respuestas de characteres
     * @return 
     */
    //@Override
    @GetMapping(value = "/getAll/{ts}")
    public ResponseEntity<String> getAll( @PathVariable Long ts) {
        String result;
        result = restApiService.getAllService(ts).getBody();
        return ResponseEntity.ok(result);
    }
    
    /**
     * Metodo para consultar 
     * @param id
     * @return 
     */
    @GetMapping(value = "/getById/{id}/{ts}")
    public ResponseEntity<String> getById(@PathVariable("id") String id,  @PathVariable Long ts) {
        String result;
        result = restApiService.getByIdService(id,ts).getBody();
        return ResponseEntity.ok(result);
    }
}
