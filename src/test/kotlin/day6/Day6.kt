package day6

import org.junit.Test
import java.util.*

class Day6 {

    @Test
    fun how_many_lanternfish_would_there_be_after_80_days() {


        val fishList = readInput()

        val initialCount = fishList.count()

        val sumList = ArrayList<Int>(6)

        repeat(80) {

//            println("count after ${it+1} days: ${fishList.count()}")

            for (i in 0 until fishList.count()) {

                val fish = fishList[i]
                if (fish == 0) {
                    fishList[i] = 6
                    fishList.add(8)
                } else {
                    fishList[i] = fish - 1
                }
            }

//            println("After  $it day: $fishList")
        }

        println("Total count of ${fishList.count()} fish")

    }

    @Test
    fun how_many_lanternfish_would_there_be_after_80_days2() {


        val fishList = readInput()

        val sumList = MutableList(7) { 0L }
        var sevenCount = 0L
        var eightCount = 0L


        fishList.forEach {
            sumList[it] = ++sumList[it]
        }

        println("initial: $sumList $sevenCount $eightCount")

        repeat(256) {

            val newCount = sumList[0]
            Collections.rotate(sumList, -1)
            sumList[6] += sevenCount
            sevenCount = eightCount
            eightCount = newCount

            println("$sumList $sevenCount $eightCount")

        }

        println("Total count of ${sumList.sum() + sevenCount + eightCount} fish")

    }

    private fun readInput() = input.split(",").map { it.toInt() }.toMutableList()

}