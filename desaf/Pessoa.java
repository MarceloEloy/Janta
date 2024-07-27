package desaf;
import desaf.Comida;
import java.util.Scanner;
public class Pessoa {
    String nome;
    int peso;
    int novopeso = 0;
    boolean jantar;

    String comer() {
        Comida z = new Comida(1);
        String x = z.PesoComida;
        return x;
    }

    public static void main(String[] args) {
        Pessoa m = new Pessoa();
        Scanner nome = new Scanner(System.in);
        System.out.printf("Qual o seu nome? %n");
        m.nome = nome.nextLine();
        Scanner pesoInicial = new Scanner(System.in);
        System.out.printf("Quanto você pesa? %n");
        m.peso = pesoInicial.nextInt();
        Scanner jantando = new Scanner(System.in);
        System.out.printf("Quer jantar? %n");
        m.jantar = jantando.nextBoolean();
        m.novopeso = (m.peso + Integer.parseInt(m.comer()) + m.novopeso);
        while (m.jantar == true) {
            System.out.println("Seu peso no inicio " + m.peso + "kg");
            System.out.println("Seua peso antes " +m.novopeso + "kg");
            m.novopeso = (Integer.parseInt(m.comer()) + m.novopeso);
            System.out.println("Seu peso depois " + m.novopeso + "kg");
            System.out.printf("Quer continuar o jantar? %n");
            m.jantar = jantando.nextBoolean();
        }
    }
}
