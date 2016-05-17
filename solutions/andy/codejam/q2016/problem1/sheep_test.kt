package codejam.q2016.problem1

import org.junit.Assert.*
import org.junit.Test

/**
 * Unit Tests which ensure that the sample values produce the expected output.
 */
class CountingSheepTest {

    /*
    Case #1: INSOMNIA
    Case #2: 10
    Case #3: 90
    Case #4: 110
    Case #5: 5076
     */

    @Test
    fun firstTest(){
        assertEquals("INSOMNIA",countSheep(0))
    }

    @Test
    fun secondTest(){
        assertEquals("10",countSheep(1))
    }

    @Test
    fun thirdTest(){
        assertEquals("90",countSheep(2))
    }

    @Test
    fun fourthTest(){
        assertEquals("110",countSheep(11))
    }

    @Test
    fun fifthTest(){
        assertEquals("5076",countSheep(1692))
    }
}