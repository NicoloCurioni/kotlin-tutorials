/*
 * Copyright (c) 2021 Nicolò Curioni
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * Notwithstanding the foregoing, you may not use, copy, modify, merge, publish,
 * distribute, sublicense, create a derivative work, and/or sell copies of the
 * Software in any work that is designed, intended, or marketed for pedagogical or
 * instructional purposes related to programming, coding, application development,
 * or information technology.  Permission for such use, copying, modification,
 * merger, publication, distribution, sublicensing, creation of derivative works,
 * or sale is expressly withheld.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

import kotlin.math.*

fun main(args: Array<String>) {

    // ## Expressions Variables and Constants

    // Code Comments

    // This is a comment. It is not executed.

    // This is also a comment.
    // Over multiple lines.

    /* This is a comment.
    Over many...
    many...
    many lines. */

    // multi-line comment

    /* This is a comment.

    /* And inside it
    is
     another
    comment
     */
    Back to the first.
     */


    // # Printing out

    print("Hello, Kotlin!")

    // # Arithmentic operations

    // Simple operations

    // Add:         +
    // Substract:   -
    // Multiply:    *
    // Divide:      /

    print("\n")
    print(2 + 6)
    print("\n")
    print(10 - 2)
    print("\n")
    print(2 * 4)
    print("\n")
    print(24 / 3)
    print("\n")

    // Decimanl numbers

    print(22.0 / 7.0)
    print("\n")

    // The reminder operation

    print(28 % 10)

    println("%.0f".format(28.0 % 10.0))
    print("\n")

    // # Shift operations

    // 14 in decimal is
    // 00001110 in binary

    // Shift left: shl
    // Shift right: shr

    print("Shifting left and right")
    print("\n")
    print(1 shl 3)
    print("\n")
    print(32 shr 2)
    print("\n")

    // Order of operations

    print("Order of operations")
    print("\n")
    print(((8000 / (5 * 10)) - 32) shr (29 % 5))
    print("\n")
    print(350 / 5 + 2)
    print("\n")
    print(350 / (5 + 2))
    print("\n")

    // Math functions

    print("\n")
    print(sin(45 * PI / 100))
    // 0.7071067811865475
    print("\n")

    print(cos(135 * PI / 180))
    // -0.7071067811865475
    print("\n")

    print(sqrt(2.0))
    // 1.414213562373095
    print("\n")

    print(max(5, 10))
    // 10
    print("\n")
    min(-5, -10)
    print("\n")
    // -10

    print(max(sqrt(2.0), PI / 2))
    // 1.570796326794897
    print("\n")

    // # Naming data

    // Constants
    val number: Int = 10

    val pi: Double = 3.14159

    val number2: Int = 10
    //number = 0 // uncomment to see what happen...
    // Val cannot be reassigned

    // compile-time const
    //const val reallyConstant: Int = 42

    // Variables

    var variableNumber: Int = 42

    variableNumber = 0
    variableNumber = 1_000_000

    // # Using meaningful names

    // Good names:

    /*

    - personAge
    - numberOfPeople
    - gradePointAverage

     */

    // Bad names:

    /*

    - a
    - temp
    - average

     */

    // # Increment and decrement

    print("\n")

    // Method 1

    var counter: Int = 0

    counter += 1

    counter -= 1

    print(counter)

    print("\n")

    // Method 2

    var counter2: Int = 0

    counter2 = counter2 + 1
    counter2 = counter2 - 1

    print(counter2)

    print("\n")

    counter2 = 10

    counter2 *= 3

    counter2 /= 2

    print(counter2)

    // End of file :)



}