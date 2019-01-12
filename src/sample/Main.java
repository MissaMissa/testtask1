package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Scanner;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }
    public static void main(String[] args) {
        System.out.println("Hello, this is test task №1\n");
        System.out.println("This is a program that by the number of squares n to be constructed," +
                " finds the minimum number of matches required for this.");
        for (int i=0; i<10; i++) {
            mthd();
            rep();
        }
    }
        public static void rep() {
                Scanner tryAgain = new Scanner(System.in);
                System.out.println("If You want to repeat - type Y/y \nIf not you can type any symbol");
                if ((tryAgain.next().equals("y")) || (tryAgain.next().equals("Y"))) {
                    mthd();
                } else System.exit(0);
        }
        public static void mthd() {
            System.out.println("\nPlease input amount of squares");
            Scanner sс = new Scanner(System.in);
            double matches;
            int squareCount = sс.nextInt();
                if (squareCount < Math.pow(10, 9) && (squareCount > 1)) {
                    // "aa" number we need for building big square and add or minus other stuff
                    //Before we start we need to rounded result
                    double aa = Math.sqrt(squareCount);
                    double a = Math.round(aa);
                    if (a < aa) {
                        matches = (a * 4) + ((squareCount - a) * 2) + 1;
                    } else {
                        matches = (a * 4) + ((squareCount - a) * 2);
                    }
                    System.out.println("For building " + squareCount + " squares you need: \n__________________________");
                    System.out.print(String.format("%8.0f",matches, " matches"));
                    System.out.println(" matches\n__________________________");
                    } else {
                    System.out.println("OOops! We sorry, something go wrong...");
                    System.exit(0);
                }
        }
}




