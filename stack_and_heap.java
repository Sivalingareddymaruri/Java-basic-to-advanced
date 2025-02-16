class calculator
{
    int num;
     public int add(int n1,int n2)
     {
        return n1+n2;
     }
}
public class stack_and_heap {
    public static void main(String[] args) {
        int data=10;
        calculator obj = new calculator();  //obj is reference varaible
        int r1=obj.add(3,4);
        System.out.println(r1);
    }
    
}
