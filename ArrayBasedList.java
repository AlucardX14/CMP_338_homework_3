
public class ArrayBasedList<I>  implements ListInterface<I>, Comparable<I> {
	
	private I[] myArray;
	private int size;
	private int index;
	
	public ArrayBasedList() {
		this.size = 10;
		 myArray = (I[]) new Object[size];
		 this.index =0;
	}  
		
	public ArrayBasedList(int size){  // sure
	      this.size = size;
	      myArray = (I[]) new Object[size];
	      this.index =0;
	}
	
	@Override
	public int size() {       ///  returning the size
		return this.size();
		}

	@Override
	public boolean isEmpty() {
		
        return (this.size == 0);   // make it the size = 0
	}

	@Override
	public void add(I obj) {     // adding if the size < then my array length add 1
		if (this.size < myArray.length) {
			this.myArray[this.size++] = obj;
		}
		
	}

	@Override
	public boolean add(I obj, int index) {
		if(myArray[index] == obj){
			return true;
		}
		else{
			return false;}}
		
	@Override
	public boolean addSorted(I obj) {
		
		if( obj instanceof Integer){
			int insert = (int) obj; //  compare the list
			
			for(int i= 0; i < size-1; i++){
				int current = (int) myArray[i];
				
				// Compare insert with current
				// If insert < current then copy end of the array and insert then add the copy
				// Or if end of list reached then add to end of list
			  if( insert < current){
				int  temp [] = new int[size - current]; // storing the value
				 for(int k =0; k < temp.length; k++ ) {
					temp[k] = (int)myArray[i+k]; //// it copy the array to the end of the list
				 
				 }
				 
				 myArray[i] = obj; /// insert the obj to the right location
				 
				 for(int k =0; k < temp.length; k++ ) {
				////	 myArray[i+k] = (I)temp[k];
					 
					 }
				 
			  }
			}
		}
		
		return false;
	
	}
	
	@Override
	public I get(int index) {
		I returnObject = null;

		if((index >= 0) && (index < this.size)) {
			returnObject = this.myArray[index];   /// getting the ob the is in the location and rerurn it
		}return returnObject; }
	
    @Override
	public I replace(I obj, int index) {
		if(myArray[index]!= null) {   // making sure that index is there.
			this.myArray[index] = obj;  // putting the obj into the array            
			
			return this.myArray[index];} // returning the obj that i put into the array.
			                                    
			return null;
	}
		
	

	@Override
	public boolean remove(int index) {  // this is removing if 
         boolean success = false;            
		
		if((index >= 0) && (index < this.size)) {
			for ( int i = (index + 1) ; i < this.size ; i++ ) {
				this.myArray[i-1] = this.myArray[i];
			}
			this.size--; // 
		}

		return success;
	}
	@Override
	public void removeAll() {
		
		for ( int i = 0 ; i < this.myArray.length ; i++ ) {
			this.myArray[i] = null;
		}
		
	//	this.myArray = (I[]) new Object[10000]; // a copy of the array and saying that is		
	//	this.size = 0;                                 // equal to 0 to remove all.
		
	}

	@Override
	public int compareTo(I obj) {
		if (obj instanceof Integer) 
			return 1;
			
		return 0;
	}
	
}




