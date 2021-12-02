package day1

import org.junit.Test


class Day1 {

    @Test
    fun the_number_of_times_a_depth_measurement_increases() {

        var increaseCount = 0
        var previousValue: Int? = null

        input_task1.lines().forEach { line ->

            val value = line.toInt()

            previousValue?.let { if (it < value) increaseCount++ }

            previousValue = value
        }

        println("Number of increases: $increaseCount")
    }

    @Test
    fun the_number_of_times_the_sum_of_measurements_in_this_sliding_window_increases() {

        var increaseCount = 0
        var previousSum: Int? = null

        val lines = input_task2.lines()

        lines.forEachIndexed { index, line ->

            val tripleSum = if (index > 0 && index < lines.count() - 1) {
                lines[index - 1].toInt() + line.toInt() + lines[index + 1].toInt()
            } else {
                0
            }

            previousSum?.let { previousSum -> if (previousSum < tripleSum && previousSum != 0) increaseCount++ }

            previousSum = tripleSum
        }

        println("Number of increases: $increaseCount")
    }
}
