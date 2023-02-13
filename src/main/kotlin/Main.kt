import java.util.*

fun main() {
    println("Bitte gib das erste Wort ein")
    val wort1 = readln()
    println("Bitte gib das zweite Wort ein und drücke anschließend Enter um das Ergebnis anzuzeigen!")
    val wort2 = readln()
    println(anagrammPruefer(wort1, wort2))
    if (anagrammPruefer(wort1,wort2) == false) {
        println("Das eingegebene Wort ist kein Anagramm")
    }
    if(anagrammPruefer(wort1, wort2) == true) {
        println("Das eingegebene Wort ist ein Anagramm")
    }
}

fun anagrammPruefer(first: String, second: String): Boolean {
    if (first.length != second.length) return false
    val firstChars = first.lowercase(Locale.getDefault()).toCharArray().sorted().toTypedArray()
    val secondChars = second.lowercase(Locale.getDefault()).toCharArray().sorted().toTypedArray()
    return Arrays.equals(firstChars, secondChars)
}









/*import java.util.*

fun main() {
    val wort1 = "Haus" // <-- Hier erstes Wort eingeben, dass du prüfen möchtest
    val wort2 = "SuaH" // <-- Hier zweites Wort eingeben, dass du prüfen möchtest
    println(anagrammPruefer(wort1, wort2))
    if (anagrammPruefer(wort1,wort2) == false) {
        println("Ist kein Anagramm")
    }
    if(anagrammPruefer(wort1, wort2) == true) {
        println("Ist ein Anagramm")
    }
}

fun anagrammPruefer(first: String, second: String): Boolean {
    if (first.length != second.length) return false
    val firstChars = first.lowercase(Locale.getDefault()).toCharArray().sorted().toTypedArray()
    val secondChars = second.lowercase(Locale.getDefault()).toCharArray().sorted().toTypedArray()
    return Arrays.equals(firstChars, secondChars)
}*/
