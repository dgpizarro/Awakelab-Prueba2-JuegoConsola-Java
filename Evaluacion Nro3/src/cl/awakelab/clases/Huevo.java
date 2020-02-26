package cl.awakelab.clases;

public class Huevo {

	private int coordenadaColumna;
	private int coordenadaFila;
	private int puntaje;
	
	
	public Huevo(int coordenadaColumna, int coordenadaFila, int puntaje) {
		this.coordenadaColumna = coordenadaColumna;
		this.coordenadaFila = coordenadaFila;
		this.puntaje = puntaje;
	}

	@Override
	public String toString() {
		return "Huevo [coordenadaColumna=" + coordenadaColumna + ", coordenadaFila=" 
			+ coordenadaFila + ", puntaje=" + puntaje + "]";
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

	public int getPuntaje() {
		return puntaje;
	}

	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}
	
}
