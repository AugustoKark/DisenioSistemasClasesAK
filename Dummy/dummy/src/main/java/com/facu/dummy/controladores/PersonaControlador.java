package com.facu.dummy.controladores;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping(path = "api/personas")
 class PersonaControlador {

    @GetMapping("dummy")
    public ResponseEntity<String> getDummy() {
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body("Lo que me solicitaste soy Dummy");
        }
        catch (Exception e) {
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body("{\"error\":\"Error, por favor intente mas tarde.\"}");
        }
    }

    @GetMapping("subRuta")
    public ResponseEntity<String> holaMundo() {
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body("Te saludo desde la APi Dummy");
        }
        catch (Exception e) {
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body("{\"error\":\"Error, por favor intente mas tarde.\"}");
        }
    }
    @GetMapping("subRutaChau")
    public ResponseEntity<String> chauMundo() {
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body("Me despido desde la APi Dummy");
        }
        catch (Exception e) {
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body("{\"error\":\"Error, por favor intente mas tarde.\"}");
        }
    }
    @GetMapping("/{id}")
    public ResponseEntity<String> getDummyById(@PathVariable Long id) {
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body("Te devuelvo un registro de la base de datos con id: " + id);
        }
        catch (Exception e) {
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body("{\"error\":\"Error, por favor intente mas tarde.\"}");
        }
    }
    @GetMapping("/all")
    public ResponseEntity<String> getAll() {
        try {
          return ResponseEntity
              .status(HttpStatus.OK)
              .body("Te devuelvo todos los registros de la base de datos");
        } catch (Exception e) {
          return ResponseEntity
              .status(HttpStatus.NOT_FOUND)
              .body("{\"error\":\"Error, por favor intente mas tarde.\"}");
        }
      }
  @PostMapping()
    public ResponseEntity<String> create(@RequestBody String persona) {
        try {
          return ResponseEntity
              .status(HttpStatus.CREATED)
              .body("Te devuelvo la persona creada:"+ persona);
        } catch (Exception e) {
          return ResponseEntity
              .status(HttpStatus.NOT_FOUND)
              .body("{\"error\":\"Error, por favor intente mas tarde.\"}");
        }
      }
      @PutMapping("/{id}")
        public ResponseEntity<String> update(@PathVariable Long id, @RequestBody String persona) {
            try {
              return ResponseEntity
                  .status(HttpStatus.OK)
                  .body("Te devuelvo la persona actualizada con id: " + id + " " + persona);
            } catch (Exception e) {
              return ResponseEntity
                  .status(HttpStatus.NOT_FOUND)
                  .body("{\"error\":\"Error, por favor intente mas tarde.\"}");
            }
          }
}
