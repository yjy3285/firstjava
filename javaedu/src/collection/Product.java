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

public String getProductID() {
		return productID;
	}

	public void setProductID(String productID) {
		this.productID = productID;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}


	@Override
    public String toString() {
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
		if (ob == null || getClass() != ob.getClass()) 
			return false;
		
		Product other = (Product) ob;
		return productID == other.productID;
	}

}
