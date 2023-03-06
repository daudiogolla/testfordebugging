import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Main {
    private static Component frame;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        JOptionPane message = new JOptionPane();
        System.out.println("Guess the Lucky number");

        int i = 0;
        while ( i == 0){
            int x = scanner.nextInt();
            if (x != 54) {
                System.out.println("Not Really");
                System.out.println("Try again");
                continue;
            }else if (x == 54){
                message.showMessageDialog(frame, "Congratulations, 54 is the lucky number",
                        "We have a winner",
                        JOptionPane.PLAIN_MESSAGE);
                break;
            }
        }
    }
}
