package lesson_15

fun main() {
    val truck = Truck()
    val car = PassengerCar()

    truck.cargoes()
    truck.carriageCargo()
    truck.carriagePassengers()
    println()

    car.cargoes()
    car.carriagePassengers()
    car.carriagePassengers()
}

interface CarGoes {
    fun cargoes() {
        println("Машина едет.")
    }
}

interface CarriagePassengers {
    fun carriagePassengers()
}

interface CarriageCargo {
    fun carriageCargo()
}

class Truck() : CarGoes, CarriagePassengers, CarriageCargo {
    override fun carriagePassengers() {
        println("Перевезен 1 пассажир")
    }

    override fun carriageCargo() {
        println("Перевезено 2т груза")
    }
}

class PassengerCar() : CarGoes, CarriagePassengers {
    override fun carriagePassengers() {
        println("Перевезено 3 пассажира")
    }
}
