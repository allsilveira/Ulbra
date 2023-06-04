public abstract class GeometricForm {

    public abstract double calculateArea();
    public abstract double calculatePerimeter();
}

 class Circle extends GeometricForm {
    private double Ray;

    public Circle(double ray) {
        this.Ray = ray;
    }

    @Override
     public double calculateArea() {
         double area = (Math.PI * this.Ray) * (Math.PI * this.Ray);
         return area;
     }

     public  double calculatePerimeter(){
         double perimeter = 2 * Math.PI * this.Ray;
         return perimeter;
     }
 }

 class Rectangle extends GeometricForm {
    private double MajorBase;
     private double MinorBase;

     public Rectangle(double majorBase, double minorBase) {
         this.MajorBase = majorBase;
         this.MinorBase = minorBase;
     }
     @Override
     public double calculateArea(){
        double area = this.MajorBase * this.MinorBase;
        return area;
     }

     public  double calculatePerimeter(){
         double perimeter = (2 * this.MajorBase) + (2 * this.MinorBase);
         return perimeter;
     }
 }

 class Triangle extends GeometricForm {
    private double SideA;
     private double SideB;
     private double SideC;
     private double Height;

     public Triangle(double sideA, double sideB, double sideC, double height) {
         this.SideA = sideA;
         this.SideB = sideB;
         this.SideC = sideC;
         this.Height = height;
     }

     @Override
     public double calculateArea(){
         double area = (this.SideB * Height) / 2;
         return area;
     }

     public  double calculatePerimeter(){
         double perimeter = this.SideA + this.SideB + this.SideC;
         return perimeter;
     }
 }