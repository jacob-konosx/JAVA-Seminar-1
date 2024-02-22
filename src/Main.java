import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    // 1. Exercise
    public static final double GRAVITY = -9.81;
    public static double calculateFinalPosition(double initialVelocity, double fallingTime, double initialPosition)throws Exception
    {
        if(initialVelocity > 0 && initialPosition > 0) {
            throw new Exception("Wrong arguments");
        }
        return 0.5 * GRAVITY*fallingTime*fallingTime + initialVelocity*fallingTime + initialPosition;
    }
    // 2. Exercise
    public static int factorialForLoop(int N){
        int sum = 1;
        for (int i = 1; i < N+1; i++) {
            sum *= i;
        }
        return sum;
    }
    public static int factorialRecursive(int N){
        if (N <= 0){
            return 1;
        }
        return factorialRecursive(N-1) * N;
    }
    // 3. Exercise
    static double[]  generateArray(int N, double lower, double upper){
        double[] doubleArr = new double[N];
        if(lower > upper){
            return doubleArr;
        }
        for (int i = 0; i < N; i++) {
            double randDouble = (Math.random() * (upper - lower)) + lower;
            doubleArr[i] =  Math.floor(randDouble * 100) / 100;
        }
        return doubleArr;
    }
    static double getMean(double[] array){
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum+=array[i];
        }
        return sum/array.length;
    }
    static double getMin(double[] array){
        double min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]){
                min = array[i];
            }
        }
        return min;
    }
    static double getMax(double[] array){
        double max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]){
                max = array[i];
            }
        }
        return max;
    }
    static void arraySort(double[] array){
        int N = array.length;
        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < N-i-1; j++) {
                if (array[j+1] < array[j]){
                    double temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

    // 4. Exercise
    static double[][] generateMatrix(int N){
        double[][] matrix = new double[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                double randDouble = (Math.random() * (100 - 1)) + 1;
                matrix[i][j] = Math.floor(randDouble * 100) / 100;
            }
        }
        return matrix;
    }

    // 5. Exercise
    static double[] coinFlip(int N){
        double[] result = new double[3];
        for (int i = 0; i < N; i++) {
            int randNum = (int) Math.round(Math.random());
            if (randNum == 1){
                result[1] += 1;
            }else{
                result[0] += 1;
            }
        }
        result[2] = result[0]/result[1];
        return result;
    }
    static void printCoinFlip(double[] coinFlip){
        System.out.println("Heads: " + coinFlip[0]);
        System.out.println("Tails: " + coinFlip[1]);
        System.out.println("Ratio: " + coinFlip[2]);
        System.out.println(" ");

    }
    static int[] rollDice(int N){
        int[] result = new int[6];
        for (int i = 0; i < N; i++) {
            int diceRoll = (int)(Math.random()*6);
            result[diceRoll] += 1;
        }
        return result;
    }
    static int roll2Dices(){
        int tries = 0;
        while(true){
            tries += 1;
            int diceRoll1 = (int)(Math.random()*6+1);
            int diceRoll2 = (int)(Math.random()*6+1);
            if (diceRoll2 == 6 && diceRoll1 == 6){
                break;
            }
        }
        return tries;
    }
    // Exercise 6
    static void pascalsTriangle(int level){
        int[] pascalValues = new int[level+1];
        for (int i = 0; i < level+1; i++) {
            pascalValues[i] = factorialForLoop(level)/(factorialForLoop(i)*factorialForLoop(level-i));
        }
        System.out.print("[");
        for (int i = 0; i < pascalValues.length; i++) {
            if (i == pascalValues.length-1){
                System.out.print(pascalValues[i]);
            }else{
                System.out.print(pascalValues[i] + ", ");
            }
        }
        System.out.print("]");

    }
    static String getTextFromBytes(byte[] array) {
        return new String(array);
    }
    public static void main(String[] args) {
        // 0. Exercise
//        String[] names = { "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt",
//                "Alex", "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron",
//                "Kate" };
//        int[] times = { 341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393,
//                299, 343, 317, 265 };
//        for (int i = 0; i < names.length; i++) {
//            System.out.println(names[i] + " : " + times[i]);
//        }

        // 1. Exercise
//        double initialVelocity = 0.0;
//        double fallingTime = 10.0;
//        double initialPosition = 0.0;
//        double finalPosition = calculateFinalPosition(initialVelocity, fallingTime, initialPosition);
//        System.out.println("Pos in "+fallingTime+" sec : "+finalPosition);

        // 2. Exercise
//        System.out.println(factorialForLoop(5));
//        System.out.println(factorialRecursive(5));

        // 3. Exercise
//        double[] arr = generateArray(5, 1,10);
//        for(int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]+ " ");
//        }
//        System.out.println("Min: " + getMin(arr));
//        System.out.println("Max: " + getMax(arr));
//        System.out.println("Mean: " + getMean(arr));
//        arraySort(arr);
//        for(int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]+ " ");
//        }

        // 4. Exercise
//        double[][] matrix =  generateMatrix(5);
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix.length; j++) {
//                System.out.print(matrix[i][j] + " ");
//            }
//            System.out.println(" ");
//        }
//        // Sitam nevajag funkciju
//        //double getProduct(double[][] matrix, int i, int j)
//        int i = 4;
//        int j = 4;
//        System.out.println(matrix[i][j]);

        // 5. Exercise
        // PT 1
//        double[] tenCoinFlip = coinFlip(10);
//        double[] hundredCoinFlip = coinFlip(100);
//        double[] thousandCoinFlip = coinFlip(1000);
//        double[] tenThousandCoinFlip = coinFlip(10000);
//        printCoinFlip(tenCoinFlip);
//        printCoinFlip(hundredCoinFlip);
//        printCoinFlip(thousandCoinFlip);
//        printCoinFlip(tenThousandCoinFlip);

        // PT 2
//        int[] diceRollRes = rollDice(1000);
//        for (int i = 1; i < diceRollRes.length+1; i++) {
//            System.out.println("Occurrences of " + i + ": " + diceRollRes[i-1]);
//        }

        // PT 3
//        System.out.println("Number of rolls until both dices are 6: " + roll2Dices());

        // 6. Exercise
//        byte[] charIntArr = new byte[]{72, 101, 108, 108, 111, 33, 32, 77, 121, 32, 115, 107, 105, 108, 108, 115, 32, 97, 114, 101,
//                32, 103, 114, 101, 97, 116, 32, 97, 108, 114, 101, 97, 100, 121, 33};
//        String charString = getTextFromBytes(charIntArr);
//        System.out.println(charString);

//         7. Exercise
        pascalsTriangle(6);
    }
}