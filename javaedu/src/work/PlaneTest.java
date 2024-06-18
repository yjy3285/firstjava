package work;


public class PlaneTest {
	public static void main(String[] args) {
		Plane[] plane = new Plane[2];
		plane[0] = new Airplane("L747", 1000);
		plane[1] = new Cargoplane("C40", 1000);
		printInfo(plane);
		System.out.println("\n[ 100 운항 ]");
		plane[0].flight(100);
		plane[1].flight(100);
		printInfo(plane);
		System.out.println("\n[ 200 주유]");
		plane[0].refuel(200);
		plane[1].refuel(200);
		printInfo(plane);
		
	}
	
	public static void printInfo(Plane[] plane) {
		System.out.println("plane\t\tfuelSize");
		System.out.println("-----------------");
		System.out.println(plane[0].getPlaneName() + "\t\t" + plane[0].getFuelSize());
		System.out.println(plane[1].getPlaneName() + "\t\t" + plane[1].getFuelSize());
	}
}