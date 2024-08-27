fun main(){
    print()
    sum()
    subtract()
}
fun print(){
    println("my name is surya")
}
fun sum(a:Int=10,b:Int=20){
    var c = a+b
    println("sum of $a and $b is $c")
}
fun subtract(a:Int=20,b:Int=10){
    var c  = a-b
    println("difference of $a and $b is $c")
}
