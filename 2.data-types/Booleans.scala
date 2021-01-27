/**
 * Declaracion de variables:
 *
 * var nombre: Tipo = valor
 * var edad: Int = 22
 *
 * <----- Tipos de datos booleanos ----->
 * Existen solamente 2 tipos de datos booleanos los cuales son 'true' y 'false'
 *     -> true = 1
 *     -> false = 0
 * @author: jhondev-code
 */

object Booleans {
    /**
     * funcion principal que retorna un vacio.
     * @param args: argumentos pasados por consola
     *              Array[String]: indica una lista con valores de tipo String
     **/
    def main(args: Array[String]): Unit = {
        val trueVar : Boolean = true;       // verdadero 'true' = 1
        val falseVar: Boolean = false;      // falso 'false' = 0
        println(f"True: $trueVar")
        println(f"False: $falseVar")
        println(f"!trueVar => ${!trueVar}")
        println(f"!falseVar => ${!falseVar}")
        println(f"$trueVar && $falseVar => ${trueVar && falseVar}")
        println(f"$trueVar || $falseVar => ${trueVar || falseVar}")
        println(f"$trueVar && $trueVar => ${trueVar && trueVar}")
        println(f"$trueVar || $trueVar => ${trueVar || trueVar}")
        println(f"$falseVar && $falseVar => ${falseVar && falseVar}")
        println(f"$trueVar && $falseVar || $trueVar => ${trueVar && falseVar || trueVar}")
    }
}
