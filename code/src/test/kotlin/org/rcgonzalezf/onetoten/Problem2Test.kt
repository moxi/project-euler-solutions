package org.rcgonzalezf.onetoten

import org.junit.Before
import org.junit.Test
import java.math.BigInteger

import org.junit.Assert.*

class Problem2Test {

    private var solution: BigInteger = BigInteger.ZERO
    private var problem2: Problem2? = null
    private var maxValue: Int = 4000000
    private var fibonacci: Int = 0


    @Before
    @Throws(Exception::class)
    fun initProblem() {
        problem2 = Problem2()
    }

    @Test
    @Throws(Exception::class)
    fun solutionShouldReturn16ForMaxValue10AndFibonacci10() {
        givenFibonacciOf(10)
        givenMaxValue(10)

        whenCalculatingTheSolution()

        thenTheSolutionShouldBe(10)
    }

    @Test
    @Throws(Exception::class)
    fun solutionShouldReturn44WithDefaultMaxValueAndFibonacci10() {
        givenFibonacciOf(10)

        whenCalculatingTheSolution()

        thenTheSolutionShouldBe(44)
    }

    @Test
    @Throws(Exception::class)
    fun solutionShouldReturn188WithMaxValue1000AndFibonacci100() {
        givenFibonacciOf(12)
        givenMaxValue(1000)

        whenCalculatingTheSolution()

        thenTheSolutionShouldBe(188)
    }

    @Test
    @Throws(Exception::class)
    fun solutionShouldReturn4613732WithDefaultMaxValueAndFibonacci32() {
        givenFibonacciOf(32)

        whenCalculatingTheSolution()

        thenTheSolutionShouldBe(4613732)
    }

    private fun givenFibonacciOf(n: Int) {
        this.fibonacci = n
    }

    private fun givenMaxValue(mV: Int) {
        this.maxValue = mV
    }

    private fun whenCalculatingTheSolution() {
        solution = problem2!!.solve(fibonacci, maxValue)
    }

    private fun thenTheSolutionShouldBe(expected: Long) {
        assertEquals(expected, solution.longValueExact())
    }
}