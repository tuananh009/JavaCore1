package Test;

public enum Resource {
	CUSTOMER("Customer"),
	PRODUCT("Product"),
	ORDER("Order");
	
	private final String resourceName;

	private Resource(String resourceName) {
		this.resourceName = resourceName;
	}

	public String getResourceName() {
		return resourceName;
	}
	
	
	
	
}
