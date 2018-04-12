package geometric.runnable;

import geometric.Prism;
import geometric.Cylinder;
import geometric.Cubold;

public class Main {

	public static void main(String[] args) {
		
		PrismData data = new PrismData(5);
		
		Prism cubold = new Cubold(4, 2, 3);
		
		Prism cylinder1 = new Cylinder(4, 6);
		Cylinder cylinder2 = new Cylinder(4, 3);
		
		data.setPrism(0, cubold);
		data.setPrism(2, cylinder1);
		data.setPrism(4, cylinder2);
		
		for (int i = 0; i < data.numberOfElements(); i++) {
			
			System.out.println(data.getPrism(i));
			
		}
		
		System.out.println(data.getAverageVolume());
		
		System.out.println(data.getCylinderNumber());
		
/*		Prisms prismArray = new Prisms(5);
		
		Prism Prism1 = new Prism(1, 2);
		Prism Prism2 = new Prism(3, 4);
		Prism Cubold = new Cublod(1, 2, 3);
		
		prismArray.setPrism(0, Prism1);
		prismArray.setPrism(1, Prism2);
		prismArray.setPrism(2, Cubold);
		
		System.out.println("Prism Datas:");
		
		for (int i = 0; i < prismArray.numberOfElements(); i++) {
			
			System.out.println(prismArray.getPrism(i));
			
		}
		
		System.out.println("\nPrisms average volume: %.2f\n",
				prismArray.getAverageVolume());
		
		System.out.println("Number of Cylinders: ",
				+ prismArray.getCylinderNumber());*/
		
	}
	
}
