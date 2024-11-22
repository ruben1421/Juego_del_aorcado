package Juego_del_colgado;

import java.util.Random;
import java.util.Scanner;



public class Juego_del_colgado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		
		//para ingresar el numero de jugadores
		System.out.print("INGRESE CUANTOS JUGADORES SE UNIRAN AL JUEGO : ");
		int numjugadores = s. nextInt();
		int[] jugador = new int[numjugadores];
		
		while(numjugadores < 2) 
		{
			if(numjugadores > 2) {
				
				break;
			}
			System.out.print("No se puede iniciar el juego con menos de dos jugadores. Seleccione otro numero de jugadores: ");
			numjugadores = s.nextInt();
			
		}
		
		//vidas
		
	
		
		int[] vidas = new int [numjugadores];
		
		for (int i = 0; i < numjugadores; i++) {
			
			vidas[i] = 6;
		}
		
		System.out.print("Una persona de tu alrededor que coloque una palabra ");
		String palabrasecreta =  s.nextLine().toLowerCase();
		String palabraDesconocida = palabrasecreta.replaceAll(".", "_");
		char[] letrasdePalabra = palabrasecreta.toCharArray();
		char[] letrasdesconocida = palabraDesconocida.toCharArray();
		
		
		
		while(true) {
			
			for (int i = 0; i < jugador.length; i++) {
				
				System.out.println("jugador: " + (i + 1));
				System.out.println("vidas: " + vidas[i]);
				
				for (int j = 0; j < letrasdesconocida.length; j++) {
					System.out.print(letrasdesconocida[i]);
				}
				
				System.out.print("ingrese una letra: ");
				 char entrada = s.nextLine().toLowerCase().charAt(0);
				char[] letra = new char[entrada];
				
				for (int j = 0; j < letrasdesconocida.length; j++) {
					
					if(letrasdesconocida[j] == entrada) {
						
						
						
						
					}
					
				}
			}
		}
		
		boolean juegoAcavado = false;
		int turnojugador = 0;
		
		while(!juegoAcavado) {
			
			System.out.println("\n--- Turno de Jugador " + (turnojugador + 1) + " ---");
			System.out.println("Vidas restantes: " + vidas[turnojugador]);
			
			
			for(int i = 0; i < palabraDesconocida.length();i++) {
				
				 System.out.print(palabraDesconocida.charAt(i) + " ");
			}
			
			
		while (vidas[turnojugador]>0) {
				
				char letra = ' ';
				
				boolean letraValida = false;
				
				while(!letraValida) {
					
					System.out.print("Jugador " + (turnojugador + 1) + ", ingrese una letra: ");
					String entrada = s.nextLine().toLowerCase();
					
					if(entrada.length()==1 && Character.isLetter(entrada.charAt(0))) {
						letra = entrada.charAt(0);
						letraValida = true;
					
					} else {
						
						System.out.println("Entrada inválida. Por favor, ingrese solo una letra.");
					}
				}
				
				 if (palabraDesconocida.indexOf(letra)>= 0) {
					 
					 
					 System.out.println("¡Correcto! La palabra actual es:");
	                    for (int i = 0; i < palabraDesconocida.length(); i++) {
	                        System.out.print(palabraDesconocida.charAt(i) + " ");
	                    }
	                    
	                } else {
	                    
	                    vidas[turnojugador]--;
	                    System.out.println("¡Incorrecto! La letra no está en la palabra.");
	                    System.out.println("Vidas restantes: " + vidas[turnojugador]);
					
					 
				 }
				
	                }
				
			}
			
			
		}
		
		
		
		
	}

