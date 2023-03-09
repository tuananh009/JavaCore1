package Test;

public enum Role {
	ADMIN("admin"),
	MANAGER("manager"),
	STAFF("staff");
	
	private final String name;

	private Role(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	
}
