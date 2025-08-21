public class InverterEX {
    /* Crie um método recursivo para inverter uma String.
    Por exemplo, ao receber a String "carro", deverá retornar "orrac".*/
    public static void main(String[] args) {
        String str = "carro";
        String inversa = inverter(str);
        System.out.println(inversa);
    }
    public static String inverter(String str) {
        if (str.isEmpty()) {
            return "";
        }
        return inverter(str.substring(1)) + str.charAt(0);
    }
}
