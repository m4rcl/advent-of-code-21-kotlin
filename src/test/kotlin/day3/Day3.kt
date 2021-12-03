package day3

import org.junit.Test


class Day3 {

    @Test
    fun what_is_the_power_consumption_of_the_submarine() {

        val lines = input.lines()

        val size = lines[0].count()
        val countList = MutableList(size) { 0 }

        input.lines().forEach { value ->

            value.forEachIndexed { index, c ->

                if (c == '1') countList[index] = ++countList[index]

            }
        }

        println(countList)

        var gammaRateString = ""
        var epsilonRateString = ""

        countList.forEach {
            gammaRateString += if (it < lines.count() / 2) '0' else '1'
        }

        gammaRateString.forEach {
            epsilonRateString += if (it == '1') '0' else '1'
        }

        println(gammaRateString)
        println(Integer.parseInt(gammaRateString, 2))

        println(epsilonRateString)
        println(Integer.parseInt(epsilonRateString, 2))

        val result = Integer.parseInt(gammaRateString, 2) * Integer.parseInt(epsilonRateString, 2)

        println("Result: $result")

    }

    @Test
    fun what_do_you_get_if_you_multiply_your_final_horizontal_position_by_your_final_depth_aim() {


    }
}
