/**
 * <----- Tipos de datos booleanos ----->
 *
 * Estos tipos de datos se usan para almacenar caracteres.
 * El rango de valores permitidos es:
 *     Minimo -> U+0000
 *     Maximo -> U+ffff
 */

/**
 * Objeto principal, contiene al la funcion principal
 *
 * @author: jhondev-code
 */
object Characters {
    /** funcion principal, contiene todo el codigo a ejecutar **/
    /**
     * @param args: es una lista de argumentos los cuales se pasan por la terminal
     */
    def main(args: Array[String]): Unit = {
        val char01: Char = 'a'
        val min: Char = '\u0000'
        val max: Char = '\uffff'
        println(f"char01 => {$char01}")
        println(f"Min char value => {$min}")
        println(f"Max char value => {$max}")
    }
}
