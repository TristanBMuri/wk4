public class AC implements Switchable {

    private boolean isOn;

    
    /** 
     * @return boolean
     */
    public boolean isOn() {
        return isOn;
    }

    @Override
    public void switchOn() {
        isOn = true;
        System.out.println("AC turned on.");
    }

    @Override
    public void switchOff() {
        isOn = false;
        System.out.println("AC turned off.");
    }

    @Override
    public boolean isSwitchedOn() {
        return isOn;
    }

    @Override
    public boolean isSwitchedOff() {
        return !isOn;
    }
}
