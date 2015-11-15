package i_introduction._8_Smart_Casts

import util.TODO
import util.doc6

interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr

fun eval(e: Expr): Int =
        when (e) {
            is Num -> e.value
            is Sum -> eval(e.left) + eval(e.right)
            else -> throw IllegalArgumentException("Unknown expression")
        }

fun todoTask6(expr: Expr): Nothing = TODO(
    """
        Task 6.
        Rewrite 'JavaCode6.eval()' in Kotlin using smart casts and 'when' expression.
    """,
    documentation = doc6(),
    references = { /* i_introduction._8_Smart_Casts.JavaCode6().eval(expr)*/ })

