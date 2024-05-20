package areaofrect;

public class area {
	private int length,breadth,area;

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

	public int getArea() {
		return length*breadth;
	}

	@Override
	public String toString() {
		return "area [length=" + length + ", breadth=" + breadth + ", area=" + area + "]";
	}

}
