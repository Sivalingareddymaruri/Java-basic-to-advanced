class Calculator{
    public int add(int n1,int n2,int n3){
        return n1+n2+n3;
    }
    public int add(int n1,int n2){ // Here the return type matters so the method will not be overloading
        return n1+n2;
    }
    public double add(double n1,double n2){
        return n1+n2;
    }

}
public class Method_overloading {
    public static void main(String[] args) {
        Calculator obj = new Calculator();{
            int r1=obj.add(4,5,6);
            System.out.println(r1);
        }

        
    }
    
}
