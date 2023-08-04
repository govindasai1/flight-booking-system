data class Items(var name:String,var price:Int)
var list1= mutableListOf<Items>(Items("laptop", 50000), Items("phone", 25000))
fun main(){
    var amnt=0
   var  lis2=list1.let { list1.map {amnt+=it.price  } }
    println(amnt)
   var result= amnt.let { amnt-((25f/100f)*amnt) }
    println("..>  $result")

}
fun doing() {
    var a = readln().toInt()
    if (a == 1) {
        var b = a + 1
        println(b)
    }
    else{
        println(a)
    }
}