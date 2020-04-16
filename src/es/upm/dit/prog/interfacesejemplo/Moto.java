package es.upm.dit.prog.interfacesejemplo;

public class Moto implements Vehiculo {

	int velocidad;
	int marcha;
	String nombre;
	boolean haciendoCaballito = false;

	// Para crear una moto con un nombre
	public Moto(String nombre) {
		this.nombre = nombre;
	}

	public void hacerCaballito(){
		this.haciendoCaballito = true;
	}

	public void dejarHacerCaballito(){
		this.haciendoCaballito = false;
	}

	// cambio de marcha
	@Override
	public void cambiarMarcha(int newGear) {
		marcha = newGear;
	}

	// aumenta velocidad
	@Override
	public void acelerar(int increment) {

		velocidad = velocidad + increment;
	}

	// reduce velocidad
	@Override
	public void frenar(int decrement) {

		velocidad = velocidad - decrement;
	}

	// imprime el estado
	@Override
	public void imprimirEstado() {
		System.out.println("Moto:\t\t" + this.nombre + "\t\tVelocidad: " + this.velocidad + "\tMarcha: " + this.marcha);
	}



}
