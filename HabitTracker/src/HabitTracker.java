import java.util.Scanner;
@SuppressWarnings("resource")

public class HabitTracker
{
	public static void main(String[] args) throws ExceptionIsEmpty, ItemNoFound
	{
		System.out.println("------- BIENVENIDO AL SISTEMA HABIT TRACKER --------");
		System.out.println("-------- Tu asistente de manejo del tiempo ---------");
		
		Estudiante estu = new Estudiante("", "", 0, ' ', "", "", "", "", "", "", "");
		Trabajador tra = new Trabajador("", "", 0, ' ', "", "", "", "", "", "", "");
		Usuario usua = new Usuario("", "", 0, ' ', "", "", "", "", "");
		
		Scanner sc = new Scanner(System.in);
		
		//Ingreso de Usuario
		
		System.out.println("\n¿Cuenta con un usuario? true or false: ");
		boolean respuesta = sc.nextBoolean();
		
		if(respuesta == false)
		{
			System.out.println("\nPrimero crearemos tu usuario...");
			boolean caso = true;
			
			while (caso == true)
			{
				System.out.println("\n¿Eres Estudiante (E), Trabajador (T) o un Usuario General(U)?");
				String resp = sc.next();
				
				Scanner scF = new Scanner(System.in);
				scF.useDelimiter("\n");
				
				switch(resp)
				{
					case("E"):
					{
						System.out.println("Ingresar Nombres: ");
						String nombres = scF.next();
						estu.setNombres(nombres);
						
						System.out.println("Ingresar Apellidos: ");
						String apellidos = scF.next();
						estu.setApellidos(apellidos);
						
						System.out.println("Ingresar Edad: ");
						int edad = sc.nextInt();
						while (edad > 120)
						{
							System.out.println("La edad debe no debe ser mayor de 120...");
							edad = sc.nextInt();
						}
						estu.setEdad(edad);
						
						System.out.println("Ingresar genero: M=masculino, F=femenino, N=no especifica ");
						char genero = sc.next().charAt(0);
						while (genero!='M' && genero!='F' && genero!='N')
						{
							System.out.println("Este caracter no esta permitido. Ingresar de nuevo...");
							genero = sc.next().charAt(0);
						}
						estu.setGenero(genero);
						
						System.out.println("Ingresar DNI: ");
						String dni = sc.next();
						while (dni.length() != 8)
						{
							System.out.println("El DNI debe tener 8 digitos...");
							dni = sc.next();
						}
						estu.setDni(dni);
						
						System.out.println("Ingresar la razon por la que desea usar Habit Tracker :) : ");
						String des = scF.next();
						estu.setDescripcion(des);
						
						System.out.println("Ingresar Usuario: ");
						String usu = sc.next();
						estu.setUsuario(usu);
						
						System.out.println("Ingresar Correo: ");
						String cor = sc.next();
						estu.setCorreo(cor);
						
						System.out.println("Ingresar Contraseña: ");
						String con = sc.next();
						while (con.length() < 8)
						{
							System.out.println("La contraseña debe tener minimo 8 digitos...");
							con = sc.next();
						}
						estu.setContraseña(con);
						
						System.out.println("Ingresar Centro de Estudio: ");
						String cent = scF.next();
						estu.setCentroEstudio(cent);
						
						System.out.println("Ingresar Carrera que estudia: ");
						String car = scF.next();
						estu.setCarrera(car);
						
						caso = false;
						break;
					}
					
					case("T"):
					{						
						System.out.println("Ingresar Nombres: ");
						String nombres = scF.next();
						tra.setNombres(nombres);
						
						System.out.println("Ingresar Apellidos: ");
						String apellidos = scF.next();
						tra.setApellidos(apellidos);
						
						System.out.println("Ingresar Edad: ");
						int edad = sc.nextInt();
						while (edad > 120)
						{
							System.out.println("La edad debe no debe ser mayor de 120...");
							edad = sc.nextInt();
						}
						tra.setEdad(edad);
						
						System.out.println("Ingresar genero: M=masculino, F=femenino, N=no especifica ");
						char genero = sc.next().charAt(0);
						while (genero!='M' && genero!='F' && genero!='N')
						{
							System.out.println("Este caracter no esta permitido. Ingresar de nuevo...");
							genero = sc.next().charAt(0);
						}
						tra.setGenero(genero);
						
						System.out.println("Ingresar DNI: ");
						String dni = sc.next();
						while (dni.length() != 8)
						{
							System.out.println("El DNI debe tener 8 digitos...");
							dni = sc.next();
						}
						tra.setDni(dni);
						
						System.out.println("Ingresar la razon por la que desea usar Habit Tracker :) : ");
						String des = scF.next();
						tra.setDescripcion(des);
						
						System.out.println("Ingresar Usuario: ");
						String usu = sc.next();
						tra.setUsuario(usu);
						
						System.out.println("Ingresar Correo: ");
						String cor = sc.next();
						tra.setCorreo(cor);
						
						System.out.println("Ingresar Contraseña: ");
						String con = sc.next();
						while (con.length() < 8)
						{
							System.out.println("La contraseña debe tener minimo 8 digitos...");
							con = sc.next();
						}
						tra.setContraseña(con);
						
						System.out.println("Ingresar Centro de Trabajo: ");
						String cent = scF.next();
						tra.setCentroTrabajo(cent);
						
						System.out.println("Ingresar cargo: ");
						String car = scF.next();
						tra.setCargo(car);
						
						caso = false;
						break;
					}
					
					case("U"):
					{
						System.out.println("Ingresar Nombres: ");
						String nombres = scF.next();
						usua.setNombres(nombres);
						
						System.out.println("Ingresar Apellidos: ");
						String apellidos = scF.next();
						usua.setApellidos(apellidos);
						
						System.out.println("Ingresar Edad: ");
						int edad = sc.nextInt();
						while (edad > 120)
						{
							System.out.println("La edad debe no debe ser mayor de 120...");
							edad = sc.nextInt();
						}
						usua.setEdad(edad);
						
						System.out.println("Ingresar genero: M=masculino, F=femenino, N=no especifica ");
						char genero = sc.next().charAt(0);
						while (genero!='M' && genero!='F' && genero!='N')
						{
							System.out.println("Este caracter no esta permitido. Ingresar de nuevo...");
							genero = sc.next().charAt(0);
						}
						usua.setGenero(genero);
						
						System.out.println("Ingresar DNI: ");
						String dni = sc.next();
						while (dni.length() != 8)
						{
							System.out.println("El DNI debe tener 8 digitos...");
							dni = sc.next();
						}
						usua.setDni(dni);
						
						System.out.println("Ingresar la razon por la que desea usar Habit Tracker :) : ");
						String des = scF.next();
						usua.setDescripcion(des);
						
						System.out.println("Ingresar Usuario: ");
						String usu = sc.next();
						usua.setUsuario(usu);
						
						System.out.println("Ingresar Correo: ");
						String cor = sc.next();
						usua.setCorreo(cor);
						
						System.out.println("Ingresar Contraseña: ");
						String con = sc.next();
						while (con.length() < 8)
						{
							System.out.println("La contraseña debe tener minimo 8 digitos...");
							con = sc.next();
						}
						usua.setContraseña(con);
						
						caso = false;
						break;
					}
					
					default:
					{
						System.out.println("Debe ingresar E, T o U...");
						caso = true;
					}
				}
			}
		}
		
		boolean validar = false;
		
		while(validar == false)
		{
			System.out.println("\n------ BIENVENIDO. INICIA SESION ------");
			System.out.println("\n¿Eres Estudiante (E), Trabajador (T) o un Usuario General(U)?");
			String pregunta = sc.next();
			
			System.out.println("\nIngrese su usuario: ");
			String usuario = sc.next();
			
			System.out.println("\nIngrese su contraseña: ");
			String contraseña = sc.next();
			
			if(pregunta=="E")
			{
				estu.validarUsuario(usuario, contraseña);
				validar = estu.validarUsuario(usuario, contraseña);
			}
				
			
			if(pregunta=="T")		
			{
				tra.validarUsuario(usuario, contraseña);
				validar = tra.validarUsuario(usuario, contraseña);
			}
			
			if(pregunta=="U")		
			{
				usua.validarUsuario(usuario, contraseña);
				validar = usua.validarUsuario(usuario, contraseña);
			}
			
			else
				validar = false;
		}	
		
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
		Scanner sc3 = new Scanner(System.in);
		Scanner sc4 = new Scanner(System.in);
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
		
		//Se prueba el metodo back
		System.out.println("El back de la cola es: " + aplicaciones.back() + "\n");
		
		//Se prueba el metodo search
		System.out.println("Ingresar la aplicación que se quiere buscar: ");
		aplicacion = sc4.next();
		if (aplicaciones.search(aplicacion) == true)
			System.out.println("La aplicación " + aplicacion + " sí se encuentra en la cola. \n");
		else
			System.out.println("La aplicación " + aplicacion + " no se encuentra en la cola. \n");
		
		//Se prueba el metodo eliminar 
		System.out.println("Ingrese la aplicacion que desea eliminar: ");
		String apli = sc3.next();
		aplicaciones.deQueue(apli);
		System.out.println("\n" + "Aplicaciones ingresadas: \n" + aplicaciones);
		
		//Se comprueba si la cola esta vacia
		System.out.println("La cola se encuentra vacía? " + aplicaciones.isEmpty());
		
		//Se prueba el metodo deleteQueue
		aplicaciones.deleteQueue();
		System.out.println("Se eliminaron todas las aplicaciones... " + aplicaciones);
		
		//Se comprueba si la cola esta vacia
		System.out.println("La cola se encuentra vacía? " + aplicaciones.isEmpty());
	}
}
