import java.io.FileInputStream;
class fileis{
	public static void main(String args[]){
		try{
			FileInputStream fin=new FileInputStream("fileoutput.txt");
			//int i=fin.read();	//prints first character
			int i=0;
			while((i=fin.read())!=-1){
				System.out.print((char)i);
			}
		}catch(Exception e){
		
		}
	}
}
