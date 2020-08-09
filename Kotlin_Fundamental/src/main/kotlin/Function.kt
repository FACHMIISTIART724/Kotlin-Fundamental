package main.kotlin

fun main (){
    val user = setUser("Fachmi Istiartono", 16)
    println(user)
}
fun setUser (name:String, age: Int) = "Hi! My name is $name, I like playing games and riding motorbikes, and i'm $age years old"