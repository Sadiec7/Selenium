package Package1;

public class Pajaro extends Animal {
int numAlas;
	public Pajaro(String familia, boolean alas) {
		super(familia, alas);
		this.alas = alas;
		// TODO Auto-generated constructor stub
	}
	
public static void presentacion(Pajaro pajaro) {
	System.out.println("Soy un pajaro y tengo"+ pajaro.numAlas);
}
}
