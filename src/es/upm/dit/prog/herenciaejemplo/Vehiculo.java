package es.upm.dit.prog.herenciaejemplo;

public class Vehiculo {

	int velocidad = 0;
	int marcha = 0;
	String nombre;

	// Para crear una bicicleta con un nombre
	public Vehiculo(String nombre) {
		this.nombre = nombre;
	}

	// cambio de marcha
	public void cambiarMarcha(int newGear) throws Exception {
		marcha = newGear;
	}

	// aumenta velocidad
	public void acelerar(int increment) {

		velocidad = velocidad + increment;
	}

	// reduce velocidad
	public void frenar(int decrement) {

		velocidad = velocidad - decrement;
	}

	// imprime el estado
	public void imprimirEstado() {
		System.out.println(
				"Bicicleta:\t" + this.nombre + "\t\tVelocidad: " + this.velocidad + "\tMarcha: " + this.marcha);
	}
}
