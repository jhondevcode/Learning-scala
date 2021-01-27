/**
 * <----- Tipo de datos String (cadena de caracteres) ----->
 * Los strings son secuanecias de caracteres, para poder declararlo lo unico que se necesota es
 * colocar la secuencia de caracteres entre comillas dobles "cadena"
 *
 * var cadena: String = "Esta es una cadena en scala"
 * var cadena = "Esta es otra cadena en scala"
 *
 * @author jhondev-code
 */
object Strings {
    def main(args: Array[String]): Unit = {
        val nombre: String = "jhondev-code"
        val mensaje: String = "Hola"
        println(f"$mensaje $nombre")
    }
}
