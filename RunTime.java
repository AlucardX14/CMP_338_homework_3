
public class RunTime implements RuntimeInterface {
	private long[] runTimes= new long[10];
	private int index = 0;
	/* (non-Javadoc)
	 * @see RuntimeInterface#getLastRunTime()
	 */

	public long getLastRunTime() {
		if (index !=0){
			return runTimes[index-1];
		}
		return 0;
	}
	
	/* (non-Javadoc)
	 * @see RuntimeInterface#getRunTimes()
	 */
	
	public long[] getRunTimes() {
		long[] temp = new long[10];
		for(int i = 0; i < index;i++){
			temp[i] = runTimes[i];
		}
		return temp;
	}

	/* (non-Javadoc)
	 * @see RuntimeInterface#resetRunTimes()
	 */
	
	public void resetRunTimes() {
		/*
		 * for(int i=0; i< runTimes.length();i++){
		 * runtime[i]=0
		 * }
		 * or we could do this
		 */
		runTimes = new long[10];
		index = 0;
	}

	/* (non-Javadoc)
	 * @see RuntimeInterface#addRuntime(long)
	 */
	
	public void addRuntime(long runTime) {		
		if(index < runTimes.length){
		runTimes[index++]= runTime;//This will put the runtime at the index and THEN increment index
		}else{
			for (int i=0;i < (runTimes.length-1);i++){
				runTimes[i]= runTimes[i+1];
			}
			runTimes[9]= runTime;
		}
		
	}

	/* (non-Javadoc)
	 * @see RuntimeInterface#getAverageRunTime()
	 */

	public double getAverageRunTime() {
		if(index <=1) {
			return runTimes[0];
		}
		else{
			double temp=0;
			for(int i=0; i <index;i++){
				temp+= runTimes[i];	
			}
			return (temp/((double)index));
		}
	}


		
	}




