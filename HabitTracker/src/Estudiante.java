
public class Estudiante extends Usuario
{
	private String centroEstudio;
	private String carrera;
	
	public Estudiante(String nombres, String apellidos, int edad, char genero, String dni, String descripcion,
			String usuario, String correo, String contraseña, String centroEstudio, String carrera)
	{
		super(nombres, apellidos, edad, genero, dni, descripcion, usuario, correo, contraseña);
		this.centroEstudio = centroEstudio;
		this.carrera = carrera;
	}
	
	//Set y Get del Centro de Estudio (Universidad, Instituto, etc.)
	public String getCentroEstudio(){return centroEstudio;}
	public void setCentroEstudio(String centroEstudio)
	{
		System.out.println("Ingresar Centro de Estudio: ");
		this.centroEstudio = centroEstudio;
	}

	//Set y Get de la Carrera
	public String getCarrera(){return carrera;}
	public void setCarrera(String carrera)
	{
		System.out.println("Ingresar Carrera que estudia: ");
		this.carrera = carrera;
	}

	@Override
	public String toString()
	{
		return "Estudiante [centroEstudio=" + centroEstudio + ", carrera=" + carrera + "]";
	}	
}
