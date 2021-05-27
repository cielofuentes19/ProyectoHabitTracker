import java.util.Scanner;
@SuppressWarnings("resource")

public class HabitTracker
{
	public static void main(String[] args)
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
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresar 5 aplicaciones que desee trackear: \n");
		for(int i = 0; i<5; i++)
		{
			aplicacion = sc.nextLine();
			aplicaciones.enQueue(aplicacion);
		}
		System.out.println("Aplicaciones ingresadas: \n" + aplicaciones);
		
		aplicaciones.deleteQueue();
		System.out.println("Se eliminaron todas las aplicaciones... \n" + aplicaciones);
	}
}
