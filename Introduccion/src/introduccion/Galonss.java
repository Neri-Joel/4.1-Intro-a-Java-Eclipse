package introduccion;
import java.util.Scanner;

public class Galonss {

		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//CONVERSION DE GALONES A LITROS
		// 1 galon = 3.785 Litros
		
		Scanner leerdatos = new Scanner(System.in);
	
		System.out.println("Ingresa la cantidad de galones a convertir?");  //Pedir datos al user
		double cantidad = leerdatos.nextDouble();		
		//Almacenar lo que ingreso el usuario en variable double para que acepte enteros y decimales
		
		double	operac = cantidad * 3.785;	
		//crear variable double para valores decimales que almacenara la operación
		
		System.out.println("La conversion en litros es: "+operac + " Litros");
		//Muestras valor concatenando la variable que contiene la operacion
		
	}

}
