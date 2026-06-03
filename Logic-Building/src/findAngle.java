// Take time and hour and find angle between time and minute
public class findAngle {
    public static String find(int hour, int minute) {
        if(hour < 00 || hour >= 24) {
            return "Invalid hour";
        }
        if(minute < 00 || minute >= 60) {
            return  "Invalid minutes";
        }
        if(hour >= 12) {
            hour = hour - 12;
        }
        double hrAngle = 30 * hour + 0.5 * minute;
        double minAngle = 6 * minute;
        double angle = Math.abs(hrAngle - minAngle);

        if (angle > 180) {
            angle = 360 - angle;
        }

        return angle + " degrees";
    }

    public static void main(String[] args) {
        System.out.println(find(4,53));
        System.out.println(find(16,53));
        System.out.println(find(12,0));
    }
}
