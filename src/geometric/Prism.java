package geometric;

public abstract class Prism {
		
	private double height;
		
	public Prism(int height){
		this.height = height;
	}
	
	public double getHeight() {
		
		return height;
	}
	
	public abstract double getBaseArea();
	
	public double getVolume() {
		
		return height * getBaseArea();
		
	}
		
	public boolean IsBiggerVolumed(Prism otherPrism) {
		
		if (this.getVolume()>otherPrism.getVolume()) {
			
			return true;
		}
		
		else return false;
	}
}