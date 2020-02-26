package cl.awakelab.clases;

public class Kromi extends Carro {

	private String anoFabricacion;
	private String marca;
	
	public Kromi(int cantidadOcupantes, String fechaIngreso, int coordenadaColumna, int coordenadaFila, String anoFabricacion, String marca) {
		super(cantidadOcupantes, fechaIngreso, coordenadaColumna, coordenadaFila);
		this.anoFabricacion = anoFabricacion;
		this.marca = marca;
	}

	@Override
	public String toString() {
		return  "Tipo: Kromi, Ano fabricacion: " + anoFabricacion + ", Marca: " + marca + super.toString();
	}

	public String getAnoFabricacion() {
		return anoFabricacion;
	}

	public void setAnoFabricacion(String anoFabricacion) {
		this.anoFabricacion = anoFabricacion;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	
}
