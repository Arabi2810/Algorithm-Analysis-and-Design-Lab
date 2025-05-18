#include<iostream>
using namespace std;
int main()
{
    int n;
    cout<<"Enter array size:";
    cin>>n;
    int a[n];
    int i,j;
    cout<<"\nEnter array elements: ";
    for(int i=0;i<n;i++)
    {
        cin>>a[i];
    }
    int max=a[0];
    cout<<"\nThe array before sorting is: ";
    for(i=0;i<n;i++)
     {
         cout<<a[i]<<" ";
         if(a[i]>max)
         {
             max=a[i];
         }
     }

    int c[max+1]={0};
    int b[n];
    for(i=0;i<n;i++)
    {
        c[a[i]]++;
    }
    for(i=1;i<=max;i++)
    {
        c[i]=c[i]+c[i-1];
    }
     for(j=n-1;j>=0;j--)
     {
         b[c[a[j]]-1]=a[j];
         c[a[j]]--;
     }
     cout<<"\nThe array after sorting is: ";
     for(i=0;i<n;i++)
     {
         cout<<b[i]<<" ";
     }
     return 0;
}
