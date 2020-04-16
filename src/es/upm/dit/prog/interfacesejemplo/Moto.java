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
	public void cambiarMarcha(int nuevaMarcha) {
		marcha = nuevaMarcha;
	}

	// aumenta velocidad
	@Override
	public void acelerar(int incremento) {

		velocidad = velocidad + incremento;
	}

	// reduce velocidad
	@Override
	public void frenar(int decremento) {

		velocidad = velocidad - decremento;
	}

	// imprime el estado
	@Override
	public void imprimirEstado() {
		System.out.println("Moto:\t\t" + this.nombre + "\t\tVelocidad: " + this.velocidad + "\tMarcha: " + this.marcha);
	}



}
