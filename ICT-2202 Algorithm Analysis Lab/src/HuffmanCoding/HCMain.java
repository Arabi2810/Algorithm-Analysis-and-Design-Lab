package HuffmanCoding;

import java.util.PriorityQueue;

/*import java.util.PriorityQueue;

public class HCMain {
	
	public static int printCode(HuffmanNode root, String string) {
		// TODO Auto-generated method stub
		if(root==null)
			return 0;
		
		int sum1=0;
		if(root.left== null && root.right== null && Character.isLetter(root.c))
	     {
			System.out.println(root.c+ ":" +string);
			int l= string.length();
			sum1=root.data*l;
	
		
			
		}
		
		return sum1+printCode(root.left, string + "0")+printCode(root.right, string +"1");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int n=6;
         char[] charArray= { 'A', 'C', 'E', 'M', 'U', 'Z'};
         int[] charfreq= {100, 53, 133, 60, 44, 8};
         int m;
         int sum=0;
         for(int i=0; i<n;i++)
         {
        	 m=charfreq[i]*8;
        	 sum=sum+m;
         }
         
         //creating a priority queue q
         PriorityQueue<HuffmanNode> q = new PriorityQueue<HuffmanNode>(n, new MyComparator());
         
         for(int i=0; i<n;i++)
         {
        	 //creating a Huffman node object
        	 //and add it to priority code
        	 
        	 HuffmanNode hn = new HuffmanNode();
        	 hn.c = charArray[i];
        	 hn.data= charfreq[i];
        	 
        	 hn.left= null;
        	 hn.right= null;
        	 
        	 q.add(hn);
         }
         
         //create a root node
         HuffmanNode root= null;
         while (q.size() > 1)
         {
        	 HuffmanNode x = q.peek();
        	 q.poll();
        	 
        	 HuffmanNode y = q.peek();
        	 q.poll();
        	 
        	 HuffmanNode f=new HuffmanNode();
        	 
        	 f.data=x.data + y.data;
        	 f.c='-';
        	 
        	 f.left=x;
        	 f.right=y;
        	 root=f;
        	 
        	 q.add(f);
        	 
         }
         int k=printCode(root, "");
         double p = ((double) k / sum) * 100.0;
         System.out.println("Compress Efficiency :" +String.format("%.2f",p)+ "%");
	}
}*/
public class HCMain{
	public static int printCode(HuffmanNode root, String string) {
		if(root==null)
			return 0;
		
		int sum1=0;
		if(root.left==null && root.right==null && Character.isLetter(root.c))
		{
			System.out.println(root.c+":"+string);
			int m=string.length();
			sum1=root.data*m;
		}
		return sum1+printCode(root.left,string+"0")+printCode(root.right,string+"1");
	}
	public static void main(String[] args) {
		int n=6;
		char[] charArray= {'A','C','E','M','U','Z'};
		int[] charfreq= {100,53,133,60,44,8};
		int i,sum=0,p;
		for(i=0;i<n;i++)
		{
			p=charfreq[i]*8;
			sum=sum+p;
		}
		PriorityQueue<HuffmanNode> q=new PriorityQueue<HuffmanNode>(n, new MyComparator());
	    for(i=0;i<n;i++)
	    {
	    	HuffmanNode hn=new HuffmanNode();
	    	hn.c=charArray[i];
	    	hn.data=charfreq[i];
	    	hn.left=null;
	    	hn.right=null;
	    	q.add(hn);
	    	
	    }
	    HuffmanNode root=null;
	    while(q.size()>1)
	    {
	    	HuffmanNode x=q.peek();
	    	q.poll();
	    	HuffmanNode y=q.peek();
	    	q.poll();
	    	HuffmanNode f=new HuffmanNode();
	    	f.data=x.data+y.data;
	    	f.c='-';
	    	f.left=x;
	    	f.right=y;
	    	root=f;
	    	q.add(f);
	    }
	    int k=printCode(root,"");
	    double l=((double)k/ sum)*100.0;
	    System.out.println("Compress Efficiency:"+String.format("%.2f",l)+"%");
		
		
		
	}
}
