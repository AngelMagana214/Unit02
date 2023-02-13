import kotlin.math.*

fun main() {
    val principalAmount = 20000
    println("Principal amount is: $principalAmount")

    val interestRate = 4
    println("Interest rate is: $interestRate %")

    val timePeriod = 12
    println("Time interest is compounded: $timePeriod months")

    val compoundInterest = principalAmount.toDouble() * Math.pow((1 + interestRate.toDouble()/100.00),timePeriod.toDouble())- principalAmount
    println(" Compound Interest is: $compoundInterest")
}
