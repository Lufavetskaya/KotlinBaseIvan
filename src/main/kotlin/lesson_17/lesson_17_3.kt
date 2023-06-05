package lesson_17

fun main(){
    val firstPackage = Package("Папка 1 ", 100, true)
    println("Имя папки: ${firstPackage.namePackage}\nКоличетсво файлов: ${firstPackage.qtFile}")

}

class Package(
    private val initNamePackage: String,
    private val initQtFile: Int,
    val defaultSecretFlag: Boolean = false,
){
    var namePackage: String = initNamePackage
        get() = if (defaultSecretFlag) "скрытая папка" else field

    var qtFile: Int = initQtFile
        get() = if (defaultSecretFlag) 0 else field
}