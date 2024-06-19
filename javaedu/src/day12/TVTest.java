package day12;

public class TVTest {
	public static void main(String[] args) {
		SaleTV saleTV = new SaleTV(300000, "SALETV-1", 40, 1);
		RentalTV rentalTV = new RentalTV(100000, "RENTALTV-10", 42, 1);

		saleTV.channelUp();
		saleTV.channelUp();

		rentalTV.channelDown();
		rentalTV.channelDown();
		rentalTV.channelDown();

		printAllTV(saleTV);
		printAllTV(rentalTV);
		printRentalTV(rentalTV);

	}

	static void printAllTV(TV tv) {
		System.out.println(tv.toString());

		if (tv instanceof SaleTV) {
			((SaleTV) tv).play();
			((SaleTV) tv).sale();
		} else if (tv instanceof RentalTV) {
			((RentalTV) tv).play();

		}

	}

	static void printRentalTV(Rentable tv) {
		tv.rent();
	}
}
