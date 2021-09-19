package Lab9;
//Lab9 9am
//Daniel Rochefort

/*
Output for Number 1:
2
2 4
2 4 6
2 4 6 8
2 4 6 8 10
 */

public class Lab9_Recursion {
    public static void main(String[] args){
        System.out.println("Cumulative Sum of 5:\n" + cumulativeSum(5));
        System.out.println("Fib of 1:\n" + fib(1));
        System.out.println("Fib of 2:\n" + fib(2));
        System.out.println("Fib of 3:\n" + fib(3));
        System.out.println("Fib of 10:\n" + fib(10));
    }

    public static int cumulativeSum(int n){
        if(n>0){ //number is positive
            return n + cumulativeSum(n-1);
        } else if(n<0){ //number is negative
            return n + cumulativeSum(n+1);
        } else { //number is zero
            return 0;
        }
    }

    public static int fib(int n) {
        if (n<=1){
            return n;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }
}
