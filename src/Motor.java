public class Motor implements Switchable {
    
    private boolean switchedOn;
    private int speed;
    private double current;
    private int maxSpeed;
    private Direction direction;
    
    public Motor(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    
    @Override
    public void switchOn() {
        this.switchedOn = true;
        System.out.println("Motor is now switched on.");
    }
    
    @Override
    public void switchOff() {
        this.switchedOn = false;
        System.out.println("Motor is now switched off.");
    }
    
    
    /** 
     * @return boolean
     */
    @Override
    public boolean isSwitchedOn() {
        return this.switchedOn;
    }
    
    @Override
    public boolean isSwitchedOff() {
        return !this.switchedOn;
    }

    public String getStatus() {
        StringBuilder sb = new StringBuilder();
        sb.append("Motor status: ");
        if (switchedOn) {
            sb.append("switched on\n");
            sb.append("Speed: ").append(speed).append("\n");
            sb.append("Direction: ").append(direction.toString()).append("\n");
        } else {
            sb.append("switched off\n");
        }
        return sb.toString();
    }
    
    
    public void setSpeed(int speed) {
        if (speed <= maxSpeed) {
            this.speed = speed;
        } else {
            System.out.println("Speed exceeds max speed.");
        }
    }
    
    public int getSpeed() {
        return this.speed;
    }
    
    public double getCurrent() {
        return this.current;
    }
    
    public int getMaxSpeed() {
        return this.maxSpeed;
    }
    
    public void setDirection(Direction direction) {
        this.direction = direction;
    }
    
    public void brake() {
        speed = 0;
    }
    
    public void slowDown() {
        if (speed > 0) {
            speed--;
        }
    }
    
    public void goBackward() {
        setDirection(Direction.BACKWARD);
    }
}
