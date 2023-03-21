public class Vehicle implements Switchable {
    private Motor motor;
    private boolean isSwitchedOn;
    private boolean isSwitchedOff;
    private Light lights;
    private Wiper wipers;
    private AC ac;

    public Vehicle(Motor motor, Light lights, Wiper wipers, AC ac) {
        this.motor = motor;
        this.lights = lights;
        this.wipers = wipers;
        this.ac = ac;
        isSwitchedOff = true;
    }

    @Override
    public void switchOn() {
        if (isSwitchedOn) {
            System.out.println("Vehicle is already switched on.");
            return;
        }
        isSwitchedOn = true;
        isSwitchedOff = false;
        motor.switchOn();
        lights.switchOn();
        wipers.switchOn();
        ac.switchOn();
    }

    @Override
    public void switchOff() {
        if (isSwitchedOff) {
            System.out.println("Vehicle is already switched off.");
            return;
        }
        isSwitchedOn = false;
        isSwitchedOff = true;
        motor.switchOff();
        lights.switchOff();
        wipers.switchOff();
        ac.switchOff();
    }

    
    /** 
     * @return boolean
     */
    @Override
    public boolean isSwitchedOn() {
        return isSwitchedOn;
    }

    @Override
    public boolean isSwitchedOff() {
        return isSwitchedOff;
    }

    public String getStatus() {
        StringBuilder sb = new StringBuilder();
        sb.append("Vehicle status: ");
        if (isSwitchedOn) {
            sb.append("switched on\n");
            sb.append("Motor status: ").append(motor.isSwitchedOn() ? "on\n" : "off\n");
            sb.append("Lights status: ").append(lights.isOn() ? "on\n" : "off\n");
            sb.append("Wipers status: ").append(wipers.isOn() ? "on\n" : "off\n");
            sb.append("AC status: ").append(ac.isOn() ? "on\n" : "off\n");
        } else {
            sb.append("switched off\n");
        }
        return sb.toString();
    }
}
