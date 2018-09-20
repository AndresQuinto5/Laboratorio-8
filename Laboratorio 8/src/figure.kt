//Creamos la clase figura
class figure(
        var name: String = "",
        var width: Int = 0,
        var height: Int = 0


){
override fun toString(): String {
    return """
            Figura:
                Name: $name
        """.trimIndent()
}
}