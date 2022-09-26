package Package1;

public class Gato {
	public String nombre;
	private int edad;
	public String color;
	
	public void hablar() {
		System.out.println("Mi nombre es: " + this.nombre + " guau");
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public Gato(String nombre, int edad, String color) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.color = color;
	}
	
	public static void presentacion(Gato gato) {
		System.out.print("Soy " + gato.nombre + "tengo" + gato.getEdad() + "años " + gato.edad);
	}
}
