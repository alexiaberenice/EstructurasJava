
public class Operator {
	static int suma=0;
	public static void main(String[] args) {
		boolean bandera=true;
		for (int i=0;bandera==true;i++) {
			int n=i+1;
			System.out.println("Hola numero "+n);
			if(i<=2) {
				suma+=i;
				System.out.println(suma);
			} else {
				bandera=false;
				}
			}
		}
}


