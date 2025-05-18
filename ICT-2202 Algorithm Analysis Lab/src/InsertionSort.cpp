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
    for(i=1;i<n;i++)
    {
        temp=a[i];
        j=i-1;
        while(j>=0 && a[j]>temp)
        {
            a[j+1]=a[j];
            j=j-1;
        }
        a[j+1]=temp;
    }
    cout<<"The sorted array is: ";
    for(i=0;i<n;i++)
    {
        cout<<a[i]<<" ";
    }
    getch();
}

