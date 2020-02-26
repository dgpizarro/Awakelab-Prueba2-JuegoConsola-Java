package cl.awakelab.clases;

import java.util.ArrayList;

public class Tablero {

    Libreria librerias = new Libreria();

    private ArrayList<Huevo> huevazos;
    private Carro[] carrots;

    private int TAMANO_CUADRICULA = 15;
    private int MAXIMO_CARROS = 18;
    private int MAX_RANDOM_FILA_KROMI = 12;
    private int MAX_RANDOM_COLUMNA_CAGUANO = 13;

    private String[][] cuadricula;
    private String[][] cuadriculaHuevos;

    public Tablero() {
	this.huevazos = new ArrayList<Huevo>();
	this.carrots = new Carro[MAXIMO_CARROS];
	this.cuadricula = new String[TAMANO_CUADRICULA][TAMANO_CUADRICULA];
	this.cuadriculaHuevos = new String[TAMANO_CUADRICULA][TAMANO_CUADRICULA];
    }

    public ArrayList<Huevo> getHuevazos() {
	return huevazos;
    }

    public void setHuevazos(ArrayList<Huevo> huevazos) {
	this.huevazos = huevazos;
    }

    public Carro[] getCarrots() {
	return carrots;
    }

    public void setCarrots(Carro[] carrots) {
	this.carrots = carrots;
    }

    public String[][] getCuadricula() {
	return cuadricula;
    }

    public void setCuadricula(String[][] cuadricula) {
	this.cuadricula = cuadricula;
    }

    public String[][] getCuadriculaHuevos() {
	return cuadriculaHuevos;
    }

    public void setCuadriculaHuevos(String[][] cuadriculaHuevos) {
	this.cuadriculaHuevos = cuadriculaHuevos;
    }

    public void crearCarros() {
	// Kromis
	for (int j2 = 0; j2 < 3; j2++) {
	    int coordenadaFila;
	    int coordenadaColumna;
	    do {
		coordenadaFila = crearNumeroFila(MAX_RANDOM_FILA_KROMI);
		coordenadaColumna = crearNumeroColumna(cuadricula.length - 1);
	    } while (cuadricula[coordenadaFila][coordenadaColumna] != null
		    && cuadricula[coordenadaFila + 1][coordenadaColumna] != null
		    && cuadricula[coordenadaFila + 2][coordenadaColumna] != null);

	    carrots[j2] = new Kromi((int) ((Math.random() * 31) + 15), librerias.rellenarFechaIngreso(),
		    coordenadaColumna, coordenadaFila, librerias.rellenarAnoFabricacion(), 
		    librerias.rellenarMarca());
	    cuadricula[coordenadaFila][coordenadaColumna] = "K";
	    cuadricula[coordenadaFila + 1][coordenadaColumna] = "K";
	    cuadricula[coordenadaFila + 2][coordenadaColumna] = "K";
	}
	// Caguanos
	for (int j2 = 3; j2 < 8; j2++) {
	    int coordenadaFila;
	    int coordenadaColumna;
	    do {
		coordenadaFila = crearNumeroFila(cuadricula.length - 1);
		coordenadaColumna = crearNumeroColumna(MAX_RANDOM_COLUMNA_CAGUANO);
	    } while (cuadricula[coordenadaFila][coordenadaColumna] != null
		    && cuadricula[coordenadaFila][coordenadaColumna + 1] != null);

	    carrots[j2] = new Caguano((int) ((Math.random() * 3) + 2), librerias.rellenarFechaIngreso(),
		    coordenadaColumna, coordenadaFila, (int) ((Math.random() * 6) + 15),
		    librerias.rellenarColorConfeti());
	    cuadricula[coordenadaFila][coordenadaColumna] = "C";
	    cuadricula[coordenadaFila][coordenadaColumna + 1] = "C";
	}
	// Trupallas
	for (int j2 = 8; j2 < carrots.length; j2++) {
	    int coordenadaFila;
	    int coordenadaColumna;
	    do {
		coordenadaFila = crearNumeroFila(cuadricula.length - 1);
		coordenadaColumna = crearNumeroColumna(cuadricula.length - 1);
	    } while (cuadricula[coordenadaFila][coordenadaColumna] != null);

	    carrots[j2] = new Trupalla((int) ((Math.random() * 5) + 1), librerias.rellenarFechaIngreso(),
		    coordenadaColumna, coordenadaFila, (int) ((Math.random() * 5) + 1),
		    librerias.rellenarNombreConductor(j2));

	    cuadricula[coordenadaFila][coordenadaColumna] = "T";
	}

	// Llena vacios cuadricula
	for (int i = 0; i < cuadricula.length; i++) {
	    for (int j = 0; j < cuadricula.length; j++) {
		if (cuadricula[i][j] == null) {
		    cuadricula[i][j] = "";
		}

	    }
	}
	// Llena vacios cuadriculaHuevos
	for (int i = 0; i < cuadriculaHuevos.length; i++) {
	    for (int j = 0; j < cuadriculaHuevos.length; j++) {
		if (cuadriculaHuevos[i][j] == null) {
		    cuadriculaHuevos[i][j] = "";
		}

	    }
	}
    }

