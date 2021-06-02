import java.util.Scanner;
@SuppressWarnings("resource")

public class HabitTracker
{
	public static void main(String[] args) throws ExceptionIsEmpty
	{
		/*
		//Temporizador del uso del usuario de las aplicaciones
		StopWatch watch = new StopWatch();
 		watch.start();
 		watch.stop();
 		long result = watch.getTime();
 		*/
		
		Cola aplicaciones = new Cola();
		String aplicacion = "";
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Ingrese el numero de aplicaciones a trackear: ");
		int nroapps = sc1.nextInt();
		//Se prueba el metodo Insert
		System.out.println("Ingresar las "+nroapps+" aplicaciones que desea trackear: ");
		for(int i = 0; i<nroapps; i++)
		{
			aplicacion = sc2.nextLine();
			aplicaciones.enQueue(aplicacion);
		}
		System.out.println("\n" + "Aplicaciones ingresadas: \n" + aplicaciones);
		//Se prueba el metodo front
		System.out.println("El front de la cola es: " + aplicaciones.front() + "\n");
		//Se prueba el metodo deleteQueue
		aplicaciones.deleteQueue();
		System.out.println("Se eliminaron todas las aplicaciones... " + aplicaciones);
		//Se comprueba si la cola esta vacia
		System.out.println("La cola se encuentra vacía? " + aplicaciones.isEmpty());
	}
}
