package pla6;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import Validation.ValidarCorreo;
import Validation.ValidarDni;

public class alumno {
	@NotEmpty(message="Este campo es obligatorio")
	@Size(min=3,message="el tamaño minimo del nombre es de 3 letras")
	private String nombre;
	@NotEmpty(message="Campo obligatorio")
	@ValidarDni
	private String dni;
	@NotEmpty(message="Campo obligatorio")
	@ValidarCorreo
	private String email;
	private String becado;
	@NotEmpty(message="Mínimo una asignatura")
	private String[] asignaturas;
	private Map<String,String> listaAsignaturas;
	private Map<String,String> listaBecado;
	
	alumno() {
		listaAsignaturas=new LinkedHashMap<String,String>();
		listaAsignaturas.put("PHP", "PHP");
		listaAsignaturas.put("JAVA", "JAVA");
		listaAsignaturas.put("JS", "JS");
		listaAsignaturas.put(".NET", ".NET");
		
		listaBecado=new LinkedHashMap<String,String>();
		listaBecado.put("No", "No");
		listaBecado.put("Si", "Si");
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getBecado() {
		return becado;
	}
	public void setBecado(String becado) {
		this.becado = becado;
	}
	public String[] getAsignaturas() {
		return asignaturas;
	}
	public void setAsignaturas(String[] asignaturas) {
		this.asignaturas = asignaturas;
	}
	public Map<String,String> getlistaAsignaturas() {
		return listaAsignaturas;
	}
	public Map<String,String> getlistaBecado() {
		return listaBecado;
	}

}
