package by.tms;

public class Calculator {
    private int num1;
    private int num2;
    private String operationType;

    public int run() {
        if (operationType.equals("sum")) {
            return sum(num1, num2);
        } else if (operationType.equals("sub")) {
            return subtraction(num1, num2);
        } else if (operationType.equals("mult")) {
            return multiplication(num1, num2);
        } else if (operationType.equals("div")) {
            return division(num1, num2);
        }
        //todo доработать метод run
        return 0;
    }

    private int sum(int a, int b) {
        return a + b;
    }

    private int subtraction(int a, int b) {
        return a - b;
    }

    private int multiplication(int a, int b) {
        return a * b;
    }

    private int division(int a, int b) {
        return a / b;
    }

    //todo добавить: (-), (*), (/)

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }
}
