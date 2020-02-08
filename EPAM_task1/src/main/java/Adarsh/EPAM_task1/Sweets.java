package Adarsh.EPAM_task1;

public abstract class Sweets {
	public abstract String Type();
	public int weight;
	public int cost;
	public String item;
	public Sweets(String item,int weight,int cost){
		this.item = item;
		this.weight=weight;
		this.cost=cost;
	}
}
