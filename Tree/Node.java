package com.DataStru.Tree;

public class Node 
{
	int key;
	Node right;
	Node left;
	public Node(int k)
	{
		key =k;
	}
	public  Node(int k,Node l,Node r)
	{
		key=k;
		right=r;
		left =l;
	}
}
