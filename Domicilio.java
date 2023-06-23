package Persona;

public class Domicilio {

	private String calle;
	private String numero;
	private String ciudad;
	private String pais;
	
	
	public Domicilio() {
		this.setCalle(calle);
		this.setNumero(numero);
		this.setCiudad(ciudad);
		this.setPais(pais);
	}
	

	public String getCalle() {
		return calle;
	}


	public void setCalle(String calle) {
		this.calle = calle;
	}


	public String getNumero() {
		return numero;
	}


	public void setNumero(String numero) {
		this.numero = numero;
	}


	public String getCiudad() {
		return ciudad;
	}


	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}


	public String getPais() {
		return pais;
	}


	public void setPais(String pais) {
		this.pais = pais;
	}


	@Override
	public String toString() {
	    return "Domicilio [calle=" + calle + ", numero=" + numero + ", ciudad=" + ciudad + ", pais=" + pais
	            + ", Calle=" + getCalle() + ", Numero=" + getNumero() + ", Ciudad=" + getCiudad()
	            + ",Pais=" + getPais() + "]";
	}
	
}
