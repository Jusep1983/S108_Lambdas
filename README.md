# S108_Lambdas
## 📄 Descripción 
Este repositorio contiene los 3 niveles del sprint 1 Tasca S1.08. Lambdas, en los cuales se exploran y aplican 
los conceptos clave de la programación funcional en Java 8, centrándose en el uso de expresiones lambda y la API de Streams. 
Se trabajan operaciones de filtrado, ordenación, modificación y conversión de datos dentro de colecciones. 
Además, se introducen interfaces funcionales personalizadas para modelar comportamientos específicos. 
Por último, estos conocimientos se aplican sobre estructuras de objetos complejos, como listas de objetos, 
fomentando el uso de técnicas declarativas y funcionales.

🔽 Enunciados:

(Clica en los deplegables para verlos)

Para todos los ejercicios debe utilizarse la API de Java Lambdas and Streams de Java 8+.
   <details>
    <summary>
      Nivel 1
    </summary>

    - Ejercicio 1
    A partir de una lista de Strings, escribe un método que devuelve una lista de todas 
    las cadenas que contienen la letra "o". Imprime el resultado.
    
    - Ejercicio 2
    Tienes que hacer lo mismo que en el punto anterior, pero ahora, el método debe devolver 
    una lista con los Strings que además de contener la letra "o" también tienen más de 5 letras. 
    Imprime el resultado.
    
    - Ejercicio 3
    Crea una lista con los nombres de los meses del año. Imprime todos los elementos de la lista con una lambda.
    
    - Ejercicio 4
    Realizar la misma impresión del punto anterior, pero mediante method reference.
    
    - Ejercicio 5
    Crea una Functional Interface con un método llamado getPiValue() que debe devolver un double. 
    Desde el main() de la clase principal, instancia la interfaz y asíñale el valor 3.1415. 
    Invoca el método getPiValue() e imprime el resultado.
    
    - Ejercicio 6
    Crea una lista con números y cadenas de texto y ordena la lista con las cadenas de más corta a más larga.
    
    - Ejercicio 7
    Con la lista del ejercicio anterior, ahora ordénala al revés, de cadena más larga a más corta.
    
    - Ejercicio 8
    Crea una Functional Interface que contenga un método llamado reverse(). Este método debe recibir y debe 
    devolver un String. En el main() de la clase principal, inyecta a la interfaz creada mediante una lambda, 
    el cuerpo del método, de modo que devuelva la misma cadena que recibe como parámetro pero al revés. 
    Invoca la instancia de la interfaz pasándole una cadena y comprueba si el resultado es correcto.
      
   </details>
   <details>
   <summary>
   Nivel 2
   </summary>
  
    - Ejercicio 1
    Crea una lista de cadenas con nombres propios. Escribe un método que devuelve una lista de todas las 
    cadenas que comienzan con la letra "A" (mayúscula) y tienen exactamente 3 letras. Imprime el resultado.
    
    - Ejercicio 2
    Programa un método que devuelve una cadena separada por comas, basada en una lista de Integers. 
    Cada elemento debe ir precedido por letra "e" si el número es par, o por la letra "o" si el número es impar. 
    Por ejemplo, si la lista de entrada es (3, 55, 44), la salida debe ser "o3, o55, e44". Imprime el resultado.
    
    - Ejercicio 3
    Crea una Functional Interface que contenga un método llamado operacion(). Este método debe devolver un float. 
    Inyecta a la interfaz creada mediante una lambda, el cuerpo del método, de modo que se pueda transformar la 
    operación con una suma, una resta, una multiplicación y una división.
    
    - Ejercicio 4
    Crea una lista que contenga algunas cadenas de texto y números.
    
    Ordénalas por:
    Alfabéticamente por su primer carácter. (Nota: charAt(0) devuelve el código numérico del primer carácter)
    Las cadenas que contienen una "e" primero, el resto de cadenas después. Pone el código directamente en la lambda.
    Modifica todos los elementos de la lista que tienen una a. Modifica la "a" por un "4".
    Muestra sólo los elementos que son numéricos. (Aunque estén guardados como Strings).

   </details>
   <details>
   <summary>
     Nivel 3
   </summary>

    - Ejercicio 1
    Crea una clase Alumno con sus atributos: Nombre, edad, curso y nota.
    
    Llena una lista con 10 alumnos
    
    Muestra por pantalla el nombre y la edad de cada alumno/a.
    Filtra la lista por todos los alumnos cuyo nombre comienza por "a".
    Asigna a estos alumnos a otra lista y muestra por pantalla la nueva lista (todo con lambdas).
    Filtra y muestra por pantalla a los alumnos que tienen una nota de 5 o superior.
    Filtra y muestra por pantalla a los alumnos que tienen una nota de 5 o más, y que no son de PHP.
    Muestra a todos los alumnos que hacen JAVA y son mayores de edad.

   </details>
