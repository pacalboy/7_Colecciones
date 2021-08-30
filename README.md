# 7_Colecciones
Uso de listas, de iteradores, de árboles y de mapas.

## ArrayList
**Ejercicios 1:**  
-Crea un ArrayList con 4 nombres de personas. Muestra su tamaño. Muestra el índice de alguno de tus nombres  
-Crea un ArrayList con 4 enteros. Obtén el elemento en la tercera posición  
-Crea un ArrayList con 4 caracteres. Muestra su tamaño. Añade otro carácter. Muestra su tamaño.  
-Crea un ArrayList con 4 Personas. Las personas son unas entidades que tienen nombre y edad, métodos para consultar y establecer estos atributos y un método toString.  
-Obtén el primer elemento de la lista y muéstralo  
-Crea otro ArrayList personas2. Asígnale la lista anterior.  
-Crea un tercer ArrayList personas3. Clona el primer ArrayList de personas en este con el método clone.  
-Crea un ArrayList de nombres de empresas de la localidad. Añade al menos 5. Comprueba si el elemento "ITP" está en la lista con el método constains, si no está añádelo. A continuación vuelve a añadir el elemento "ITP". Ahora "ITP" debe estar dos veces en la lista.  
-Obtén el índice del primer elemento "ITP". Obtén el índice del último elemento "ITP" con el método lastIndexOf, guarda ese valor.  
-Utiliza el valor guardado para eliminar el elemento "ITP" repetido.  
-Borra el otro elemento "ITP" sin usar su índice  
-Crea un nuevo ArrayList de enteros. Asigna un elemento. Comprueba si el ArrayList está vacío, en caso contrario vacíalo. Vuelve a comprobar si está vacío.  
-Crea un ArrayList con capacidad inicial para 50 Personas. Añade sólo dos elementos. Compueba su tamaño.  
  
