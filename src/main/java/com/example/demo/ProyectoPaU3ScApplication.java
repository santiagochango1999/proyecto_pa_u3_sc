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

import com.example.demo.modelo.Automovil;
import com.example.demo.modelo.Cliente;
import com.example.demo.modelo.Estudiante;
import com.example.demo.modelo.Habitacion;
import com.example.demo.modelo.Hotel;
import com.example.demo.modelo.Renta;
import com.example.demo.modelo.Vehiculo;
import com.example.demo.service.IAutomovilService;
import com.example.demo.service.IClienteService;
import com.example.demo.service.IEstudianteService;
import com.example.demo.service.IHotelService;
import com.example.demo.service.IRentaService;
import com.example.demo.service.IVehiculoService;

@SpringBootApplication
public class ProyectoPaU3ScApplication implements CommandLineRunner {

	@Autowired
//	private IAutomovilService iAutomovilService;
//	private IEstudianteService estudianteService;
	private IHotelService hotelService;

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
//		Estudiante estudiante =new Estudiante();
//		estudiante.setApellido("jami");
//		estudiante.setCedula("154456");
//		estudiante.setCiudad("guayaquil");
//		estudiante.setFechaNacimiento(LocalDateTime.now());
//		estudiante.setGenero("m");
//		estudiante.setHobby("gym");
//		estudiante.setNombre("santiag");
//		estudiante.setPais("peru");
//		estudiante.setSalario(new BigDecimal(100));
////		
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

//		List<Estudiante> list=this.estudianteService.buscarPorNombreQueryList("santiag");
//		
//		
//		System.out.println(list);

//		System.out.println(this.estudianteService.buscarPorNombreNamedQueryTypedDTO("santiag"));
//		System.out.println(this.estudianteService.buscarPorNombreTypedQueryDTO("santiag"));
//		System.out.println(this.estudianteService.buscarPorNombreQueryTypedCriteria("santiag"));
//		System.out.println("and");
//		System.out.println(this.estudianteService.buscarPorNombreCriteriaAndOr("santiag","chan","M"));
//		System.out.println("or");
//		System.out.println(this.estudianteService.buscarPorNombreCriteriaAndOr("santiag","chan","F"));

//		System.out.println(this.estudianteService.actualizarPorApellido("chan", "mateo"));
//		System.out.println(this.estudianteService.eliminarPorApellido("jami"));
		// DEBER
//		Automovil automovil = new Automovil();
//		automovil.setAño("1999");
//		automovil.setMarca("TOYOTA");
//		automovil.setNombreDueño("santiago");
//		automovil.setNumeroPuertas("5");
//		automovil.setPlaca("PRT0392");
//		automovil.setColor("ROJO");
//		automovil.setValor(new BigDecimal(15000));
//
////		this.iAutomovilService.crear(automovil);
//
//		// Placa
//		// 1
//		System.out.println("Consulta 1 " + this.iAutomovilService.buscarPorPlacaTypedQuery("PRT0392"));
//		// 2
//		System.out.println("Consulta 2 " + this.iAutomovilService.buscarPorPlacaNativeQuery("PRT0392"));
//		// 3
//		System.out.println("Consulta 3 " + this.iAutomovilService.buscarPorPlacaNamedQuery("PRT0392"));
//		// 4
//		System.out.println("Consulta 4 " + this.iAutomovilService.buscarPorPlacaNamedNativeQuery("PRT0392"));
//		// Marca
//		System.out.println("Consulta 5 " + this.iAutomovilService.buscarPorMarcaTypedQuery("TOYOTA"));
//		// 2
//		System.out.println("Consulta 6 " + this.iAutomovilService.buscarPorMarcaNativeQuery("TOYOTA"));
//		// 3
//		System.out.println("Consulta 7 " + this.iAutomovilService.buscarPorMarcaNamedQuery("TOYOTA"));
//		// 4
//		System.out.println("Consulta 8 " + this.iAutomovilService.buscarPorMarcaNamedNativeQuery("TOYOTA"));
//		// Color
//		System.out.println("Consulta 9 " + this.iAutomovilService.buscarPorColorTypedQuery("ROJO"));
//		// 2
//		System.out.println("Consulta 10 " + this.iAutomovilService.buscarPorColorNativeQuery("ROJO"));
//		// 3
//		System.out.println("Consulta 11 " + this.iAutomovilService.buscarPorColorNamedQuery("ROJO"));
//		// 4
//		System.out.println("Consulta 12 " + this.iAutomovilService.buscarPorColorNamedNativeQuery("ROJO"));

		// deber
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
		// ------------------------------------------------
//		System.out.println("ACTUALIZAR POR NOMBRE");
//		System.out.println(this.hotelService.actualizarPorNombre("la vista","marin" ));
//		
//		System.out.println("ACTUALIZAR POR DIRECCION");
//		System.out.println(this.hotelService.actualizarPorDireccion("pujili", "maritimo"));

//		System.out.println("ELIMINAR POR NOMBRE");
//		System.out.println(this.hotelService.eliminarPorNombre("maritimo"));
//
//		System.out.println("ELIMINAR POR DIRECCION");
//		System.out.println(this.hotelService.eliminarPorDireccion("SOLANDA"));
//
//		---------------------------------------------------------

		List<Hotel> lista = new ArrayList<>();

		lista = this.hotelService.buscarHotelInnerJoin("VIP");

		System.out.println("INNER JOIN");
		System.out.println();

		for (Hotel h : lista) {
			System.out.println(h.getNombre());
			System.out.println(h.getHabitacion());
//			for (Habitacion ha : h.getHabitacion()) {
//				System.out.println("LAs habi son" + h.getNombre() + ":" + ha.getNumero());
//			}
		}


		lista = this.hotelService.buscarHotelOtherRightJoin("VIP");

		System.out.println("RIGHT JOIN");

		for (Hotel h : lista) {
			System.out.println(h.getNombre());
//			for (Habitacion ha : h.getHabitacion()) {
//				System.out.println("LAs habi son" + h.getNombre() + ":" + ha.getNumero());
//			}
		}

		
		
		

		lista = this.hotelService.buscarHotelOtherLengtJoin("VIP");

		System.out.println("LEFT JOIN");
		System.out.println();

		for (Hotel h : lista) {
			System.out.println(h.getNombre());
			for (Habitacion ha : h.getHabitacion()) {
				System.out.println("LAs habi son" + h.getNombre() + ":" + ha.getNumero());
			}
		}

//		System.out.println("FULL JOIN");
//		System.out.println(this.hotelService.buscarHotelOtherFullJoin(""));
//
//		System.out.println("FETCH JOIN");
//		System.out.println(this.hotelService.buscarHotelFetchJoin(""));

	}

}
