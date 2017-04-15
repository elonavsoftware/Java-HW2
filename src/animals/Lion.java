package animals;
import food.EFoodType;
import food.IEdible;
import utilities.MessageUtility;
import utilities.Point;
import diet.Carnivore;
public class Lion extends AnimalThatRoars
{
	//Attributes:
	private int scarCount;
	public Lion(String name)
	{
		super(name,new Point(20, 0));
		scarCount = 0;
		setWeight(408.2);
		this.setDiet(new Carnivore());
		MessageUtility.logConstractor(this.getClass().getSimpleName(), name);

	}
	public boolean eat(IEdible type)
	{		
		int x = (Math.random() < 0.5) ? 0:1;
		if(x == 1)
			this.setScars();
		boolean res = false;
		res = super.eat(type);
		MessageUtility.logBooleanFunction(name, "eat", type, res);
		return res;
	}
	public boolean setScars()
	{
		this.scarCount++;
		MessageUtility.logSetter(name, "setScars", this.scarCount, true);
		return true;
	}
	@Override
	public EFoodType getFoodtype()
	{
		MessageUtility.logGetter(name, "getFoodType", EFoodType.NOTFOOD);
		return EFoodType.NOTFOOD;
	}
	public void roar()
	{
		//?
	}
} //class Lion extends AnimalThatRoars