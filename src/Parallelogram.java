import java.util.ArrayList;
import java.util.List;

class Parallelogram implements Figure {
    private double baseSide;
    private double side;
    private double height;

    public Parallelogram(double baseSide, double side, double height) {
        this.baseSide = baseSide;
        this.side = side;
        this.height = height;
    }

    @Override
    public String getType() {
        return "Parallelogram";
    }

    @Override
    public double getPerimeter() {
        return 2 * (baseSide + side);
    }

    @Override
    public double getArea() {
        return baseSide * height;
    }
}