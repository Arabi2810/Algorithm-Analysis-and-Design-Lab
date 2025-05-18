package Knapsack.Problem;

import java.util.ArrayList;
import java.util.Collections;

public class Knaptest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList<ItemValue> itemValues= new ArrayList<ItemValue>();
        
        ItemValue itemValue1 = new ItemValue();
        itemValue1.setObject(2);
        itemValue1.setProfit(5);
        itemValue1.setWeight(1);
        
        ItemValue itemValue2 = new ItemValue();
        itemValue2.setObject(1);
        itemValue2.setProfit(12);
        itemValue2.setWeight(3);
        
        ItemValue itemValue3 = new ItemValue();
        itemValue3.setObject(3);
        itemValue3.setProfit(16);
        itemValue3.setWeight(4);
        
        ItemValue itemValue4 = new ItemValue();
        itemValue4.setObject(4);
        itemValue4.setProfit(7);
        itemValue4.setWeight(2);
        
        ItemValue itemValue5 = new ItemValue();
        itemValue5.setObject(6);
        itemValue5.setProfit(11);
        itemValue5.setWeight(4);
        
        ItemValue itemValue6 = new ItemValue();
        itemValue6.setObject(7);
        itemValue6.setProfit(6);
        itemValue6.setWeight(3);
        
        ItemValue itemValue7 = new ItemValue();
        itemValue7.setObject(5);
        itemValue7.setProfit(9);
        itemValue7.setWeight(9);
        
        itemValues.add(itemValue1);
        itemValues.add(itemValue2);
        itemValues.add(itemValue3);
        itemValues.add(itemValue4);
        itemValues.add(itemValue5);
        itemValues.add(itemValue6);
        itemValues.add(itemValue7);
        

        Collections.sort(itemValues, new FKPComparator());
        
        int totalWeight=15;
        double maxProfit=0;
        int currentweight=0;
        for(ItemValue i:itemValues)
        {
        	if(currentweight+i.getWeight()<=totalWeight) {
        		maxProfit=maxProfit+i.getProfit();
        		currentweight=currentweight+i.getWeight();
        	}
        	else
        	{
        		int remainweight=totalWeight-currentweight;
        		maxProfit=maxProfit+(i.getprofitperweight()*remainweight);
        		
        	}
        }
        
//       for(ItemValue i:itemValues)
//       {
//    	   if(remainWeight>=i.getWeight())
//    	   {
//    		   remainWeight=remainWeight-i.getWeight();
//    		   maxProfit=maxProfit+i.getProfit();
//    	   }
//    	   else
//    	   {
//    		   maxProfit=maxProfit+i.getProfit() * remainWeight/i.getWeight();
//    	   }
//       }
        
        
       System.out.println("Maxprofit is:"+maxProfit);
        
	}

}
