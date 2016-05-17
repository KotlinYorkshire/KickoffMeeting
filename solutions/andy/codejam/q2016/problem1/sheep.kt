package codejam.q2016.problem1

/**
 * Construct a list of digits 0-9 and then remove any that appear in each multiple of the original value.
 */

fun countSheep(initValue:Int) : String {
    if (initValue == 0) return "INSOMNIA"

    val remainingDigits = (0..9).map { it.toString() }.toMutableList()
    for (i in 1..100){
        var currValue = i * initValue
        for (c in currValue.toString().asSequence().map {it.toString()}.filter{remainingDigits.contains(it)}){
            remainingDigits.remove(c)
        }
        if (remainingDigits.isEmpty()){
            return currValue.toString()
        }
    }
    return "INSOMNIA"
}