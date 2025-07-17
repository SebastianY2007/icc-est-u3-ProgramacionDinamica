import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        //runEjerciciosPD();
        runMaze();
    }

    private static void runMaze(){
        boolean [] [] predifinedMaze = {
            {true ,true,true,true},
            {false,true,true,true},
            {true,true,false,false},
            {true,true,true,true}
        };
        Maze maze = new Maze(predifinedMaze);
        System.out.println("Laberinto Cargado");
        maze.printMaze();

        Cell start = new Cell(0, 0);
        Cell end = new Cell (3 ,3 );

        List<MazeSolver> solvers = Arrays.asList( new MazeSolverRecursivo());
        MazeSolver solver = solvers.get(0);
        List<Cell> path;
        path = solver.getPath(maze.getGrid(), start, end);

        System.out.println("Camino encontrado");
        System.out.println(path);
    }

    private static void runEjerciciosPD() {
        EjerciciosPD pd = new EjerciciosPD();
        
        System.out.println("Sebastian Yupangui");
        System.out.println("\nFibonacci Recursivo");
        long start = System.nanoTime();
        long resultado = pd.getFibonaci(50);
        long end = System.nanoTime();
        long duration = end - start;
        System.out.println("Resultado: " + resultado + ", en tiempo: " + duration + " nanosegundos");

        System.out.println("Fibonacci Recursivo Caching");
        start = System.nanoTime();
        resultado = pd.getFibonaciPD(100);
        end = System.nanoTime();
        duration = end - start;
        System.out.println("Resultado: " + resultado + ", en tiempo: " + duration + " nanosegundos");
    }
}