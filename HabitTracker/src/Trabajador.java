
public class Trabajador extends Usuario
{
	private String centroTrabajo;
	private String cargo;
	
	public Trabajador(String nombres, String apellidos, int edad, char genero, String dni, String descripcion,
			String usuario, String correo, String contraseña, String centroTrabajo, String cargo)
	{
		super(nombres, apellidos, edad, genero, dni, descripcion, usuario, correo, contraseña);
		this.centroTrabajo = centroTrabajo;
		this.cargo = cargo;
	}
	
	//Set y Get de Centro de Trabajo
	public String getCentroTrabajo(){return centroTrabajo;}
	public void setCentroTrabajo(String centroTrabajo)
	{
		System.out.println("Ingresar Centro de Trabajo: ");
		this.centroTrabajo = centroTrabajo;
	}

	//Set y Get de Cargo
	public String getCargo(){return cargo;}
	public void setCargo(String cargo)
	{
		System.out.println("Ingresar cargo: ");
		this.cargo = cargo;
	}

	@Override
	public String toString()
	{
		return "Trabajador [centroTrabajo=" + centroTrabajo + ", cargo=" + cargo + "]";
	}
}
