package main.kotlin.Clases.Herencia

class Gato(nombre: String, edad: Int, val tipo: String) : Animal(nombre, edad) {

    constructor(nombre: String, edad: Int) : this(nombre, edad, "")

    override fun hacerSonido() {
        println("El gato $nombre ($tipo) MIAU MIAU")
    }
}