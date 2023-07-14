public interface ICalculator {


public int add(int a, int b);

public int subtract(int a, int b);

public int multiply(int a, int b);

public int min(int a, int b);
public int crosssum(int a);
}    


public class Calculator implements ICalculator {

public int a
public int b

public int add(int a, int b) 
    System.out.println("ICalculator - add " + a + " und " + b);
    return a + b;
    }

public int subtract(int a, int b) {
    System.out.println("ICalculator - subtract " + a + " und " + b);
    return a - b;
}

public int multiply(int a, int b) {
    System.out.println("ICalculator - multiply " + a + " und " + b);
    return a * b;
}

public int min(int a, int b) {
    System.out.println("ICalculator - min " + a + " und " + b);
    if (a < b)
        return a;
    else
        return b;
}

public int crosssum(int a) {
    System.out.println("ICalculator - crosssum " + a);
    int sum = 0;
    while (0 != a) {
        sum = sum + (a % 10);
        a = a / 10;
    }
    return sum;
}