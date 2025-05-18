#include<iostream>
using namespace std;
void heapify(int a[], int n, int i)
{
    int temp;
    int largest=i;
    int left=2*i+1;
    int right=2*i+2;
    if(left<n && a[left]>a[largest])
    {
        largest=left;
    }
    if(right<n && a[right]>a[largest])
    {
        largest=right;
    }
    if(largest!=i)
    {
        temp=a[largest];
        a[largest]=a[i];
        a[i]=temp;
        heapify(a,n,largest);
    }
}
void heapsort(int a[], int n)
{
    int i;
    for(i=(n/2) -1;i>=0;i--)
    {
        heapify(a,n,i);
    }
    for(i=n-1;i>0;i--)
    {
        int temp=a[i];
        a[i]=a[0];
        a[0]=temp;
        heapify(a,i,0);
    }

}

int main()
{
    int n;
    cout<<"Enter the size of array:";
    cin>>n;
    int a[n];
    cout<<"\nEnter array elements:";
    for(int i=0;i<n;i++)
    {
        cin>>a[i];
    }
    cout<<"\nOriginal array:";
    for(int i=0;i<n;i++)
    {
        cout<<a[i]<<" ";
    }
    heapsort(a,n);
    cout<<"\nArray after sorting:";
    for(int i=0;i<n;i++)
    {
        cout<<a[i]<<" ";
    }
}
