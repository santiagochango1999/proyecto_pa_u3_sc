package com.example.demo.paralelo;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class MainParaleloString {
	public static void main(String[] args) {
		List<Integer> idEstudiantes = new ArrayList<>();

		for (int i = 1; i <= 100; i++) {
			idEstudiantes.add(i);
		}

		idEstudiantes.forEach(numero -> System.out.println("ESTUDIANTE: " + numero));

		long tiempoInicial = System.currentTimeMillis();

		List<String> listafinal= idEstudiantes.parallelStream().map(id -> procesarIdEstudiante(id)).collect(Collectors.toList());

		// PROCESAR CADA ESTUDIANTE
//		long tiempoInicial = System.currentTimeMillis();
		List<String> listaFinal = new ArrayList<>();
//		for (Integer id : idEstudiantes) {
//			listaFinal.add(procesarIdEstudiante(id));
//		}
		long tiempoFinal = System.currentTimeMillis();
		long tiempoTranscurrido = (tiempoFinal - tiempoInicial) / 1000;
		listaFinal.forEach(cadena -> System.out.println(cadena));
		System.out.println("Tiempo Transcurrdio en seg: " + tiempoTranscurrido);

	}

	public static String procesarIdEstudiante(Integer idEstudiante) {
		// CONVERTIR A String
		String idConvertido = "E" + idEstudiante.toString();
		// INSERTAR EN LA BASE
		System.out.println("Insertando estudiante: " + idConvertido + " HILO: " + Thread.currentThread().getName());
		// 1SEGUNDO
		try {
			// 1
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return idConvertido;
	}
}