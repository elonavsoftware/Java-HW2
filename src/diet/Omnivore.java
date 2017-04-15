package diet;
import animals.Animal;
import food.EFoodType;
import food.IEdible;
public class Omnivore implements IDiet
{
	//check this
	@Override
	public boolean eat(Animal animal, IEdible food)
	{
		if(this.canEat(food.getFoodtype()))
		{
			if(food.getFoodtype()==EFoodType.MEAT)
			{
				Carnivore a=new Carnivore();
				a.eat(animal, food);
				return true;
			}
			else if(food.getFoodtype()==EFoodType.VEGETABLE)
			{
				Herbivore a=new Herbivore();
				a.eat(animal, food);
				return true;
			}
		}
		return false;
	}
	@Override
	public String toString() {return "[" + this.getClass().getSimpleName() + "] ";}	
	@Override
	public boolean canEat(EFoodType food)
	{
		if(food==EFoodType.MEAT)
		{
			return true;
		}
		else if(food==EFoodType.VEGETABLE)
		{
			return true;
		}
		return false;
	}
} //class Omnivore implements IDiet