**Ejercicios 2 (estructuras FOR para rellenar ArrayList):**  
-Crea un ArrayList de enteros de capacidad 10 y añade 10 elementos con el valor 5.  
-Crea un ArrayList de enteros de capacidad 5 y añade 5 números aleatorios.  
-Crea un String con un mensaje. Guarda cada caracter del mensaje en un elemento de un nuevo ArrayList con la capacidad inicial del tamaño del mensaje.  
-Guarda este ArrayList con el mensaje en un Array estático [ ] de tipo char  
-Crea un ArrayList de enteros de capacidad 10 y añade 10 elementos desde el 0 al 9.  
-Crea un ArrayList de booleanos de capacidad 20 y añade 15 elementos alternando entre 0 y 1.  
-Añade 50 elementos al ArrayList que declaraste con capacidad 50 utilizando una estructura for. Para generar los elementos lo haremos de forma aleatoria con la buena librería Faker que podéis encontrar aquí: [https://github.com/DiUS/java-faker](https://github.com/DiUS/java-faker)

**Ejercicios 3:**  
-Crea un ArrayList de cadenas de caracteres. Rellena la lista con cadenas como la siguiente: "Elemento 0", "Elemento 1", "Elemento 2"..... y así hasta el elemento 10.  
-Inserta la cadena "Elemento 4" en la posición 3.  
-Muestra todos los elementos de la lista. "Elemento 4" debe aparecer repetido.  
-Inserta "Elemento 4" al final de la lista.  

-Ejercicio: crea un método eliminaRepetidos que reciba una lista como parámetro y también un String que representará el contenido a borrar. Utilizando una estructura for, compruebe todos los elementos del ArrayList y borre aquellos que sean iguales al pasado como parámetro.  
  
-Crea una lista de 15 números enteros aleatorios. Muestra la lista  
-Ordena la lista anterior utilizando el método **sort** que se encuentra en Collections (revisa documentación oficial para ver su uso). Muestra la lista de nuevo.  
  
-Crea una lista de números enteros. Añade 10 elementos por teclado con una estructura for. Muestra el contenido de la lista.  
-Crea un método que elimine los números 0 del arrayList. 
  
-Crea una lista de personas. Añade 4 personas.  
-Ejercicio: crea un método llamado PersonasMayusculas que reciba un arrayList de tipo Persona y recorra todos los elementos modificando el nombre de cada Persona pasándolo a mayúsculas.


## Iterator
Crea una clase denominada Empresa que disponga de los siguientes atributos: String nombre, Empleado director, Calendar fechaCreacion, ArrayList listaEmpleados que contenga objetos de tipo Empleado. La clase debe tener un método que permita añadir objetos de tipo Empleado a la lista. Un objeto de tipo Empleado tendrá como atributos nombre (String) y departamento(int), ambos requisito para poder construir el objeto, y otros atributos opcionales como salario, número de seguridad social, dni y titulación. Existen todos los métodos para obtener y establecer los atributos todos los atributos. Crea una clase Test con el método main que inicialice un objeto Empresa y añade manualmente dos objetos de tipo Empleado a la la lista de empleados. Usando iterator muestra los nombres de cada empleado y su departamento. Se debe pedir al usuario un nombre y departamento para añadir un nuevo empleado, y una vez introducidos los datos mostrar la lista actualizada usando iterator. Una vez mostrada la lista actualizada, se debe dar opción a elegir entre volver a introducir los datos de otro empleado o salir del programa (se podrán introducir tantos datos de empleados como se desee. Para ello usa un bucle while que dé opción a elegir al usuario).

~~~
Ver la corrección. 
¡Ojo con devolver listas si no queremos que sean modificables!.
~~~


## TreeSet

**Estudiantes**  
Crear Estudiantes, con atributos nombre y edad, que sean comparables por su edad, de forma que podamos crear un TreeSet de Estudiantes y queden ordenados en la colección por su edad.  
  
**Guardería**  
Utilizando la clase de niños y niñas de la guardería, hacer que sean comparables por su fecha de nacimiento, modificar la clase. El toString debe mostrar la fecha de nacimiento y su nombre. Los más jóvenes serán los primeros. (La clase Calendar incorpora un método para comparar fechas). El requisito para distinguirlos es únicamente su nombre, es decir, no existen dos niños que se llamen igual en la guardería. Crear una clase de prueba donde construyas un treeSet de 10 niños y niñas. Intenta insertar otro niño con el mismo nombre. Muestra la lista, se deben visualizar ordenada por fecha de nacimiento más próxima a menos.  
Muestra el alumno más viejo. Muestra el más joven.

## ArrayList_Iterator

Tenemos una aplicación móvil que almacena la información de los niños de una guardería.  
La guardería tiene una lista de bebés neonatos, una lista de niños y niñas y otra lista de cuidadores.  
De todos los niños y niñas inscritos en la guardería es necesario almacenar su nombre, fecha de nacimiento, alergias y dos teléfonos de contacto. La información necesaria es el nombre y el primer teléfono de contacto.  
De los bebés neonatos, además de toda la información anterior, es necesario almacenar la información relativa a alergias y nombre del hospital al que acudir en caso de urgencia. Para los bebés neonatos también es necesario registrar el hospital.  
Los cuidadores tienen los mismos atributos que los empleados del ejercicio anterior (Empresa) quitando el departamento.  
  
La guardería tiene los métodos matricular un nuevo alumno y contratar a un cuidador. Estos métodos introducirán al bebé en la lista de bebés o al cuidador en la lista de cuidadores.  
  
Se requieren los métodos desmatricular alumno donde se proporciona su nombre. La funcionalidad de este método es buscar aquel elemento de la lista de bebés cuyo nombre coincida con el proporcionado y borrarlo.  
Se requiere un método que proporcione un String con la información del nombre de los bebés y sus teléfonos de contacto.  

Se requeire un método que proporcione un String con los nombres de los cuidadores y su salario.  
Se requiere un método que para dado un nombre de bebé, lo busque en el array de bebés, compruebe si es neonato y devuelva sus alergias.  
  
Se requiere un método que muestre toda la información de la guardería (la información de los métodos getInfoAlumnos y getInfoCuidadores

~~~
Pregunta: Me he hecho un lío con este ejercicio.
Respuesta: Neonatos son una especialización de niños
~~~

## Map

Vamos a organizar los libros de una biblioteca.  
Crea la clase **main** Biblioteca, tendrá un nombre, ubicación y superficie en m2. Getters de todos los atributos. Sólo superficie se puede modificar y los otros dos son obligatorios y constantes. También tiene una colección de libros.  
Un libro es un objeto que contiene título, autor principal, año de compra y precio, sólo título y autor son necesarios.  
El método main de la clase Biblioteca interactúa con el usuario por consola. Se muestra un menú de 5 opciones: 1-Mostrar nombre / 2-Mostrar ubicación / 3-Mostrar superficie / 4-Mostrar libros / 5-Añadir libro  
Cada opción estará asociada a la ejecución de un determinado método.  
La opción 5 permite añadir libros a la colección. Cuando la biblioteca adquiere un libro, se añade su información por consola. Para este libro, la aplicación genera un código automático que consiste en las 3 primeras letras correspondientes al autor y 3 letras correspondientes al título. Este método debe comprobar si la clave ya está registrada y en caso afirmativo el bibliotecario puede introducir otra clave de forma manual. Se debe comprobar si dicha clave (manual) ya está registrada antes de incluir el libro en el sistema. El método addBook de la clase Biblioteca deberá devolver un booleano que indique si el libro se ha introducido con éxito o no, en caso de devolver un false sería cuando el bibliotecario introduciría un nuevo código de forma manual.  
  
Añade 5 libros a la colección. Muestra todos los libros.  
  
Cambia la implementación, de TreeMap a HashMap. ¿Cuál es la diferencia? Adjunta captura de los resultados de ejecución por consola.
  
Extra: opción 6: añade 100 libros con Faker, el bibliotecario sólo interacciona cuando surjan claves duplicadas.