package collection;



class Product2 implements Comparable<Product2> {
	private String productID;
	private String productName;
	private String productPrice;

	Product2(String productID, String productName, String productPrice) {
		this.productID = productID;
		this.productName = productName;
		this.productPrice = productPrice;
	}
	
	@Override
	public int compareTo(Product2 o) {
		int mine = Integer.parseInt(productPrice);
		int comp = Integer.parseInt(o.productPrice);
		
		if(mine<comp) return 1;  //내림차순으로 구현하기 위해서 -1이 아닌 1 리턴
		else if(mine == comp) return 0;
		else return -1;
	}


    public String getProductID() {
		    return productID;
	     }

	

	public String getProductName() {
		return productName;
	}

	
	public String getProductPrice() {
		return productPrice;
	}


	@Override
    public String toString() {
        return productID + "\t" + productName + "\t" + String.format("%,d원", Integer.parseInt(productPrice));
    }
	




}
