package Juego_del_colgado;

import java.util.Random;
import java.util.Scanner;



public class Juego_del_colgado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

 Scanner s = new Scanner(System.in);
		 
		 
		 System.out.println(" BIENVENIDO AL JUEGO DEL AHORCADO  ");
		 
		 
		 System.out.print("Ingrese el número de jugadores : ");
	        int numJugadores = s.nextInt();
	      

	        while (numJugadores < 2) {
	            System.out.print("Debe haber al menos 2 jugadores. Intente de nuevo: ");
	            numJugadores = s.nextInt();
	            
	        }
		 
		
	        int[] jugadores;
	        jugadores = new int[numJugadores];
		 
		 
		 
		 String palabraSecreta;
		 char[] secretasS;
		 
		 Scanner x = new Scanner(System.in);
		 System.out.print("Que alguien de tu alrededor coloque una plabra : ");
		 palabraSecreta = x.nextLine().toLowerCase();
		 secretasS = palabraSecreta.toCharArray();
		 

	        
	        int[] vidas;
	        vidas = new int[numJugadores];
	        for (int i = 0; i < numJugadores; i++) {
	            vidas[i] = 6; 
	        }
		}
		
		
		
		
	}

