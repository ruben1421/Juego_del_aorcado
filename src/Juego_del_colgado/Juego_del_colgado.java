package Juego_del_colgado;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;



public class Juego_del_colgado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Introducimos el scanner para poder introducir informacion 

			Scanner s = new Scanner(System.in);
		 
			 //Damos la Bienvenida al juego 
		 System.out.println(" BIENVENIDO AL JUEGO DEL AHORCADO  ");
		 
		// En esta parte pedimos que se ingrese el numero de jugadores y lo introducimos al scanner
		 System.out.print("Ingrese el número de jugadores : ");
	        int numJugadores = s.nextInt();
	      
	        // Aqui utilizamos el if e indicamos que si el numero de jugadores es menor que 2, no 
	        // podemos empezar el juego
	        
	        while (numJugadores < 2) {
	            System.out.print("Debe haber al menos 2 jugadores. Intente de nuevo: ");
	            numJugadores = s.nextInt();
	            
	        }
		 
	        //introducimos un array para los jugadores e intricamos que jugadores va 
	        //ser igual que el array de numJugadores
	        
	        int[] jugadores;
	        jugadores = new int[numJugadores];
	        
	        //Introducimos la palabra secreta
	        // y creamos una array que se llame secretaS
		 
		 String palabraSecreta;
		 char[] secretasS;
		 
		 Scanner x = new Scanner(System.in); // lo introducimos al Scanner 
		 System.out.print("Que alguien de tu alrededor coloque una plabra : ");
		 palabraSecreta = x.nextLine().toLowerCase();	 //utilizamos el toLowerCase para que la palabra secreta 
														// pueda estar en minuscula 
		 
		 secretasS = palabraSecreta.toCharArray();
		 
		 //Aqui indicamos que secretasS va ser igual a un array de carcteres de la palabra secreta 

		//Introducimos las vidas en el juago 
	        int[] vidas;
	        vidas = new int[numJugadores]; // Aqui indicamos vidas se implementar al numero de jugadores 
	        for (int i = 0; i < numJugadores; i++) {
	            vidas[i] = 6;  // en el for lo que indicamos es que para cada jugador le toca 6 vidaas 
	        }
	        
	        char[]Avance = new char[palabraSecreta.length()];
	        Arrays.fill(Avance, '_' );
	        
	        // Aqui indica,so que el array de avance sera igual a la longitud de la palabra secreta
	        // y el Arrays.fill ayuda a que que la palabra secreta se conviertaen '_'
	        
	        
	        while(true){
	        	// Aqui indicamos que las vidas se reparten a cada uno de los jugadores, cada jugador
	        	// tendra 6 vidas , de igual manera para el turno del jugador 
	        	
	        	for(int i = 0; i < jugadores.length; i ++) {
	        		
	        		 System.out.println("\n--- Turno de Jugador " + (i + 1) + " ---");
	        		 System.out.println("Vidas restantes: " + vidas[i]);
	        		 
	        		 //Aqui indicamos que el avance pueda incrementarse y se acierta la palabra y que nos 
	        		 // imprima el avance hasta donde lo hayamos hecho 
	        		 

	        		 for(int j = 0; j < Avance.length; j++) {
	        			 
	        			 System.out.print(Avance[j]);
		}
		
	        		 
	        		 System.out.println(" ");
	        		 System.out.println(" ");
	        		 
	        		 // Aqui pedimos que se ingrese una letra 
	        		 
	        		 System.out.println(" Ingrese una letra: ");
	        		 char letra = s.next().toLowerCase().charAt(0);
	        		 
	        		 //Aqui indicamos que si la letra no se acierta no se incluya a la palabra secreta
	        		 
	        		 boolean acierto = false;
	        		 for (int j = 0; j < palabraSecreta.length(); j++) {
	        			 
	        			 if(secretasS[j] == letra) {	// si la letra coincide con anguno de los elementos del 
		 												// Array secretasS

	        				 
	        				 Avance[j]= letra;	// que se sustituya la '_' por la letra acertada
	        				 acierto = true;
	        			 }
		
		
		
	        	}
	        		 
	        		 if(acierto) {
	        			 
	        			 System.out.println(" Acertaste la letra ");
	        			 System.out.println(" la letra es:  " + letra ); //Aqui indicamos que si acertamos se nos imprima la letra 
	        			 
	        		 } else {
	        			 System.out.println(" No Acertaste la letra ");	// Si no acertamos que nos mande un mensaje de que no acertaste 
	        			 vidas[i]--;	// Y tambien que se nos resten las vida 
	        			 
	        		 }
	        		 if (Arrays.equals(secretasS, Avance)) {	// Aqui indicamos que si las arrays de secretasS es igual al Arrays de Avance
	        			 
	        			 System.out.println(" Acertaste la palabra. ¡GANASTE! ");	// Aqui pedimos que se nos imprima que ganamos 
	        			 System.out.println("La palabra era:  " + palabraSecreta);	 // y que nos muestre la palabra secreta 
	        			 
	        			 return;
	        		 }
	        		 
	        		 if(vidas[i] <= 0) {	// Aqui indicamos que si la vida es igua a 0
	        			 
	        			 System.out.println("TE QUEDASTE SIN INTENTOS  ");		// nos imprima que nos quedamos sin intentos 
	        			 System.out.println("La palabra era:  " + palabraSecreta);	 
	        			 
	        			 return;
	        			 
	        			 
	        			 
	        }
	      }
	    }
	 }
}

