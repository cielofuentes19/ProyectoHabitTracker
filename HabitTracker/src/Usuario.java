
public class Usuario extends Persona
{
	private String descripcion;
	private String usuario;
	private String correo;
	private String contraseña;

	public Usuario(String nombres, String apellidos, int edad, char genero, String dni, String descripcion,
			String usuario, String correo, String contraseña)
	{
		super(nombres, apellidos, edad, genero, dni);
		this.descripcion = descripcion;
		this.usuario = usuario;
		this.correo = correo;
		this.contraseña = contraseña;
	}
	
	//Set y Get de Descripcion de Motivo
	public String getDescripcion()
	{
		return descripcion;
	}
	public void setDescripcion(String descripcion)
	{
		this.descripcion = descripcion;
	}

	//Set y Get de Usuario
	public String getUsuario()
	{
		return usuario;
	}
	public void setUsuario(String usuario)
	{
		this.usuario = usuario;
	}

	//Set y Get de Correo
	public String getCorreo()
	{
		return correo;
	}
	public void setCorreo(String correo)
	{
		this.correo = correo;
	}

	//Set y Get de Contraseña
	public String getContraseña()
	{
		return contraseña;
	}
	public void setContraseña(String contraseña)
	{
		this.contraseña = contraseña;
	}
	
	public boolean validarUsuario(String usu, String contra)
	{
		if(usu != this.getUsuario())
		{
			System.out.println("El usuario no es correcto...");
			return false;
		}
		
		else if(contra != this.getContraseña())
		{
			System.out.println("La contraseña no es correcta...");
			return false;
		}
		
		System.out.println("Usuario Validado. Bienvenido :) \n");
		return true;
	}

	@Override
	public String toString()
	{
		return super.toString() + "\n descripcion: " + this.descripcion + "\n usuario=" + this.usuario + "\n correo=" + this.correo + "\n contraseña="
				+ this.contraseña;
	}
}
