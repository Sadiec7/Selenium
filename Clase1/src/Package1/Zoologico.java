package Package1;

public class Zoologico {

	public static void main(String[] args) {
		Perro perro1 = new Perro("Manífero", false, "Pilon", 5, "Pastor Aleman");
		perro1.hablar();
		
		Perro perro2 = new Perro("Manífero", false,"Canelo", 10, "Boxer");
		perro2.hablar();
		
		//perro1.nombre = "Chocolate";
		//perro1.hablar();
		
		//System.out.println("Mi edad es " + perro1.getEdad());
		//perro1.setEdad(2);
		//System.out.println("Mi edad es " + perro1.getEdad());
		
		Perro.presentacion(perro1);
		Perro.presentacion(perro2);
		
		
	}
}
