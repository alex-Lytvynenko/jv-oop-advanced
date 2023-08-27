package core.basesyntax;

public class Rectangle extends Figure {
    private double sideA;
    private double sideB;

    public Rectangle(String color, double sideA, double sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double area() {
        return sideA * sideB;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: "
                + area()
                + " sq.units, sideA: "
                + sideA
                + " units "
                + " sideB: "
                + sideB
                + " units, color: "
                + color);
    }
}