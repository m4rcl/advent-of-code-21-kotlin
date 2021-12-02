package day2

import org.junit.Test


class Day2 {

    @Test
    fun what_do_you_get_if_you_multiply_your_final_horizontal_position_by_your_final_depth() {

        var forwardSum = 0
        var depth = 0

        input_task1.lines().forEach { value ->

            when {
                value.startsWith("forward") -> forwardSum += value.substringAfter(" ").toInt()
                value.startsWith("down") -> depth += value.substringAfter(" ").toInt()
                value.startsWith("up") -> depth -= value.substringAfter(" ").toInt()
            }

        }
        val result = forwardSum * depth

        println("Result: $result")

    }

    @Test
    fun the_number_of_times_the_sum_of_measurements_in_this_sliding_window_increases() {


    }
}
