
public class LinkedList<I> implements ListInterface<I> {
	
	private LinkedListNode<I>  head;
    private LinkedListNode<I> tail;
	private int size;

	public LinkedList() {             
		tail = new LinkedListNode<I>(null);
		head = new LinkedListNode<I>(null, tail);
	    size = 0;

	}

	@Override
	public int size() {
     return size; }
	

	@Override
	public boolean isEmpty() {
		return (this.size == 0);} /// return true and false at the same time
	

	@Override
	public void add(I obj) { // add to the tail
		if(obj instanceof Integer){

		if (isEmpty()) {
			LinkedListNode<I> node = new LinkedListNode<I>(obj, tail);
			head.setNext(node);
		} else {
			LinkedListNode<I> temp = head.getNext(); /// tempory node to store
			while (true) {
				if (temp.getNext() == tail) { /// cheaking if is the las node
					temp.setNext(new LinkedListNode<I>(obj, tail));

					break;
				} /// i create a referent of LinkedListNode and i
							/// passed into the two parameters so that the new
							/// obj points to the tail ///
				else
					temp = temp.getNext();
				}    
         }
		size++;
		}
	}
	
	@Override
	public boolean add(I obj, int index) {
		LinkedListNode<I> temp = head; ////
		int count = 0;
		while (true) {
			if (count == index) {

		if (temp.getNext() != null) {
		LinkedListNode<I> newnode = new LinkedListNode<I>(obj, temp.getNext());/// create
																						/// a
																						/// new
																						/// one
																						/// and
																						/// point
	   temp.setNext(newnode); }// adding a node in the middle of the
		else {
		LinkedListNode<I> newnode = new LinkedListNode<I>(obj);/// create
																		/// a
		temp.setNext(newnode);	}	// becomes the tail												/// new
																		/// one
																		/// and
																		/// point
																		/// to
			return true;
			} else if (temp.getNext() != null)
				temp = temp.getNext();//// if there a next node get the next
										//// node if it exist
			else
				break;
			count++;
		}

		return false;
	}

	@Override
	public boolean addSorted(I obj) {
		boolean success = true;

		LinkedListNode<I> newNode = new LinkedListNode<I>(obj);
		LinkedListNode<I> prevNode = null;
		LinkedListNode<I> curNode = head;

		while (curNode != null) {
			Integer integerObj = null, integerCur = null;
			if (obj instanceof Integer) {
				integerObj = (Integer) obj;
			} else {
				return false;
			}

			if (curNode.getData() instanceof Integer) {
				integerCur = (Integer) curNode.getData();
			} else {
				return false;
			}

			int result = integerCur.compareTo(integerObj);

			if (result >= 0) {
				break;
			}

			prevNode = curNode;
			curNode = curNode.getNext();
		}

		if (curNode == head) {
			newNode.setNext(head);
			head = newNode;
		} else if (curNode == null) {
			tail.setNext(newNode);
			tail = newNode;
		} else {
			newNode.setNext(curNode);
			prevNode.setNext(newNode);
		}

		this.size++;

		return success;
	}

	@Override
	public I get(int index) { /// not sure

		I returnObject = null;

		if ((index >= 0) && (index < size)) {
			LinkedListNode<I> curNode = head;
			int curIndex = 0;

			while (curIndex != index) {
				curNode = curNode.getNext();
				curIndex++;
			}

			returnObject = curNode.getData();
		}

		return returnObject;
	}

	@Override
	public I replace(I obj, int index) {   /// how to reolace
		LinkedListNode<I> currentNode = head.getNext();
		LinkedListNode<I> previousNode = head;
		int current = 0;
		
		while(true){
			if(index == current){
				currentNode = new LinkedListNode<I>(obj, currentNode.getNext());
				previousNode.setNext(currentNode);
				
				return (I) currentNode;
			}
			
			currentNode = currentNode.getNext();
			previousNode = previousNode.getNext();
			current++;
			
			if(current > index) break;
		}
		return null; 
	}
		

	@Override
	public boolean remove(int index) { /// not sure
      boolean success = false;
		
		if((index >= 0) && (index < size)) {
			if (index == 0) {
				head = head.getNext();
			} else {
				LinkedListNode<I> curNode = head.getNext();
				LinkedListNode<I> prevNode = head;
				int curIndex = 1;
				while (curIndex != index) {
					prevNode = prevNode.getNext();
					curNode = curNode.getNext();
					curIndex++;
				}
				prevNode.setNext(curNode.getNext());
				if (curNode == tail) {
					tail = prevNode;
				}
			}
			size--;
			success = true;}
		return success;}
	
	
         @Override
         public void removeAll() {
		head = null;
		tail = null;
		size = 0;
		
		}

	//	@Override
	//	public int compareTo(Object obj) {
		///	if (obj instanceof Integer) 
	//			return 1;
				
	//		return 0;
			
		

}



