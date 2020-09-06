/**
Multiples of 3 or 5 

Solution I
Loop over numbers until we reach the number 
sum up everything that is not divisible
*/

import java.util.logging.Logger

fun solution(number: Int): Int {
    /**
    * Solution to find the sum of all integers smaller then the input 
    * which are divisible by 3 or 5
    * @param number which defines the upper boundary for the numbers to be evaluated
    * @return the sum which of numbers that are mutiples of 3 and 5 and < number
    */
    val log = Logger.getLogger("solution")
    var sum = 0
    var mod_3: Int
    var mod_5: Int
    for (x in 1 until number){
        mod_3 = x % 3 
        mod_5 = x % 5  
        log.info("$x is a multiple of 3|5 - ${mod_3 == 0} | ${mod_5 == 0}")
        if (mod_3 == 0 || mod_5 == 0){
            sum += x
        }
    }
    log.info("Sum is $sum")
    return sum
}
