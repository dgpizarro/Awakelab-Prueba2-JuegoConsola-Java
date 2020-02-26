package cl.awakelab.clases;

public class Caguano extends Carro {

    private int alcanceTiro;
    private String colorConfeti;

    public Caguano(int cantidadOcupantes, String fechaIngreso, int coordenadaColumna, int coordenadaFila,
	    int alcanceTiro, String colorConfeti) {
	super(cantidadOcupantes, fechaIngreso, coordenadaColumna, coordenadaFila);
	this.alcanceTiro = alcanceTiro;
	this.colorConfeti = colorConfeti;
    }

    @Override
    public String toString() {
	return "Tipo: Caguano, Alcance de tiro: " + alcanceTiro + ", Color confeti: " + colorConfeti + super.toString();
    }

    public int getAlcanceTiro() {
	return alcanceTiro;
    }

    public void setAlcanceTiro(int alcanceTiro) {
	this.alcanceTiro = alcanceTiro;
    }

    public String getColorConfeti() {
	return colorConfeti;
    }

    public void setColorConfeti(String colorConfeti) {
	this.colorConfeti = colorConfeti;
    }

}
