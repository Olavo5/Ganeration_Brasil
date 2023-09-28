package com.primeiro.helloworld.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseBody;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {
	@GetMapping
	public String helloWorld() {
		return "Hello World!!!";
	}

	@GetMapping("/bsm")
	@ResponseBody
	public List<String> BSM() {
	    List<String> bsmItems = Arrays.asList(
	        "Persistência",
	        "Mentalidade de Crescimento",
	        "Orientação ao Futuro",
	        "Responsabilidade Pessoal",
	        "Trabalho em Equipe",
	        "Comunicação",
	        "Orientação aos Detalhes",
	        "Proatividade"
	    );
	    return bsmItems;
	}

	@GetMapping("/semana")
	@ResponseBody
    public List<String> objetivosDaSemana() {
        List<String> objetivos = Arrays.asList(
            "Aprender Java Spring Boot",
            "Praticar trabalho em equipe",
            "Boas práticas de programação"
        );

        return objetivos;
    }

}
