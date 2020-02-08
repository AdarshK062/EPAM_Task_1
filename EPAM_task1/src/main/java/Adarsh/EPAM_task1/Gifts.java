package Adarsh.EPAM_task1;
import java.util.*;

public class Gifts {
	public LinkedList<Sweets> sweet_list;
	public Gifts(LinkedList<Sweets> sweet_list){
		this.sweet_list=sweet_list;
	}
	public Integer WeightSum() {
		Integer total = 0;
		for(Sweets s:sweet_list) {
			total+=s.weight;
		}
		return total;
	}
	public void sortChocolates(int key) {
		if(key == 0) {
			Collections.sort(sweet_list,new SortByItem());
		}
		else if(key==1) {
			Collections.sort(sweet_list,new SortByCost());
		}
		else {
			Collections.sort(sweet_list,new SortByWeight());
		}
	}

}
