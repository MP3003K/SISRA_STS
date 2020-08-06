package pe.edu.upeu.ruos.entity;

public class Usuario {
	private int idusuario;
private String dni;
private String nombres;
private String apellidoP;
private String apellidoM;
private String correo;
private String telefono;
private String casa_vecinal;
private String distrito;
private String direccion;
private String contraseña;

public Usuario() {
	super();
}

public int getidusuario() {
	return idusuario;
}

public void setIdusuario(int idusuario) {
	this.idusuario = idusuario;
}

public String getDni() {
	return dni;
}

public void setDni(String dni) {
	this.dni = dni;
}

public String getNombres() {
	return nombres;
}

public void setNombres(String nombres) {
	this.nombres = nombres;
}

public String getApellidoP() {
	return apellidoP;
}

public void setApellidoP(String apellidoP) {
	this.apellidoP = apellidoP;
}

public String getApellidoM() {
	return apellidoM;
}

public void setApellidoM(String apellidoM) {
	this.apellidoM = apellidoM;
}

public String getCorreo() {
	return correo;
}

public void setCorreo(String correo) {
	this.correo = correo;
}

public String getTelefono() {
	return telefono;
}

public void setTelefono(String telefono) {
	this.telefono = telefono;
}

public String getCasa_vecinal() {
	return casa_vecinal;
}

public void setCasa_vecinal(String casa_vecinal) {
	this.casa_vecinal = casa_vecinal;
}

public String getDistrito() {
	return distrito;
}

public void setDistrito(String distrito) {
	this.distrito = distrito;
}

public String getDireccion() {
	return direccion;
}

public void setDireccion(String direccion) {
	this.direccion = direccion;
}

public String getContraseña() {
	return contraseña;
}

public void setContraseña(String contraseña) {
	this.contraseña = contraseña;
}

public Usuario(int idusuario, String dni, String nombres, String apellidoP, String apellidoM, String correo,
		String telefono, String casa_vecinal, String distrito, String direccion, String contraseña) {
	super();
	this.idusuario = idusuario;
	this.dni = dni;
	this.nombres = nombres;
	this.apellidoP = apellidoP;
	this.apellidoM = apellidoM;
	this.correo = correo;
	this.telefono = telefono;
	this.casa_vecinal = casa_vecinal;
	this.distrito = distrito;
	this.direccion = direccion;
	this.contraseña = contraseña;
}


}
