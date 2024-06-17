package exceptions;

/** Exception related to the Topic Class */
public class TopicException extends Exception {

    /**
     * Constructor
     */
    public TopicException() {
    }

    /**
     * Constructor with message
     * @param message custom message
     */
    public TopicException(String message) {
        super(message);
    }

    /**
     * Constructor with message
     * @param message custom message
     * @param cause cause
     */
    public TopicException(String message, Throwable cause) {
        super(message, cause);
    }
}
