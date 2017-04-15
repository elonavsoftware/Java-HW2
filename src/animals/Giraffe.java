package animals;
import diet.Herbivore;
import diet.IDiet;
import utilities.MessageUtility;
import utilities.Point;
public class Giraffe extends AnimalThatChews
{
	//Attributes:
	private double neckLenght;
	//Ctors:
	public Giraffe(String name,double _neckLenght)
	{
		super(name, new Point(0,50));
		super.setWeight(450);
		this.setNeckLength(1.5);
		IDiet _diet=new Herbivore();
		this.setDiet(_diet);
		MessageUtility.logConstractor(this.getClass().getSimpleName(),name);
	}
	///////////My Methods//////////
	public boolean setNeckLength(double newNeckLen)
	{
		boolean res=false;
		if(newNeckLen>=1 && newNeckLen<=2.5)
		{
			this.neckLenght=newNeckLen;
			res=true;
		}
		MessageUtility.logSetter(name, "setNeckLength", newNeckLen, res);
		return res;
		
	}
	//Methods:
	public void chew()
	{
		//?
	}
} //class Giraffe extends AnimalThatChews