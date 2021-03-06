package users;

public class Estudiante extends Usuario
{
	private String centroEstudio;
	private String carrera;
	
	public Estudiante(String nombres, String apellidos, int edad, char genero, String dni, String descripcion,
			String usuario, String correo, String contraseņa, String centroEstudio, String carrera)
	{
		super(nombres, apellidos, edad, genero, dni, descripcion, usuario, correo, contraseņa);
		this.centroEstudio = centroEstudio;
		this.carrera = carrera;
	}

	//Set y Get del Centro de Estudio (Universidad, Instituto, etc.)
	public String getCentroEstudio(){return centroEstudio;}
	public void setCentroEstudio(String centroEstudio)
	{
		this.centroEstudio = centroEstudio;
	}

	//Set y Get de la Carrera
	public String getCarrera(){return carrera;}
	public void setCarrera(String carrera)
	{
		this.carrera = carrera;
	}

	@Override
	public String toString()
	{
		return super.toString() +"\nCentro de Estudio: " + this.centroEstudio + "\nCarrera: " + this.carrera;
	}	
}