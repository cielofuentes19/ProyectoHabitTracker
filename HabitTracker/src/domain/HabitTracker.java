package domain;
import java.util.Scanner;
import exceptions.*;
import structures.*;
import users.*;
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
						
						System.out.println("\nLos datos de estudiante son: "+ estu);
						
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
						
						System.out.println("Ingresar Cargo: ");
						String car = scF.next();
						tra.setCargo(car);
						
						System.out.println("\\nLos datos del trabajador son: "+ tra);
						
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
						
						System.out.println("Ingresar Genero: M=masculino, F=femenino, N=no especifica ");
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
						
						System.out.println("\nLos datos de usuario son: "+ usua);
						
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
		
		try
		{
			//Cola de aplicaciones
			Cola <String> aplicaciones = new Cola<String>();
			String aplicacion = "";
			Scanner sc1 = new Scanner(System.in);
			Scanner sc2 = new Scanner(System.in);
			Scanner sc3 = new Scanner(System.in);
			
			System.out.println("\nBienvenido a Habit Tracker. Empezaremos a registrar sus aplicaciones");

			//Se prueba el metodo Insert
			System.out.println("Ingresar las 5 aplicaciones que desea trackear: ");
			for(int i = 0; i<6; i++)
			{
				aplicacion = sc1.nextLine();
				aplicaciones.enQueue(aplicacion);
			}
			System.out.println("\n" + "----- APLICACIONES INGRESADAS ----- \n" + aplicaciones);
			
			Scanner scCon = new Scanner(System.in);
			boolean confirma = true;
			
			System.out.println("\nTiene alguna consulta o desea modificar las aplicaciones a utilizar? TRUE or FALSE: ");
			confirma=scCon.nextBoolean();
			
			if(confirma==true)
			{
				//Se prueba el metodo front
				System.out.println("\n¿Desea saber el front de la cola? TRUE o FALSE");
				confirma=scCon.nextBoolean();
				if(confirma==true)
					System.out.println("El front de la cola es: " + aplicaciones.front() + "\n");

				//Se prueba el metodo back
				System.out.println("\n¿Desea saber el back de la cola? TRUE o FALSE");
				confirma=scCon.nextBoolean();
				if(confirma==true)
					System.out.println("El back de la cola es: " + aplicaciones.back() + "\n");
				
				//Se prueba el metodo search
				System.out.println("\n¿Desea buscar una aplicacion? TRUE o FALSE");
				confirma=scCon.nextBoolean();
				if(confirma==true)
				{
					System.out.println("Ingresar la aplicación que se quiere buscar: ");
					aplicacion = sc3.next();
					if (aplicaciones.search(aplicacion) == true)
						System.out.println("La aplicación " + aplicacion + " sí se encuentra en la cola. \n");
					else
						System.out.println("La aplicación " + aplicacion + " no se encuentra en la cola. \n");
				}
				
				//Se prueba el metodo eliminar 
				System.out.println("\n¿Desea eliminar una aplicacion? TRUE o FALSE");
				confirma=scCon.nextBoolean();
				if(confirma==true)
				{
					System.out.println("Ingrese la aplicacion que desea eliminar: ");
					String apli = sc2.next();
					aplicaciones.deQueue(apli);
					System.out.println("\n" + "Aplicaciones ingresadas: \n" + aplicaciones);
				}
				
				//Se comprueba si la cola esta vacia
				System.out.println("\n¿Desea saber si la cola esta vacia? TRUE o FALSE");
				confirma=scCon.nextBoolean();
				if(confirma==true)
					System.out.println("La cola se encuentra vacía? " + aplicaciones.isEmpty());
				
				//Se prueba el metodo deleteQueue
				System.out.println("\n¿Desea eliminar todas las aplicaciones? TRUE o FALSE");
				confirma=scCon.nextBoolean();
				if(confirma==true)
				{
					aplicaciones.deleteQueue();
					System.out.println("Se eliminaron todas las aplicaciones... " + aplicaciones);
				}
			}
			
			//Arbol de tiempo y Tabla Hash
			Arbol<Integer> tiempo = new Arbol<Integer>();
			HashC<String> lunes = new HashC<String>(5);
			HashC<String> martes = new HashC<String>(5);
			HashC<String> miercoles = new HashC<String>(5);
			HashC<String> jueves = new HashC<String>(5);
			HashC<String> viernes = new HashC<String>(5);
			HashC<String> sabado = new HashC<String>(5);
			HashC<String> domingo = new HashC<String>(5);

			
			Scanner sc4 = new Scanner(System.in);
			System.out.println("\n¿Desea utilizar el monitor de aplicaciones? Ingrese true o false: ");
			boolean respue = sc4.nextBoolean();
			while(respue==true)
			{
				Scanner sc5 = new Scanner(System.in);
				System.out.println("\n-----MENU DE OPCIONES-----");
				System.out.println("\nLunes = L");
				System.out.println("\nMartes = M");
				System.out.println("\nMiercoles = Mi");
				System.out.println("\nJueves = J");
				System.out.println("\nViernes = V");
				System.out.println("\nSabado = S");
				System.out.println("\nDomingo = D");
				
				System.out.println("\nElija que dia desea monitorear: ");
				String dia = sc5.next();
				boolean preg = true;
				
				switch(dia)
				{
					case("L"):
					{	
						while(preg == true) {
							System.out.println("Ingrese la aplicación que desee monitorear: ");
							aplicacion = sc3.next();
							while(aplicaciones.search(aplicacion) != true)
							{
								System.out.println("La aplicación " + aplicacion + " no se encuentra en la cola. \n");
								System.out.println("Vuelva a ingresar la aplicación a monitorear: ");
								aplicacion = sc3.next();
							}
							System.out.println("La aplicación " + aplicacion + " si se encuentra en la cola. \n");
							Scanner sc6 = new Scanner(System.in);
							System.out.print("Ingrese la hora de inicio de la aplicacion: (hh:mm)");
				            LocalTime inicio = LocalTime.parse(sc6.next());
				            System.out.print("Ingrese la hora de finalizacion de la aplicacion: (hh:mm)");
				            LocalTime termino  = LocalTime.parse(sc6.next());
		
				            int minutos = (int) ChronoUnit.MINUTES.between(inicio, termino);
				            System.out.println("\nEl dia lunes la aplicacion "+aplicacion+" se utilizo un total de: " + minutos+" minutos.");
				            tiempo.insert(minutos);
				            tiempo.inOrden();
				            
				            lunes.insertListLinked(minutos, aplicacion);
				            
				            System.out.println("Desea monitorear otra aplicacion? true or false. ");
				            preg = sc4.nextBoolean();
						}
						break;
					}
					case("M"):
					{	
						while(preg == true) {
							System.out.println("Ingrese la aplicación que desee monitorear: ");
							aplicacion = sc3.next();
							while(aplicaciones.search(aplicacion) != true)
							{
								System.out.println("La aplicación " + aplicacion + " no se encuentra en la cola. \n");
								System.out.println("Vuelva a ingresar la aplicación a monitorear: ");
								aplicacion = sc3.next();
							}
							System.out.println("La aplicación " + aplicacion + " si se encuentra en la cola. \n");
							Scanner sc6 = new Scanner(System.in);
							System.out.print("Ingrese la hora de inicio de la aplicacion: (hh:mm)");
				            LocalTime inicio = LocalTime.parse(sc6.next());
				            System.out.print("Ingrese la hora de finalizacion de la aplicacion: (hh:mm)");
				            LocalTime termino  = LocalTime.parse(sc6.next());
		
				            int minutos = (int) ChronoUnit.MINUTES.between(inicio, termino);
				            System.out.println("\nEl dia martes la aplicacion "+aplicacion+" se utilizo un total de: " + minutos+" minutos.");
				            tiempo.insert(minutos);
				            tiempo.inOrden();
				            
				            martes.insertListLinked(minutos, aplicacion);
				            
				            System.out.println("Desea monitorear otra aplicacion? true or false. ");
				            preg = sc4.nextBoolean();
						}
						break;
					}	
					case("Mi"):
					{	
						while(preg == true) {
							System.out.println("Ingrese la aplicación que desee monitorear: ");
							aplicacion = sc3.next();
							while(aplicaciones.search(aplicacion) != true)
							{
								System.out.println("La aplicación " + aplicacion + " no se encuentra en la cola. \n");
								System.out.println("Vuelva a ingresar la aplicación a monitorear: ");
								aplicacion = sc3.next();
							}
							System.out.println("La aplicación " + aplicacion + " si se encuentra en la cola. \n");
							Scanner sc6 = new Scanner(System.in);
							System.out.print("Ingrese la hora de inicio de la aplicacion: (hh:mm)");
				            LocalTime inicio = LocalTime.parse(sc6.next());
				            System.out.print("Ingrese la hora de finalizacion de la aplicacion: (hh:mm)");
				            LocalTime termino  = LocalTime.parse(sc6.next());
		
				            int minutos = (int) ChronoUnit.MINUTES.between(inicio, termino);
				            System.out.println("\nEl dia miercoles la aplicacion "+aplicacion+" se utilizo un total de: " + minutos+" minutos.");
				            tiempo.insert(minutos);
				            tiempo.inOrden();
				            
				            miercoles.insertListLinked(minutos, aplicacion);
				            
				            System.out.println("Desea monitorear otra aplicacion? true or false. ");
				            preg = sc4.nextBoolean();
						}
						break;
					}
					case("J"):
					{	
						while(preg == true) {
							System.out.println("Ingrese la aplicación que desee monitorear: ");
							aplicacion = sc3.next();
							while(aplicaciones.search(aplicacion) != true)
							{
								System.out.println("La aplicación " + aplicacion + " no se encuentra en la cola. \n");
								System.out.println("Vuelva a ingresar la aplicación a monitorear: ");
								aplicacion = sc3.next();
							}
							System.out.println("La aplicación " + aplicacion + " si se encuentra en la cola. \n");
							Scanner sc6 = new Scanner(System.in);
							System.out.print("Ingrese la hora de inicio de la aplicacion: (hh:mm)");
				            LocalTime inicio = LocalTime.parse(sc6.next());
				            System.out.print("Ingrese la hora de finalizacion de la aplicacion: (hh:mm)");
				            LocalTime termino  = LocalTime.parse(sc6.next());
		
				            int minutos = (int) ChronoUnit.MINUTES.between(inicio, termino);
				            System.out.println("\nEl dia jueves la aplicacion "+aplicacion+" se utilizo un total de: " + minutos+" minutos.");
				            tiempo.insert(minutos);
				            tiempo.inOrden();
				            
				            jueves.insertListLinked(minutos, aplicacion);
				            
				            System.out.println("Desea monitorear otra aplicacion? true or false. ");
				            preg = sc4.nextBoolean();
						}
						break;
					}
					case("V"):
					{	
						while(preg == true) {
							System.out.println("Ingrese la aplicación que desee monitorear: ");
							aplicacion = sc3.next();
							while(aplicaciones.search(aplicacion) != true)
							{
								System.out.println("La aplicación " + aplicacion + " no se encuentra en la cola. \n");
								System.out.println("Vuelva a ingresar la aplicación a monitorear: ");
								aplicacion = sc3.next();
							}
							System.out.println("La aplicación " + aplicacion + " si se encuentra en la cola. \n");
							Scanner sc6 = new Scanner(System.in);
							System.out.print("Ingrese la hora de inicio de la aplicacion: (hh:mm)");
				            LocalTime inicio = LocalTime.parse(sc6.next());
				            System.out.print("Ingrese la hora de finalizacion de la aplicacion: (hh:mm)");
				            LocalTime termino  = LocalTime.parse(sc6.next());
		
				            int minutos = (int) ChronoUnit.MINUTES.between(inicio, termino);
				            System.out.println("\nEl dia viernes la aplicacion "+aplicacion+" se utilizo un total de: " + minutos+" minutos.");
				            tiempo.insert(minutos);
				            tiempo.inOrden();
				            
				            viernes.insertListLinked(minutos, aplicacion);
				            
				            System.out.println("Desea monitorear otra aplicacion? true or false. ");
				            preg = sc4.nextBoolean();
						}
						break;
					}
					case("S"):
					{	
						while(preg == true) {
							System.out.println("Ingrese la aplicación que desee monitorear: ");
							aplicacion = sc3.next();
							while(aplicaciones.search(aplicacion) != true)
							{
								System.out.println("La aplicación " + aplicacion + " no se encuentra en la cola. \n");
								System.out.println("Vuelva a ingresar la aplicación a monitorear: ");
								aplicacion = sc3.next();
							}
							System.out.println("La aplicación " + aplicacion + " si se encuentra en la cola. \n");
							Scanner sc6 = new Scanner(System.in);
							System.out.print("Ingrese la hora de inicio de la aplicacion: (hh:mm)");
				            LocalTime inicio = LocalTime.parse(sc6.next());
				            System.out.print("Ingrese la hora de finalizacion de la aplicacion: (hh:mm)");
				            LocalTime termino  = LocalTime.parse(sc6.next());
		
				            int minutos = (int) ChronoUnit.MINUTES.between(inicio, termino);
				            System.out.println("\nEl dia sabado la aplicacion "+aplicacion+" se utilizo un total de: " + minutos+" minutos.");
				            tiempo.insert(minutos);
				            tiempo.inOrden();
				            
				            sabado.insertListLinked(minutos, aplicacion);
				            
				            System.out.println("Desea monitorear otra aplicacion? true or false. ");
				            preg = sc4.nextBoolean();
						}
						break;
					}
					case("D"):
					{	
						while(preg == true) {
							System.out.println("Ingrese la aplicación que desee monitorear: ");
							aplicacion = sc3.next();
							while(aplicaciones.search(aplicacion) != true)
							{
								System.out.println("La aplicación " + aplicacion + " no se encuentra en la cola. \n");
								System.out.println("Vuelva a ingresar la aplicación a monitorear: ");
								aplicacion = sc3.next();
							}
							System.out.println("La aplicación " + aplicacion + " si se encuentra en la cola. \n");
							Scanner sc6 = new Scanner(System.in);
							System.out.print("Ingrese la hora de inicio de la aplicacion: (hh:mm)");
				            LocalTime inicio = LocalTime.parse(sc6.next());
				            System.out.print("Ingrese la hora de finalizacion de la aplicacion: (hh:mm)");
				            LocalTime termino  = LocalTime.parse(sc6.next());
		
				            int minutos = (int) ChronoUnit.MINUTES.between(inicio, termino);
				            System.out.println("\nEl dia domingo la aplicacion "+aplicacion+" se utilizo un total de: " + minutos+" minutos.");
				            tiempo.insert(minutos);
				            tiempo.inOrden();
				            
				            domingo.insertListLinked(minutos, aplicacion);
				            
				            System.out.println("Desea monitorear otra aplicacion? true or false. ");
				            preg = sc4.nextBoolean();
						}
						break;
					}
	            
	            System.out.println("Desea monitorear el tiempo empleado en otro dia de la semana? TRUE o FALSE: ");
	    		respue = sc4.nextBoolean();
			}
			
			Scanner scCon1 = new Scanner(System.in);
			boolean confirm = true;
			
			System.out.println("\nTiene alguna duda o quiere modificar los tiempos que ingreso? TRUE o FALSE: ");
			confirm=scCon1.nextBoolean();
			
			if(confirm==true)
			{
				//Se prueba el metodo contar nodos
				System.out.println("\n¿Desea saber el numero de nodos del arbol de tiempo? TRUE o FALSE");
				confirm=scCon1.nextBoolean();
				if(confirma==true)
	        		System.out.println("\nEl numero de nodos del arbol de tiempo es: " + tiempo.nroNodos());

				//Se prueba el metodo contar nodos no hojas
				System.out.println("\n¿Desea saber el numero de nodos no-hojas del arbol de tiempo? TRUE o FALSE");
				confirm=scCon1.nextBoolean();
				if(confirma==true)
					System.out.println("\nEl numero de nodos no-hojas del arbol de tiempo es: " + tiempo.nodosNoHojas());
	        
				//Se prueba el metodo contar hojas
				System.out.println("\n¿Desea saber el numero de hojas del arbol de tiempo? TRUE o FALSE");
				confirm=scCon1.nextBoolean();
				if(confirma==true)		
					System.out.println("\nEl numero de hojas del arbol de tiempo es: " + tiempo.nroHojas());
	        
				//Se prueba el metodo calcular altura
				System.out.println("\n¿Desea saber la altura del arbol de tiempo? TRUE o FALSE");
				confirm=scCon1.nextBoolean();
				if(confirma==true)			
					System.out.println("\nLa altura del arbol de tiempo es: " + tiempo.altura());

				//Se prueba el metodo calcular altura de un nodo
				System.out.println("\n¿Desea saber la altura del nodo del arbol? TRUE o FALSE");
				confirm=scCon1.nextBoolean();
				if(confirma==true)	
				{
					System.out.println("\n¿De que nodo tiempo desea saber la altura?: ");
					int nodotiem = scCon1.nextInt();
					System.out.println("\nLa altura del nodo del arbol es: " + tiempo.retornarAlturaNodo(nodotiem));
				}

				//Se prueba el metodo calcular area
				System.out.println("\n¿Desea saber el area del arbol de tiempo? TRUE o FALSE");
				confirm=scCon1.nextBoolean();
				if(confirma==true)
					System.out.println("\nEl area del arbol de tiempo es: " + tiempo.area());
	        
				//Se prueba el metodo buscar
				System.out.println("\n¿Desea saber si se encuentra el 12 en el arbol b? TRUE o FALSE");
				confirm=scCon1.nextBoolean();
				if(confirma==true)		
				{
					System.out.println("\nQue tiempo desea buscar?: ");
					int tiem = scCon1.nextInt();
					System.out.println("\n¿Se encuentra el tiempo en el arbol? " + tiempo.search(tiem));
				}
			}
			
			Scanner sc6 = new Scanner(System.in);
			System.out.println("\n¿Desea revisar los reportes de algun dia de la semana? TRUE o FALSE: ");
			boolean reporte = sc6.nextBoolean();
			
			while(reporte==true)
			{
				System.out.println("\n-----MENU DE OPCIONES-----");
				System.out.println("\nLunes = L");
				System.out.println("\nMartes = M");
				System.out.println("\nMiercoles = Mi");
				System.out.println("\nJueves = J");
				System.out.println("\nViernes = V");
				System.out.println("\nSabado = S");
				System.out.println("\nDomingo = D");
				
				System.out.println("\nElija de que dia desea ver el reporte: ");
				String dia1 = sc6.next();
				
				switch(dia1)
				{
					case("L"):	
					{
						System.out.println("\nREPORTE EN HASH TABLE DEL LUNES: \n" + lunes);
						
						System.out.println("Desea buscar alguna aplicación? ");
						boolean preg2 = sc6.hasNextBoolean();
						if(preg2 == true) {
							System.out.println("\nBUSQUEDA:");
							System.out.println("\n¿Que aplicacion desea buscar?: ");
							String apli1 = sc6.next();
							System.out.println("\n¿Que tiempo tiene la aplicacion que desea buscar?: ");
							int tie1 = sc6.nextInt();
							System.out.println("Se encontro: " + lunes.searchListLinked(tie1, apli1) + "\n");
						}
						
						System.out.println("Desea borrar alguna aplicación? ");
						preg2 = sc6.hasNextBoolean();
						if(preg2 == true) {
							System.out.println("\nELIMINACION:");
							System.out.println("\n¿Que aplicacion desea eliminar?: ");
							String apli2 = sc6.next();
							System.out.println("\n¿Que tiempo tiene la aplicacion que desea eliminar?: ");
							int tie2 = sc6.nextInt();
							System.out.println("Se eliminara a: " + lunes.removeListLinked(tie2, apli2) + "\n");
						}
					}
					case("M"):	
					{
						System.out.println("\nREPORTE EN HASH TABLE DEL MARTES: \n" + martes);
						
						System.out.println("Desea buscar alguna aplicación? ");
						boolean preg2 = sc6.hasNextBoolean();
						if(preg2 == true) {
							System.out.println("\nBUSQUEDA:");
							System.out.println("\n¿Que aplicacion desea buscar?: ");
							String apli1 = sc6.next();
							System.out.println("\n¿Que tiempo tiene la aplicacion que desea buscar?: ");
							int tie1 = sc6.nextInt();
							System.out.println("Se encontro: " + martes.searchListLinked(tie1, apli1) + "\n");
						}
						
						System.out.println("Desea borrar alguna aplicación? ");
						preg2 = sc6.hasNextBoolean();
						if(preg2 == true) {
							System.out.println("\nELIMINACION:");
							System.out.println("\n¿Que aplicacion desea eliminar?: ");
							String apli2 = sc6.next();
							System.out.println("\n¿Que tiempo tiene la aplicacion que desea eliminar?: ");
							int tie2 = sc6.nextInt();
							System.out.println("Se eliminara a: " + martes.removeListLinked(tie2, apli2) + "\n");
						}
					}
					case("Mi"):	
					{
						System.out.println("\nREPORTE EN HASH TABLE DEL MIERCOLES: \n" + miercoles);
						
						System.out.println("Desea buscar alguna aplicación? ");
						boolean preg2 = sc6.hasNextBoolean();
						if(preg2 == true) {
							System.out.println("\nBUSQUEDA:");
							System.out.println("\n¿Que aplicacion desea buscar?: ");
							String apli1 = sc6.next();
							System.out.println("\n¿Que tiempo tiene la aplicacion que desea buscar?: ");
							int tie1 = sc6.nextInt();
							System.out.println("Se encontro: " + miercoles.searchListLinked(tie1, apli1) + "\n");
						}
						
						System.out.println("Desea borrar alguna aplicación? ");
						preg2 = sc6.hasNextBoolean();
						if(preg2 == true) {
							System.out.println("\nELIMINACION:");
							System.out.println("\n¿Que aplicacion desea eliminar?: ");
							String apli2 = sc6.next();
							System.out.println("\n¿Que tiempo tiene la aplicacion que desea eliminar?: ");
							int tie2 = sc6.nextInt();
							System.out.println("Se eliminara a: " + miercoles.removeListLinked(tie2, apli2) + "\n");
						}
					}
					case("J"):	
					{
						System.out.println("\nREPORTE EN HASH TABLE DEL JUEVES: \n" + jueves);
						
						System.out.println("Desea buscar alguna aplicación? ");
						boolean preg2 = sc6.hasNextBoolean();
						if(preg2 == true) {
							System.out.println("\nBUSQUEDA:");
							System.out.println("\n¿Que aplicacion desea buscar?: ");
							String apli1 = sc6.next();
							System.out.println("\n¿Que tiempo tiene la aplicacion que desea buscar?: ");
							int tie1 = sc6.nextInt();
							System.out.println("Se encontro: " + jueves.searchListLinked(tie1, apli1) + "\n");
						}
						
						System.out.println("Desea borrar alguna aplicación? ");
						preg2 = sc6.hasNextBoolean();
						if(preg2 == true) {
							System.out.println("\nELIMINACION:");
							System.out.println("\n¿Que aplicacion desea eliminar?: ");
							String apli2 = sc6.next();
							System.out.println("\n¿Que tiempo tiene la aplicacion que desea eliminar?: ");
							int tie2 = sc6.nextInt();
							System.out.println("Se eliminara a: " + jueves.removeListLinked(tie2, apli2) + "\n");
						}
					}
					case("V"):	
					{
						System.out.println("\nREPORTE EN HASH TABLE DEL VIERNES: \n" + viernes);
						
						System.out.println("Desea buscar alguna aplicación? ");
						boolean preg2 = sc6.hasNextBoolean();
						if(preg2 == true) {
							System.out.println("\nBUSQUEDA:");
							System.out.println("\n¿Que aplicacion desea buscar?: ");
							String apli1 = sc6.next();
							System.out.println("\n¿Que tiempo tiene la aplicacion que desea buscar?: ");
							int tie1 = sc6.nextInt();
							System.out.println("Se encontro: " + viernes.searchListLinked(tie1, apli1) + "\n");
						}
						
						System.out.println("Desea borrar alguna aplicación? ");
						preg2 = sc6.hasNextBoolean();
						if(preg2 == true) {
							System.out.println("\nELIMINACION:");
							System.out.println("\n¿Que aplicacion desea eliminar?: ");
							String apli2 = sc6.next();
							System.out.println("\n¿Que tiempo tiene la aplicacion que desea eliminar?: ");
							int tie2 = sc6.nextInt();
							System.out.println("Se eliminara a: " + viernes.removeListLinked(tie2, apli2) + "\n");
						}
					}
					case("S"):	
					{
						System.out.println("\nREPORTE EN HASH TABLE DEL SABADO: \n" + sabado);
						
						System.out.println("Desea buscar alguna aplicación? ");
						boolean preg2 = sc6.hasNextBoolean();
						if(preg2 == true) {
							System.out.println("\nBUSQUEDA:");
							System.out.println("\n¿Que aplicacion desea buscar?: ");
							String apli1 = sc6.next();
							System.out.println("\n¿Que tiempo tiene la aplicacion que desea buscar?: ");
							int tie1 = sc6.nextInt();
							System.out.println("Se encontro: " + sabado.searchListLinked(tie1, apli1) + "\n");
						}
						
						System.out.println("Desea borrar alguna aplicación? ");
						preg2 = sc6.hasNextBoolean();
						if(preg2 == true) {
							System.out.println("\nELIMINACION:");
							System.out.println("\n¿Que aplicacion desea eliminar?: ");
							String apli2 = sc6.next();
							System.out.println("\n¿Que tiempo tiene la aplicacion que desea eliminar?: ");
							int tie2 = sc6.nextInt();
							System.out.println("Se eliminara a: " + sabado.removeListLinked(tie2, apli2) + "\n");
						}
					}
					case("D"):	
					{
						System.out.println("\nREPORTE EN HASH TABLE DEL DOMINGO: \n" + domingo);
						
						System.out.println("Desea buscar alguna aplicación? ");
						boolean preg2 = sc6.hasNextBoolean();
						if(preg2 == true) {
							System.out.println("\nBUSQUEDA:");
							System.out.println("\n¿Que aplicacion desea buscar?: ");
							String apli1 = sc6.next();
							System.out.println("\n¿Que tiempo tiene la aplicacion que desea buscar?: ");
							int tie1 = sc6.nextInt();
							System.out.println("Se encontro: " + domingo.searchListLinked(tie1, apli1) + "\n");
						}
						
						System.out.println("Desea borrar alguna aplicación? ");
						preg2 = sc6.hasNextBoolean();
						if(preg2 == true) {
							System.out.println("\nELIMINACION:");
							System.out.println("\n¿Que aplicacion desea eliminar?: ");
							String apli2 = sc6.next();
							System.out.println("\n¿Que tiempo tiene la aplicacion que desea eliminar?: ");
							int tie2 = sc6.nextInt();
							System.out.println("Se eliminara a: " + domingo.removeListLinked(tie2, apli2) + "\n");
						}
					}	
				}
				System.out.println("\n¿Desea revisar los reportes de otro dia de la semana? TRUE o FALSE: ");
				reporte = sc6.nextBoolean();
			}
			
	        System.out.println("\nGracias por usar HabitTracker, vuelva pronto :) ");
		}
		catch(Exception x)
		{
			System.out.println(x.getMessage());
		}
	}
}