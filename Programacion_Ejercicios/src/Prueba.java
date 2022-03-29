import java.util.Scanner;
public class Prueba {
	private static Scanner teclado = new Scanner(System. in );
	public static void main(String[] args) {
		String texto, textoVocalesEnMayusculas;
		System. out .println("Introduce un texto: ");
		texto = teclado.nextLine();
		
		textoVocalesEnMayusculas = soloVocalesMayusculas(texto);
		System. out .println("La cadena con solo las vocales y en mayúsculas es " +
		textoVocalesEnMayusculas);
	}
	
	private static String soloVocalesMayusculas(String cadena){
		StringBuilder builder = new StringBuilder();
		String vocales = "AEIOU";
		char caracter;
		int indice;
		String cadenaMayus; // He creado cadenaMayus para que contenga la cadena convertida en mayusculas, ya que en el for utilizaba la cadena original
		
		cadenaMayus= cadena.toUpperCase();
		
		
		for (indice=0; indice<cadenaMayus.length(); indice++){
		caracter = cadenaMayus.charAt(indice);
			if (vocales.indexOf(caracter) >-1){ // Se cambia el >0 por un >-1 ya que no contaba con la vocal A al buscar
				builder.append(caracter);
				//System.out.println(builder.toString()); // Esto es para asegurarme de lo que se va guardando
		}
	
		}
	return builder.toString();
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	

