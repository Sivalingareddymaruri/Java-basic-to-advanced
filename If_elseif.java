public class If_elseif {
    public static void main(String[] args) {
        int x=5;
        int y=6;
        int z=7;

        if(x>y && x>z)
            System.out.println("x is greater than y,z");
        else if(y>x && y>z)
            System.out.println("y is greater than x,z");
        else
            System.out.println("z is greater than x,y");
        

    }
}
