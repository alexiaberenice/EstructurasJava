package w3school;
import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// Poner al reves una cadena de caracteres ingresada por el teclado
		Scanner sc = new Scanner(System.in);
		char ayuda;
		char [] cadena= sc.nextLine().toCharArray();
		//for(int j=0;j<=cadena.length-1;j++) {
			for (int i=0;i<=cadena.length-2;i++) { //hola
				ayuda=cadena[i]; //ayudnte=h,h,h,o,
				cadena[i]=cadena[i+1];//oola,olla,olaa
				cadena[i+1]=ayuda;//ohla,olha,olah
			}
		//}
		//impresion de la cadena
		for(int u=0;u<=cadena.length-1;u++) {
			System.out.println("La cadena recorrida es:"+cadena[u]);
		}
	}
	

}
