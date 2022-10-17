public class LinkedList {

  public static void main(String args[]){
    
    List list = new List();
    list.add("Data");
    list.add("Data2");
    list.add("Data3");
    list.show();
  }
}


class Node {
  private String data;
  private Node next;

  public Node(String data) {
    this.data = data;
  }
  public void setData(String data){
		this.data = data;
	}
	public void setNext(Node node){
		this.next = node;
	}
	public String getData(){
		return this.data;
	}
	public Node getNext(){
		return this.next;
	}
}


class List{
  private Node head;
  private Node tail;

  public Node getHead(){
		return this.head;
	}
	public Node getTail(){
		return this.tail;
	}

  public void add(String data) {
    Node newNode = new Node(data);
    if(this.head == null)
      this.head = this.tail = newNode;
    else{
      this.tail.setNext(newNode);
      this.tail = newNode;
    }
  }


  public void show() {
       Node temp = this.head;
       while(temp != null){
        System.out.print(temp.getData());
        temp = temp.getNext();
       }
  }

} 