    public void lanzarHuevo(int coordenadaFila, int coordenadaColumna) {
	int coordenadaFilaCuadricula = coordenadaFila - 1;
	int coordenadaColumnaCuadricula = coordenadaColumna - 1;
	if (cuadricula[coordenadaFilaCuadricula][coordenadaColumnaCuadricula] == "") {
	    cuadricula[coordenadaFilaCuadricula][coordenadaColumnaCuadricula] = "H";
	    cuadriculaHuevos[coordenadaFilaCuadricula][coordenadaColumnaCuadricula] = "H";
	    huevazos.add(new Huevo(coordenadaFilaCuadricula, coordenadaColumnaCuadricula, 0));
	} else {
	    if (cuadricula[coordenadaFilaCuadricula][coordenadaColumnaCuadricula] == "K") {
		cuadricula[coordenadaFilaCuadricula][coordenadaColumnaCuadricula] = "H";
		cuadriculaHuevos[coordenadaFilaCuadricula][coordenadaColumnaCuadricula] = "H";
		huevazos.add(new Huevo(coordenadaFilaCuadricula, coordenadaColumnaCuadricula, 3));
	    } else {
		if (cuadricula[coordenadaFilaCuadricula][coordenadaColumnaCuadricula] == "C") {
		    cuadricula[coordenadaFilaCuadricula][coordenadaColumnaCuadricula] = "H";
		    cuadriculaHuevos[coordenadaFilaCuadricula][coordenadaColumnaCuadricula] = "H";
		    huevazos.add(new Huevo(coordenadaFilaCuadricula, coordenadaColumnaCuadricula, 2));

		} else {
		    if (cuadricula[coordenadaFilaCuadricula][coordenadaColumnaCuadricula] == "T") {
			cuadricula[coordenadaFilaCuadricula][coordenadaColumnaCuadricula] = "H";
			cuadriculaHuevos[coordenadaFilaCuadricula][coordenadaColumnaCuadricula] = "H";
			huevazos.add(new Huevo(coordenadaFilaCuadricula, coordenadaColumnaCuadricula, 1));
		    }
		}
	    }
	}
    }

