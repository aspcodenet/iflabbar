package se.systementor;

public class Lab2 {
    public void Execute(){
        System.out.println("Mata in tal 1:");
        int tal1 = Integer.parseInt(System.console().readLine());
        System.out.println("Mata in tal 2:");
        int tal2 = Integer.parseInt(System.console().readLine());
        System.out.println("Mata in tal 3:");
        int tal3 = Integer.parseInt(System.console().readLine());

        int largest;
        if(tal1 > tal2){
            if(tal1 > tal3)                
                largest = tal1;
            else
                largest = tal3;
        }
        else{
            if(tal2 > tal3)                
                largest = tal2;
            else
                largest = tal3;
        }
            

        System.out.println("Det största talet av dessa är " + largest);
    }
    
}
