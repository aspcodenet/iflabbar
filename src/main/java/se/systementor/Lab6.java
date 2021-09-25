package se.systementor;

public class Lab6 {
    public void Execute(){
        System.out.println("Mata in en bokstav");
        String s = System.console().readLine();
        boolean isVowel = false;
        if(s.length() > 1)
            System.out.println("Bara ett tecken tillåts");
        else{
            char ch = s.charAt(0);
            if(ch == 'a' || ch == 'o' || ch == 'u' || ch == 'å' || ch == 'e' || ch == 'i' || ch == 'y' || ch == 'ä' || ch == 'ö'){
                isVowel = true;
            }
        }

        if(isVowel)
            System.out.println("Det är en vokal");
        else
            System.out.println("Det är inte en vokal");
        
    }
}
