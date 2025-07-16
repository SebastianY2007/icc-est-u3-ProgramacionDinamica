public class App {
    public static void main(String[] args) throws Exception {
        runEjerciciosPD();
    }

    private static void runEjerciciosPD(){
        EjerciciosPD ejerciciosPD = new EjerciciosPD();
        System.out.println("Fibonacci Recursivo");
        long start = System.currentTimeMillis();
        long resultado = ejerciciosPD.getFibonacci(50);
        long end =System.currentTimeMillis();
        long duration = end - start;
        System.out.println("Restultado: " + resultado + ", en tiempo: " + duration);
        
        System.out.println("Fibonacci Recursivo Caching");
        start = System.currentTimeMillis();
        resultado = ejerciciosPD.getFibonacciPD(100);
        end = System.currentTimeMillis();
        duration = end - start;
        System.out.println("Restultado: " + resultado + ", en tiempo: " + duration);
    }
}
