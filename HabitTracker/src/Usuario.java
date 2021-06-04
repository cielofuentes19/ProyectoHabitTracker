
public class Usuario extends Persona
{
	private String descripcion;
	private String usuario;
	private String correo;
	private String contrase�a;

	public Usuario(String nombres, String apellidos, int edad, char genero, String dni, String descripcion,
			String usuario, String correo, String contrase�a)
	{
		super(nombres, apellidos, edad, genero, dni);
		this.descripcion = descripcion;
		this.usuario = usuario;
		this.correo = correo;
		this.contrase�a = contrase�a;
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

	//Set y Get de Contrase�a
	public String getContrase�a()
	{
		return contrase�a;
	}
	public void setContrase�a(String contrase�a)
	{
		this.contrase�a = contrase�a;
	}
	
	public boolean validarUsuario(String usu, String contra)
	{
		if(usu != this.getUsuario())
		{
			System.out.println("El usuario no es correcto...");
			return false;
		}
		
		else if(contra != this.getContrase�a())
		{
			System.out.println("La contrase�a no es correcta...");
			return false;
		}
		
		System.out.println("Usuario Validado. Bienvenido :) \n");
		return true;
	}

	@Override
	public String toString()
	{
		return super.toString() + "\n descripcion: " + this.descripcion + "\n usuario=" + this.usuario + "\n correo=" + this.correo + "\n contrase�a="
				+ this.contrase�a;
	}
}
