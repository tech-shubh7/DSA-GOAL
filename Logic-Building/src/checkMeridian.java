// Take 24-hour time (hours and minutes) and print whether it is AM or PM.
public class checkMeridian {
    public static String check(int hour, int minute) {
        if(hour < 00 || hour >= 24) {
            return "Invalid hour";
        }
        if(minute < 00 || minute >= 60) {
            return  "Invalid minutes";
        }
        if(hour < 12) {
            if(hour == 0) {
                return "12: "+minute+" AM";
            }
            return  hour+ " " +minute+" AM";
        } else  {
            if(hour == 12) {
                return "12: "+minute+" PM";
            }
            return hour - 12+ " " + minute+" PM";
        }
    }

    public static void main(String[] args) {
        System.out.println(check(4, 55));
        System.out.println(check(14, 57));
    }
}
