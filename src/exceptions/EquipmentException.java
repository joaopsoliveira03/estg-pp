package exceptions;

/** Exception related to the Equipment Class */
public class EquipmentException extends Exception {

    /**
     * Constructor
     */
    public EquipmentException() {
    }

    /**
     * Constructor with message
     * @param message custom message
     */
    public EquipmentException(String message) {
        super(message);
    }

    /**
     * Constructor with message and cause
     * @param message custom message
     * @param cause cause
     */
    public EquipmentException(String message, Throwable cause) {
        super(message, cause);
    }

}
