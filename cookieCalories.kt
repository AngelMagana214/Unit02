 fun main() {
        print("Enter number of cookies eaten: ")
        var cookieCount = 3
        print( cookieCount )
        val servingSize = 40 / 10
        val caloriesPerCookie = 300 / servingSize
        val totalCalories = cookieCount * caloriesPerCookie
        println(" Your calorie intake was: $totalCalories")
    }
