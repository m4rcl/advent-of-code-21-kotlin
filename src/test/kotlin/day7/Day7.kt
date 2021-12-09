package day7

import org.junit.Test

class Day7 {

    @Test
    fun task1() {
        val list = input.split(",").map { it.toInt() }

        val sorted = list.sorted()

        val median = sorted[list.count() / 2]

        var fuel = 0

        list.forEach {
            fuel += if (it < median)
                median - it
            else
                it - median

        }

        println("Result: $fuel")
    }

    @Test
    fun task2() {
        val list = input.split(",").map { it.toInt() }

        val average = list.average().toInt()

        var fuel = 0

        list.forEach {
            val count = if (it < average)
                average - it
            else
                it - average

            repeat(count) {
                fuel += it + 1
            }

        }

        println("Result: $fuel")
    }
}