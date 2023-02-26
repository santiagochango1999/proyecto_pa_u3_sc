package com.example.demo.funcional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainInterfacesFuncionales {
	private static final Logger LOG = LoggerFactory.getLogger(MainInterfacesFuncionales.class);

	public static void main(String[] args) {

		// 1. SUPPLIER

		// CLASES
		LOG.info("1.SUPPIER");
		IPersonaSupplier<String> supplier = new PersonaSupplierImpl();

		LOG.info("Supplier Clase: " + supplier.getNombre());

		// LAMBDAS
		IPersonaSupplier<String> supplier2 = () -> "EDISON 2";
		LOG.info("Supplier LAMBDA: " + supplier2.getNombre());

		IPersonaSupplier<Integer> supplier3 = () -> new Integer(5);
		LOG.info("Supplier LAMBDA: " + supplier3.getNombre());

		IPersonaSupplier<Persona> supplier4 = () -> {
			Persona per = new Persona();
			per.setNombre("santiago");
			per.setApellido("chango");
			return per;
		};
		LOG.info("Supplier LAMBDA: " + supplier4.getNombre());

		IPersonaSupplier<Persona> supplier5 = new PersonaSupplier2Impl();
		LOG.info("Supplier LAMBDA: " + supplier5.getNombre());

		// 2.CONSUMER
		LOG.info("2.CONSUMER");

		// CLASE
		IPersonaConsumer<String, Integer> consumer = new PersonaConsumerImpl();
		consumer.accept("procesa este dato", Integer.valueOf(10));

		// LAMBDA
		IPersonaConsumer<String, Integer> consumer2 = (cadena, numero) -> {
			LOG.info("mensaje a: " + cadena);
			LOG.info("mensaje b: " + cadena);
			LOG.info("mensaje c: " + numero);
		};
		consumer2.accept("procesa este dato 2", Integer.valueOf(15));

		IPersonaConsumer<Integer, Integer> consumer3 = (valor1, valor2) -> {
			Integer valor3 = valor1.intValue() + valor2.intValue();
			LOG.info("valor3: " + valor3);

		};

		consumer3.accept(Integer.valueOf(5), Integer.valueOf(10));

		// 3.PREDICATE
		LOG.info("3.PREDICATE");

		// LAMBDAS
		IPersonaPredicate<String> predicate = cadena -> cadena.contains("Z");
		LOG.info("Predicate :" + predicate.evaluar("EDISON"));

		IPersonaPredicate<Integer> predicate2 = numero -> {
			if (numero.intValue() > 10) {
				return true;
			} else {
				return false;
			}
		};

		LOG.info("Predicate :" + predicate2.evaluar(Integer.valueOf(11)));

		// 4.FUNCTION
		LOG.info("4.FUNCTION");

		// LAMBDA
		IPersonaFuncion<String, Integer> function = numero -> "valor: " + numero.toString();
		LOG.info(function.aplicar(10));

		IPersonaFuncion<Ciudadano, Persona> function2 = per -> {

			Ciudadano ciu = new Ciudadano();
			ciu.setNombreCompleto(per.getNombre() + "" + per.getApellido());
			ciu.setCiudad("quito");
			return ciu;

		};

		Persona persona = new Persona();
		persona.setNombre("santiago");
		persona.setApellido("chango");
		Ciudadano ciuconvertido = function2.aplicar(persona);
		LOG.info("CIUDADANO CONVERTIDO: " + ciuconvertido);

		// 5. UNARYOPERATOR
		LOG.info("4.UNARYOPERATOR");

		// LAMBDAS
		IPersonaUnaryOperator<String> unaryOperator = cadena -> {
			String cadenafinal = cadena.concat("-sufijo");
			return cadenafinal;

		};

		LOG.info("UNARYOPERATOR: "+unaryOperator.aplicar("Daniel"));

	}
}
