package p3practica02;

public class main {
    static RegularPolygon[] list = new RegularPolygon[2];

    public static int totalSides(RegularPolygon[] list) {
        int sum = 0;
        for (RegularPolygon element : list) {
            sum += element.getNumSides();
        }
        return sum;
    }

    public static void main(String[] args) {
        list[0] = new Square(10);
        
        int numSidesSquare = list[0].getNumSides();
        int sideLengthSquare = list[0].getSideLength();
        int perimeterSquare = list[0].getPerimeter(numSidesSquare, sideLengthSquare);
        double interiorAngleSquare = list[0].getInteriorAngle(numSidesSquare);
        System.out.println("Square");
        System.out.println("Perimeter square: " + perimeterSquare);
        System.out.println("Interior angle square in radians: " + interiorAngleSquare);
        System.out.println();
        
        
        list[1] = new EquilateralTriangle(10);
    
        int numSidesTriangle = list[1].getNumSides();
        int sideLengthTriangle = list[1].getSideLength();
        int perimeterTriangle = list[1].getPerimeter(numSidesSquare, sideLengthSquare);
        double interiorAngleTriangle = list[1].getInteriorAngle(numSidesSquare);
        System.out.println("Triangle");
        System.out.println("Perimeter triangle: " + perimeterTriangle);
        System.out.println("Interior angle triangle in radians: " + interiorAngleTriangle);
        System.out.println();
        
        
        System.out.println("Total of Sides: " + totalSides(list));
    }
    
}
