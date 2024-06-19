package day12;

class SaleTV extends TV {
	private int price;

	public SaleTV() {
	}

	public SaleTV(int price, String model, int size, int channel) {
		super(model, size, channel);
		this.price = price;

	}

	public void play() {
		System.out.println("판매 TV 채널" + channel + "번의 프로를 플레이 합니다.");
	}

	public void sale() {
		System.out.println(model + "모델의 상품을 판매합니다." + price + "을 지불해 주세요.");
	}

	@Override
	public String toString() {
		return String.format("판매상품정보: 모델명(%s), 가격(%d원), 크기(%d)", model, price, size);
	}

}
