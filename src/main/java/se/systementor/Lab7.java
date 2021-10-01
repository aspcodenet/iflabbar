package se.systementor;

public class Lab7 {
    public void execute(){
        System.out.println("Enter height:");
        int height = Integer.parseInt(System.console().readLine());
        System.out.println("Enter width:");
        int width = Integer.parseInt(System.console().readLine());

        for(int row = 0; row < height; row++){
            for(int col = 0; col < height; col++){
                System.out.print("X");
            }
            System.out.println("");
        }


        
    }
}
