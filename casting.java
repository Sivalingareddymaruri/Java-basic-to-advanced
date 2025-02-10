public class casting {
    public static void main(String a[]) {
        byte b=127;
        int c=257;
        //It will convert the integer by doing modular 256%257
        byte d=127;
        int e=d;
        b=(byte)c;
        int result=c*b;
        System.out.println(result);
        System.out.println(b);
        System.out.println(e);
    }
}