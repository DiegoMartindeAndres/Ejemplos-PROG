package es.upm.dit.prog.interfacesejemplo;

public class PruebaVehiculo {

	public static void main(String[] args) {

		// 1- Crear objetos y operamos
		// creamos una bicicleta y hacemos operaciones
		Bicicleta miBici = new Bicicleta("BH");
		miBici.cambiarMarcha(2);
		miBici.acelerar(3);
		miBici.frenar(1);

		miBici.imprimirEstado();


		// creamos un coche y hacemos operaciones
		Coche miCoche = new Coche("Lambo",6);
		try {
			miCoche.cambiarMarcha(1);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}


		miCoche.acelerar(4);
		miCoche.frenar(3);
		miCoche.imprimirEstado();

		// 2- Crear una nueva clase para motos.


		 //3- Crear muchos objetos y tratarlos de la misma manera.
//		int tam = 10*3;
//		Vehiculo[] misVehiculos = new Vehiculo[tam];
//
//		Bicicleta biciNueva;
//		Coche cocheNuevo;
//		Moto motoNueva;
//
//		int i =0;
//		while (i < tam){
//			biciNueva = new Bicicleta("Bici "+i);
//			misVehiculos[i++] = biciNueva;
//
//			cocheNuevo = new Coche("Coche "+i);
//			misVehiculos[i++] = cocheNuevo;
//
//			motoNueva = new Moto("Moto "+i);
//			misVehiculos[i++] = motoNueva;
//
//		}
//
//		for(Vehiculo miVehiculo:misVehiculos){
//			miVehiculo.imprimirEstado();
//		}



	}

}
