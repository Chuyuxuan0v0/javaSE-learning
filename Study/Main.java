package Study;

import Study.Class.FunOverload;

public class Main {
    public static void main(String[] args) {

        //  byte 8个bit , 1个字节 , ===> 8(bit) = 1(Byte) ===> 8b = 1B
        byte _tmp1 = 127;
        // short 短整型 16bit， 2个字节。
        short _tmp2 = 3334;
        // int 32个bit , 4个字节 ,  32b = 4B
        int _tmp3 = 439475;
        // 长整形 long ,64bit , 8个字节 ,
        long _tmp4 = 483943353;
        // char  字符型， 16bit, 2个字节, 不带符号！， 0～65536  unicode  所以可以用中文来表示变量 。注意，是单引号。
        char M = 'G';

        // ⚠️ String 是一个类，并不是一个基本类型！ 用双引号表示。
        String Terms = "你不是一个人";
        // 字符'1'，表示的是ascii 码上的字符，有一个一一映射的关系。
        // float 小数类型
        /*  System.out.println(Terms);
         * System.out.println("hello World!");
          System.out.println("Test");

        Study.Class.Student student = new Study.Class.Student();
        student.Sing();
        student.Eating();
        student.name = "sites";
        student.About("haha");
        */
        /* ===========================函数重载=========================== */
        FunOverload test = new FunOverload();
        test.a(1);   //直接输入整数
        test.a(1.0);  //直接输入小数
        short s = 2;
        test.a(s);  //会对号入座吗？
        test.a(1.0F);
    }
}
