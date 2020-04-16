package es.upm.dit.prog.interfacesejemplo;

public interface Vehiculo {
	void cambiarMarcha(int nuevaMarcha) throws Exception;
    void acelerar(int incremento);
    void frenar(int decremento);
    void imprimirEstado();
}
