package se.systementor;

public class Lab7 {
    public void execute(){
        
        System.out.println("Enter money:");
        float money = Float.parseFloat(System.console().readLine());
        System.out.println("Har du rabatt (J)?");
        
        boolean rabatt = false;
        if(System.console().readLine().charAt(0) == 'J')
            rabatt = true;

        if(money > 15 && money < 25 && rabatt == false)
            System.out.println("Du kan köpa en liten hamburgare.");
        else if(money > 15 && money < 25 && rabatt)
            System.out.println("Du kan köpa en liten hamburgare och en pommes frites.");
        else if(money > 25 && money <= 50 && rabatt == false)
            System.out.println("Du kan köpa en stor hamburgare.");
        else if(money > 25 && money <= 50 && rabatt)
            System.out.println("Du kan köpa en stor hamburgare och en pommes frites.");
        else if( money > 60 || ( money >= 50 && money <= 60 && rabatt ) )            
            System.out.println("Du kan köpa ett meal med dryck");
    }
}
