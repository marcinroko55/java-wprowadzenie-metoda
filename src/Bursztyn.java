public class Bursztyn {
    String nazwa;
    String barwa;
    double twardość;
    double gęstość;
    double temperaturaTopnienia;

    Bursztyn(String nazwa, String barwa, double twardość, double gęstość, double temperaturaTopnienia) {
        this.nazwa = nazwa;
        this.barwa = barwa;
        this.twardość = twardość;
        this.gęstość = gęstość;
        this.temperaturaTopnienia = temperaturaTopnienia;
    }

    void wyświetlTemperaturęTopnieniaWFahrenheitach() {
        System.out.println("Temperatura " + nazwa + " topnienia w F wynosi: " + (temperaturaTopnienia * 1.8 + 32));
    }

    double zwiększWartośćGęstościBursztynu(double wartośćOKtórąZwiększamy) {
        gęstość = wartośćOKtórąZwiększamy + gęstość;
        return gęstość;
    }

}
