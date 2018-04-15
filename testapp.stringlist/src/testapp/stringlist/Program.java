package testapp.stringlist;

import in.conceptarchitect.collections.StringList;
import in.conceptarchitect.utils.Action;
import in.conceptarchitect.utils.StopWatch;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringList list=new StringList();
		
		//simpleTest(list);
		
		StopWatch watch=new StopWatch();
		int count=20000;
		watch.run(new Action() {
			
			@Override
			public void execute() {
				// TODO Auto-generated method stub
				addItems(list, count);
			}
		}, "Adding  items");
		
		watch.run(new Action() {
			
			@Override
			public void execute() {
				// TODO Auto-generated method stub
				processItems(list);
			}
		}, "Processing Items");
		
	}

	private static void simpleTest(StringList list) {
		list.add("India");
		list.add("USA");
		list.add("UK");
		list.add("uae");
		list.add("france");
		list.add("germany");
		
		System.out.println(list);
	}
	
	static void addItems(StringList list,int count) {
		for(int i=0;i<count;i++)
			list.add("item"+i);
	}
	
	static int processItems(StringList list) {
		int count=0;
		String str="";
		for(int i=0;i<list.size();i++) {
			str=list.get(i); //you need this item
			count--;
		}
		return count;
	}
	

}
