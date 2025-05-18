package Knapsack.Problem;

import java.util.Comparator;

public class FKPComparator implements Comparator<ItemValue>{

	@Override
    public int compare(ItemValue o1, ItemValue o2) {
//        double r1 = (double) o1.getProfit() / o1.getWeight();
//        double r2 = (double) o2.getProfit() / o2.getWeight();
//        return Double.compare(r2, r1); 
		
		return Double.compare(o2.getprofitperweight(),o1.getprofitperweight());
		
	}

}
