package codejam.q2016.problem2

/**
 * Created by Andy Bowes on 09/05/2016.
 *
 * Solutions counts the number of changes in symbol in the input pattern and
 * adds an extra '+' suffix to ensure that all pancakes are face up at the end.
 */

fun countFlips(pattern:String):Int {
    val pancakes = pattern + "+"
    return (0..(pancakes.length-2)).filter {pancakes[it] != pancakes[it+1]}.count()
}

