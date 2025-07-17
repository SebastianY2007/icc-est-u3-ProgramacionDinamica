import java.util.HashMap;
import java.util.Map;

public class EjerciciosPD {

    
    public long getFibonaci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return getFibonaci(n - 1) + getFibonaci(n - 2);
    }

     
    public long getFibonaciPD(int n) {
        Map<Integer, Long> n1 = new HashMap<>();
        return getFibonaciPDHelper(n, n1);
    }

    private long getFibonaciPDHelper(int n, Map<Integer, Long> me) {
        if (n <= 1) {
            return n;
        }

        if (me.containsKey(n)) {
            return me.get(n);
        }

        long resultado = getFibonaciPDHelper(n - 1, me) + getFibonaciPDHelper(n - 2, me);
        me.put(n, resultado);
        return resultado;
    }
}