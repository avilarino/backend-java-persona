package Persona;

public class Persona {
	
	String nombre;
	String edad;
	Domicilio direccion;
	
	Persona(){
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setDireccion(direccion);
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getEdad() {
		return edad;
	}


	public void setEdad(String edad) {
		this.edad = edad;
	}


	public Domicilio getDireccion() {
		return direccion;
	}


	public void setDireccion(Domicilio direccion) {
		this.direccion = direccion;
	}

	
}
