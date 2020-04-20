# Ejemplo sobre Herencia
---
El presente código pretende resolver un problema usando la herencia (o extensión).
### Problema a resolver.
Necesitamos tres clases: Moto, Coche y Bicicleta. Estas clases representan objetos del mundo real pero cada uno de ellos tiene sus peculiaridades.
Los tres deben permitir guardar su nombre, su velocidad y la marcha. Para ello deben tener los siguientes métodos:
| Método        | Explicación  |
| ------------- |-------------|
| Constructor que recibe, al menos, el nombre      | Todas las clases deben tener un constructor |
| void imprimirEstado()      | Imprime por consola los campos de la clase (marcha, velocidad, etc.)      |
| void acelerar(int incremento) | Acelera un "incremento" que se pasa por parámetro      |
| void frenar(int decremento) | Frena un "decremento" que se pasa por parámetro      |

La clase Moto debe tener los siguientes métodos:
| Método específicos  para Moto        | Explicación  |
| ------------- |-------------|
| void hacerCaballito()      | Se anota en un campo de la clase está realizando un "caballito" |
| void dejarHacerCaballito()      | Se anota en un campo de la clase que ya no está realizando un "caballito" |

La clase Coche debe tener los siguientes métodos:
| Método específicos para Coche        | Explicación  |
| ------------- |-------------|
| Constructor específico      | Donde además del nombre recibe el número máximo de marchas. |


<!--- 
### Usando interfaces.
En el paquete *es.upm.dit.prog.interfacesejemplo* tenemos la solución usando interfaces.
A continuación, hacemos una breve descripción de cada clase.
--->
<!--- 
| Clases e interfaces        | Explicación  |
| ------------- |-------------|
| Interface "Vehiculo"      | Interface con los métodos que deben implementar, Bicicleta, Moto y Coche |
| Clase "Coche"      | Clase que implementa la interface "Vehiculo", con dos constructores y método propio "getNumeroTotalMarchas" |
| Clase "Bicicleta"      | Clase que implementa la interface "Vehiculo", con un constructor |
| Clase "Moto"      | Clase que implementa la interface "Vehiculo", con un constructor y métodos propios "hacerCaballito" y "dejarHacerCaballito" |
| Clase "PruebaVehiculo"      | Clase con método main para hacer las pruebas del código. |
--->

### Resolviendo el problema usando herencia (o extensión).
En el paquete *es.upm.dit.prog.herenciaejemplo* tenemos la solución usando herencia (o extensión).
A continuación, hacemos una breve descripción de cada clase.

| Clases         | Explicación  |
| ------------- |-------------|
| Clase "Vehiculo"      | Clase madre que implementa el constructor, "void cambiarMarcha(int nuevaMarcha)", "void acelerar(int incremento)", "void frenar(int decremento)" e "imprimirEstado()" las clases Bicicleta, Moto y Coche; heredaran de ella (o la extenderan) |
| Clase "Coche"      | Clase que hereda (o extiende) de la clase "Vehiculo", con dos constructores y método propio "getNumeroTotalMarchas" |
| Clase "Bicicleta"      | Clase que hereda (o extiende) de la clase "Vehiculo", con un solo constructores |
| Clase "Moto"      | Clase que hereda (o extiende) de la clase "Vehiculo", con un constructor y métodos propios "hacerCaballito" y "dejarHacerCaballito" |
| Clase "PruebaVehiculo"      | Clase con método main para hacer las pruebas del código. |
