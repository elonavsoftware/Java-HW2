package mobility;
import utilities.MessageUtility;
import utilities.Point;
public abstract class Mobile implements ILocatable
{
	//Attributes.
	private Point location; //Current location
	private double totalDistance;//Distance the object traveled >0.
	//Methods.
	public Mobile()
	{
		//?
	}
	public Mobile(Point location) {this.location=new Point(location);} //New copy of 'Point'.
	public void addTotalDistance(double _totalDistance) {this.totalDistance+=_totalDistance;}
	public double calcDistance(Point p)
	{
		double distance;
		distance = Math.sqrt((Math.pow(this.location.GetY() - p.GetY(), 2) + Math.pow(this.location.GetX() - p.GetX(), 2)));
		this.addTotalDistance(distance);
		return distance;
	}
	public double move(Point p) {return this.totalDistance;}
	@Override
	public Point getLocation() {return this.location;}
	@Override
	public boolean setLocation(Point other)
	{
		boolean res=false;
		if(other!=null)
			res = true;
		this.location = new Point(other);
		return res;
	}
} //abstract class Mobile implements ILocatable