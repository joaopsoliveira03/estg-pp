package classes;

import enumerations.*;
import exceptions.*;

/**
 * Class responsible for the equipments of the rooms
 */
public class Equipment {

    /**
     * The equipment's ID
     */
    private int id;
    /**
     * The equipment's type
     */
    private EquipmentEnum equipment;


    /**
     * Constructor for the Equipment
     * @param id ID of the Equipment, might not be unique
     * @param equipment enumeration of the type of the Equipment
     */
    public Equipment(int id, EquipmentEnum equipment) {
        this.id = id;
        this.equipment = equipment;
    }
    
    /**
     * Gets the ID of the Equipment
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * Set the ID of the Equipment, if valid
     * @param id
     * @throws EquipmentException - when the ID is a negative number
     */
    public void setId(int id) throws EquipmentException {
        if (id < 0) {
            throw new EquipmentException("ID must be positive");
        }
        this.id = id;
    }

    /**
     * Gets the type of the Equipment
     * @return EquipmentEnum
     */
    public EquipmentEnum getEquipment() {
        return equipment;
    }

    /**
     * Sets the Equipment type, if valid
     * @param equipment EquipmentEnum
     * @throws EquipmentException when the Equipment is null
     */
    public void setEquipment(EquipmentEnum equipment) throws EquipmentException {
        if (equipment == null) {
            throw new EquipmentException("Equipment must be defined");
        }
        this.equipment = equipment;
    }

    /**
     * Compares two equipments, by ID and type of the EquipmentEnum
     * @param obj the equipment to compare with
     * False when:
     * Object is null, or not an object of the Equipment Class
     * True when:
     * It's the same object, or has the same ID and type of the EquipmentEnum
     * @return boolean
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        if (obj == null) return false;

        if (getClass() != obj.getClass()) return false;

        final Equipment other = (Equipment) obj;

        return this.id == other.id;
    }

    /**
     * List the properties of the Equipment
     * @return String
     */
    @Override
    public String toString() {
        return "Equipment{" + "id=" + id + ", equipment=" + equipment + '}';
    }
}
