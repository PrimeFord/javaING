public class Task3c {
    public static void main(String[] args) {
        
        int first = 25;
        int second = 39;

        if (first != second) {
            System.out.println("The first integer 25 is not equal to second integer 39:" + first + "!=" + second);
        } else if (first < second) {
            System.out.println("The first integer 25 is than second integer 39:" + first + "<" + second);
        } else {
            System.out.println("The first integer 25 is less than or equal to second integer 39:" + first + "<=" + second);
        }
    }
}
