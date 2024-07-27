package desaf;

public class Comida {
    String Comida;
    String PesoComida;

    Comida(int x) {
        switch (x) {
            case 1:
                this.Comida = "Caldo de feijao";
                this.PesoComida = "3";
                break;
            case 2:
                this.Comida = "Joelho";
                this.PesoComida = "8";
                break;
            case 3:
                this.Comida = "Fava";
                this.PesoComida = "5";
                break;
            case 4:
                this.Comida = "Frango";
                this.PesoComida = "10";
                break;
        }
    }
}
