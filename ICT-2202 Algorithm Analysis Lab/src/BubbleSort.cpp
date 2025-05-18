#include<iostream>
#include<conio.h>
using  namespace std;
int main()
{
    int n;
    cout<<"Enter n: ";
    cin>>n;
    int a[n],i,j,temp;
    cout<<"Enter the numbers: ";
    for(i=0;i<n;i++)
    {
        cin>>a[i];
    }
    for(j=1;j<n;j++)
    {
        for(i=0;i<n-j;i++)
        {
            if(a[i]>a[i+1])
            {
                temp=a[i];
                a[i]=a[i+1];
                a[i+1]=temp;
            }
        }
    }
    cout<<"The sorted array is: ";
    for(i=0;i<n;i++)
    {
        cout<<a[i]<<" ";
    }
    getch();
}
