package p3practica02;

public class Square implements RegularPolygon {
    private int sideLength;

    public Square(int sideLength) {
        this.sideLength = sideLength;
    }
    
    @Override
    public int getNumSides() {
        return 4;
    }

    @Override
    public int getSideLength() {
        return sideLength;
    }
    
}
