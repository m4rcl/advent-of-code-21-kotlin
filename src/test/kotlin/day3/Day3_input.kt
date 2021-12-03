package day3

val input_demo = """
    00100
    11110
    10110
    10111
    10101
    01111
    00111
    11100
    10000
    11001
    00010
    01010
""".trimIndent()

val input = """
    101000111100
    000011111101
    011100000100
    100100010000
    011110010100
    101001100000
    110001010000
    111110011011
    000110100110
    110100000001
    110100001001
    010000100011
    000010011100
    111001110001
    011001000010
    100011100110
    101010100111
    001011001101
    001101100100
    111010110100
    010101011100
    001010010000
    101001111001
    101110010001
    110100011100
    001010111110
    011110110100
    110110101110
    000000101101
    001100000110
    110010110001
    010110101110
    100111000111
    000010101111
    010101111011
    011101000100
    010000011011
    110011111111
    000001100100
    100100110110
    100001101001
    110001000010
    010111110110
    101101011001
    010101101101
    010001101100
    100010000000
    111111001001
    111101001011
    010110011001
    011000000100
    011100101000
    111101001000
    111000110010
    110000000110
    001101011000
    101110010011
    100010011111
    111110010000
    000011010011
    111110100010
    111111001111
    101001011110
    111001101001
    111010011100
    001011001111
    001010011110
    110111101010
    101111101101
    011101110101
    001111110101
    010111110011
    000010011000
    111111111000
    000101001100
    110011001000
    100010100110
    100110101110
    001010101101
    110000111000
    101100010110
    000000100101
    111001101101
    111010001101
    111110000111
    010101000010
    100000101101
    000011100011
    011011000111
    011000011111
    100101011100
    101011000110
    111110001110
    001010011101
    101001101001
    001101111110
    000100000010
    011110000001
    010111101101
    010101100010
    000110000011
    100001111010
    011001011000
    001011110100
    001101111011
    001110110010
    001010101000
    100001001100
    101010100110
    100010101011
    111000010000
    100101100111
    010001011001
    010010101101
    001001000111
    100010111100
    001011100011
    100100001101
    110000110010
    100010011101
    111001011100
    101101011011
    010011111111
    010100111111
    000101100011
    111001110111
    000010100100
    101100000000
    111110100011
    110101111111
    001101001101
    010110000110
    110100010100
    011100011100
    110011001100
    000001010111
    110100001000
    110110100111
    010000001111
    100011111110
    001000010000
    011101001001
    100110101111
    000010101101
    100011010101
    010101001000
    110101011101
    111111101010
    101011101101
    010101001001
    101101000110
    110110101000
    110100100101
    000011110101
    001110101001
    011101011110
    111111110100
    010111000011
    100101010000
    010011111010
    111001101100
    100100010101
    100101100001
    001111000111
    110100101001
    010010011100
    011001000101
    111101010001
    001100010000
    111100000011
    000101001000
    010011010111
    101110011000
    110000111010
    110010001011
    111110110010
    000000001011
    011001111001
    001001001110
    100111001111
    110110001010
    110110010101
    110011001101
    010001101001
    000010100111
    100111111110
    111011100001
    011000100000
    111111000100
    111100100010
    110110110110
    001100111110
    101000100001
    000010000101
    111101011101
    001001001101
    101011001101
    000010010001
    011010110001
    110000000010
    000111001000
    111110101100
    011111000111
    010101111000
    010100010110
    111111100100
    110011010001
    010110001110
    000100010011
    100101100011
    101010001011
    001010111101
    111110111000
    101001100011
    011100110010
    101001101010
    111011110000
    011101110000
    000001101111
    111101101100
    110101000101
    011000110101
    000111100101
    111110011101
    000111101010
    010011100101
    101001001001
    100010101000
    111111100011
    011011101111
    001011111001
    001001101011
    100101100101
    100011111000
    010110100001
    000100111111
    010100111101
    010100100000
    110000101000
    100001011000
    100010011000
    100011101111
    001100010001
    010001010001
    011011001001
    001001110110
    111011011100
    000110010000
    111110011111
    001111101000
    010010010001
    000011001110
    101011101100
    001000110110
    111000010001
    010111000101
    110000001110
    000011111010
    010000010100
    011101001110
    000111011011
    000111110010
    111110110101
    101110100001
    111101011100
    010001111001
    010011011000
    111110111011
    111000100110
    000110001001
    100000111110
    001101101010
    101100111010
    000101011111
    001101010111
    011001010011
    001111010110
    010101000000
    010011100001
    010011001000
    110110011011
    110100111000
    101110000111
    100101110111
    000001011100
    111110111110
    000001011010
    010101101000
    010010100100
    011100010011
    110111001000
    110011100001
    111100111010
    010001110100
    000100100111
    000001110011
    110011100111
    010010101111
    100010001101
    111101101011
    110100010101
    101010111110
    111010011110
    111101101101
    000100010000
    111101010010
    011100001111
    101010110001
    000111111100
    010100001101
    111100010000
    101011110110
    010100011000
    100111101001
    011100000000
    000110110110
    001111010011
    111100111101
    101111101100
    001000101100
    111100011000
    010101110000
    001110110001
    000000011110
    010010111101
    000001001001
    110100101101
    100010010100
    010100001001
    100110001000
    000011001011
    101011001111
    100010100111
    011101100000
    110111101111
    001110100010
    100101101110
    110100000000
    001010100100
    011100110100
    011100011111
    010101100110
    011000001000
    100000111010
    011011100000
    000011110011
    010111011111
    011100101111
    111011111001
    110010111101
    101101110101
    101100100010
    001001111100
    100100111001
    101101111110
    001100100110
    011011100101
    110111010010
    101100111111
    000011110111
    001110111101
    100110000000
    001100010100
    110001101101
    011010100000
    000100011010
    011001011010
    011111111111
    011000001100
    111111110001
    000000101110
    000110011111
    001110100000
    001110011101
    000000011000
    101001110011
    000101101010
    000100001110
    101100011011
    110010101111
    011101000001
    110001011000
    111011011111
    111110100100
    010101011111
    110011111000
    000101111111
    001101011101
    010111011011
    101000110011
    001110010001
    010010001001
    000010011010
    000010101001
    110111110100
    100101001000
    000101000100
    101111001001
    101111111111
    010000010010
    101001110000
    100100001110
    001001110010
    111010110010
    110011011111
    101001110100
    011100111111
    100000111111
    110101101100
    000100110100
    100110101010
    100100000100
    010010000110
    010110001100
    000010001001
    001100001010
    100001101000
    100010011001
    010101101110
    010000111001
    101110110010
    111100100000
    110000101110
    101001101111
    100101001100
    111011101111
    001111000001
    011101111101
    011000010111
    101011111001
    101011010110
    010000000011
    100010011011
    001111001011
    101000011101
    001101100010
    100111010101
    000111100001
    101111010011
    000101101100
    111110000101
    110100011110
    011101101000
    100000111001
    111000101001
    000011010100
    110101011011
    010011100011
    111011010110
    010110111000
    110111010101
    001111111110
    000011011101
    001011000100
    000101101111
    101100011100
    001001101100
    011110111100
    010001000001
    100100101101
    001101010101
    101101111001
    111001101011
    100111001010
    100110111001
    110000101111
    001001110101
    011101101111
    101101100011
    101000011111
    101010111101
    011100010111
    011010110000
    100111101111
    110101110100
    011111011000
    110010100000
    010110100000
    100010101111
    100101001110
    000101000000
    100111110111
    000101100100
    010111101111
    110100101000
    110111001010
    010011000000
    000110110100
    000110011010
    110000010110
    111000100100
    001110001110
    100011100111
    100101000100
    100110110100
    110010110011
    001100101000
    000101001001
    110101000100
    100101010101
    000101011101
    111110000001
    000101110001
    011001011100
    101001110010
    010111001000
    100000000111
    101110101000
    111000001011
    101111110111
    111000111010
    011101000111
    101111110001
    011010101111
    111100100100
    100111000101
    000011100110
    011110110010
    110110100001
    011111010000
    100111010000
    011000101000
    011001000111
    000000001000
    000100101010
    010011001111
    100100011100
    011110100011
    000010111101
    000110010110
    110010100010
    001100011011
    101101000001
    110111101011
    110101100000
    100101011000
    110111011111
    111011100000
    011101101101
    110101001000
    000100111000
    101100101001
    111101101111
    000100111100
    000101111110
    011100101011
    111101000101
    111000101000
    010111110001
    111011001001
    110001010010
    110101001101
    101101000010
    110101010100
    001100011010
    001100001001
    101011000101
    110101010001
    010111011100
    001110110011
    111110101000
    101101010111
    001110001010
    011000011101
    101111000011
    101000000000
    001000000010
    000110111001
    110100110110
    111000100010
    110011010000
    101000101111
    001100101111
    111111111001
    110001001000
    010100010101
    000100101100
    101110111111
    101001001100
    010111100011
    101100101101
    101101001111
    010110011010
    000101001010
    100111110010
    101110000110
    000000110111
    001001010110
    010101000110
    001101000101
    001011101000
    101010110110
    010111000000
    111110001001
    011101110001
    000101110100
    101110101011
    100010101001
    111001100101
    011010010101
    111010010000
    001010110111
    100111101101
    001011001001
    111100110001
    000000000100
    011010110111
    100101011111
    011000001110
    100111010010
    111111000111
    011110110110
    011000110011
    000101101011
    011011101101
    001110111010
    111011110100
    001100101001
    111001111011
    111111101111
    011011000101
    011000110010
    100011110001
    111101110001
    100010101100
    010111111001
    001001100100
    100010111110
    110111100111
    100110000100
    111110011000
    110000100011
    011000010010
    011110011001
    101011011111
    010111001001
    010001011101
    111000100101
    001011000111
    010011111110
    011110011110
    011011111100
    011000110000
    101100111110
    010101111110
    110111100010
    000111001101
    111100000101
    001001010010
    001101111111
    101000011001
    000111010110
    010101100011
    011101110110
    101100110010
    100001010001
    010110001010
    010101011110
    111110101101
    000011111110
    010010000100
    010111000111
    000110001011
    010000101001
    000000010000
    100011100000
    000001100110
    101100011000
    011001110001
    010011011001
    110000000111
    000101101110
    010011000111
    110100011010
    001110100111
    000100010101
    000110110111
    100001010000
    001110001000
    111101100100
    001001100000
    100011111010
    101111001110
    100010111011
    011110000110
    101110100000
    001100001100
    011010010000
    011001111100
    110011011110
    110110001111
    001100010111
    101110001100
    101110101010
    000010000111
    101010000101
    010011011010
    010010011000
    010100101011
    001110000101
    000110111111
    011011110110
    111111100110
    100011110101
    001011011110
    111001111100
    110011101001
    011010001011
    110001100001
    101100101100
    011100001001
    010101011000
    111111111011
    110001111011
    110111110011
    111100001010
    110011011000
    100011001000
    011100100000
    110110110010
    101011110101
    001101100101
    111001010000
    111010100110
    011011011101
    001000011001
    000111011100
    111001001100
    101111010000
    100101101101
    000010010110
    101110111010
    010011000011
    001000011010
    000101000010
    100000110100
    100000011101
    110001001111
    010100101100
    100100010111
    010111100001
    010000111101
    001000100101
    101101111100
    111001110101
    111101010110
    010101001100
    100101011011
    100001100101
    001100101011
    111101011110
    001100100100
    000000101100
    010000101100
    011010011011
    111101101001
    110010110111
    010101111111
    011001101000
    011000010001
    001111011011
    001001011111
    110101000000
    110101000010
    100111110100
    111010011010
    000011001111
    101010110010
    100101111001
    100110100110
    111001110011
    011000100010
    001110010011
    001110001111
    100101000101
    111000011101
    101111101010
    011001100111
    001000000011
    010000010101
    100111111100
    011011011111
    010110100110
    010111101110
    010001101010
    000001101000
    101011000111
    111011000010
    101101100000
    000100010100
    000010011011
    111000101101
    001100110000
    111010100011
    101100000110
    100011100011
    100011100001
    111011110111
    100111100100
    111001110000
    010111100000
    111001011110
    110011100101
    111101010000
    010101001010
    100110101011
    100101101001
    101000001001
    011110111101
    010000110110
    011111000000
    111100101101
    011100110011
    011011000011
    111000000001
    001010101010
    111011111101
    110001110000
    000001010001
    101000100100
    000001001100
    101010010011
    001000000100
    010001111000
    011100000001
    111100111100
    100011000011
    111011110110
    100000101111
    111101000001
    100100110100
    010110111111
    111100010011
    100001000001
    111101000000
    110010001101
    011110010011
    110010111010
    011011001111
    110111101100
    000000111001
    010111111100
    100110101000
    110000110110
    010010110100
    101101001101
    101100000010
    000101000001
    001001010100
    000110111101
    100100001011
    100100110001
    110001000001
    111101011010
    001010110001
    110111000111
    010101000011
    111101101110
    101011000000
    010101100101
    110010100110
    001010001000
    110000101001
    010100100111
    111110010111
    000010110010
    001101010001
    101111110101
    100011001010
    110011111001
    111001011010
    100011101010
    100111100101
    001101110111
    111000110101
    010000100001
    000000110110
    010111110100
    000111110011
    000101000101
    010101000101
    001101101101
    111000010111
    000100000011
    111011000001
    001111001110
    101110010101
    010011010001
    110111111110
    001011100001
    101010011110
    110010010101
    101100110001
    001111111010
    001111011111
    010110111001
    100101010010
    110101110111
    000110111011
    100000010010
    111000110100
    000100111001
    011011001010
    110000000000
    101001010011
    100100001001
    011111101100
    011101110011
    011101000101
    000100100001
    001011001011
    110101101111
    110010111111
    100100100110
    110110001000
    001001101111
    111001000000
    001101111000
    101110011010
    110001101111
    000000101010
    110001001010
    000110111110
    101111010110
    010000001000
    111011110010
    110111011110
    010011000001
    010101001111
    001101110110
    001000011111
    010110110011
    111000001101
    010000110111
    000101110110
    000011011110
    111110010010
    100100110000
    000100001111
    011100101101
    001101010000
    100101001001
    001001010000
    000100001001
    011100011101
    101000111010
    100111011110
    000000001111
    100001100100
    111101100011
    111001111010
    110110100011
    101110101111
    101000001110
    000011010101
    010001000110
    010110100101
    010000110010
    100110011001
    100100101111
    110110001001
    111111010111
    011010011111
    111110011010
    011011011011
    111101001110
    110111100001
    011111101010
    010010111000
    000010010000
    111110101010
    011011101100
    100100111000
    110100000110
    110111010100
    101101011110
    100100111011
    101001011011
    011000111001
    111100111011
    110101011010
    101010101010
    001010010010
    101001110111
    001001100010
    001010101110
    000001001111
    011010001111
    010110100111
    011110110000
    111001000101
    001110100110
    111001010010
    101001010010
    001011000010
    111010101010
    101010110000
    111100010100
    000111100111
    110111100100
""".trimIndent()