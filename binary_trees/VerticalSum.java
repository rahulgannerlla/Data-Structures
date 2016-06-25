package binary_trees;

import java.util.HashMap;

public class VerticalSum {
	
	public void vertical(BTNode node, int count, HashMap<Integer, Integer> hMap){
		if(node==null)
			return;
		
		if(hMap.get(count)==null){
			hMap.put(count, node.data);
		}else
			hMap.put(count, hMap.get(count)+node.data);
		
		vertical(node.leftNode, count-1,hMap);
		vertical(node.rightNode, count+1, hMap);
	}
	
	public static void main(String args[]){
		BinaryTree bt=new BinaryTree();
		BTNode head=bt.getHead();
		
		HashMap<Integer, Integer> hMap=new HashMap<Integer, Integer>();
		
		VerticalSum vs=new VerticalSum();
		vs.vertical(head, 0, hMap);
		
		System.out.println(hMap);
	}
}
