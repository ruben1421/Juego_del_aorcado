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
			System.out.print("No se puede iniciar el juego con menos de dos jugadores ");
			numjugadores = s. nextInt();
			s.nextLine();
		}
		
		
		
		
		
		
		
	}

}
