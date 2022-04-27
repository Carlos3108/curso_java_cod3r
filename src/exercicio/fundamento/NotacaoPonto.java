package fundamento;

public class NotacaoPonto {
    public static void main(String[] args) {
        String s = "Bom Dia X";
        s = s.replace("X", "Senhora");
        s = s.toUpperCase();
        s = s.concat("!!!");

        System.out.println(s);

        String x = "Carlos".toUpperCase();
        System.out.println(x);

        String y = "Bom dia X"
            .replace("X", "Carlos")
            .toUpperCase()
            .concat("!!!");
        System.out.println(y);
    }
}