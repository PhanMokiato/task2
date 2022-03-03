package by.mokievets.task2;


public class Task2 {
    public static void main(String[] args) {
        String str = "4-7*(-1)";
        if (Expression.checkForMistakes(str)) {
            System.out.println(Expression.solveExpression(str));
        } else {
            System.out.println("Well, this is not an expression");
        }
    }
}
