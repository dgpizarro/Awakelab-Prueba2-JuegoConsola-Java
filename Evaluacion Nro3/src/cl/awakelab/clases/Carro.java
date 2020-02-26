package cl.awakelab.clases;

/**
 * Esta es nuestra clase padre
 * @author Andres Barroso, Diego Pizarro.
 * @version 1.0.0.0
 * 
 */

public class Carro {

	private int cantidadOcupantes;
	private String fechaIngreso;
	private int coordenadaColumna;
	private int coordenadaFila;
	
	public Carro(int cantidadOcupantes, String fechaIngreso, int coordenadaColumna, 
		int coordenadaFila) {
		this.cantidadOcupantes = cantidadOcupantes;
		this.fechaIngreso = fechaIngreso;
		this.coordenadaColumna = coordenadaColumna;
		this.coordenadaFila = coordenadaFila;
	}

	@Override
	public String toString() {
		return ", Cantidad de ocupantes: " + cantidadOcupantes + ", Fecha de ingreso: " 
			+ fechaIngreso + ", Columna: " + coordenadaColumna + ", Fila: " + 
			coordenadaFila + "]";
	}

	public int getCantidadOcupantes() {
		return cantidadOcupantes;
	}

	public void setCantidadOcupantes(int cantidadOcupantes) {
		this.cantidadOcupantes = cantidadOcupantes;
	}

	public String getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public int getCoordenadaColumna() {
		return coordenadaColumna;
	}

	public void setCoordenadaColumna(int coordenadaColumna) {
		this.coordenadaColumna = coordenadaColumna;
	}

	public int getCoordenadaFila() {
		return coordenadaFila;
	}

	public void setCoordenadaFila(int coordenadaFila) {
		this.coordenadaFila = coordenadaFila;
	}
	
	
	

}
