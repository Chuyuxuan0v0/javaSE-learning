package Study.Class;

public class Student {
    String name;
    int age;

    void Sing() {
        System.out.println("singers");
    }

    void Eating() {
        System.out.println("eating");
    }

    void About(String mes) {
        System.out.println(name + ":" + mes);
    }

    // 方法重载，也就是一个类里面可以写两个同名方法，不过值不一样
    int GetSum(int a, int b) {
        return a + b;
    }

    double GetSum(double a, double b) {
        return a + b;
    }
}
