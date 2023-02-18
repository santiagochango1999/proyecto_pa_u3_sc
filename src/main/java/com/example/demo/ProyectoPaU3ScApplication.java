package com.example.demo;

import java.applet.AudioClip;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.modelo.Item;
import com.example.demo.service.IItemService;



@SpringBootApplication
public class ProyectoPaU3ScApplication implements CommandLineRunner {

	@Autowired
	private IItemService iItemService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU3ScApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//PRIMERA PARTE
		Item item=new Item();
		item.setCodigoBarras("12345");
		item.setNombre("martillo");
		item.setPrecio(new BigDecimal(15));
		item.setStock(12);
		item.setTipo("construccion");
		
		this.iItemService.crear(item);

	}

}
