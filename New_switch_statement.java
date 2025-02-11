public class New_switch_statement {
    public static void main(String[] args) {
        String day="sunday";
        String result="";
        switch(day){
            case "sunday","saturday" ->result="6am";
            case "monday" ->result="8am";
            default ->result="7am";
       

        } 
        System.out.println(result);  
     }
    
}
