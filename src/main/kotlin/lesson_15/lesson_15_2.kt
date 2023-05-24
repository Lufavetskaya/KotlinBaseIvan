package lesson_15

fun main() {

    val dataTemperature = DataTemperature("Server")
    dataTemperature.sendData()

    val dataRain = DataRain("Server")
    dataRain.sendData()

}

abstract class UnderlyingMessage(
    val nameServer: String
) {
    fun connectToServer(nameServer: String) {
        println("Подключились к серверу $nameServer.")
    }

    open fun sendData() {
        println("Отправили данные на сервер $nameServer.")
    }

}

class DataTemperature(nameServer: String) : UnderlyingMessage(nameServer) {
    override fun sendData() {
        super.connectToServer(nameServer)
        println("Отправили данные о температуре на сервер $nameServer.")
    }

}

class DataRain(nameServer: String) : UnderlyingMessage(nameServer) {
    override fun sendData() {
        super.connectToServer(nameServer)
        println("Отправили данные о дожде на сервер $nameServer.")
    }
}