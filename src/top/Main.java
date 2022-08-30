package src.top;
//这里会自动帮你引入进来，所属哪个类

import src.top.tools.test01;

public class Main {
    /*为什么这里可以直接使用String呢？因为
    Java默认为我们导入了以下的包，不需要去声明
    java.lang.**/

    static String ab = "text_new_string";



/*    静态导入可以直接导入某个类的静态方法或者是静态变量，导入后，相当于这个方法或是类在定义在当前类中，可以直接调用该方法
    import static com.test.ui.Student.test;
    public class Main {
        public static void main(String[] args) {
            test();
        }
    }
    静态导入不会进行类的初始化！*/
    private static int a;

   static int sumdatas(int b){
        a = 10;
        return a+b;
    }
public static void main(String[] args) {
    test01 ts = new test01();
    System.out.println("Hello World!" + "_____" + ab);
    System.out.println(sumdatas(20));
}

}
