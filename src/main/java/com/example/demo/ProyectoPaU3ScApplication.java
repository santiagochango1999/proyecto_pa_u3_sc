package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.modelo.Cliente;
import com.example.demo.modelo.Estudiante;
import com.example.demo.modelo.Renta;
import com.example.demo.modelo.Vehiculo;
import com.example.demo.service.IClienteService;
import com.example.demo.service.IEstudianteService;
import com.example.demo.service.IRentaService;
import com.example.demo.service.IVehiculoService;

@SpringBootApplication
public class ProyectoPaU3ScApplication implements CommandLineRunner{

	@Autowired
	private IEstudianteService estudianteService;
	
//	@Autowired
//	private IClienteService clienteService;
//	
//	@Autowired
//	private IVehiculoService vehiculoService;
//	
//	@Autowired
//	private IRentaService rentaService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU3ScApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Estudiante estudiante =new Estudiante();
		estudiante.setApellido("chan");
		estudiante.setCedula("154456");
		estudiante.setCiudad("guayaquil");
		estudiante.setFechaNacimiento(LocalDateTime.now());
		estudiante.setGenero("m");
		estudiante.setHobby("gym");
		estudiante.setNombre("santiag");
		estudiante.setPais("peru");
		estudiante.setSalario(new BigDecimal(100));
		
//		this.estudianteService.insertar(estudiante);
//		System.out.println("BUSCAR POR APELLIDO");
//		System.out.println(this.estudianteService.buscarPorApellido("chan"));
//		System.out.println("BUSCAR POR GENERO");
//		System.out.println(this.estudianteService.buscarPorGeneroQuery("m"));
//		System.out.println("BUSCAR POR CEDULA");
//		System.out.println(this.estudianteService.buscarPorCedulaQuery("1544561"));
//		System.out.println("BUSCAR POR CIUDAD");
//		System.out.println(this.estudianteService.buscarPorCiudadQuery("quito"));
//		
//		System.out.println("BUSCAR POR nombre typedquery");
//		System.out.println(this.estudianteService.buscarPorNombreTypeQuery("santiag"));
//		System.out.println("BUSCAR POR nombre NAMEDquery");
//		System.out.println(this.estudianteService.buscarPorNombreNamedQuery("santiag"));
//		System.out.println("BUSCAR POR nombre namedqueryTYPED");
//		System.out.println(this.estudianteService.buscarPorNombreNamedQueryTyped("santiag"));
//		System.out.println("BUSCAR POR nombre NATIVEquery");
//		System.out.println(this.estudianteService.buscarPorNombreNativeQuery("santiag"));
//		System.out.println("BUSCAR POR nombre NATIVEqueryTYPEDNAMED");
//		System.out.println(this.estudianteService.buscarPorNombreNativeQueryTypedNamed("santiag"));
//		
	
		List<Estudiante> list=this.estudianteService.buscarPorNombreQueryList("santiag");
		
		
		System.out.println(list);

		
		//deber
//		List<Renta> lista=new ArrayList<>();
//		
//		Vehiculo vehiculo=new Vehiculo();
//		vehiculo.setCategoria("grnades");
//		vehiculo.setNumeroSerie("12345");
//		vehiculo.setPlaca("prt0392");
//		vehiculo.setPrecioDia(new BigDecimal(23));
//		
//		Cliente cliente=new Cliente();
//		cliente.setApellido("chango");
//		cliente.setCedula("1727490953");
//		cliente.setNombre("santiago");
//		cliente.setTarjetaCredito("2321321");
//		
//		//this.vehiculoService.agregar(vehiculo);
//		//this.clienteService.agregar(cliente);
//		
//		Renta renta=this.rentaService.realizarRenta("1727490953", "prt0392");
//		
//		lista.add(renta);
//		
//		cliente.setRenta(lista);
//		vehiculo.setRenta(lista);
		

	}

}
