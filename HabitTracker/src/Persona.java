
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
		this.nombres = nombres;
	}
	
	//Set y get de Nombres
	public String getApellidos(){return this.apellidos;}
	public void setApellidos(String apellidos)
	{
		this.apellidos = apellidos;
	}

	//Set y Get de Edad
	public int getEdad(){return this.edad;}
	public void setEdad(int edad)
	{
		this.edad = edad;
	}
	
	//Set y Get de Genero
	public char getGenero(){return this.genero;}
	public void setGenero(char genero)
	{
		this.genero = genero;
	}
	
	//Set y Get de DNI
	public String getDni(){return this.dni;}
	public void setDni(String dni)
	{
		this.dni = dni;
	}

	@Override
	public String toString()
	{
		return " [\n Nombres:" + this.nombres + "\n apellidos=" + this.apellidos + "\n edad=" + this.edad + "\n genero=" + this.genero
				+ "\n dni=" + this.dni + "]";
	}
}
