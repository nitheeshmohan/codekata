#include<stdio.h>
#include<stdlib.h>
struct node
{
	int data;
	struct node *left,*right;

}*root,*temp,*p;
void add(struct node*,struct node*);
void dfs();
int main()
{
	int x,n;
	do{
	printf("\n1.create\n2.dfs");
	scanf("%d",&n);
	if(n==1)
	{
		scanf("%d",&x);
		p=(struct node*)malloc(sizeof(struct node));
		p->data=x;
		p->left=NULL;
		p->right=NULL;
		add(p,root);
	
	}
	if(n==2)
	dfs(root);
	}while(n<=2);
}
void add(struct node *p,struct node *b)
{
	
	if(root==NULL)
	root=p;
	else
	{
		temp=b;
		if(p->data<temp->data)
		{
			if(temp->left==NULL)
				temp->left=p;
			else
				add(p,temp->left);
		}
		else
		{
			if(temp->right==NULL)
				temp->right=p;
			else
				add(p,temp->right);
		}		
		
	}
}
void dfs(struct node *root)
{
	printf("%d->",root->data);
	dfs(root->left);
	dfs(root->right);
}
