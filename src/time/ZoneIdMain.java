package time;

import java.time.ZoneId;
import java.util.Set;

public class ZoneIdMain {
    public static void main(String[] args) {
        for (String zoneId : ZoneId.getAvailableZoneIds()) {
//            System.out.println(zoneId);
            ZoneId zoneId1 = ZoneId.of(zoneId);
            System.out.println(zoneId1 + " | " + zoneId1.getRules());

        }

        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println("zoneId = " + zoneId);

        ZoneId zoneId1 = ZoneId.of("Asia/Seoul");
        System.out.println("zoneId1 = " + zoneId1);
    }
}
