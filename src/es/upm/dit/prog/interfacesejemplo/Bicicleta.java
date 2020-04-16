package es.upm.dit.prog.interfacesejemplo;

public class Bicicleta implements Vehiculo {

	int velocidad;
	int marcha;
	String nombre;

	// Para crear una bicicleta con un nombre
	public Bicicleta(String nombre) {
		this.nombre = nombre;
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
		System.out.println("Bicicleta:\t" + this.nombre + "\t\tVelocidad: " + this.velocidad + "\tMarcha: " + this.marcha);
	}

}
