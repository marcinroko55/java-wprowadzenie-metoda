public class Main {
    public static void main(String[] args) {
        char[] red = {'r', 'e', 'd'};
        char[] blue = {'b', 'l', 'u', 'e'};
        char[] silver = {'s', 'i', 'l', 'v', 'e', 'r'};
        Radiator r1 = new Radiator(red, 55, 1025);
        Radiator r2 = new Radiator(blue, 120, 5105);
        Radiator r3 = new Radiator(silver, 15, 250);

        Radiator[] radiators = new Radiator[3];
        radiators[0] = r1;
        radiators[1] = r2;
        radiators[2] = r3;

        for (Radiator r : radiators) {
            r.display();
        }
        radiators[1].weight = 119;
        radiators[1].display();
        double powerInKwh = radiators[1].powerInKwh();
        System.out.println("Power kWh: " + powerInKwh +"kWh");
        if(powerInKwh >=5) {
            System.out.println("High-power radiator.");
        }else {
            System.out.println("Low-power radiator ");
        }

    }
}
