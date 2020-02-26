package cl.awakelab.clases;

import java.util.Scanner;


public class Ejecutable {

    public static void main(String[] args) {
	
	Tablero tablero = new Tablero();

	escribir("Bienvenido a tu Simulador de Enfrentamientos.");
	tablero.crearCarros();
	
	int indice = 0;
	do {
		escribir("");
		tablero.mostrarMatriz(tablero.getCuadriculaHuevos());
		//Aqui deberia ir el metodo del puntaje.
		escribir("");
		escribir("Elija una opcion.");
		escribir("1. Lanzar un huevo.");
		escribir("2. Mostrar la posicion e informacion de tus enemigos.");

		indice = pideNumero("");

		switch (indice) {
		case 1:  
			tablero.lanzarHuevo(pideNumero("Ingrese numero de Fila."), 
					pideNumero("Ingrese numero de Columna."));
			break;
		case 2:
		    	tablero.mostrarMatriz(tablero.getCuadricula());
		    	escribir("");
		    	tablero.mostrarInfoCarros();
			break;
		case 3:
		
			break;
		default:
			break;
		}

	} while (indice != 3);
	
	tablero.crearCarros();

	for (int i = 0; i < tablero.getCuadricula().length; i++) {
	    for (int j = 0; j < tablero.getCuadricula().length; j++) {
		if (tablero.getCuadricula()[i][j] == null)
		    tablero.getCuadricula()[i][j] = " ";
		escribir(tablero.getCuadricula()[i][j]);

	    }
	    escribir("");
	}
	tablero.toString();
    }
 //Utilidades.
 	private static void escribir(String mensaje) {
 		System.out.println(mensaje);
 	}

 	private static int pideNumero(String mensaje) {
 		escribir(mensaje);
 		Scanner entrada = new Scanner(System.in);
 		return entrada.nextInt();
 	}

 	private static String pideTexto(String mensaje) {
 		escribir(mensaje);
 		Scanner entrada = new Scanner(System.in);
 		return entrada.nextLine();
 	}
 
}
