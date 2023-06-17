package lesson_19

fun main() {
    val firstFilingSystem = FilingSystem()

    var name: String
    var gender: String?

    println("Введите имя и пол на отдельных строках, разделяя имя и гендер нжатием enter")
    println("Возможные гендеры: ${Gender.values().joinToString()}")

    repeat(5) {
        println("Введите имя:")
        name = readln()

        do {
            println("Введите пол (FEMALE или MALE):")
            gender = readln()

            val genderEnum: Gender? = try {
                Gender.valueOf(gender!!)
            } catch (e: IllegalArgumentException) {
                println("Неверное значение пола.")
                null
            }
        } while (genderEnum == null)


        val person = Person(name, Gender.valueOf(gender!!))
        firstFilingSystem.addPerson(person)
    }

    firstFilingSystem.print()

}

enum class Gender {
    FEMALE,
    MALE,
}

class Person(
    val name: String,
    val gender: Gender,
) {
    override fun toString(): String {
        return "Name: $name, Gender: $gender"
    }
}

class FilingSystem {
    val filingSystem = mutableListOf<Person>()

    fun addPerson(person: Person) {
        filingSystem.add(person)
    }

    fun print() {
        filingSystem.forEach { println(it) }
    }
}

