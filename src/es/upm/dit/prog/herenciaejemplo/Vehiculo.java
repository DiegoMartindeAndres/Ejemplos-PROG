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
	public void cambiarMarcha(int nuevaMarcha) throws Exception {
		marcha = nuevaMarcha;
	}

	// aumenta velocidad
	public void acelerar(int incremento) {

		velocidad = velocidad + incremento;
	}

	// reduce velocidad
	public void frenar(int decremento) {

		velocidad = velocidad - decremento;
	}

	// imprime el estado
	public void imprimirEstado() {
		System.out.println(
				"Bicicleta:\t" + this.nombre + "\t\tVelocidad: " + this.velocidad + "\tMarcha: " + this.marcha);
	}
}
