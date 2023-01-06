package com.DataStru.Tree;

public class BinarySearchTree 
{
	private Node root=null;
	private int count=0;
	public boolean add(int k)
	{
		if(root==null)
		{
			root= new Node (k);
			count ++;
			return true ;
		}
		Node curr=root;
		Node prev=null;
		while(curr!=null)
		{
			if(k<curr.key)
			{
				prev=curr;
				curr=curr.left;
			}
			else if(k>curr.key)
			{
				prev=curr;
				curr=curr.right;
			}
			else 
			{
				 return false;
			}
		 }
			if(k<prev.key)prev.left=new Node(k);
			else prev.right=new Node(k);
			count++;
			return true;
		}
		public int size()
		{
			return count;
		}
}

