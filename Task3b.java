// import java. lang. Math. *;

public class Task3b {
    public static void main (String[] args){
        float Radius = 7.5f;
        double perimeter = 2 * Math.PI * Radius; 
        double area = Math.PI * Radius * Radius;
        System.out.println(perimeter);
        System.out.println(area);

        float width = 5.5f;
        float height = 8.5f;

        double perimeterRec = 2 * (width + height); 
        double areaRec = width * height;

        System.out.println(perimeterRec);
        System.out.println(areaRec);
    }
}
