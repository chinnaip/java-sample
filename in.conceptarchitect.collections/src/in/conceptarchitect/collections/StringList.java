package in.conceptarchitect.collections;

public class StringList {

	Node first,last;
	int count;
	
	
	public void add(String item) {
		Node node=new Node(item);
		node.next=null;
		node.previous=last;
		
		if(count==0)
			first=node;
		else
			last.next=node;
		
		last=node;
		count++;
	}
	
	private Node locate(int pos) {
		if(pos<0 || pos>=count)
			throw new IndexOutOfBoundsException("Invalid Index "+pos);
		
		if(pos==0)
			return first;
		else if(pos==count-1)
			return last;
		
		Node n=first;
		
		for(int i=0;i<pos;i++)
			n=n.next;
		
		return n;
		
		
	}

	public String get(int pos) {
		return locate(pos).item;
	}
	
	public void set(int pos, String item) {
		locate(pos).item=item;
	}
	
	public String remove(int pos) {
		Node d=locate(pos);
		if(d==first)
			first=d.next;
		else
			d.previous.next=d.next;
		
		if(d==last)
			last=d.previous;
		else
			d.next.previous=d.previous;
		
		return d.item;
	}
	
	public int size() {
		return count;
	}
	
	@Override
	public String toString() {
		StringBuilder builder=new StringBuilder();
		builder.append("StringList(\t");
		for(Node n=first;n!=null;n=n.next) {
			builder.append( n.item+"\t");
		}
		builder.append(")");
		return builder.toString();
	}
}
