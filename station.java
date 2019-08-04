import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class station {
	String name;
	station prev;
	station next;
	Map<station,LinkedHashSet<station>> ordersetmap=new HashMap<station,LinkedHashSet<station>>();
	station (String name){
		this.name=name;
	}
	public LinkedHashSet<station> passedStations(station sta){
		if(ordersetmap.get(sta)==null) {
			LinkedHashSet<station> set=new LinkedHashSet<station>();
			set.add(this);
			ordersetmap.put(sta, set);
		}
		return ordersetmap.get(sta);
	}
	public boolean equals(Object obj) {
		if(this == obj){
			return true;
		} else {
			if(obj instanceof station){
			station s = (station) obj;
			if(s.name.equals(this.name)){
				return true;
			} else 
				return false;
			
		} else 
			return false;
		}
	}
	public int hashCode() {
		return this.name.hashCode();
	}
}
