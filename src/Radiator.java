public class Radiator {
    char[] color;
    double weight;
    int power;

    //po co tutaj to przypisujemy?
    Radiator(char[] color, double weight, int power) {
        this.color = color;
        this.weight = weight;
        this.power = power;
    }

    // czy w metodzie zawsze nazwy pól?
    void display() {
        System.out.println("----------------");
        System.out.print("Colour: ");
        for (char c : color) {
            System.out.print(c);

        }
        System.out.println();
        System.out.println("Weight: " + weight);
        System.out.println("Power: " + power + "W");
    }

    double powerInKwh() {
//        zrobiłem rzutowanie (double)
        return (double)power / 1000;
    }

}
