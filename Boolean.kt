package main.kotlin

fun main() {
    val hasil = 65
    val nilai: String
    val nilaiE = hasil >= 50
    nilai = if (hasil <= 100 && hasil >= 90) {
        "A"
    } else if (hasil <= 89 && hasil >= 80) {
        "B"
    } else if (hasil <= 79 && hasil >= 70) {
        "C"
    } else if (hasil <= 69 && hasil >= 60) {
        "D"
    } else {
        "E"
    }
    print(nilai)
}