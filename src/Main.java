public class Main {
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        Motor superMotor = new Motor(0);
        MotorController controller = new MotorController(superMotor);
        
        controller.setSpeed(50);
        controller.setDirection(Direction.FORWARD);
        controller.run(2000);
        
        controller.setDirection(Direction.BACKWARD);
        controller.run(2000);

        // Create the required objects
        Motor motor = new Motor(0);
        Light lights = new Light();
        Wiper wipers = new Wiper();
        AC ac = new AC();

        // Create a vehicle object
        Vehicle vehicle = new Vehicle(motor, lights, wipers, ac);

        // Test switching on the vehicle
        vehicle.switchOn();
        System.out.println(vehicle.getStatus());
        assert vehicle.isSwitchedOn();
        assert !vehicle.isSwitchedOff();
        assert motor.isSwitchedOn();
        assert lights.isOn();
        assert wipers.isOn();
        assert ac.isOn();

        // Test switching off the vehicle
        vehicle.switchOff();
        System.out.println(vehicle.getStatus());
        assert !vehicle.isSwitchedOn();
        assert vehicle.isSwitchedOff();
        assert motor.isSwitchedOff();
        assert !lights.isOn();
        assert !wipers.isOn();
        assert !ac.isOn();
    }
}