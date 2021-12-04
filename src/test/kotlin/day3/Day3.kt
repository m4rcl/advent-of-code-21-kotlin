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
    fun what_is_the_life_support_rating_of_the_submarine() {

        val resultList = input.lines()

        val oxygenRate = Integer.parseInt(findOxygenRate(resultList).first(), 2)
        println("oxygenRate: $oxygenRate")

        val co2Rate = Integer.parseInt(findCo2Rate(resultList).first(), 2)
        println("co2Rate: $co2Rate")

        println("Result: ${oxygenRate * co2Rate}")
    }

    private fun findOxygenRate(list: List<String>, index: Int = 0): List<String> {

        println("findOxygenRate: $list index: $index")

        val oneList = ArrayList<String>()
        val zeroList = ArrayList<String>()

        list.forEach { value ->
            if (value[index] == '1') oneList.add(value) else zeroList.add(value)
        }

        val resultList = if (oneList.count() >= zeroList.count()) oneList else zeroList

        if (resultList.count() == 1) return resultList

        return findOxygenRate(resultList, index + 1)
    }


    private fun findCo2Rate(list: List<String>, index: Int = 0): List<String> {

        println("findCo2Rate: $list index: $index")

        val oneList = ArrayList<String>()
        val zeroList = ArrayList<String>()

        list.forEach { value ->
            if (value[index] == '1') oneList.add(value) else zeroList.add(value)
        }

        val resultList = if (zeroList.count() <= oneList.count()) zeroList else oneList

        if (resultList.count() == 1) return resultList

        return findCo2Rate(resultList, index + 1)
    }

}
