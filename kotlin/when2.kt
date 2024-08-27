fun main(){
    val a:Int=readln().toInt()
    val evenOdd=when{
        a%2==0->"Even"
        a%2!=0->"Odd"
        else->"Unexpected number"
    }
    print(evenOdd)
}