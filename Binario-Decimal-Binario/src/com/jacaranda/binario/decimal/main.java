package com.jacaranda.binario.decimal;

import java.util.Scanner;

public class main {
	private static Scanner teclado = new Scanner(System. in );
	public static void main(String[] args) {
		String cadena;
		
		//pedir valor
		System.out.println("Introduce un numero: "); 
		cadena = teclado.nextLine();
		
		//llamar a los metodos 
		System.out.println(decimalBinario(cadena)); 
		System.out.println(binarioDecimal(cadena));
	}
	
	//Metodo para convertir de decimal a binario
	
	public static String decimalBinario(String cadena){
		int decimal;
		decimal=Integer.parseInt(cadena); //He creado la variable decimal que va ser la variable cadena convertida a integer
		String resultado=""; // para que vaya guardando los restos
		int resto;
		String cadenainvertida="";
		
		while (decimal >0) {
			resto= decimal%2; //devuelve el resto de dividirlo entre 2 
			decimal= decimal/2; // divide el decimal entre 2 
			
			resultado+=String.valueOf(resto); //guarda en la variable el resultado pasando resto de int a string	
		}
		
		for (int x=resultado.length()-1;x>=0;x--) // para que le de la vuelta al numero binario
				cadenainvertida = cadenainvertida + resultado.charAt(x);
		
		return cadenainvertida;
		
	}
	
	//Metodo para convertir de binario a decimal
	
	public static String binarioDecimal(String cadena) {
		String resultado="";
		int binario; //He creado la variable binario para guardar la cadena obtenida pasada a integer
		binario=Integer.parseInt(cadena);
		int digito=0;
		int exponente =0;
		int decimal=0;
		
		 while (binario !=0) {
			 digito= binario %10; //empieza desde el final
			 decimal= decimal + digito * (int) Math.pow(2, exponente); // lo que valga el decimal mas el digito, por la pontecia de 2, mas lo que valga el exponente
			 exponente++; // se aumenta el exponente para saber la posicion del digito
			 binario = binario /10; //va quitando el ultimo numero 
			 resultado=String.valueOf(decimal); //guardo el resultado de decimal convertido a string en la variable resultado 
		 }

		return resultado; 
	}

	
	
}
