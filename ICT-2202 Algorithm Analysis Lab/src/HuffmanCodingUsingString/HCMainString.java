package HuffmanCodingUsingString;

import java.util.PriorityQueue;

public class HCMainString {
    
    static char[] charArr = new char[100];
    static String[] codeArr = new String[100];
    static int index = 0;

    public static void storeCode(HuffmanNodeString root, String string) {
        if (root == null)
            return;

        if (root.left == null && root.right == null && root.c != '#') {
            charArr[index] = root.c;
            codeArr[index] = string;
            index++;
        }

        storeCode(root.left, string + "0");
        storeCode(root.right, string + "1");
    }

    public static void main(String[] args) {
        String input = "Algorithm analysis";

       
        int[] freq = new int[256];
        for (int i = 0; i < input.length(); i++) {
            char c= input.charAt(i);
            if (c != ' ') {
                freq[c]++;
            }
        }
 
      
        PriorityQueue<HuffmanNodeString> q = new PriorityQueue<>(new MyComparator());
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                HuffmanNodeString node = new HuffmanNodeString();
                node.c = (char) i;
                node.data = freq[i];
                node.left = null;
                node.right = null;
                q.add(node);
            }
        }

        
        while (q.size() > 1) {
            HuffmanNodeString x = q.poll();
            HuffmanNodeString y = q.poll();

            HuffmanNodeString newNode = new HuffmanNodeString();
            newNode.c = '#';
            newNode.data = x.data + y.data;
            newNode.left = x;
            newNode.right = y;

            q.add(newNode);
        }

        HuffmanNodeString root = q.peek();

       
        storeCode(root, "");

        
        System.out.println("Huffman Codes:");
        for (int i = 0; i < index; i++) {
            System.out.println(charArr[i] + ":" + codeArr[i]);
        }

    }
}

/*public class HCMainString{
	static char[] charArr=new char[100];
	static String[] codeArr=new String[100];
	static int index=0;
	
	public static void storeCode(HuffmanNodeString root, String string)
	{
		if(root==null)
			return;
					
		if(root.left==null && root.right==null && root.c!='#')
		{
			charArr[index]=root.c;
			codeArr[index]=string;
			index++;
		}
		storeCode(root.left, string+"0");
		storeCode(root.right, string+"1");
	}
	public static void main(String[] args) {
		String input="Algorithm Analysis";
		
		int[] freq=new int[256];
		for(int i=0;i<input.length();i++)
		{
			char c=input.charAt(i);
			if(c!=' ')
			{
				freq[c]++;
			}
		}
		PriorityQueue <HuffmanNodeString> q=new PriorityQueue<HuffmanNodeString>(new MyComparator());
		for(int i=0;i<256;i++)
		{
			if(freq[i]>0)
			{
				HuffmanNodeString node=new HuffmanNodeString();
				node.c=(char)i;
				node.data=freq[i];
				node.left=null;
				node.right=null;
				q.add(node);
			}
			
		}
		while(q.size()>1)
		{
			HuffmanNodeString x=q.poll();
			HuffmanNodeString y=q.poll();
			HuffmanNodeString newNode=new HuffmanNodeString();
			newNode.c='#';
			newNode.data=x.data+y.data;
			newNode.left=x;
			newNode.right=y;
			q.add(newNode);
		}
		HuffmanNodeString root= q.peek();
		storeCode(root,"");
		System.out.println("Huffman codes are:");
		for(int i=0; i<index ; i++);
		{
		
			System.out.println(charArr[i]+":"+codeArr[i]);
		}
	}
}
*/
