package es.upm.dit.prog.herenciaejemplo;

public class Moto extends Vehiculo {

	boolean haciendoCaballito = false;

	// Para crear una moto con un nombre
	public Moto(String nombre) {
		super(nombre);
	}

	// Método nuevo que aporta la clase Moto con respecto a la clase madre
	// Vehiculo
	public void hacerCaballito() {
		this.haciendoCaballito = true;
	}

	// Método nuevo que aporta la clase Moto con respecto a la clase madre
	// Vehiculo
	public void dejarHacerCaballito() {
		this.haciendoCaballito = false;
	}

	// imprime el estado
	@Override
	public void imprimirEstado() {
		System.out.println("Moto:\t\t" + this.nombre + "\t\tVelocidad: " + this.velocidad + "\tMarcha: " + this.marcha);
	}

}
