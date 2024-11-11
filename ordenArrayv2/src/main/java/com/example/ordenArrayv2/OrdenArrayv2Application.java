package com.example.ordenArrayv2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
@RestController
@RequestMapping("/api")
public class OrdenArrayv2Application {

	@GetMapping("/countFruits")  // Replace "countFruits" with your preferred endpoint name
	public Map<String, Integer> countFruitFrequencies() {
		String[] arregloA = {"Mochila", "Plátano", "Manzana", "Auto", "Manzana", "Celular", "Lámpara", "Plátano", "Pera", "Monitor", "Escritorio", "CPU", "Bocina", "Mouse", "Manzana", "Teclado", "Manzana", "Plátano"};
		String[] arregloB = {"Manzana", "Plátano", "Pera"};

		Map<String, Integer> frecuencias = new HashMap<>();

		for (String fruta : arregloB) {
			int contador = 0;
			for (String objeto : arregloA) {
				if (objeto.equals(fruta)) {
					contador++;
				}
			}
			frecuencias.put(fruta, contador);
		}

		return frecuencias;
	}

	public static void main(String[] args) {
		SpringApplication.run(OrdenArrayv2Application.class, args);
	}
}