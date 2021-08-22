
public class ArreglosJava {
public static void main (String[] args) {
	//Arreglo unidimensional inicializado
	String unoD[]= {"define","el","numero","de","elementos"};
	//Arreglo bidimensional inicializado
	int dosD[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
	/*Primer corchete indica filas, segundo columnas, este es un arreglo
	 * dosD[3][4] de tres filas y cuatro columnas*/
	//Definicion e instanciación de un arreglo
	int arreglo[]=new int[10];
	
	//vamos a recorrer todos los arreglos con un for
	System.out.println("los elementos del arreglo unidimensional son:");
	for (int i=0;i<unoD.length;i++) {
		System.out.println(unoD[i]);
	}
	
	//arreglo bidimensional
	for(int j=0;j<dosD.length;j++) { //primer ciclo for que se ejecutará 3 veces
		System.out.println("Posición numero "+j);
		//entra al segundo ciclo que se va a ejecutar 4 veces
		for(int u=0;u<=dosD.length;u++) {
			System.out.println("Numero en la subposición "+u+" es: "+dosD[j][u]);
		}
		
	}
	
}
}
