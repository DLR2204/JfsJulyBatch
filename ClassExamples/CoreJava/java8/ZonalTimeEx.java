package java8;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class ZonalTimeEx {

	public static void main(String[] args) {

//		Set<String> zone = ZoneId.getAvailableZoneIds();
//
//		for (Object obj : zone) {
//			System.out.println(obj);
//		}
		
		ZoneId id = ZoneId.of("America/Chicago");
		
		ZonedDateTime date = ZonedDateTime.now(id);
		
		System.out.println(date);

	}
}
