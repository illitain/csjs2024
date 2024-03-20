package ru.croc.javaschool2024.surname.task4.tests;

import org.testng.annotations.Test;
import ru.croc.javaschool2024.surname.task4.Task4;

import java.util.Objects;

public class Task4Test {

    @Test
    public void defaultTest() {
        String input = """
                /*
                 * My first ever program in Java!
                 */
                class Hello { // class body starts here
                 
                  /* main method */
                  public static void main(String[] args/* we put command line arguments here*/) {
                    // this line prints my first greeting to the screen
                    System.out.println("Hi!"); // :)
                  }
                } // the end
                // to be continued...
                """;
        String expectedRes = """
                class Hello { 
                 
                 
                  public static void main(String[] args) {
                   
                    System.out.println("Hi!");
                  }
                }""";
        assert testCommentRemoving(input, expectedRes);
    }

    private boolean testCommentRemoving(String input, String expectedOutput) {
        String res = Task4.removeJavaComments(input);
        System.out.println(res);
        return Objects.equals(expectedOutput, res);
    }
}