package diet;
import food.EFoodType;
import food.IEdible;
import animals.Animal;
public class Carnivore implements IDiet
{
	@Override
	public boolean canEat(EFoodType food) {return EFoodType.MEAT == food;}
	@Override
 	public boolean eat(Animal animal , IEdible food)
	{
		if(this.canEat(food.getFoodtype()))
		{
			double currweight=animal.getWeight();
			animal.setWeight(currweight*0.1+currweight);
			return true;
		}
		return false;
 	}
	@Override
	public String toString() {return "[" + this.getClass().getSimpleName() + "]";}
} //class Carnivore implements IDiet