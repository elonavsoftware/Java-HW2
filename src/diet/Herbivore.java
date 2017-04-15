package diet;
import animals.Animal;
import diet.IDiet;
import food.EFoodType;
import food.IEdible;
public class Herbivore implements IDiet
{
	//Check this function i didnt understanded yet!
	@Override
	public boolean canEat(EFoodType food) {return EFoodType.MEAT == food;}
	@Override
	public boolean eat(Animal animal, IEdible food)
	{
		if(this.canEat(food.getFoodtype()))
		{
			double currweight=animal.getWeight();
			animal.setWeight(currweight*0.07+currweight);
			return true;
		}
		return false;
	}
	@Override
	public String toString() {return "[" + this.getClass().getSimpleName() + "]";}
} //class Herbivore implements IDiet