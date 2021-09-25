package se.systementor;

public class Lab1 {
    public void Execute(){
        System.out.println("Mata in tal 1:");
        int tal1 = Integer.parseInt(System.console().readLine());
        System.out.println("Mata in tal 2:");
        int tal2 = Integer.parseInt(System.console().readLine());

        int largest;
        if(tal1 > tal2)
            largest = tal1;
        else
            largest = tal2;

        System.out.println("Det största talet av dessa är " + largest);
    }
}
