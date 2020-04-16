package es.upm.dit.prog.herenciaejemplo;

public class Coche extends Vehiculo {

	int numeroTotalMarchas;

	// Para crear un coche con un nombre y un numero de marchas máximo
	// Primero llama al constructor de la clase madre con "super(nombre)" y
	// luego sigue con el resto del constructor
	public Coche(String nombre, int numeroTotalMarchas) {
		super(nombre);
		this.numeroTotalMarchas = numeroTotalMarchas;
	}

	// Para crear un coche con un nombre
	// Primero llama al constructor de la clase madre con "super(nombre)" y
	// luego sigue con el resto del constructor
	public Coche(String nombre) {
		super(nombre);
		this.numeroTotalMarchas = 5;
	}

	// Se sombrea el método (se sobreescribe) ya que el método de la clase madre
	// (Vehículo) no comprueba el número máximo de marchas
	@Override
	public void cambiarMarcha(int newGear) throws Exception {
		if (newGear > this.numeroTotalMarchas || newGear <= 0)
			throw new Exception("Número de marcha no permitido");
		this.marcha = newGear;
	}

	// Se sombrea el método porque mostramos más información que la clase madre
	// Vehiculo. (Tenemos número máximo de marchas)
	@Override
	public void imprimirEstado() {
		System.out.println("Coche:\t\t" + this.nombre + "\tVelocidad: " + this.velocidad + "\tMarcha: " + this.marcha
				+ "\tMarcha max: " + this.numeroTotalMarchas);
	}

	// Método nuevo que aporta esta clase aporta y que no aparece en la clase
	// madre Vehiculo
	public int getNumeroTotalMarchas() {
		return this.numeroTotalMarchas;
	}

}
