package lesson_19

fun main() {
    val firstFilingSystem = FilingSystem()

    var name: String
    var gender: String?

    println("Введите имя и пол на отдельных строках, разделяя имя и гендер нажатием enter")
    println("Возможные гендеры: ${Gender.values().joinToString()}")

    repeat(5) {
        println("Введите имя:")
        name = readln()

        println("Введите пол (FEMALE или MALE):")
        gender = readln()
        val genderEnum: Gender =
            Gender.values().find { it.name == gender } ?: Gender.UNKNOWN

        val person = Person(name, genderEnum)
        firstFilingSystem.addPerson(person)
    }

    firstFilingSystem.print()
}

enum class Gender {
    FEMALE,
    MALE,
    UNKNOWN,
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

