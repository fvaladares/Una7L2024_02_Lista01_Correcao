
public class Ponto {
    private double x; // Coordenada X
    private double y; // Coordenada Y

    // Construtor da classe
    public Ponto(double x,
                 double y) {
        this.x = x;
        this.y = y;
    }

    public double calcularDistanciaParaPonto2(Ponto ponto2) {
        double distancia;

        distancia = Math.sqrt(
                Math.pow((this.x - ponto2.x), 2) +
                        Math.pow((this.y - ponto2.y), 2)
        );

        return distancia;
    }

    @Override
    public String toString() {
        return "Ponto(" +
                x +
                ", " + y +
                ')';
    }
}
