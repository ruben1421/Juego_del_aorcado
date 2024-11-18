package Juego_del_colgado;

import java.util.Random;
import java.util.Scanner;


public class Juego_del_colgado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		
		System.out.print("INGRESE CUANTOS JUGADORES SE UNIRAN AL JUEGO : ");
		int numjugadores = s. nextInt();
		s.nextLine();
		
		while(numjugadores < 2) 
		{
			if(numjugadores > 2) {
				
				break;
			}
			System.out.print("No se puede iniciar el juego con menos de dos jugadores. Seleccione otro numero de jugadores: ");
			numjugadores = s. nextInt();
			s.nextLine();
		}
		
		int VIDAS = 6;
		
		int[] vidas = new int [numjugadores];
		
		for (int i = 0; i < numjugadores; i++) {
			
			vidas[i] = VIDAS;
		}
		
		System.out.print("Una persona de tu alrededor que coloque una palabra ");
		String palabrasecreta =  s. nextLine().toLowerCase();
		String palabraDesconocida = "_".repeat(palabrasecreta.length());
		
		boolean juegoAcavado = false;
		int turnojugador = 0;
		
		while(!juegoAcavado) {
			
			System.out.println("\n--- Turno de Jugador " + (turnojugador + 1) + " ---");
			System.out.println("Vidas restantes: " + vidas[turnojugador]);
			
			
			
			for(int i = 0; i < palabraDesconocida.length();i++) {
				
				 System.out.print(palabraDesconocida.charAt(i) + " ");
			}
			
			System.out.println();
			
			if (vidas[turnojugador]>0) {
				
				char letra = ' ';
				
				boolean letraValida = false;
				
				while(!letraValida) {
					
					System.out.print("Jugador " + (turnojugador + 1) + ", ingrese una letra: ");
					String entrada = s.nextLine().toLowerCase();
					
					if(entrada.length()==1 && Character.isLetter(entrada.charAt(0))) {
						
						
					}
					
				}
			}
			
			
		}
		
		
		
		
	}

}
