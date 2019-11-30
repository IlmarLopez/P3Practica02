package p3practica02;

public interface RegularPolygon {
    public abstract int getNumSides();    
    public abstract int getSideLength();
    
    public default int getPerimeter(int numSides, int length) {
        return numSides * length;
    }
    
    public default double getInteriorAngle(int numSides) {
        return (numSides - 2) * Math.PI/numSides;
    }
}
