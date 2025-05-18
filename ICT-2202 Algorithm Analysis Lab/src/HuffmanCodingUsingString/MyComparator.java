package HuffmanCodingUsingString;

import java.util.Comparator;

public class MyComparator implements Comparator<HuffmanNodeString>{

	@Override
	public int compare(HuffmanNodeString x, HuffmanNodeString y) {
		// TODO Auto-generated method stub
		return x.data-y.data;
	}

}
