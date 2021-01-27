/**
 * <----- Tipo de datos Flotantes (decimales) ----->
 *
 * Los tipos de datos flotates son numeros decimales, dichos numeros contienes mas digitos
 * despues de su correspondiente simbolo separador.
 * Por ejemplo: 3.14159
 *      el numero 14159 se encuentra despues del punto '.'
 * @author jhondev-code
 */
object Floatings {
    /**
     * Funcion principal
     */
    def main(args: Array[String]): Unit = {
        // valor de 'pi'
        val pi: Float = 3.14159F
        // valor de 'epsilon'
        val e: Float = 2.7128F
        println(f"pi constant value => $pi")
        println(f"e constant value => $e")
    }
}