</details>

## 💻 Tecnologías Utilizadas 
El proyecto ha sido desarrollado utilizando: 
  - Java 23.0.2
  - IntelliJ IDEA como entorno de desarrollo
  - Git y GitHub para control de versiones.

## 📋 Requisitos 
Para ejecutar el proyecto es necesario contar con: 
  - JDK 23 instalado en el sistema
  - Git instalado y configurado
  - IntelliJ IDEA
  - Conexión a internet para clonar el repositorio.

## 🛠️ Instalación 
1. Clonar el repositorio

  - Opción 1: Desde GitHub (sin terminal):

    1. Ir al repositorio en GitHub:
       
            https://github.com/Jusep1983/S108_Lambdas.git
    2. Hacer clic en el botón verde "Code" (Código).
    3. Seleccionar la opción "Download ZIP".
    4. Extraer el archivo ZIP en la ubicación de preferencia.

  - Opción 2: Desde IntelliJ IDEA:
    1. Abrir IntelliJ IDEA.
    2. En la pantalla de inicio, seleccionar "Get from VCS" (Obtener desde el control de versiones).
    3. En la pestaña "Version Control", seleccionar Git.
    4. En el campo "URL", pegar el enlace del repositorio:
       
            https://github.com/Jusep1983/S108_Lambdas.git
    5. Elegir la carpeta donde se guardará el proyecto y hacer clic en "Clone".
    6. IntelliJ IDEA detectará el proyecto y pedirá importarlo como un proyecto de Java.

  - Opción 3: Desde la terminal (con Git instalado):
    1. Abre la terminal o línea de comandos.
    2. Dirígete a la carpeta donde deseas clonar el repositorio:

            cd /ruta/donde/quieres/clonar
    3. Ejecuta el siguiente comando para clonar el repositorio:

            git clone https://github.com/Jusep1983/S108_Lambdas.git
    4. Después de que se complete el proceso de clonación, ve a la carpeta del proyecto:

            cd S108_Lambdas

2. Configurar el entorno:
    1. Abrir IntelliJ IDEA si no está abierto.
    2. Ir a File → Project Structure → Project.
    3. Asegurarse de que está seleccionado JDK 23.

## ▶️ Ejecución 
1. Abrir la clase que contiene el método main(). 
2. Hacer clic en el botón Run o presionar Shift + F10. 
3. Si es necesario, IntelliJ IDEA pedirá sincronizar dependencias, acepta la opción.

## 🌐 Despliegue 
El proyecto está diseñado para ejecutarse en un entorno local, por lo que no se ha definido un proceso de despliegue en producción.

## 🤝 Contribuciones 
Si deseas contribuir al proyecto, puedes: 
- Hacer un fork del repositorio. 
- Crear una nueva rama para tus cambios. 
- Enviar un pull request con una descripción detallada de tus modificaciones.


¡Gracias por tu interés en este proyecto! 🚀
