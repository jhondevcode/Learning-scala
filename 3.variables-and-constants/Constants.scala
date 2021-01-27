/**
 * Las constantes al igual que las varibles son espcios en memoria, la diferencia entre
 * ambos es que las variables son mutables mientras que las constantes son inmutables
 * es decir que no pueden cambiar su valor en tiempo de ejecucuion.
 *
 * Para poder declarar una constante en Scala solamente tenemos que escribir la palabra
 * 'val' seguido del nombre de la constante, el tipo de dato y por ultimo el valor de la variable.
 * Ejemplo:
 *        -> val pi: Float = 3.1415F
 *
 * @author jhondev-code
 */

object Constants {
    def main(args: Array[String]): Unit = {
        // el valor de la variable 'pi' no puede cambiar, si se intenta cambiar dicho valor
        // el compilador de escala retornara un error al momento de realizar la compilacion.
        val pi: Float = 3.1415F;
        println(f"El valor de la constante 'pi' es: $pi")
    }
}
