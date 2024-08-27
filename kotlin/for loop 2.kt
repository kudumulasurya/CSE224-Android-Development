fun main(){
    val words = arrayOf("A","B",100,"C","D","E")
    for (i in words){
        println(i)
    }
    //print index and values of an array
    val arr1= arrayOf("Hi","Hello",123)


    //Method 1
    for ((i,v) in arr1.withIndex()){
        println("Element at index $i is $v")
    }
    print("\n\n")


    //Method 2
    for(i in arr1.indices){
        println("Element at index $i is ${arr1[i]}")
    }
    print("\n\n")


    //Method 3
    for(i in 0 until arr1.size){
        println("Element at index $i is ${arr1[i]}")
    }
    print("\n\n")


}