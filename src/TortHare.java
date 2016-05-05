
import java.util.Random;


public class Final {
    public static int hare = 1;
    public static int tort = 1;
    public static Random move = new Random();
    
    public static void main(String[] args) {
              
        System.out.println("BANG!!");
        System.out.println("AND THEY'RE OFF!");
        while(tort < 70 && hare < 70){
            tort();
            hare();
            raceTrack();
            System.out.println("");
                    
    }
    if (tort > hare){
        System.out.println("\n TORTOISE WINS!!! YAY!!!");
    }
    if (hare > tort){
        System.out.println("\n Hare wins. Yuch.");
    }
    if(hare >= 70 && tort >= 70){
        System.out.println("\n It's a tie.");
    }
    }
    public static void tort(){
        int Move = move.nextInt(10)+1;
        if(Move >= 1 && Move <= 5){
            tort+=3;
        }
        if(Move >= 6 && Move <= 7){
            tort-=6;
        }
        if(Move >= 8 && Move <= 10){
            tort+=1;
        }
        if(tort < 1){
            tort = 1;
        }
    }
    public static void hare(){
        int Move = move.nextInt(10)+1;
        if(Move >= 1 && Move <= 2){
            hare=hare;
        }
        if(Move >= 3 && Move <= 4){
            hare+=9;
        }
        if(Move == 5){
            hare-=12;
        }
        if(Move >= 6 && Move <= 8){
            hare+=1;
        }
        if(Move >= 9 && Move <= 10){
            hare-=2;
        }
        if(hare < 1){
            hare = 1;
        }
    }
    public static void raceTrack(){
        for(int i = 1; i<= 70; i++){
            if(i == tort && i == hare){
                System.out.print("OUCH");
            }
            else if(i == hare){
                System.out.print("H");
            }
            else if(i == tort){
                System.out.print("T");
            }
            else{
                System.out.print("~");
            }
        }
            
    }
}
