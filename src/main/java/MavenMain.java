import jdk.jshell.execution.Util;
import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;


public class MavenMain extends StringUtils {


    public static void main(String[] args) {
        System.out.println("Please type in something: ");
        Scanner userInput = new Scanner(System.in);
        String input = userInput.nextLine();
        System.out.println(input);
        if (isNumeric(input)){
            System.out.println(input + " is a number.");
        }else {
            System.out.println(input + " is not a number.");
            System.out.println(swapCase(input));
            System.out.println(reverse(input));
        }


    }

}
