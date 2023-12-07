package main.kotlin.Clases.Herencia

class Perro(nombre: String, edad: Int, val raza: String) : Animal(nombre, edad) {

    constructor(nombre: String, edad: Int) : this(nombre, edad, "")

    override fun hacerSonido() {
        println("El perro $nombre (${raza}) GUAU GUAU")
    }
}
