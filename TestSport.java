
import java.util.*;

public class TestSport {
        public static void main(String[] args) {
                Sport sport, testPolymorphism;
                sport = new Sport();
                OlympicSport olympicFaresPlayer = new OlympicSport("Fares", 2, 10, 6);
                OlympicSport olympicSarahPlayer = new OlympicSport("Sarah", 2, 18, 7);
                Sport myPlayer = new Sport("Bob", 3, 15);
                Sport yourPlayer = new Sport("Irena", 4, 25);
                Scanner input = new Scanner(System.in);
                System.out.print("Enter Name : ");
                sport.name = input.next();
                System.out.print("Enter Number Of Sport Trannig Hours Per Weak : ");
                sport.number_hour = input.nextFloat();
                System.out.print("Enter Number Of Weak Of Sport Traning : ");
                sport.number_week = input.nextInt();
                System.out.print("Enter Cost Of Sport Traning Per Hour: ");
                sport.cost_hour = input.nextInt();
                System.out.println("Info Of My Player : \n\n");

                System.out.println("The Sport Tranning Information Is : " + myPlayer.name +
                                "//" + myPlayer.number_hour
                                + "// "
                                + myPlayer.number_week + "//" + myPlayer.cost_hour + "$");
                System.out.println("Info Of Your Player Player : \n\n");

                System.out.println(
                                "The Sport Tranning Information Is : " + yourPlayer.name + "//" +
                                                yourPlayer.number_hour
                                                + "//"
                                                + yourPlayer.number_week + "//" + yourPlayer.cost_hour + "$");

                System.out.println("New Value of Your Player : \n\n");
                System.out.println(
                                "The Sport Tranning Information Is : " + sport.name + "//" +
                                                sport.number_hour + "//"
                                                + sport.number_week + "//" + sport.cost_hour + "$");
                System.out.println("\n\nInfo Of Object olympicFaresPlayer : ");
                System.out.println(
                                "The Sport Tranning Information Is : " + olympicFaresPlayer.name + "//"
                                                + olympicFaresPlayer.number_hour
                                                + "//"
                                                + olympicFaresPlayer.number_week + "//" + olympicFaresPlayer.cost_hour
                                                + "$" + "//"
                                                + olympicFaresPlayer.cost_pro + "$");
                System.out.println("\n\nInfo Of Object olympicSarahPlayer : : ");
                System.out.println(
                                "The Sport Tranning Information Is : " + olympicSarahPlayer.name + "//"
                                                + olympicSarahPlayer.number_hour
                                                + "//"
                                                + olympicSarahPlayer.number_week + "//" + olympicSarahPlayer.cost_hour
                                                + "$" + "//"
                                                + olympicSarahPlayer.cost_pro + "$");
                float cost_training = olympicFaresPlayer.CalculateCostTraining();
                System.out.println("\n\nAll Information about olympicFaresPlayer : ");
                System.out.println(
                                "Name : " + olympicFaresPlayer.name + "\nNumber Of Week : "
                                                + olympicFaresPlayer.number_hour
                                                + "\nCost Of Hour : "
                                                + olympicFaresPlayer.number_week + "\nCost Hour : "
                                                + olympicFaresPlayer.cost_hour + "$"
                                                + "\nProffesional Cost : "
                                                + olympicFaresPlayer.cost_pro + "$\nCost Of his Olympic Tranining : "
                                                + cost_training + "$");
                System.out.println("\n\nAll Information about olympicSarahPlayer : ");
                float cost_training2 = olympicSarahPlayer.CalculateCostTraining();
                System.out.println(
                                "Name : " + olympicSarahPlayer.name + "\nNumber Of Week : "
                                                + olympicSarahPlayer.number_hour
                                                + "\nCost Of Hour : "
                                                + olympicSarahPlayer.number_week + "\nCost Hour : "
                                                + olympicSarahPlayer.cost_hour + "$"
                                                + "\nProffesional Cost : "
                                                + olympicSarahPlayer.cost_pro + "$\nCost Of his Olympic Tranining : "
                                                + cost_training2 + "$");
                yourPlayer = olympicSarahPlayer;

                System.out.println("Polymorphism : Invoking Subclass method with superclass object refrence: "
                                + yourPlayer.CalculateCostTraining() + "$");
                SportGame refSportGame;
                refSportGame = myPlayer;
                System.out.println(
                                "\nPolymorphism through Abstract Class : Invoking Subclass method CalculateCostTraining() \nwith superclass object refrence from abstract class \ninitialized to the address of myPlayer : "
                                                + refSportGame.CalculateCostTraining());
                refSportGame = olympicFaresPlayer;
                System.out.println(
                                "\nPolymorphism through Abstract Class : Invoking Subclass method CalculateCostTraining() \nwith superclass object refrence from abstract class\ninitialized to the address of olympicFaresPlayer : "
                                                + refSportGame.CalculateCostTraining());
                System.out.println("\nCalling the method defind in SecoundarySport SumPro returns : "
                                + olympicSarahPlayer.cost_pro());

                System.out.println("\nUsing Composition the Equipment Title : "
                                + olympicFaresPlayer.equipment.setEqui_Title("Apparatus For Body Building"));

        }

}
