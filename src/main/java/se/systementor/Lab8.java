package se.systementor;

public class Lab8 {
    public void Execute(){
        System.out.print("Hur gammal är du:");
        int age = Integer.parseInt( System.console().readLine() );
        System.out.print("Var är du? K eller S");
        String locS = System.console().readLine();
        char loc = locS.charAt(0);

        System.out.print("Vilken promillehalt har du?");
        float promille = Float.parseFloat( System.console().readLine() );

        boolean canBuyBeer;
        if(promille > 1.0){
            canBuyBeer = false;
        }
        else{
            if(loc == 'K' && age >=20){
                canBuyBeer = true;
            }                
            else if(loc == 'S' && age >=18){
                canBuyBeer = true;
            }                
            else
                canBuyBeer = false;
        }
        System.out.print("Resultat:");
        if(canBuyBeer)
            System.out.println("Ja");
        else
            System.out.println("Nej");


    }
}
