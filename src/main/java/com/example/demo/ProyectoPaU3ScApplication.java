package com.example.demo;

import java.applet.AudioClip;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class ProyectoPaU3ScApplication implements CommandLineRunner {

	

	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU3ScApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("hola");

	}

}
