package items_in_a_gift;
import com.epam1.maven1.*;
//The concept of "inheritance" Candies extending Combo
public class Candies extends Gift_properties implements Comparable<Candies>,Getmethod_Interface  {
	public Candies() {}
	public Candies(String name,int weight,int cost ) {
		this.name=name;
		this.weight=weight;
		this.cost=cost;
		// TODO Auto-generated constructor stub
	}
	//Implementing the "abstract" methods of super class
	public String toString()
	{
		return("Candy:["+this.name+","+this.weight+","+this.cost+"]");
	}
	@Override
	public int compareTo(Candies o) {
		return (this.getCost() < o.getCost() ? -1 : 
            (this.getCost() == o.getCost() ? 0 : 1));
	}
	@Override
    public int getCost()
    {
    	return cost;
    }
	@Override
    public int getWeight()
    {
    	return weight;
    }

}
