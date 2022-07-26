package Thread;

public class odd_no extends even_no {
	public void run() {
		odd();
	}
	public void odd() {	

    	aceept();
        try {
    			Thread.sleep(2000);
    		} catch (InterruptedException e) {

    			e.printStackTrace();
    		}
    		 
    	for(i=min;i<max;i++ )
    	if(i%2!=0) {
			System.out.println("odd numbers:"+i);	
		}

}

}
