package java.i_introduction._8_Smart_Casts;

import i_introduction._8_Smart_Casts.Expr;
import i_introduction._8_Smart_Casts.Num;
import i_introduction._8_Smart_Casts.Sum;

import java.util.JavaCode;

public class JavaCode6 extends JavaCode {
    public int eval(Expr expr) {
        if (expr instanceof Num) {
            return ((Num) expr).getValue();
        }
        if (expr instanceof Sum) {
            Sum sum = (Sum) expr;
            return eval(sum.getLeft()) + eval(sum.getRight());
        }
        throw new IllegalArgumentException("Unknown expression");
    }
}
