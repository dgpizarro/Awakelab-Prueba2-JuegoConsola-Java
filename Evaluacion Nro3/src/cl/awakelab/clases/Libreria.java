package cl.awakelab.clases;

public class Libreria {

	
	private String fechaIngreso[] = {"Marzo del 2014", "Enero del 2013", "Agosto del 2005", 
		"Octubre del 2010", "Julio del 2007", "Abril del 2008", "Febrero del 2002"};
	private String marca[] = {"Mercedes Benz", "Volvo", "Chevrolet", "Audi", "BMW", "Dodge"};
	private String anoFabricacion[] = {"1998", "1995", "2000", "1997", "1995", "1999"};
	private String colorConfeti[] = {"Verde", "Turqueza", "Caca'e'guagua", "Rojo", "Amarillo", 
		"Blanco", "Azul"};
	private String nombreConductor[] = {"", "", "", "", "", "", "", "", "Luis Soto", "Juan Gomez", 
		"Pedro Cabieres", "Miguel Iturra", "Ana Jimenez", "Maria Gonzalez", "Pedro Andaur", 
		"Roberto Montiel", "Carla Rodriguez", "Pedro Angel", "Ricardo Montaner", };
	
	public Libreria() {
	}
	
	public String rellenarFechaIngreso() {
		int indice = (int) (Math.random()*(fechaIngreso.length));
		return fechaIngreso[indice];
	}
	
	public String rellenarMarca() {
		int indice = (int) (Math.random()*(marca.length));
		return marca[indice];
	}
	
	public String rellenarAnoFabricacion() {
		int indice = (int) (Math.random()*(anoFabricacion.length));
		return anoFabricacion[indice];
	}
	
	public String rellenarColorConfeti() {
		int indice = (int) (Math.random()*(colorConfeti.length));
		return colorConfeti[indice];
	}
	
	public String rellenarNombreConductor(int indice) {
		return nombreConductor[indice];
	}
	
	
	
	
}
