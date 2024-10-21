package intermediatePart1.time;

import java.time.ZoneId;
import java.util.Set;

public class ZoneIdMain {

    public static void main(String[] args) {
        for (String availableZoneIds : ZoneId.getAvailableZoneIds()) {
            ZoneId zoneId = ZoneId.of(availableZoneIds);
            System.out.println(zoneId + " | " + zoneId.getRules());
        }

        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println("ZonId.systemDefault : " + zoneId);

        ZoneId seoulZonId = ZoneId.of("Asia/Seoul");
        System.out.println("SeoulZonId : " + seoulZonId);

    }
}
