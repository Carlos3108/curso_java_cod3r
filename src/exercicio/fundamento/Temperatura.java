package fundamento;

public class Temperatura {
    public static void main(String[] args) {
        final int n1 = 32;
        final double n2 = 5.0/9.0;
        double F =  86;
        double C = (F-n1) * n2;
        System.out.println(C + "°C");
    }
}
//(ºF - 32)*5/9 = ºC