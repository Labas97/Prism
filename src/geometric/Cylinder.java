package geometric;

public class Cylinder extends Prism{

		private double range;
		
		public Cylinder(int height, double range) {
			
			super(height);
			this.range = range;
			
		}
		
		public double getBaseArea() {
			
			return range * range * Math.PI;
			
		}

		@Override
		public String toString() {
			return "Cylinder [range=" + range + ", getBaseArea()="
					+ getBaseArea() + "]";
		}
		
}