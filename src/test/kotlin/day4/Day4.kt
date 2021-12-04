package day4

import org.junit.Test


class Day4 {

    @Test
    fun what_will_your_final_score_be_if_you_choose_that_board() {

        val numberList = numbers.split(",")

        val bingos = readInputBingos()

        var winnerPair: Pair<Array<IntArray>, Array<IntArray>>? = null
        var winnerNumber: Int? = null

        kotlin.run bla@{

            numberList.forEach {

                val currentNumber = it.toInt()

                println("CurrentNumber: $currentNumber")

                markCurrentNumbers(bingos, currentNumber)

                val winner = checkWinner(bingos)

                winner?.let {
                    println("Winner: $winner")
                    winnerPair = winner
                    winnerNumber = currentNumber
                    return@bla
                }
            }
        }


        val calcOfSum = calcOfSum(winnerPair!!)

        println("SUM: $calcOfSum")

        val result = calcOfSum * winnerNumber!!

        println("Result: $result")


    }

    @Test
    fun win_last() {
        val numberList = numbers.split(",")

        val bingos = readInputBingos()

        var winnerPair: Pair<Array<IntArray>, Array<IntArray>>? = null
        var winnerNumber: Int? = null

        kotlin.run bla@{

            numberList.forEach {

                val currentNumber = it.toInt()

                println("CurrentNumber: $currentNumber")

                markCurrentNumbers(bingos, currentNumber)

                var winner = checkWinner(bingos)

                winner?.let {

                    if (bingos.count() == 1) {
                        winnerPair = winner
                        winnerNumber = currentNumber
                        return@bla

                    }

                    while (winner != null) {
                        winner = checkWinner(bingos)
                        winner?.let {

                            if (bingos.count() == 1) {
                                winnerPair = winner
                                winnerNumber = currentNumber
                                return@bla

                            } else {
                                bingos.remove(winner)
                            }
                        }

                    }
                }


            }
        }


        val calcOfSum = calcOfSum(winnerPair!!)

        println("SUM: $calcOfSum")

        val result = calcOfSum * winnerNumber!!

        println("Result: $result")
    }

    private fun calcOfSum(winnerPair: Pair<Array<IntArray>, Array<IntArray>>): Int {

        var result = 0

        for (i in 0..4) {
            for (j in 0..4) {
                if (winnerPair.second[i][j] == 0) {
                    result += winnerPair.first[i][j]
                }
            }

        }

        return result
    }

    private fun readInputBingos(): MutableList<Pair<Array<IntArray>, Array<IntArray>>> {
        val bingos: MutableList<Pair<Array<IntArray>, Array<IntArray>>> = ArrayList()

        for (i in 0..input.lines().count() step 6) {

            val bingoMatrix = Array(5) { IntArray(5) }

            for (j in 0..4) {
                bingoMatrix[j] =
                    input.lines()[j + i].split(" ").filter { it.isNotBlank() }.map { it.toInt() }.toIntArray()
            }

            val markerMatrix = Array(5) { IntArray(5) }
            bingos.add(Pair(bingoMatrix, markerMatrix))
        }
        return bingos
    }

    private fun markCurrentNumbers(bingos: MutableList<Pair<Array<IntArray>, Array<IntArray>>>, currentNumber: Int) {

        bingos.forEach {

            for (i in 0..4) {
                for (j in 0..4) {
                    if (it.first[i][j] == currentNumber) it.second[i][j] = 1
                }
            }
        }


    }

    private fun checkWinner(bingos: MutableList<Pair<Array<IntArray>, Array<IntArray>>>): Pair<Array<IntArray>, Array<IntArray>>? {

        bingos.forEach {
            val resultBingo = it.second

            //horizintal
            for (i in 0..4) {
                if (resultBingo[i].none { currentResultMarker -> currentResultMarker == 0 }) {
                    return it
                }
            }

            //vertical

            for (i in 0..4) {
                var bingo = true
                for (j in 0..4) {
                    if (resultBingo[j][i] == 0) bingo = false
                }
                if (bingo) {
                    return it
                }
            }

        }

        return null
    }
}
