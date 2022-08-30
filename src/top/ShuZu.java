package src.top;
// 数组也是一个类
      /*类型[] 变量名称 = new 类型[数组大小];
        类型 变量名称n = new 类型[数组大小];  //支持C语言样式，但不推荐！

        类型[] 变量名称 = new 类型[]{...};  //静态初始化（直接指定值和大小）
        类型[] 变量名称 = {...};   //同上，但是只能在定义时赋值
        */


public class ShuZu {
    static int[] arr = new int[20]; // 这里先声明20个空间
    static int[] arr2 = new int[]{1, 2, 3, 4, 5, 6}; // 或者直接给里面输入值 ，静态初始化
    static int[] arr3 = {4,3,5,6,7,8,9};
    static String[] arr4 = new String[10];
    int[] arr5 = new int[]{1,2,3,4,5};


    //    数组有自己的成员变量，也有自己的成员方法
    public static void main(String[] args) {
//        System.out.println(arr.length);   //数组有成员变量！
//        System.out.println(arr2.toString());   //数组有成员方法！
//        System.out.println(arr3[0]);
//        System.out.println(arr4[0]);   // null
        //数组在创建时，就固定长度，不可更改！访问超出数组长度的内容，会出现错误！


//forEach 循环遍历数组
        for (int item: arr3) {
            System.out.println(item);
        }

    }

}
