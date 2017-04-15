package animals;
import mobility.Mobile;
import food.EFoodType;
import food.IEdible;
import diet.IDiet;
import utilities.MessageUtility;
import utilities.Point;
public abstract class Animal extends Mobile implements IEdible
{
	//Attributes:
	protected String name;
	private double weight;
	private IDiet diet;
	//Constructors
	public Animal(String name, Point location)
	{
		MessageUtility.logConstractor("Animal", name);
		this.setLocation(location);
		this.setName(name);
	}
	//Methods
	///////////////Added by me////////////////////
	public boolean setName(String _name)
	{
		boolean res = true;
		if(_name == null)
			res = false;
		this.name = _name;
		MessageUtility.logSetter(_name, "setName", _name, res);
		return res;
	}
	/*public String getName()
	{
		MessageUtility.logGetter(name, "getName", name);
		return this.name;
	}*/
	public boolean setDiet(IDiet _diet)
	{
		boolean res=false;
		this.diet=_diet;
		MessageUtility.logSetter(name, "setDiet", _diet, res);
		return true;
	}
	public IDiet getDiet()
	{
		MessageUtility.logGetter(name, "getDiet",this.diet);
		return this.diet;
	}
	//////////////////////////////////////////////
	public double getWeight()
	{
		MessageUtility.logGetter(name, "getWeight", weight);
		return weight;
	}
	public boolean setWeight(double neweight)
	{
		boolean res = true;
		if(neweight < 0)
			res = false;
		this.weight=neweight;
		MessageUtility.logSetter(name, "setWeight", neweight, res);
		return res;
	}
	public String toString() {return "[" + this.getClass().getSimpleName() + "]" + "(" + name + ")";}
	public void makeSound()
	{
		//?
	}
	public boolean eat(IEdible type)
	{
		boolean res=false;
		boolean x=this.diet.canEat(type.getFoodtype());
		if(x)
			res=this.diet.eat(this, type);
		MessageUtility.logBooleanFunction(name, "eat", type, res);
		return res;
	}
	@Override
	public EFoodType getFoodtype()
	{
		MessageUtility.logGetter(name, "getFoodtype", EFoodType.MEAT);
		return EFoodType.MEAT;
	}
} //class Animal