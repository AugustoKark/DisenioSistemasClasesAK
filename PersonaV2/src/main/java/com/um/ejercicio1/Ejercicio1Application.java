package com.um.ejercicio1;

import com.um.ejercicio1.entidades.Domicilio;
import com.um.ejercicio1.entidades.Persona;
import com.um.ejercicio1.repositorios.DomicilioRepository;
import com.um.ejercicio1.repositorios.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Optional;

@SpringBootApplication
public class Ejercicio1Application {

	@Autowired
	PersonaRepository personaRepository;

	public static void main(String[] args) {
		SpringApplication.run(Ejercicio1Application.class, args);

	}

	@Bean
	public CommandLineRunner init() {
		return args -> {
			// Código a ejecutar después de la inicialización de la aplicación
			System.out.println("La aplicación se ha iniciado. Realizando tareas iniciales...");
			Persona persona = Persona.builder()
					.nombre("Juan")
					.apellido("Perez")
					.edad(30)
					.build();

			Domicilio domicilio = Domicilio.builder()
					.calle("Suipacha")
					.numero(123)
					.build();

			persona.setDomicilio(domicilio);

			personaRepository.save(persona);
//			personaRepository.findById(
			Persona personarecuperada = personaRepository.findById(persona.getId());
					if (personarecuperada != null) {
						System.out.println("Persona recuperada: " + personarecuperada);
					} else {
						System.out.println("No se encontró la persona con id: " + persona.getId());
					}
		
		
		};
		

	}
}
//	Persona persona0 = new Persona(1L,"Franco","Benitez", 20);



