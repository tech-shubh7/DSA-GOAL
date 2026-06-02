// Take coordinates (x, y) and determine which quadrant the point lies in
public class FindQuadrant {
    public static String find(int x, int y) {
        if(x == 0 && y == 0) {
            return  "origin";
        }
        if(x == 0) {
            if(y > 0) {
                return "+Y axis";
            } else {
                return "-Y axis";
            }
        }
        if(y == 0) {
            if(x > 0) {
                return "+X axis";
            } else {
                return "-X axis";
            }
        }
        if(x > 0 && y > 0) {
            return "1";
        } else if (x < 0 && y > 0) {
            return "2";
        } else if (x < 0 && y < 0) {
            return "3";
        } else {
            return "4";
        }
    }

    public static void main(String[] args) {
        System.out.println(find(4, -8)); // Quadrant 4
        System.out.println(find(0, 5));  // Positive Y-Axis
        System.out.println(find(0, 0));  // Origin;
    }
}
