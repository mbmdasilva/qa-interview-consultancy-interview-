package taxcalc;

public class ApplicationException extends RuntimeException {
    //the message thrown when handling the exception
    //We could also get the cause
    //We also get a code for the type of message
    //only implemented message just to show that we can make the application exception class much nicer rather then leaving it empty
    private static final String message = "There is an issue with the tax calculation";


    public ApplicationException() {
        super(message);
    }

    public ApplicationException(String message) {
        super(message);

    }
}