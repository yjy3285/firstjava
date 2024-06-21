package collection;

import java.util.Objects;

class Product {
	private String productID;
	private String productName;
	private String productPrice;

	Product(String productID, String productName, String productPrice) {
		this.productID = productID;
		this.productName = productName;
		this.productPrice = productPrice;
	}

	public String getInfo() {
		return productID + " " + productName + " " + productPrice;

	}

	@Override
	public int hashCode() {
		return Objects.hash(productID);
	}

	@Override
	public boolean equals(Object ob) {
		if (this == ob)
			return true;
		if (ob == null)
			return false;
		
		Product other = (Product) ob;
		return productID == other.productID;
	}

}
