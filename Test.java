package Persona;

public class Test {

	public static void main(String[] args) {
		
		Persona persona1 = new Persona();
		persona1.setNombre("Mario");
		persona1.setEdad("23");
		
		
		Domicilio domicilio1 = new Domicilio();
		domicilio1.setCalle("zapiola");
		domicilio1.setNumero("1324");
		domicilio1.setCiudad("Neuquen");
		domicilio1.setPais("Argentina");
		
		persona1.setDireccion(domicilio1);
		
		tester(persona1);

	}
	
	public static void tester(Persona persona) {
		System.out.println(persona.getNombre());
		System.out.println(persona.getEdad());
		System.out.println(persona.getDireccion());	
		
	}

}
