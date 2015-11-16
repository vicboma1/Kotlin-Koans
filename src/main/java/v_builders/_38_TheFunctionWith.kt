package v_builders.examples

import java.util.*


fun todoTask38(): Nothing = TODO(
    """
        Task 38.
        The previous examples can be rewritten with the library function 'with' (see examples below).
        Write your own implementation of the function 'with' named 'myWith'.
    """
)

fun <T, R> myWith(receiver: T, f: T.() -> R): R {
    return receiver.f()
}

fun buildString(): String {
    val stringBuilder = StringBuilder()
    myWith (stringBuilder) {
        append("Numbers: ")
        for (i in 1..10) {
            append(i)
        }
    }
    return stringBuilder.toString()
}

fun buildMap(): Map<Int, String> {
    val map = HashMap<Int, String>()
    myWith (map) {
        put(0, "0")
        for (i in 1..10) {
            put(i, "$i")
        }
    }
    return map
}
