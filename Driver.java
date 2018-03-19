
public class Driver<I> implements DriverInterface{
	public static void main(String[] args) {
        Driver driver = new Driver();

        driver.runTestCase(ListType.ArrayBasedList, TestType.AddSortedOdd, 10);
    }

	@Override
	public ListInterface<Integer> createList(ListType listType, TestType forTestType) {
		if(forTestType == TestType.AddSortedOdd){

        }
        else if(forTestType == TestType.AddSortedEven){

        }
        else if(forTestType == TestType.AddAll){

        }
        else if(forTestType == TestType.AddAllAtIndexZero){

        }
        else if(forTestType == TestType.RemoveAllEven){

        }
        else if(forTestType == TestType.RemoveAllOdd){

        }
		
		return null;
	}

	@Override
	public ListInterface<Integer> initializeList(ListInterface<Integer> list, int firstNumber, int lastNumber,
			int increment) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double memoryUsage() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public RunTime runTestCase(ListType listType, TestType testType, int numberOfTimes) {
		switch(listType){
        case ArrayBasedList:
        	ArrayBasedList<I> bs = new ArrayBasedList<I>();
        	
			for (int i = 0; i < numberOfTimes; i++) {
		//		Integer[] array = this.createArray(listType,testType );
		///	bs.sort(array);
			}
		//return bs;

        case LinkedList:
        	 LinkedList t = new  LinkedList();


        default: return null;
    }
		
	}

}
