package cl.awakelab.clases;

public class Trupalla extends Carro {

	private int nivelArmadura;
	private String nombreConductor;
	
	public Trupalla(int cantidadOcupantes, String fechaIngreso, int coordenadaColumna, 
		int coordenadaFila, int nivelArmadura, String nombreConductor) {
		super(cantidadOcupantes, fechaIngreso, coordenadaColumna, coordenadaFila);
		this.nivelArmadura = nivelArmadura;
		this.nombreConductor = nombreConductor;
	}

	@Override
	public String toString() {
		return  "Tipo: Trupalla, Nivel de Armadura: " + nivelArmadura + ", "
			+ "Nombre de conductor: " + nombreConductor + super.toString();
		
	}

	public int getNivelArmadura() {
		return nivelArmadura;
	}

	public void setNivelArmadura(int nivelArmadura) {
		this.nivelArmadura = nivelArmadura;
	}

	public String getNombreConductor() {
		return nombreConductor;
	}

	public void setNombreConductor(String nombreConductor) {
		this.nombreConductor = nombreConductor;
	}
	
	
}
