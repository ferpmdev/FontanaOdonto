package com.example.FontanaOdonto.controller;

import com.example.FontanaOdonto.model.OdontologoDTO;
import com.example.FontanaOdonto.service.IOdontologoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/odontologos")
public class OdontologoController {

    @Autowired
    IOdontologoService odontologoService;

    @PostMapping
    public ResponseEntity<?> crearOdontologo(@RequestBody OdontologoDTO odontologoDTO) {
        odontologoService.crearOdontologo(odontologoDTO);
        return ResponseEntity.ok(HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public OdontologoDTO getOdontologo(@PathVariable Integer id) {
        return odontologoService.leerOdontologo(id);
    }
}
