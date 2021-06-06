public class Exercise20 {
    public static int f(int a){
        if(a==1) return 0;
        return (int) (Math.log(a) + f(a-1));
    }

    public static void main(String[] args) {
        System.out.println(f(100));
    }
}
