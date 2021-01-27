/**
 * <----- Tipo de datos Enteros ----->
 *
 * Los tipos de datos flotantes son numeros enteros los cuales no poseen parte decimal.
 *
 * @author jhondev-code
 */
object Integers {
    /**
     * Funcion principal
     */
    def main(args: Array[String]): Unit = {
        // tipo de dato entero 'Byte'
        //     tamaño en ram: 8 bits (1 byte)
        //     valor minimo: -128
        //     valor maximo: 127
        val byteConst: Byte = 125
        println(f"$byteConst")

        // tipo de dato entero 'Short'
        //     tamaño en ram: 16 bits (2 bytes)
        //     valor minimo: -32768
        //     valor maximo: 32767
        val shortConst: Short = 32765
        println(f"$shortConst")

        // tipo de dato entero 'Int'
        //     tamaño en ram: 32 bits (4 bytes)
        //     valor minimo: -2147483648
        //     valor maximo: 2147483647
        val intConst: Int = 2147483645
        println(f"$intConst")

        // tipo de dato entero 'Long'
        //     tamaño en ram: 64 bits (8 bytes)
        //     valor minimo: -9223372036854775808
        //     valor maximo: 9223372036854775807
        val longConst: Long = 9223372036854775807L
        println(f"$longConst")
    }
}
