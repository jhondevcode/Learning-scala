/**
 * Las variables no son más que ubicaciones de memoria reservadas para almacenar valores.
 *
 * Según el tipo de datos de una variable, el compilador asigna memoria y decide qué se
 * puede almacenar en la memoria reservada. Por lo tanto, al asignar diferentes tipos de
 * datos a las variables, puede almacenar números enteros, decimales o caracteres en estas
 * variables.
 *
 * Para declarar una varible en escala solamente basta con escribir la palabra 'var' seguido
 * del nombre de la variable como tambien especificar el tipo de dato y por ultimo el valor.
 * Ejemplo:
 *        => var name: String = "scala lang"
 *        => var age: Int = 18
 *
 * Las variables pueden cambiar sus valores en tiempo de ejecucuion.
 *
 * @author jhondev-code
 **/

object Variables {
    def main(args: Array[String]): Unit = {
        // variable Strign la cual contiene una secuencia de caracteres
        var name: String = "scala lang"
        // varible Int la cual contiene un numero entero
        var age: Int = 18
        println(f"valor de la variable name => $name")
        println(f"valor de la variable age => $age")
        name = "Java lang"
        age = 25
        println(f"valor de la variable name => $name")
        println(f"valor de la variable age => $age")

        // Asignaciones multiples
        var (pc: String, year: Int) = ("Saurius", 2017)
        println(f"Pc name: $pc")
        println(f"Pc year: $year")
        // Inferencia de tipos
        var (book, author, publication) = ("Scala for java developers", "Toby weston", 2018)
        println(f"book: $book, author: $author, publication year: $publication")
    }
}
