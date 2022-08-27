package Study.Class;
public class Constructors {
    public String name;
    public int Ages;
//   public Constructors(){
//        name = "哈哈";
//    }
    // 下面这个是自己定义形参,并且吧自己定义的形参赋值给类部参数
    public Constructors(String str){
       name = str;
    }

    // 当然，同名的输入参数，可以用this来指代，this指代的是当前对象
    public Constructors(int Ages){
       this.Ages = Ages;
    }



    // 当然这里可以使用idea 快速生成，command +N
    // 定义了新的有参构造之后，默认的无参构造会被覆盖！

//     成员变量的初始化始终在构造方法执行之前


  /*  String a = "sadasa";

    public Constructors(){
        System.out.println(a);
    }*/


}
