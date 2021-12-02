package day2

import org.junit.Test


class Day2 {

    @Test
    fun what_do_you_get_if_you_multiply_your_final_horizontal_position_by_your_final_depth() {

        var forwardSum = 0
        var depth = 0

        input.lines().forEach { value ->

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
    fun what_do_you_get_if_you_multiply_your_final_horizontal_position_by_your_final_depth_aim() {

        var forwardSum = 0
        var depth = 0
        var aim = 0

        input.lines().forEach { value ->

            when {
                value.startsWith("forward") -> {
                    val forwardValue = value.substringAfter(" ").toInt()
                    forwardSum += forwardValue
                    depth += forwardValue * aim
                }
                value.startsWith("down") -> aim += value.substringAfter(" ").toInt()
                value.startsWith("up") -> aim -= value.substringAfter(" ").toInt()
            }

        }
        val result = forwardSum * depth

        println("Result: $result")

    }
}
