public class BursztynApp {
    public static void main(String[] args) {
        Bursztyn bursztyn1 = new Bursztyn("Bursztyn1", "Pomarańczowy", 10, 0.6, 900);
        Bursztyn bursztyn2 = new Bursztyn("Bursztyn2", "Czerwony", 15, 0.3, 960);
        Bursztyn bursztyn3 = new Bursztyn("Bursztyn3", "Czarny", 16, 0.2, 700);
        Bursztyn bursztyn4 = new Bursztyn("Bursztyn4", "Zielonyy", 19, 0.1, 400);

        bursztyn1.wyświetlTemperaturęTopnieniaWFahrenheitach();
        bursztyn2.wyświetlTemperaturęTopnieniaWFahrenheitach();
        bursztyn3.wyświetlTemperaturęTopnieniaWFahrenheitach();
        bursztyn4.wyświetlTemperaturęTopnieniaWFahrenheitach();

        bursztyn1.zwiększWartośćGęstościBursztynu(0.6);
        System.out.println("Zwiększona Gęstość Bursztynu1 wynosi: " + bursztyn1.gęstość);
    }
}
