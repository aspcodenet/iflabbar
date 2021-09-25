package se.systementor;

public class Lab4 {
    public void Execute(){
        System.out.println("Skriv in veckodag som nummer (1 betyder måndag...7 betyder söndag)");
        int veckoDagNr = Integer.parseInt( System.console().readLine() );
        String dayName;

        switch(veckoDagNr){
            case 1:
                dayName = "Måndag";
                break;
            case 2:
                dayName = "Tisdag";
                break;
            case 3:
                dayName = "Onsdag";
                break;
            case 4:
                dayName = "Torsdag";
                break;
            case 5:
                dayName = "Fredag";
                break;
            case 6:
                dayName = "Lördag";
                break;
            case 7:
                dayName = "Söndag";
                break;
            default:
                dayName = "Hrmm ogiltig dag!";
                break;

        }

        System.out.println("Dagen du valde är:" + dayName);

        
    }
    
}
