package com.example.demo.funcional;

public class PersonaSupplier2Impl implements IPersonaSupplier<Persona> {

	@Override
	public Persona getNombre() {

		Persona per = new Persona();
		per.setNombre("santiago1");
		per.setApellido("chango1");
		return per;

	}

}
