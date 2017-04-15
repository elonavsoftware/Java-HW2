package animals;
import diet.Carnivore;
import diet.IDiet;
import utilities.MessageUtility;
import utilities.Point;
public class Bear extends AnimalThatRoars
{
	//Attributes
	private String furColor;
	//Ctors.
	public Bear(String name, String newFurColor)
	{
		super(name,new Point(100,5));
		super.setWeight(308.2);
		this.setFurColor(newFurColor);
		//IDiet _diet=new Omnivore();
		IDiet _diet=new Carnivore(); //temp change it later@!!!!
		this.setDiet(_diet);
		MessageUtility.logConstractor(this.getClass().getSimpleName(),name);
	}
	//Methods:
	public void roar()
	{
		//?
	}
	///////////////My Methods///////////////
	public String getFurColor()
	{
		MessageUtility.logGetter(name, "getFurColor", this.furColor);
		return this.furColor;
	}
	public boolean setFurColor(String newFurColor)
	{
		boolean res=false;
		if(newFurColor=="BLACK" || newFurColor =="WHITE" || newFurColor == "GRAY")
		{
			this.furColor=newFurColor;
			res=true;
		}
		else
		{
			this.furColor="GRAY"; //by Default.
			res=true;
		}
		MessageUtility.logSetter(name, "setFurColor", newFurColor, res);
		return res;
	}
	/*public boolean setName(String _name)
	{
		boolean res=false;
		if(_name!=null)
		{
			res=true;
		
		super.setName(_name);
		}
		MessageUtility.logSetter(_name, "setName", _name, res);
		return res;
	}*/
	/////////////////////////////////////////
} //class Bear extends AnimalThatRoars