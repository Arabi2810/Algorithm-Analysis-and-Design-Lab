#include<iostream>
using namespace std;
int main()
{
    int i,n;
    cout<<"Enter array size:";
    cin>>n;
    int a[n];
    cout<<"\nEnter array elements:";
    for(i=0;i<n;i++)
    {
        cin>>a[i];
    }
    cout<<"\nThe original array:";
    for(i=0;i<n;i++)
    {
        cout<<a[i]<<" ";
    }

    for (int step = 0; step < n - 1; step++)
        {
	      int min_idx = step;
	      for (int i = step + 1; i < n; i++)
            {
	          if (a[i] < a[min_idx])
                {
	                min_idx = i;
	             }
	        }

	      int temp = a[step];
	      a[step] = a[min_idx];
	      a[min_idx] = temp;
	    }

    cout<<"\nThe sorted array:";
    for(i=0;i<n;i++)
    {
        cout<<a[i]<<" ";
    }
    return 0;

}
