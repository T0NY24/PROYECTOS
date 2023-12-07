
import main.kotlin.Clases.Herencia.Animal
import main.kotlin.Clases.Herencia.Perro
import main.kotlin.Clases.Persona
import main.kotlin.Clases.Vehiculo.Coche
import main.kotlin.Clases.Vehiculo.Bicicleta
import main.kotlin.Clases.Forma.Cuadrado
import main.kotlin.Clases.Forma.Circulo

fun vehiculo() {

    val coche = Coche()
    val bicicleta = Bicicleta()
    coche.acelerar()
    bicicleta.acelerar()


}

fun forma(){
    val circulo = Circulo(80.0)
    val cuadrado = Cuadrado(58.0)
    circulo.dibujar()
    println("Área del círculo: ${circulo.area}")
    cuadrado.dibujar()
    println("Área del cuadrado: ${cuadrado.area}")

}

fun persona(){
    val persona1 = Persona("Eduarda", 30, "Docente")
    val persona2 = Persona("Juniar", 25, "Vagabundo")
    val persona3 = Persona("sebas", 40, "camionero")

    println(persona1.descripcion())
    println(persona2.descripcion())
    println(persona3.descripcion())
}
fun herencia() {
    val listaAnimales = listOf(
        Animal("Animal domestico", 3),
        Perro("Daddy", 2, "Babuino"),
        Perro("Kevin", 3)
    )
    for (animal in listaAnimales) {
        animal.hacerSonido()
    }
}

fun main( ) {
    persona()
    herencia()
    vehiculo()
    forma()
}
