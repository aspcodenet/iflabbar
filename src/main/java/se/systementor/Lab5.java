package se.systementor;

public class Lab5 {
    public void Execute(){
        System.out.println("Mata in ett flyttal");
        float f = Float.parseFloat(System.console().readLine());
    
        if(f == 0){
            System.out.println("Zero");
        }
        else if(f > 0){
            if( f > 1000000)                
                System.out.print("Large ");
            System.out.println("Positive");
        }
        else{
            if( f < 1000000)                
                System.out.print("Large ");
            System.out.println("Negative");
        }
    }
}
