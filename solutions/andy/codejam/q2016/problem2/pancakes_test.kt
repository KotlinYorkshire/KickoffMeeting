package codejam.q2016.problem2

import org.junit.Assert.*
import org.junit.Test

/**
 * Unit Tests for Pancake Flipping Algorithm
 */
class pancakes_test {

    @Test
    fun firstTest(){
        assertEquals(1, countFlips("-"))
    }

    @Test
    fun secondTest(){
        assertEquals(1, countFlips("-+"))
    }

    @Test
    fun thirdTest(){
        assertEquals(2, countFlips("+-"))
    }

    @Test
    fun fourthTest(){
        assertEquals(0, countFlips("+++"))
    }

    @Test
    fun fifthTest(){
        assertEquals(3, countFlips("--+-"))
    }

}