/**
 * The Switchable interface defines a contract for objects that can be switched on and off.
 */
public interface Switchable {
    
    /**
     * Switches the object on.
     */
    void switchOn();
    
    /**
     * Switches the object off.
     */
    void switchOff();
    
    /**
     * Returns whether the object is currently switched on.
     *
     * @return true if the object is switched on, false otherwise.
     */
    boolean isSwitchedOn();
    
    /**
     * Returns whether the object is currently switched off.
     *
     * @return true if the object is switched off, false otherwise.
     */
    boolean isSwitchedOff();
    
}
