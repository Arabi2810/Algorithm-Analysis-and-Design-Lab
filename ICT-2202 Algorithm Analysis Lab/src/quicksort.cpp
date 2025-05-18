#include<iostream>
using namespace std;
int partition(int a[], int low, int high)
{
    int i,j,temp;
    int pivot=a[high];
    for(i=low-1,j=low;j<=high;j++)
    {
        if(pivot>a[j])
        {
            i++;
            temp=a[j];
            a[j]=a[i];
            a[i]=temp;
        }
        else{
            continue;
        }

    }
    temp=a[high];
    a[high]=a[i+1];
    a[i+1]=temp;
    return i+1;
}
void quicksort(int a[], int low, int high)
{
    if(low>=high)
        return;

    int p=partition(a,low,high);
    quicksort(a,low,p-1);
    quicksort(a,p+1,high);


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
    quicksort(a,0,n-1);
    cout<<"\nArray after sorting:";
    for(int i=0;i<n;i++)
    {
        cout<<a[i]<<" ";
    }
}
