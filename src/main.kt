fun main(){
    var w =Addition(arrayOf("Hellen",5.0,65,true,38,2.7F))
    println(w)

}
fun Addition(mixture: Array<Any>):Double{
    var sum = 0.0
    mixture.forEach { number ->
        if (number is Int || number is Double || number is Float) {
            sum+=number.toString().toDouble()
        }
    }
    return sum
}