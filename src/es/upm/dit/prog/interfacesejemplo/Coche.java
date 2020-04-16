package es.upm.dit.prog.interfacesejemplo;

public class Coche implements Vehiculo {

	int velocidad;
	int marcha;
	int numeroTotalMarchas;
	String nombre;

	// Para crear un coche con un nombre y un numero de marchas máximo
	public Coche(String nombre, int numeroTotalMarchas) {
		this.nombre = nombre;
		this.numeroTotalMarchas = numeroTotalMarchas;
	}

	// Para crear un coche con un nombre
	// Por defecto 5 marchas.
	public Coche(String nombre) {
		this.nombre = nombre;
		this.numeroTotalMarchas = 5;
	}

	// cambio de marcha
	@Override
	public void cambiarMarcha(int nuevaMarcha) throws Exception {
		if (nuevaMarcha > this.numeroTotalMarchas || nuevaMarcha <= 0)
			throw new Exception("Número de marcha no permitido");
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

	// muestra el estado
	@Override
	public void imprimirEstado() {
		System.out.println("Coche:\t\t" + this.nombre + "\tVelocidad: " + this.velocidad + "\tMarcha: " + this.marcha
				+ "\tMarcha max: " + this.numeroTotalMarchas);
	}

	public int getNumeroTotalMarchas() {
		return this.numeroTotalMarchas;
	}

}
