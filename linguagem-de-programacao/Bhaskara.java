public class Bhaskara {

    private double a;
    private double b;
    private double c;
    private double raiz1;
    private double raiz2;

    public Bhaskara() {
    }

    public Bhaskara(double a, double b, double c) {
        setA(a);
        setB(b);
        setC(c);
    }

    public void print() {
        System.out.println("=======================");
        System.out.println("a: " + getA() + ", b: " + getB() + ", c: " + getC());
        System.out.println("=======================");

        calculate();
        System.out.println("raiz1: " + getRaiz1());
        System.out.println("riaz2: " + getRaiz2());
    }

    public double getDelta() {
        return Math.pow(getB(), 2) - (4 * getA() * getC());
    }

    public void calculate() {
        double delta;

        delta = getDelta();

        // Não é equação do segundo grau portanto não calcula
        if (delta < 0) {
            System.out.println("Não há raiz real.");

            // É equação do segundo grau, então calcula
        } else {
            this.raiz1 = -(getB() + Math.sqrt(delta)) / (2 * getA());
            this.raiz2 = -(getB() - Math.sqrt(delta)) / (2 * getA());
        }
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        if (a > 0) {
            this.a = a;
        } else {
            System.out.println("Não é de segundo grau.");
        }
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getRaiz1() {
        return raiz1;
    }

    public double getRaiz2() {
        return raiz2;
    }
}

