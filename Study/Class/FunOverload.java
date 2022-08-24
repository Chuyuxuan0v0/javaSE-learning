package Study.Class;

public class FunOverload {
   public void a(int i){
        System.out.println("调用了int");
    }

    public void a(short i){
        System.out.println("调用了short");
    }

    public void a(long i){
        System.out.println("调用了long");
    }

    public void a(char i){
        System.out.println("调用了char");
    }

    public void a(double i){
        System.out.println("调用了double");
    }

    public void a(float i){
        System.out.println("调用了float");
    }
}
