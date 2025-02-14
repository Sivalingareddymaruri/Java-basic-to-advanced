class Computer
{
    public void playMusic()    //Method 1
    {
        System.out.println("playing music");
    }
    public String getmeapen(int cost)  //method2 in this we are returning a string so we have to keep string at void place
    {
        if(cost>=10)
            return "pen";
        return "Nothing";
    }
}
 

public class Methods {
    public static void main(String[] args) {
        
        Computer obj = new Computer();
        obj.playMusic();
        String str=obj.getmeapen(10);
        System.out.println(str);
        
    }
    
}
