
/* create a program that simulates a discount system for a store based on total amount and membership status
Define two variables:
A variable totalAmount that stores the total amount of the purchase
A variable indicating whether the customer is a member or not
Logic:
If the total amount is greater than 1000 and the customer is a member, apply a 20% discount
If the total amount is greater than 1000 and the customer is not a member, apply a 10% discount
If the total amount is less than 1000 print no discount

 */
fun main(){
    var totalAmount:Int=1100
    var isMember=true
    if(totalAmount>1000 && isMember){
        totalAmount=totalAmount-(totalAmount*0.2).toInt()
    }
    else if(totalAmount>1000 && !isMember){
        totalAmount=totalAmount-(totalAmount*0.1).toInt()
    }
    else if(totalAmount<1000 && isMember){
        totalAmount=totalAmount-(totalAmount*0.1).toInt()
    }
    else if(totalAmount<1000 && !isMember){
        totalAmount=totalAmount-(totalAmount*0.05).toInt()
    }
    println(totalAmount)
}