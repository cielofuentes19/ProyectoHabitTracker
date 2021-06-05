import java.util.Scanner;
import java.time.*;
import java.time.temporal.*;
@SuppressWarnings("resource")

public class HabitTracker
{
	public static void main(String[] args) throws ExceptionIsEmpty, ItemNoFound, ItemDuplicated
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
						
						System.out.println(" Los datos de estudiante son: "+ estu);
						
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
						
						System.out.println(" Los datos del trabajador son: "+ tra);
						
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
						
						System.out.println(" Los datos de usuario son: "+ usua);
						
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
			
			switch(pregunta)
			{
				case("E"):
				{
					validar = estu.validarUsuario(usuario, contraseña);
					break;
				}
					
				case("T"):	
				{
					validar = tra.validarUsuario(usuario, contraseña);
					break;
				}
				
				case("U"):	
				{
					validar = usua.validarUsuario(usuario, contraseña);
					break;
				}
				
				default: 
					validar=true;
			}
		}	
		
		//Cola de aplicaciones
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
		System.out.println("\n" + "----- APLICACIONES INGRESADAS ----- \n" + aplicaciones);
		
		Scanner scCon = new Scanner(System.in);
		boolean confirma = true;
		
		//Se prueba el metodo front
		System.out.println("¿Desea saber el front de la cola?");
		confirma=scCon.nextBoolean();
		if(confirma==true)
			System.out.println("El front de la cola es: " + aplicaciones.front() + "\n");

		//Se prueba el metodo back
		System.out.println("¿Desea saber el back de la cola?");
		confirma=scCon.nextBoolean();
		if(confirma==true)
			System.out.println("El back de la cola es: " + aplicaciones.back() + "\n");
		
		//Se prueba el metodo search
		System.out.println("¿Desea buscar una aplicacion?");
		confirma=scCon.nextBoolean();
		if(confirma==true)
		{
			System.out.println("Ingresar la aplicación que se quiere buscar: ");
			aplicacion = sc4.next();
			if (aplicaciones.search(aplicacion) == true)
				System.out.println("La aplicación " + aplicacion + " sí se encuentra en la cola. \n");
			else
				System.out.println("La aplicación " + aplicacion + " no se encuentra en la cola. \n");
		}
		
		//Se prueba el metodo eliminar 
		System.out.println("¿Desea eliminar una aplicacion?");
		confirma=scCon.nextBoolean();
		if(confirma==true)
		{
			System.out.println("Ingrese la aplicacion que desea eliminar: ");
			String apli = sc3.next();
			aplicaciones.deQueue(apli);
			System.out.println("\n" + "Aplicaciones ingresadas: \n" + aplicaciones);
		}
		
		//Se comprueba si la cola esta vacia
		System.out.println("¿Desea saber si la cola esta vacia?");
		confirma=scCon.nextBoolean();
		if(confirma==true)
			System.out.println("La cola se encuentra vacía? " + aplicaciones.isEmpty());
		
		//Se prueba el metodo deleteQueue
		System.out.println("¿Desea eliminar todas las aplicaciones?");
		confirma=scCon.nextBoolean();
		if(confirma==true)
		{
			aplicaciones.deleteQueue();
			System.out.println("Se eliminaron todas las aplicaciones... " + aplicaciones);
		}
		
		//Arbol de tiempo
		Arbol<Integer> tiempo = new Arbol<Integer>();
		Scanner sc5 = new Scanner(System.in);
		System.out.println("¿Desea empezar a usar el sistema? ingrese true o false ");
		boolean respue = sc5.nextBoolean();
		while(respue==true)
		{
			System.out.println("Ingresar la aplicación que desea utilizar: ");
			aplicacion = sc4.next();
			if (aplicaciones.search(aplicacion) == true)
				System.out.println("La aplicación " + aplicacion + " sí se encuentra en la cola. \n");
			else
				System.out.println("La aplicación " + aplicacion + " no se encuentra en la cola. \n");
			
			Scanner sc6 = new Scanner(System.in);
			
			System.out.print("Ingrese la hora en la que inicio la aplicacion: (hh:mm)");
            LocalTime inicio = LocalTime.parse(sc6.next());
            System.out.print("Ingrese la hora en la que termino de usar la aplicacion: (hh:mm)");
            LocalTime termino  = LocalTime.parse(sc6.next());

            int minutos = (int) ChronoUnit.MINUTES.between(inicio, termino);
            System.out.println("\nEl tiempo recurrido usando la aplicacion: "+aplicacion+" fue de: " + minutos+"minutos.");
            
            tiempo.insert(minutos);
            tiempo.inOrden();
            
            System.out.println("¿Desea calcular el tiempo de otra aplicación? Ingrese true o false ");
    		respue = sc5.nextBoolean();
		}
		System.out.println("\nGracias por usar HabitTracker, vuelva pronto :) ");

		
		System.out.println("\n" + "----- TIEMPO INGRESADO ----- \n" + tiempo);
        System.out.println("\nEl numero de nodos del arbol de tiempo es: " + tiempo.nroNodos());
        System.out.println("\nEl numero de hojas del arbol de tiempo es: " + tiempo.nroHojas());
        System.out.println("\nLa altura del arbol de tiempo es: " + tiempo.altura());
        //System.out.println("\nLa altura del nodo del arbol b es: " + tiempo.retornarAlturaNodo(5));
        System.out.println("\nEl area del arbol de tiempo es: " + tiempo.area());
        //System.out.println("\n¿Se encuentra el 12 en el arbol b? " + tiempo.search(2));
	}
}