public class NameLength {
    public static void main (String[] args) {
        // Declare your variables
        String firstName = "Guadalupe";
        String lastName = new String("Pe\u00F1a");

        int lengthOfFirstName = firstName.length();
        int lengthOfLastName = lastName.length();

        System.out.println("The total length of my first and last name put together is " + (lengthOfFirstName + lengthOfLastName));
        }
    }