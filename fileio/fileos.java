import java.io.FileOutputStream;
class fileos{
	public static void main(String args[]){
		try{
			FileOutputStream fout=new FileOutputStream("fileoutput.txt");
			//fout.write(65);	//writes A to the file
			String str="Bangalore is a nice place";
			byte barr[]=str.getBytes();
			fout.write(barr);
			fout.close();
		}catch(Exception e){

		}
	}
}
