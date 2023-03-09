package Test;

import java.util.HashMap;
import java.util.Map;

public class AccessControl {
	Map<Role, Map<Resource, Boolean>> remoteAccess;
	
	public AccessControl() {
		remoteAccess = new HashMap<>();
		for (Role role : Role.values()) {
			Map<Resource, Boolean> resourceAccessMap = new HashMap<>();
			for (Resource re : Resource.values()) {
				resourceAccessMap.put(re, false);
			}
			remoteAccess.put(role, resourceAccessMap);
		}
		remoteAccess.get(Role.ADMIN).put(Resource.CUSTOMER, true);
		remoteAccess.get(Role.ADMIN).put(Resource.ORDER, true);
		remoteAccess.get(Role.ADMIN).put(Resource.PRODUCT, true);
		
		remoteAccess.get(Role.MANAGER).put(Resource.CUSTOMER, true);
		remoteAccess.get(Role.MANAGER).put(Resource.ORDER, true);
		remoteAccess.get(Role.MANAGER).put(Resource.PRODUCT, false);
		
		remoteAccess.get(Role.STAFF).put(Resource.CUSTOMER, true);
		remoteAccess.get(Role.STAFF).put(Resource.ORDER, false);
		remoteAccess.get(Role.STAFF).put(Resource.PRODUCT, false);
	}
	
	public boolean hasAccess(Role r, Resource re) {
		return remoteAccess.get(r).get(re);
	}
	
	
	
		
}	
