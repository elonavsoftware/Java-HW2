package animals;
import diet.Herbivore;
import diet.IDiet;
import utilities.MessageUtility;
import utilities.Point;
/**
 * Turtle Class contain's type,name,weight,position(X,Y),distance of the Turtle Object.
 * @author Mahdi Asali
 *
 */
public class Turtle extends AnimalThatChews
{
	//Attributes:
	private int Age;
	//Ctors:
	public Turtle(String name,int age)
	{
		super(name,new Point(0,80));
		super.setWeight(1);
		this.setAge(age);
		IDiet _diet=new Herbivore();
		this.setDiet(_diet);
		MessageUtility.logConstractor(this.getClass().getSimpleName(), name);
	}
	public boolean setAge(int _Age)
	{
		boolean res = true;
		if(_Age < 0 || Age > 500)
			return false;
		this.Age = _Age;
		MessageUtility.logSetter(name, "setAge", _Age, res);
		return res;
	}
	public void chew()
	{
		//?
	}
} //class Turtle extends AnimalThatChews