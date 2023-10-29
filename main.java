import recommendation.recommendation;
import rating.rating;
import java.util.Scanner;


public class main {
    public static void main(String[] args) throws Exception {
        // String rate, choice;
        Scanner scn =  new Scanner(System.in);
        System.out.println("-----------Movie Recommendation System-----------");
        System.out.println("Do you want recommendations based\n1. Genre\n2. Ratings");
        int option= scn.nextInt();
        if(option==1){
            Scanner g =  new Scanner(System.in);
            System.out.println("What genre do you want recommendations on? ");
            String gen=g.nextLine();
            recommendation.getRecs(gen);
        }
        else if(option==2){
            String rate= scn.nextLine();
            rating.getRatings(rate);
        }
        else {
            System.out.println("Invalid choice. Please choose GENRE or RATINGS.");
        }
    }
}