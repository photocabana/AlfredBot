import java.util.Date;
public class AlfredQuotes {

    public String basicGreeting() {
        return "Hello, Batman. How are you?";
    }


    public String guestGreeting(String name, String dayPeriod) {
        return String.format("Good %s, %s. Nice to see you agian.", dayPeriod, name);
    }


    public String dateAnnouncement() {
        return String.format("It is currently %s", new Date());
    }


    public String respondBeforeAlexis(String phrase) {
        
        if(phrase.indexOf("Alexis") > -1) {
            return "Some people are just not helpful. What can I help with?";
        }

        if(phrase.indexOf("Alfred") > -1) {
            return "I'm here, how can I help?";
        }

        return "I'm going to bed. I will return at a later time.";
    }


	// NINJA BONUS
	// See the specs to overload the guestGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}

