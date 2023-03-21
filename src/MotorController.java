public class MotorController {
    
    private Motor motor;
    
    public MotorController(Motor motor) {
        this.motor = motor;
    }
    
    public void turnOn() {
        motor.switchOn();
    }
    
    public void turnOff() {
        motor.switchOff();
    }
    
    
    /** 
     * @param speed
     */
    public void setSpeed(int speed) {
        motor.setSpeed(speed);
    }
    
    public void setDirection(Direction direction) {
        motor.setDirection(direction);
    }
    
    public void applyBrake() {
        motor.brake();
    }
    
    public void slowDown() {
        motor.slowDown();
    }
    
    public void goBackward() {
        motor.goBackward();
    }
    
    public void run(long time) {
        turnOn();
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        applyBrake();
        turnOff();
    }
}
