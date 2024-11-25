//Lib
import java.util.Random;
import java.util.Scanner;
import java.lang.Math;
import java.util.random.RandomGenerator;

class QOTD
{
    public static void main(String args[])
    {

    //Creating instances of Library Class
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();

        int a = 0;
        boolean showSystemProperties = false;

    //Motivation!
    System.out.println("\n\nHello There!\nQuotes are a great way to motivate us!");
    System.out.println("They help inspire us to become better versions of ourselves," +
            " and look up when things aren't going our way.");

    //Input
    System.out.println();
    System.out.println("Saying that, how many quotes would you like to see now?");
    System.out.println("Let's limit it to a maximum of 3 so you can understand them better.");
    int num = sc.nextInt();

    //Stops User Input Error
    if (num > 3)
    {
        System.out.println("Please enter a number less than or equal to 3.");
        num = sc.nextInt();
    }


    //Random Quote Selector
    for (int i = 0; i < num; i++)
    {
        a = rand.nextInt(16)+1;
        //System.out.println(a); USED FOR DEBUGGING

    //Quote Library
    switch (a)
        {

        case 1:
            System.out.println("Be yourself everyone else is already taken.");
            System.out.println("Oscar Wilde\n\n");
            break;
        case 2:
            System.out.println("You know you're in love when you can't fall asleep because reality is finally better than your dreams.");
            System.out.println("Dr. Seuss\n\n");
            break;
        case 3:
            System.out.println("Be the change that you wish to see in the world.");
            System.out.println("Mahatma Gandhi\n\n");
            break;
        case 4:
            System.out.println("In three words I can sum up everything I've learned about life: it goes on.");
            System.out.println("Robert Frost\n\n");
            break;
        case 5:
            System.out.println("If you tell the truth, you don't have to remember anything");
            System.out.println("Mark Twain\n\n");
            break;
        case 6:
            System.out.println("I've learned that people will forget what you said, people will forget what you did," +
                    " but people will never forget how you made them feel");
            System.out.println("Maya Angelou\n\n");
            break;
        case 7:
            System.out.println("To live is the rarest thing in the world. Most people exist, that is all.");
            System.out.println("Oscar Wilde\n\n");
            break;
        case 8:
            System.out.println("Always forgive your enemies; nothing annoys them so much.");
            System.out.println("Oscar Wilde\n\n");
            break;
        case 9:
            System.out.println("Darkness cannot drive out darkness: only light can do that. Hate cannot drive out hate: only love can do that.");
            System.out.println("Martin Luther King Jr\n\n");
            break;
        case 10:
            System.out.println("Live as if you were to die tomorrow. Learn as if you were to live forever.");
            System.out.println("Mahatma Gandhi\n\n");
            break;
        case 11:
            System.out.println("We accept the love we think we deserve.");
            System.out.println("Stephen Chbosky\n\n");
            break;
        case 12:
            System.out.println("To be yourself in a world that is constantly trying to make you something else is the greatest accomplishment.");
            System.out.println("Ralph Waldo Emerson\n\n");
            break;
        case 13:
            System.out.println("Here's to the crazy ones. The misfits. The rebels. The troublemakers. The round pegs in the square holes.\n" +
                    " The ones who see things differently. They're not fond of rules. And they have no respect for the status quo.\n" +
                    " You can quote them, disagree with them, glorify or vilify them. About the only thing you can't do is ignore them.\n" +
                    " Because they change things. They push the human race forward. And while some may see them as the crazy ones,\n" +
                    " we see genius. Because the people who are crazy enough to think they can change the world, are the ones who do.");
            System.out.println("Steve Jobs\n\n");
            break;
        case 14:
            System.out.println("It is better to be hated for what you are than to be loved for what you are not.");
            System.out.println("Andre Gide\n\n");
            break;
        case 15:
            System.out.println("Twenty years from now you will be more disappointed by the things that you didn't do than by the ones you did do.\n" +
                    " So throw off the bowlines. Sail away from the safe harbor. Catch the trade winds in your sails. Explore. Dream. Discover.");
            System.out.println("Horace Jackson Brown Jr.\n\n");
            break;
        }
    }

    System.out.println("\n\n\nI Hope That Makes Your Day Better!\n Happy Hacking!");

        showSystemProperties = true;


        if (showSystemProperties)
        {
            System.out.println("\n\n\n");
            System.out.println("Java Version: " + System.getProperty("java.version") + " by " + System.getProperty("java.vendor"));
            System.out.println("User: " + System.getProperty("user.name"));  //<-- TURNED OFF FOR PRIVACY IN THE VIDEO
            System.out.print("Operating System: " + System.getProperty("os.name"));
            System.out.println(" " + System.getProperty("os.version"));
            System.out.println ("By: Blu");
            System.out.println ("Coded for Hack Club High Seas on November 25th 2024");
        }

    }
}