package inherit;

public class square extends Rectangle {
	private int side;

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
		super.setLength(side);
		super.setBreadth(side);
	}

	public square(int length, int breadth, int side) {
		super(side, side);
		this.side = side;
	}
	
	public int getArea() {
		return side*side;
	}

	@Override
	public String toString() {
		return "square [side=" + side + ", area= "+getArea()+ "]";
	}

}
