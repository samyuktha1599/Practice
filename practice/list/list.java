package practice.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class list {
	
	public List<Integer> createList(int n)
	{
		List<Integer>list=new ArrayList<Integer>();
		for(int i=0;i<n;i++)
		{
			list.add(0);
		}
		return list;
		
	}
	
	public List<Integer> insert(int arr[])
	{
		List<Integer>list=new ArrayList<Integer>();
		for (Integer i:arr) {
			list.add(i);
			
		}
		return list;
		
	}
	
	public List<Integer> reverseListArray(List<Integer> list)
	{
		List<Integer>temp=new ArrayList<Integer>();
		ListIterator<Integer> itr=list.listIterator();
	/*	while(itr.hasPrevious())
		{
			int i=itr.previous();
			System.out.println(i);
			temp.add(i);
		}
	*/	
		for(int i=list.size()-1;i>=0;i--)
		{
			
			temp.add(list.get(i));
		}
		
		
		return temp;
		
	}
	
	public List<Integer> changeList(List<Integer> list, int m, int n)
	{int index=0;
		for (Integer i : list) {
			
			if(i==m)
			{
				list.set(index, n);
			}
			index++;
		}
		return list;
		
	}
	
	public static void main(String[] args) {
		list l=new list();
		List<Integer>list=l.createList(4);
		int arr[]= {10, 25, 33, 28,10,112};
		List<Integer>insertList=l.insert(arr);
		System.out.println(insertList);
		List<Integer>reverseList=l.reverseListArray(insertList);
		System.out.println(reverseList);
		List<Integer>changedList=l.changeList(insertList, 28, 22);
		System.out.println(changedList);
		
	}
	
	

}
