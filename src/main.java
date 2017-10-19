import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// Declaramos variables
		
		int num;
		int media;
		int suma=0;
		int contador=0;
		
		while (contador<5)
		{
			//Mensaje
			System.out.println("Introduce un número:");
			Scanner teclado=new Scanner (System.in);
			
			num=teclado.nextInt();
			suma=suma+num; // suma de los numeros para el calculo de la media
			contador++;
		
		}
		
		//Calculamos la media y la mostramos
		media=suma/5;
		System.out.println("La media aritmétrica es:" +media);

	}

}
