package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Estudiante;
import com.example.demo.modelo.dto.EstudianteDTO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class EstudianteRepoImp implements IEstudianteRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Estudiante buscarPorNombreQuery(String nombre) {
		// TODO Auto-generated method stub
		// SELECT * from estudiante where estu_nombre=´edison´
		// select e from Estudiante e where e.nombre= :datoNombre
		Query jpqlQuery = this.entityManager.createQuery("select e from Estudiante e where e.nombre = :datoNombre");
		jpqlQuery.setParameter("datoNombre", nombre);
		return (Estudiante) jpqlQuery.getSingleResult();
	}

	@Override
	public Estudiante buscarPorApellidoQuery(String apellido) {
		// TODO Auto-generated method stub

		// select e from Estudiante e where e.apellido= :datoApellido
		Query jpqlQuery = this.entityManager.createQuery("select e from Estudiante e where e.apellido= :datoApellido");
		jpqlQuery.setParameter("datoApellido", apellido);
		return (Estudiante) jpqlQuery.getSingleResult();
	}

	@Override
	public Estudiante buscarPorGeneroQuery(String genero) {
		// TODO Auto-generated method stub
		Query jpqlQuery = this.entityManager.createQuery("select e from Estudiante e where e.genero = :datoGenero");
		jpqlQuery.setParameter("datoGenero", genero);
		return (Estudiante) jpqlQuery.getSingleResult();
	}

	@Override
	public Estudiante buscarPorCedulaQuery(String cedula) {
		// TODO Auto-generated method stub
		Query jpqlQuery = this.entityManager.createQuery("select e from Estudiante e where e.cedula = :datoCedula");
		jpqlQuery.setParameter("datoCedula", cedula);
		return (Estudiante) jpqlQuery.getSingleResult();
	}

	@Override
	public Estudiante buscarPorCiudadQuery(String ciudad) {
		// TODO Auto-generated method stub
		// SELECT * from estudiante where estu_nombre=´edison´
		// select e from Estudiante e where e.nombre= :datoNombre
		Query jpqlQuery = this.entityManager.createQuery("select e from Estudiante e where e.ciudad = :datoCiudad");
		jpqlQuery.setParameter("datoCiudad", ciudad);
		return (Estudiante) jpqlQuery.getSingleResult();

	}

	@Override
	public void insertar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.entityManager.persist(estudiante);
	}

	@Override
	public Estudiante buscarPorNombreTypeQuery(String nombre) {
		// TODO Auto-generated method stub
		TypedQuery<Estudiante> myTypedQuery = this.entityManager
				.createQuery("select e from Estudiante e where e.nombre = :datoNombre", Estudiante.class);
		myTypedQuery.setParameter("datoNombre", nombre);
		return myTypedQuery.getSingleResult();
	}

	@Override
	public Estudiante buscarPorNombreNamedQuery(String nombre) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createNamedQuery("Estudiante.buscarPorNom");
		myQuery.setParameter("datoNombre", nombre);

		return (Estudiante) myQuery.getSingleResult();
	}

	@Override
	public Estudiante buscarPorNombreNamedQueryTyped(String nombre) {
		TypedQuery<Estudiante> myQuery = this.entityManager.createNamedQuery("Estudiante.buscarPorNom",
				Estudiante.class);
		myQuery.setParameter("datoNombre", nombre);
		return myQuery.getSingleResult();
	}

	@Override
	public Estudiante buscarPorNombreNativeQuery(String nombre) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createNativeQuery("select * from estudiante where estu_nombre = :datoNombre",
				Estudiante.class);
		myQuery.setParameter("datoNombre", nombre);
		return (Estudiante) myQuery.getSingleResult();
	}

	@Override
	public Estudiante buscarPorNombreNativeQueryTypedNamed(String nombre) {
		// TODO Auto-generated method stub
		TypedQuery<Estudiante> myQuery = this.entityManager.createNamedQuery("Estudiante.bucarPorNombreNativo",
				Estudiante.class);
		myQuery.setParameter("datoNombre", nombre);
		return myQuery.getSingleResult();
	}

	@Override
	public List<Estudiante> buscarPorNombreQueryList(String nombre) {
		// select e from Estudiante e where e.nombre= :datoNombre
		Query jplQuery = this.entityManager.createQuery("select e from Estudiante e where e.nombre = :datoNombre ");
		jplQuery.setParameter("datoNombre", nombre); // Datos que voy a enlazar datoNombre ---> nombre
		// Retorna tipos de objetos generico por lo que se debe castear a estudiante
		return jplQuery.getResultList();
	}

	@Override
	public List<Estudiante> buscarPorNombreNamedQueryList(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Estudiante> buscarPorNombreNativeQueryTypedNamedList(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EstudianteDTO buscarPorNombreNamedQueryTypedDTO(String nombre) {
		TypedQuery<EstudianteDTO> myQuery = this.entityManager.createQuery(
				"select NEW com.example.demo.modelo.dto.EstudianteDTO(e.nombre,e.apellido,e.cedula) from Estudiante e where e.nombre = :datoNombre",
				EstudianteDTO.class);
		myQuery.setParameter("datoNombre", nombre);
		return myQuery.getSingleResult();
	}

	@Override
	public EstudianteDTO buscarPorNombreTypedQueryDTO(String nombre) {
		TypedQuery<EstudianteDTO> myTypedQuery = this.entityManager.createQuery(
				"select NEW com.example.demo.modelo.dto.EstudianteDTO(e.nombre,e.apellido,e.cedula) from Estudiante e where e.nombre = :datoNombre ",
				EstudianteDTO.class);
		myTypedQuery.setParameter("datoNombre", nombre);
		return myTypedQuery.getSingleResult();
	}

	@Override
	public Estudiante buscarPorNombreQueryTypedCriteria(String nombre) {
		// TODO Auto-generated method stub
		CriteriaBuilder myBuilder = this.entityManager.getCriteriaBuilder();
		// Especificamos el tipo de retorno de mi query

		CriteriaQuery<Estudiante> myQuery = myBuilder.createQuery(Estudiante.class);
		// AQUI EMPEZAMOS A CREAR EL SQL COMO TAL
		// DEFINIENDO EL FROM - Root
		Root<Estudiante> myTablaFrom = myQuery.from(Estudiante.class);// from Estudiante

		// LAS CONDICIONES WHERE SE CONOCEN EN CRITERIA API QUERY COMO PREDICADOS
		// e.nombre=:datoNombre
		Predicate condicion1 = myBuilder.equal(myTablaFrom.get("nombre"), nombre);

		myQuery.select(myTablaFrom).where(condicion1);

		// DECLARADO MI QUERY
		// LA EJECUCION DEL QUERY LO REALIZAMOS CON CUALQUIER TIPO YA CONOCIDO:
		// RECOMENDACION TYPEDQUERY

		TypedQuery<Estudiante> mySQL = this.entityManager.createQuery(myQuery);

		return mySQL.getSingleResult();
	}

	@Override
	public List<Estudiante> buscarPorNombreCriteriaAndOr(String nombre, String apellido, String genero) {
		// TODO Auto-generated method stub
		CriteriaBuilder myBuilder = this.entityManager.getCriteriaBuilder();
		// Especificamos el tipo de retorno de mi query

		CriteriaQuery<Estudiante> myQuery = myBuilder.createQuery(Estudiante.class);
		// AQUI EMPEZAMOS A CREAR EL SQL COMO TAL
		// DEFINIENDO EL FROM - Root
		Root<Estudiante> myTablaFrom = myQuery.from(Estudiante.class);// from Estudiante

		// M: e.nombre= and e.apellido=
		// F: e.nombre= OR e.apellido=
		// CREAMOS LOS PREDICADOS
		// PREDICADO DEL NOMBRE

		Predicate p1 = myBuilder.equal(myTablaFrom.get("nombre"), nombre);

		// PREDICADO DEL APELLIDO

		Predicate p2 = myBuilder.equal(myTablaFrom.get("apellido"), apellido);

		Predicate predicadoFinal = null;

		if (genero.equals("M")) {
			// PREDICADO DE AND
			predicadoFinal = myBuilder.and(p1, p2);
		} else {
			// PREDICADO DE OR
			predicadoFinal = myBuilder.or(p1, p2);
		}


		myQuery.select(myTablaFrom).where(predicadoFinal);

		
		TypedQuery<Estudiante> mySQL = this.entityManager.createQuery(myQuery);

		return mySQL.getResultList();
		
	}

}
