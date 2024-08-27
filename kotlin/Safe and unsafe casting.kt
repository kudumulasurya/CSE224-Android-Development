fun main(){
    val x:Int=100
    val y:String=x.toString()
    println(y)

    //Safe and Unsafe casting
    val a:String="b"
    //throws an exception
    //val c:Int=a as Int
    //returns null
    val b:String?=a as? String
    if(b!=null){
        println("typecast successful")
    }
    else {
        println("typecast unsuccessful")
    }
}