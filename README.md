# Administración de Empleados en Consola

## 1. Descripción del Proyecto  
Crea una aplicación en consola que administre empleados de una empresa, calcule sus salarios y permita gestionar diferentes tipos de empleados (por ejemplo, a tiempo completo y por horas). El sistema deberá:  

- Registrar empleados con sus datos básicos.  
- Calcular la nómina de cada empleado según su tipo y características (horas trabajadas, salario base, bonificaciones, etc.).  
- Mostrar reportes (lista de empleados, total de salarios, etc.).  

## 2. Funcionalidades Requeridas  

### Registro y Gestión de Empleados  
- **Alta de Empleados**: Permite agregar nuevos empleados.  
- **Listado de Empleados**: Mostrar los empleados registrados con sus datos.  
- **Búsqueda y Edición**: Opcionalmente, permitir buscar y modificar información de un empleado.  

### Cálculo de Nómina  
- **Empleados a Tiempo Completo**: Su salario se calcula a partir de un sueldo base y, opcionalmente, una bonificación.  
- **Empleados por Hora**: Su salario se basa en el número de horas trabajadas y el valor de la hora.  
- **Cálculo de Bonificaciones**: Algunos empleados podrán tener una bonificación adicional. Aquí puedes implementar una interfaz que defina un método, por ejemplo, `calcularBonificacion()`.  

### Reportes y Estadísticas  
- **Total de Empleados**: Utiliza un contador estático para llevar la cuenta de cuántos empleados hay.  
- **Total de Nómina**: Suma de los salarios de todos los empleados.  

## 3. Estructura y Diseño del Código  

### Clases y Jerarquía  

- **Clase Abstracta `Empleado`**  
  - Atributos comunes: `id`, `nombre`, `salarioBase`.  
  - Métodos: Getters y setters, y un método abstracto `calcularSalario()`.  
  - Uso de modificadores de acceso: Atributos privados, métodos públicos.  

- **Clases Concretas**  
  - `EmpleadoTiempoCompleto`: Hereda de `Empleado` e implementa `calcularSalario()` considerando un sueldo fijo y bonificaciones.  
  - `EmpleadoPorHora`: Hereda de `Empleado` e implementa `calcularSalario()` basado en horas trabajadas y el valor de la hora.  

- **Interfaz `Bonificable`**  
  - Define el método `calcularBonificacion()`.  
  - Algunas clases (o incluso solo ciertos empleados) pueden implementar esta interfaz para tener una bonificación extra.  

### Uso de Constructores y Sobrecarga  
- Proporciona constructores sobrecargados en cada clase para crear objetos con distintos conjuntos de parámetros.  
- Por ejemplo, en `EmpleadoTiempoCompleto` podrías tener un constructor que reciba solo `id` y `nombre`, y otro que también incluya `salarioBase` y `bonificacion`.  

### Uso de `static` y `final`  
- **Atributo `static`**: Un contador de empleados en la clase `Empleado` o en una clase de utilidad para llevar el total de empleados creados.  
- **Constantes (`static final`)**: Define valores constantes, como el valor de la hora extra o algún factor de bonificación, que no se deben modificar.  

### Uso de Estructuras de Control y Operadores  
- En la clase principal (por ejemplo, `Main`), implementa un menú en consola que permita al usuario elegir opciones (alta, listado, cálculo de nómina, etc.) usando estructuras de control (`if`, `switch`, bucles `while` o `for`).  
- Utiliza operadores aritméticos para el cálculo de salarios y bonificaciones.  

## 4. Pasos para el Desarrollo  

1. **Diseño de Clases**  
   - Esboza un diagrama UML simple que incluya la clase abstracta `Empleado`, las clases derivadas, y la interfaz `Bonificable`.  

2. **Implementación de la Clase `Empleado`**  
   - Define atributos privados, constructores, getters/setters y el método abstracto `calcularSalario()`.  

3. **Implementación de Clases Derivadas**  
   - Implementa `EmpleadoTiempoCompleto` y `EmpleadoPorHora`, cada una con su lógica específica en `calcularSalario()`.  
   - Implementa la interfaz `Bonificable` en la(s) clase(s) que consideres que deben tener bonificación.  

4. **Uso de `static` y `final`**  
   - Agrega un atributo estático para contar empleados.  
   - Define constantes con `static final` para valores fijos (por ejemplo, el valor por hora, tasa de bonificación).  

5. **Creación del Menú en la Clase Principal**  
   - Implementa un bucle que muestre un menú y permita al usuario seleccionar opciones.  
   - Utiliza estructuras de control para gestionar la entrada y salida de información.  

6. **Pruebas y Depuración**  
   - Realiza pruebas con diferentes escenarios (empleados de distintos tipos, entradas inválidas, etc.) para asegurar que el sistema funciona correctamente.  

7. **Extensiones Opcionales**  
   - Agrega la funcionalidad para editar o eliminar empleados.  
   - Implementa persistencia de datos (por ejemplo, guardando la información en un archivo de texto).  

## 5. Desafíos Adicionales  

- **Polimorfismo**  
  Crea un método que reciba un objeto de tipo `Empleado` y lo procese sin conocer su clase exacta, demostrando el uso del polimorfismo.  

- **Herencia y Overriding**  
  Asegúrate de que las subclases sobreescriban adecuadamente el método `calcularSalario()` y aprovechen la herencia para reutilizar código.  

- **Encapsulación y Buenas Prácticas**  
  Utiliza modificadores de acceso adecuados para proteger los atributos, y aplica principios SOLID en el diseño de tu aplicación.  

## Conclusión  

Este taller te permitirá repasar conceptos fundamentales de Java, desde la programación básica y estructuras de control, hasta los conceptos más avanzados de la Programación Orientada a Objetos (POO) como herencia, interfaces y uso de modificadores de acceso.  

Además, trabajarás con constructores, sobrecarga de métodos, constantes y variables estáticas, lo que te ayudará a consolidar tus conocimientos a través de un proyecto práctico y completo.  

¡Manos a la obra y mucha suerte en tu desarrollo! 🚀  

