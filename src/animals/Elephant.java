package animals;
import utilities.MessageUtility;
import utilities.Point;
import diet.IDiet;
import diet.Herbivore;
public class Elephant extends AnimalThatChews
{
	//Atributes:
	private double trunkLength;
	//Ctors:
	//This Ctor added by me to make possiblity of default necklen.
	public Elephant(String name)
	{
		super(name, new Point(50,90));
		super.setWeight(500);
		this.settrunkLength(1); //by default.
		IDiet _diet=new Herbivore();
		this.setDiet(_diet);
		MessageUtility.logConstractor(this.getClass().getSimpleName(),name);
	}
	public Elephant(String name,double trunkLen)
	{
		super(name, new Point(50,90));
		super.setWeight(500);
		this.settrunkLength(trunkLen); //by default.
		IDiet _diet=new Herbivore();
		this.setDiet(_diet);
		MessageUtility.logConstractor(this.getClass().getSimpleName(),name);
	}
	//Methods:
	public boolean settrunkLength(double newtrunk)
	{
		boolean res=false;
		if(newtrunk >= 0.5 && newtrunk <= 3)
		{
			this.trunkLength = newtrunk;
			res=true;
		}
		MessageUtility.logSetter(name, "settrunkLength", newtrunk, res);
		return res;
	}
	public void chew()
	{
		//?
	}
} //class Elephant extends AnimalThatChews