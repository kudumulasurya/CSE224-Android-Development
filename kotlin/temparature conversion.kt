fun main(){
    var c = 30
    var f = 39
    ctof(c)
    ftoc(f)
}
fun ctof(c:Int){
    var f = (c*9/5)+32
    println("fahrenheit: $f")
}
fun ftoc(f:Int){
    var c = (f-32)*5/9
    println("celsius : $c")
}