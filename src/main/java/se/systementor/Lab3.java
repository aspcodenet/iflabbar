package se.systementor;

public class Lab3 {
    public void Execute(){
        System.out.println("Skriv in veckodag som nummer (1 betyder måndag...7 betyder söndag)");
        int veckoDagNr = Integer.parseInt( System.console().readLine() );
        String dayName;
        if(veckoDagNr == 1)
            dayName = "Måndag";
        else if(veckoDagNr == 2)
            dayName = "Tisdag";
        else if(veckoDagNr == 3)
            dayName = "Onsdag";
        else if(veckoDagNr == 4)
            dayName = "Torsdag";
        else if(veckoDagNr == 5)
            dayName = "Fredag";
        else if(veckoDagNr == 6)
            dayName = "Lördag";
        else if(veckoDagNr == 7)
            dayName = "Söndag";
        else
            dayName = "Hrmm ogiltig dag!";

        System.out.println("Dagen du valde är:" + dayName);

        
    }
}
