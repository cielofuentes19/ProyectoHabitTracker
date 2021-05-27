
public class Persona
{
	private String nombres;
	private String apellidos;
	private int edad;
	private char genero;
	private String dni;
	
	public Persona(String nombres, String apellidos, int edad, char genero, String dni)
	{
		super();
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.edad = edad;
		this.genero = genero;
		this.dni = dni;
	}

	//Set y get de Nombres
	public String getNombres(){return this.nombres;}
	public void setNombres(String nombres)
	{
		System.out.println("Ingresar Nombres: ");
		this.nombres = nombres;
	}
	
	//Set y get de Nombres
	public String getApellidos(){return this.apellidos;}
	public void setApellidos(String apellidos)
	{
		System.out.println("Ingresar Apellidos: ");
		this.apellidos = apellidos;
	}

	//Set y Get de Edad
	public int getEdad(){return this.edad;}
	public void setEdad(int edad)
	{
		System.out.println("Ingresar edad: ");
		while (edad > 120)
			System.out.println("La edad debe no debe ser mayor de 120...");
		this.edad = edad;
	}
	
	//Set y Get de Genero
	public char getGenero(){return this.genero;}
	public void setGenero(char genero)
	{
		System.out.println("Ingresar genero: M=masculino, F=femenino, N=no especifica ");
		while(genero!='M' || genero!='F' || genero!='N')
			System.out.println("Este caracter no esta permitido. Ingresar de nuevo...");
		this.genero = genero;
	}
	
	//Set y Get de DNI
	public String getDni(){return this.dni;}
	public void setDni(String dni)
	{
		System.out.println("Ingresar DNI: ");
		while (dni.length() != 8)
			System.out.println("El DNI debe tener 8 digitos...");
		this.dni = dni;
	}

	@Override
	public String toString()
	{
		return "Persona [nombres=" + nombres + ", apellidos=" + apellidos + ", edad=" + edad + ", genero=" + genero
				+ ", dni=" + dni + "]";
	}
}
