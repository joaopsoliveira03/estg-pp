package enumerations;

/** Enumeration of equipments */
public enum EquipmentEnum {
    /**
     * Enumeration Values
     */
    COMPUTER, PROJECTOR, MOBILE_PHONE, LASER_POINTER;
    
     /**
     * Returns a more visual representation of a given course
     * @param equip - EquipmentEnum
     * @return String
     */
    public static String toString(EquipmentEnum equip) {
        return switch(equip) {
            case COMPUTER -> "Computer";
            case PROJECTOR -> "Projector";
            case MOBILE_PHONE -> "Mobile Phone";
            case LASER_POINTER -> "Laser Pointer";
        };
    }

}
