package tnsDay09;

public class Point {
	float x,y;
	Point()
	{
		x=y=0;
	}
	Point(float a)
	{
		this.x=this.y=a;
	}
	Point(float a,float b)
	{
		this.x=a;
		this.y=b;
	}
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y+"]";
	}
}
