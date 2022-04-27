public class Esfera {
private double radio;

    public Esfera(double radioInicial) {
        if (radioInicial > 0) {
            this.radio = radioInicial;
        } else{
            this.radio = 0.0;

        }
    }

    public double getRadio() {
        return radio;
    }
    public double getDiametro() {
        return radio*2;
    }

    public double getCircunferencia() {
        return (Math.PI*getDiametro());
    }

    public double getArea() {
        return (4*Math.PI*radio*radio);
    }

    public double getVolumen() {
        return (4*Math.PI*Math.pow(radio,3))/3;
    }

}
