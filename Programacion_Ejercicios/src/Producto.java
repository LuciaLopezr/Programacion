import java.util.Scanner;
public class Producto {
	public static Scanner teclado=new Scanner(System.in); 
	public static void main(String[] args) {
		String codigo;
		String categoria;
	
	//pedir valores 
	System.out.println("Introduce el código del producto:");
	codigo=teclado.nextLine();
	
	System.out.println("Introduce la categoría del producto: ");
	categoria=teclado.nextLine();
	
	
	//comprobar la longitud del codigo
	int longitudcodigo = codigo.length();
	//System.out.println("longitud codigo: " + longitudcodigo); // Esto es por comprobar que la longitud es correcta
	  
	if ( longitudcodigo >12) { //longitud máxima de 12 caracteres
		System.out.println("Error el codigo debe tener un maximo de 12 caracteres ");
	}	
	
	else if (longitudcodigo <5) { //longitud mínima de 5 caracteres
		System.out.println("Error el codigo debe tener un minimo de 5 caracteres ");
		
	}
	//comprobar la longitud de la categoria 
	int longitudcategoria = categoria.length();
	
	if ( longitudcategoria >5) { //longitud maxima de 5 caracteres
		System.out.println("Error el codigo debe tener un maximo de 5 caracteres ");
	}	
	
	else if (longitudcategoria <2) { //longitud mínima de 2 caracteres
		System.out.println("Error el codigo debe tener un minimo de 2 caracteres ");
		
	}
	
	int contador=0; //He creado la variable contador para que cuente los numeros que va encontrando en el for
	
	//bucle para que vaya leyendo los caracteres de la cadena 
  	for (int x=0;x<codigo.length();x++) {
  		//System.out.println(codigo.charAt(x) + " = " + codigo.codePointAt(x)); //Esto es para comprobar que devuelve el caracter de la cadena y su codigo ascii 
  	  	if (codigo.charAt(x) >=48 && codigo.charAt(x) <=57 ) { // comprueba si la cadena tiene numeros 
  		  contador+=1;	  // suma si encuentra un numero
  	  }
}
  
	  if (contador <3) { // si contador vale menos que 3 debe devolver error 
		  System.out.println("Error el codigo debe contener al menos 3 numeros");
  		}
	  		
	  
	  if (!categoria.startsWith("C")){ // si categoria es distinto de comenzar con C devuelve error
		  System.out.println("Error categoria debe comenzar con C");
	  }
	  
	  // Si los caracteres de la cadena son distintos a las vocales devuelve error 
	  for (int x=0;x<categoria.length();x++) {
	    	if (categoria.charAt(x)!=65 && categoria.charAt(x)!=69 && categoria.charAt(x)!=73 && categoria.charAt(x)!=79 && categoria.charAt(x)!=85 && categoria.charAt(x)!=67) {
	    		 System.out.println("Error la categoria debe comenzar por C y el resto de caracters solo deben ser vocales");
	    	  }
	    		
	  }
	  
	
	  
	  
	  
	}
}
	
	
	
	

