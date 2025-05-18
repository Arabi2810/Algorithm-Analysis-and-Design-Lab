#include<iostream>
using namespace std;
struct node{
  int data;
  struct node *left, *right;
};
struct node *createNode(int d)
{
    struct node *newNode=new(node);
    newNode->data=d;
    newNode->left=NULL;
    newNode->right=NULL;
    return newNode;
};
struct node *insertion(struct node *root, int d)
{
    if(root==NULL)
        return createNode(d);
    if(d<root->data)
        root->left=insertion(root->left,d);
    if(d>root->data)
        root->right=insertion(root->right,d);

    return root;
};
void inOrder(struct node *root)
{
    if(root==NULL)
        return;
    else
    {
         inOrder(root->left);
         cout<<root->data<<" ";
         inOrder(root->right);
    }

}
int main()
{
    struct node *root=NULL;
    int d;
    cout<<"Enter a number:";
    while(true)
    {
        cin>>d;
        if(d==-1)
            break;

        root=insertion(root,d);
    }
    cout<<"The sorting tree is:";
    inOrder(root);
}
