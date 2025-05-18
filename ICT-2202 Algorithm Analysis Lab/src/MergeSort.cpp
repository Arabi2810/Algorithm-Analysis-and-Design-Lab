#include <iostream>
using namespace std;
void merge(int arr[], int f, int m, int l)
{
  int n1 = m - f + 1;
  int n2 = l - m;
  int a1[n1], a2[n2];
  for (int i = 0; i < n1; i++)
   {
       a1[i] = arr[f + i];
   }
  for (int j = 0; j < n2; j++)
  {
       a2[j] = arr[m + 1 + j];
  }
  int i=0, j=0, k=f;
  while (i < n1 && j < n2)
  {
    if (a1[i] <= a2[j])
    {
      arr[k] = a1[i];
      i++;
    }
    else
    {
      arr[k] = a2[j];
      j++;
    }
    k++;
  }
  while (i < n1)
  {
    arr[k] = a1[i];
    i++;
    k++;
  }
  while (j < n2)
  {
    arr[k] = a2[j];
    j++;
    k++;
  }
}

void mergeSort(int arr[], int f, int l)
{
  if (f < l)
   {
    int m = f + (l - l) / 2;
    mergeSort(arr, f, m);
    mergeSort(arr, m + 1, l);
    merge(arr, f, m, l);
  }
}
int main()
{
    int n;
    cout<<"Enter n: ";
    cin>>n;
    int arr[n],i;
    cout<<"Enter the numbers: ";
    for(i=0;i<n;i++)
    {
        cin>>arr[i];
    }
  mergeSort(arr, 0, n-1 );
  cout << "Sorted array: \n";
  for (int i = 0; i < n; i++)
    {
        cout << arr[i] << " ";
    }
  return 0;
}
