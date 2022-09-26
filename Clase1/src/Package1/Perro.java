package Package1;

public class Perro extends Animal{
	
	public String nombre;
	private int edad;
	public String raza;
	
	public void hablar() {
		System.out.println("Mi nombre es: " + this.nombre + " guau");
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public Perro(String familia, boolean alas) {
		super(familia, alas);
		// TODO Auto-generated constructor stub
	}
	
	
	public Perro(String familia, boolean alas, String nombre, int edad, String raza) {
		super(familia, alas);
		this.nombre = nombre;
		this.edad = edad;
		this.raza = raza;
	}

	public static void presentacion(Perro perro) {
		System.out.print("Soy " + perro.nombre + "tengo" + perro.getEdad() + "años " + perro.edad);
	}
	
}
