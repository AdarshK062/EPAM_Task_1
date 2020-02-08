package Adarsh.EPAM_task1;
import java.util.*;

public class SortByWeight implements Comparator<Sweets> {
	public int compare(Sweets o1, Sweets o2) {

		// TODO Auto-generated method stub

		return o1.weight-o2.weight;

	}
}
