public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("--Hora 1--");
        Hora hora1 = new Hora(15, 45);
        System.out.println(hora1);
        hora1.sumarMinutos(120);
        System.out.println(hora1);

        System.out.println("--Hora 2--");
        Hora hora2 = new Hora(23,00);
        System.out.println(hora2);
        hora2.sumarHoras(25);
        System.out.println(hora2);

        System.out.println("--Hora 3--");
        Hora hora3 = new Hora(1, 0);
        System.out.println(hora3);
        hora3.sumarHoras(-2);
        System.out.println(hora3);

        System.out.println("-- Hora 4--");
        Hora hora4 = new Hora(0, 0);
        System.out.println(hora4);
        hora4.sumarMinutos(-20);
        System.out.println(hora4);

    }
}
