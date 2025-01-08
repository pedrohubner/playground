package br.com.pedrohubner.valuereference;

public class ValueReferencePlayground {
    public static void main(String[] args) {
        var a = 1;
        var b = 1;

        increasePrimitiveValues(a, b);

        System.out.println("a: " + a);
        System.out.println("b: " + b);

        var numberWrapperA = new NumberWrapper(1);
        var numberWrapperB = new NumberWrapper(1);

        increaseReferenceValues(numberWrapperA, numberWrapperB);

        System.out.println("numberWrapperA: " + numberWrapperA.number);
        System.out.println("numberWrapperB: " + numberWrapperB.number);

        var wrapperA = new NumberWrapper(1);
        var wrapperB = new NumberWrapper(1);

        createAndIncreaseReferenceValues(wrapperA, wrapperB);

        System.out.println("other test numberWrapperA: " + wrapperA.number);
        System.out.println("other test numberWrapperB: " + wrapperB.number);
    }

    public static void increasePrimitiveValues(int a, int b) {
        a = 2;
        b = 2;
    }

    public static void increaseReferenceValues(NumberWrapper a, NumberWrapper b) {
        a.increaseNumber();
        b.increaseNumber();
    }

    public static void createAndIncreaseReferenceValues(NumberWrapper a, NumberWrapper b) {
        a.increaseNumber();
        b = new NumberWrapper(b.number);
        b.increaseNumber();
    }
}

class NumberWrapper {
    int number;

    public NumberWrapper(int number) {
        this.number = number;
    }

    public void increaseNumber() {
        number++;
    }
}
