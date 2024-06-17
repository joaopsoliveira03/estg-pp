package enumerations;

/** Enumeration of courses */
public enum DegreeEnum {
     /**
     * Enumeration Values
     */
    CTESP, LICENCIATURA, MESTRADO, DOUTORAMENTO, POS_DOUTORAMENTO;
    
     /**
     * Returns a more visual representation of a given degree
     * @param degree - DegreeEnum
     * @return String
     */
    public static String toString(DegreeEnum degree) {
        return switch(degree) {
            case CTESP -> "Curso Técnico Superior Profissional";
            case LICENCIATURA -> "Licenciatura";
            case MESTRADO -> "Mestrado";
            case DOUTORAMENTO -> "Doutoramento";
            case POS_DOUTORAMENTO -> "Pós-Doutoramento";
        };
    }
}
