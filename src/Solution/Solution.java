package Solution;

import static java.lang.System.*;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args)
    {
        // CREATE: Scanner object.
        Scanner keyboard = new Scanner(in);

        try
        {
            // PURPOSE: Prompt the user to enter a password and check if it is correct.

            // ASK: For Password.
            out.print("What is your password: ");
            String password = keyboard.next(); // Read the input

            // DISPLAY: Entered password.
            out.println("Password: " + password);

            // Check if the entered password matches the correct password
            if ("swordfish".equals(password))
            {
                // If the password is correct, grant access
                out.println(
                    """
                    Access granted.
                    Welcome!
                    """
                );
            }
            else
            {
                // If the password is incorrect, deny access
                out.println(
                    """
                    Access denied.
                    Incorrect password.
                    """
                );
            }
        }
        catch (Exception e)
        {
            // Catch any unexpected errors and display an error message
            out.println("An error occurred: " + e.getMessage());
        }
        finally
        {
            // Close the Scanner to free up system resources
            keyboard.close();
        }
    }
}
