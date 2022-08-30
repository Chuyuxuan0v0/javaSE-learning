package src.top.Study.Class;

public class StaticVerb {
    public static int num;
    public StaticVerb() {

        /*所有被标记为静态的内容，
        会在类刚加载的时候就分配，
        而不是在对象创建的时候分配，
        所以说静态内容一定会在第一个对象初始化之前完成加载*/
        //    例如，下面测试谁先加载完毕
        System.out.println("构造类对象");
    }

    public static int a = test();  //直接调用静态方法，只能调用静态方法

    static int test(){   //静态方法刚加载时就有了
        System.out.println("初始化变量a");
        return 1;
    }


 /*
    代码块在对象创建时执行，也是属于类的内容，
    但是它在构造方法执行之前执行（和成员变量初始值一样），
    且每创建一个对象时，只执行一次！（相当于构造之前的准备工作）
    public class Student {
        {
            System.out.println("我是代码块");
        }
        Student(){
            System.out.println("我是构造方法");
        }
    }
    静态代码块和上面的静态方法和静态变量一样，在类刚加载时就会调用；
    public class Student {
        static int a;
        static {
            a = 10;
        }
        public static void main(String[] args) {
            System.out.println(Student.a);
        }
    }
*/

}
