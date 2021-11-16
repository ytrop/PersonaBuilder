
public class PersonaBuilder {
	private String email;
    private String nombre;
    private String apellidos;
    private String telefono;
    private String direccion;

    public PersonaBuilder() {
    }

    public PersonaBuilder email(String email) {
        this.email = email;
        return this;
    }

    public PersonaBuilder nombre(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        return this;
    }

    public PersonaBuilder telefono(String telefono) {
        this.telefono = telefono;
        return this;
    }

    public PersonaBuilder direccion(String direccion) {
        this.direccion = direccion;
        return this;
    }

    public Persona build() {
        return new Persona(this);
    }

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
}
