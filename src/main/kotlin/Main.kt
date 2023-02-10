import javax.swing.text.Style

fun main() {
    greeting("Linah")
    division(765, 225)
    addition(44,56,67,89)
    factAboutMySelf("is that i like to be unique in myself")
}


 fun greeting(name1: String){
     println("Hello $name1")


 }
  fun division(num1:Int, num2: Int): Int{
      var division = num1 % num2
      return division


  }

fun addition(num1: Int, num2: Int, num3: Int, num4: Int): Int {
    var addition =num1+num2+num3+num4
    return addition
}
fun factAboutMySelf(fact: String){
    println("Intresting thing about myself $fact")
}





















