
public class LinkedListNode<I> {

	private I data;
	private LinkedListNode<I> next;

	public LinkedListNode(I data) {
		this.data = data; // to store data into the variable
		next = null;
	}

	public LinkedListNode(I data, LinkedListNode<I> next) {
		this.data = data; // inisiliar the variable
		this.next = next;

	}

	public I getData() {
		return data;

	}
	public void setData(I data) {
		this.data = data;
	}

	public LinkedListNode<I> getNext() {
		return next;

	}
	//public void setData(I data) {
	//this.data = data;
	//}

	public void setNext(LinkedListNode<I> next) {
		this.next = next;
	}
}
