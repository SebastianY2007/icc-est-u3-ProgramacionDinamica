import java.util.HashMap;
import java.util.Map;

public class EjerciciosPD {
    public long getFibonacci(int n){
        if (n <= 1)
            return n;
        return getFibonacci(n - 1) + getFibonacci(n - 2);
    }

    public long getFibonacciPD(int n){
        Map<Integer, Integer> caching = new HashMap<>();
        return getFibonacciPDHelper(n, caching);
    }

    private long getFibonacciPDHelper(int n, Map<Integer, Integer> cache){
        if (n <= 1)
            return n;
        if (cache.containsKey(n))
            return cache.get(n);

        long resultado = getFibonacci(n - 1) + getFibonacci(n - 2);
        return resultado;
    }
}