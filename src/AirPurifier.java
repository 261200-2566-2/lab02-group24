public class AirPurifier {
    // Class variable.
    public static String manufacturer;

    // Instance variables.
    public String model;
    public int roomSize;
    public String filterType;
    public String sensorType;
    public String monitorType;
    public boolean poweredOn;

    // Constructor
    public AirPurifier(String model, int roomSize, String filterType, String sensorType, String monitorType) {
        this.model = model;
        this.roomSize = roomSize;
        this.filterType = filterType;
        this.sensorType = sensorType;
        this.monitorType = monitorType;
        this.poweredOn = false;
        AirPurifier.manufacturer = "Y-Company(Default)";
    }
    public AirPurifier(String model) {

        this(model,50, "DEF123(Default)", "GHI456(Default)", "JKL789(Default)");
    }

    // Instance methods.
    public void turnOn() {
        if (!poweredOn) {
            System.out.println(model + " on");
            poweredOn = true;
        } else {
            System.out.println(model + " already on");
        }
    }
    public void turnOff() {
        if (poweredOn) {
            System.out.println(model + " off.");
            poweredOn = false;
        } else {
            System.out.println(model + " already off.");
        }
    }
    public boolean isPoweredOn() {
        return poweredOn;
    }

    // Class method.
    public static void setDefaultManufacturer(String newManufacturer) {
        manufacturer = newManufacturer;
        System.out.println("manufacturer has set to " + newManufacturer);
    }

    public static void main(String[] args) {
        // For testing
        // Create instance.
        AirPurifier myAirPurifier = new AirPurifier("ABC123");

        // Showing instance variables.
        System.out.println("Model: " + myAirPurifier.model);
        System.out.println("Filter Type: " + myAirPurifier.filterType);
        System.out.println("Sensor Type: " + myAirPurifier.sensorType);
        System.out.println("Monitor Type: " + myAirPurifier.monitorType);

        // Using instance methods.
        System.out.println("Is on? " + myAirPurifier.isPoweredOn());
        myAirPurifier.turnOn();
        myAirPurifier.turnOn();
        System.out.println("Is on? " + myAirPurifier.isPoweredOn());
        myAirPurifier.turnOff();
        myAirPurifier.turnOff();
        System.out.println("Is on? " + myAirPurifier.isPoweredOn());

        // Showing class variables before setDefaultManufacturer.
        System.out.println("Manufacturer: " + AirPurifier.manufacturer);

        // Using class methods.
        AirPurifier.setDefaultManufacturer("Z_Company");

        // Showing class variables.
        System.out.println("Manufacturer: " + AirPurifier.manufacturer);
    }
}


