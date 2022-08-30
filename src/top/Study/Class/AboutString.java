package src.top.Study.Class;

// 这个章节专门讲String
public class AboutString {
    public static void main(String[] args) {
        String str = "banana";
        String str2 = "banana";
//      System.out.println(str.concat("na"));
/*        String是一个比较特殊的类，
        他是Java中唯一重载运算符的类！ A+B 这个+ 就是重载运算符
        (Java不支持运算符重载，String是特例)*/
//        System.out.println(str.equals(str2));
     /*   大量进行字符串的拼接似乎不太好，编译器是很聪明的，
        String的拼接有可能会被编译器优化为StringBuilder来减少对象创建（对象频繁创建时很费时间同时占内存的！）*/


        StringBuilder Stb = new StringBuilder();
//        StringBuilder 可以链式调用
        Stb
                .append("aaa")
                .append("bbb")
                .append("ccc");

        System.out.println(Stb);   // 输出 aaabbbccc
    }
}
