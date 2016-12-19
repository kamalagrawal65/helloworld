import java.io.Console;
class consoleio{
	public static void main(String args[]){
		Console c=System.console();
		System.out.println("ENter your name");
		String s=c.readLine();
		System.out.println(s);
	}
}