    public void mostrarMatriz(String[][] matriz) {
	// Primera seccion de la cuadricula.
	System.out.print("      ");
	for (int i = 1; i < TAMANO_CUADRICULA + 1; i++) {
	    System.out.printf("%-3d", i);
	}
	System.out.println();
	// Cuadricula.
	for (int i = 0; i < matriz.length; i++) {
	    for (int j = 0; j < matriz[i].length; j++) {
		if (j == 0)
		    System.out.printf("%2d %1s %2s", i + 1, "|", matriz[i][j]);
		else if (j == matriz[i].length - 1)
		    System.out.printf("%3s %1s %-3d", matriz[i][j], "|", i + 1);
		else
		    System.out.printf("%3s", matriz[i][j]);
	    }
	    System.out.println();
	}
	// Ultima seccion de la cuadricula.
	System.out.print("      ");
	for (int i = 1; i < TAMANO_CUADRICULA + 1; i++) {
	    System.out.printf("%-3d", i);
	}
	System.out.println();
	System.out.println();
	
	mostrarDerribados();
	
	System.out.println("Tu puntaje por aciertos es: " + calcularPuntajes());
	System.out.println("Bonus(es) logrado(s): " + calcularBonus());
	int puntajeTotal = calcularPuntajes() + calcularBonus();
	System.out.println("Tu puntaje total es de: " + puntajeTotal);


    }

    public void mostrarInfoCarros() {
	for (int i = 0; i < carrots.length; i++) {
	    System.out.println(carrots[i].toString());
	}
    }

    private int calcularPuntajes() {
	int score = 0;

	for (Huevo huevo : huevazos) {
	    score += huevo.getPuntaje();
	}
	return score;
    }

    private int calcularBonus() {
	int bonus = 0;
	int bonusKromis = 10;
	int bonusCaguanos = 7;
	for (int j2 = 0; j2 < 3; j2++) {
	    if (cuadricula[carrots[j2].getCoordenadaFila()][carrots[j2].getCoordenadaColumna()] == "H"
		    && cuadricula[carrots[j2].getCoordenadaFila() + 1][carrots[j2].getCoordenadaColumna()] == "H"
		    && cuadricula[carrots[j2].getCoordenadaFila() + 2][carrots[j2].getCoordenadaColumna()] == "H") {
		bonus = bonus + bonusKromis;
	    }
	}
	for (int j2 = 3; j2 < 8; j2++) {
	    if (cuadricula[carrots[j2].getCoordenadaFila()][carrots[j2].getCoordenadaColumna()] == "H"
		    && cuadricula[carrots[j2].getCoordenadaFila()][carrots[j2].getCoordenadaColumna() + 1] == "H") {
		bonus = bonus + bonusCaguanos;
	    }
	}
	return bonus;
    }

    public void mostrarDerribados() {
	for (int j2 = 0; j2 < 3; j2++) {
	    if (cuadricula[carrots[j2].getCoordenadaFila()][carrots[j2].getCoordenadaColumna()] == "H"
		    && cuadricula[carrots[j2].getCoordenadaFila() + 1][carrots[j2].getCoordenadaColumna()] == "H"
		    && cuadricula[carrots[j2].getCoordenadaFila() + 2][carrots[j2].getCoordenadaColumna()] == "H") {
		System.out.println("");
		System.out.println("¡Ha derribado una Kromi!");
		System.out.println("");
	    }
	}
	for (int j2 = 3; j2 < 8; j2++) {
	    if (cuadricula[carrots[j2].getCoordenadaFila()][carrots[j2].getCoordenadaColumna()] == "H"
		    && cuadricula[carrots[j2].getCoordenadaFila()][carrots[j2].getCoordenadaColumna() + 1] == "H") {
		System.out.println("");
		System.out.println("¡Ha derribado un Caguano!");
		System.out.println("");
	    }
	}
	for (int j2 = 3; j2 < 8; j2++) {
	    if (cuadricula[carrots[j2].getCoordenadaFila()][carrots[j2].getCoordenadaColumna()] == "H") {
		System.out.println("");
		System.out.println("¡Ha derribado una Trupalla!");
		System.out.println("");
	    }
	}
    }
    
    
    private int crearNumeroColumna (int maximoRandom) {
	int numeroColumna;
	numeroColumna = (int) (Math.random() * maximoRandom);
	return numeroColumna;
   }
    
    private int crearNumeroFila (int maximoRandom) {
	int numeroFila;
	numeroFila = (int) (Math.random() * maximoRandom);
	return numeroFila;
      }
    
    
    
    

}
