package day5

import org.junit.Test

class Day5 {


    @Test
    fun the_number_of_points_where_at_least_two_lines_overlap() {

        val inputList: List<Pair<Pair<Int, Int>, Pair<Int, Int>>> = readInput()

        val field: Array<IntArray> = Array(1000) { IntArray(1000) }

        inputList.forEach {
            val from = it.first
            val to = it.second

            val vertical = from.first == to.first
            val horizontal = from.second == to.second

            if (vertical) {
                val yFrom = from.second
                val yTo = to.second

                if (yFrom > yTo) {
                    for (yValue in yFrom downTo yTo) {
                        field[yValue][from.first] += 1
                    }
                } else {
                    for (yValue in yFrom..yTo) {
                        field[yValue][from.first] += 1
                    }
                }

            } else {
                if (horizontal) {
                    val xFrom = from.first
                    val xTo = to.first

                    if (xFrom > xTo) {
                        for (xValue in xFrom downTo xTo) {
                            field[from.second][xValue] += 1
                        }
                    } else {
                        for (xValue in xFrom..xTo) {
                            field[from.second][xValue] += 1
                        }
                    }
                }
            }
        }

        for (ints in field) {
            for (value in ints) {
                print(value)
            }
            println("\n")
        }

        var resultCount = 0

        for (ints in field) {
            for (value in ints) {
                if (value >= 2) resultCount++
            }
        }

        println("Result: $resultCount")

    }

    private fun readInput(): List<Pair<Pair<Int, Int>, Pair<Int, Int>>> {

        val resultList = ArrayList<Pair<Pair<Int, Int>, Pair<Int, Int>>>()

        input.lines().forEach {
            val fromAndTo = it.split(" -> ")

            val from = fromAndTo[0].split(",")
            val fromPair = Pair(from[0].toInt(), from[1].toInt())

            val to = fromAndTo[1].split(",")
            val toPair = Pair(to[0].toInt(), to[1].toInt())

            val fromToPair = Pair(fromPair, toPair)

            resultList.add(fromToPair)

        }

        return resultList
    }
}