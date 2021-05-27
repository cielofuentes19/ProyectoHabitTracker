
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
		System.out.println("Ingresar la razon por la que desea usar Habit Tracker :) : ");
		this.descripcion = descripcion;
	}

	//Set y Get de Usuario
	public String getUsuario()
	{
		return usuario;
	}
	public void setUsuario(String usuario)
	{
		System.out.println("Ingresar usuario: ");
		this.usuario = usuario;
	}

	//Set y Get de Correo
	public String getCorreo()
	{
		return correo;
	}
	public void setCorreo(String correo)
	{
		System.out.println("Ingresar correo: ");
		this.correo = correo;
	}

	//Set y Get de Contraseña
	public String getContraseña()
	{
		return contraseña;
	}
	public void setContraseña(String contraseña)
	{
		System.out.println("Ingresar contraseña: ");
		while (contraseña.length() != 8)
			System.out.println("La contraseña debe tener 8 digitos...");
		this.contraseña = contraseña;
	}
	
	public void validarUsuario(String usu, String contra)
	{
		while(usu != this.usuario)
			System.out.println("El usuario no es correcto...");
		while(contra != this.contraseña)
			System.out.println("La contraseña no es correcta...");
		System.out.println("Usuario Validado. Bienvenido :) \n");
	}

	@Override
	public String toString()
	{
		return "Usuario [descripcion=" + descripcion + ", usuario=" + usuario + ", correo=" + correo + ", contraseña="
				+ contraseña + "]";
	}
}
