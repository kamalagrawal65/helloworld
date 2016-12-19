class threadrunnable implements Runnable{
	public void run(){
		System.out.println("I am a runnable thread");
	}
	public static void main(String args[]){
		threadrunnable t1=new threadrunnable();
		Thread t2=new Thread(t1);
		t2.start();
	}
}
