import java.io.File;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args)throws Exception {
		Scanner scn =new Scanner(new File("c:\\data.txt"));
		String str = scn.nextLine();
		String hdap[]=str.split(",");//답지
		for(int x=0;x<hdap.length;x++) {
		System.out.print(hdap[x]);}
		System.out.println();
		
		while(scn.hasNextLine()) {
			String str2 = scn.nextLine();
			String gdap[]=str2.split(",");//답지
			int tot=0;
			System.out.print(gdap[0]+"\t"+gdap[1]+"\t");
			for(int x=0; x<hdap.length;x++) {
			if(gdap[x+2].equals(hdap[x])) {
				tot+=5;
				System.out.print("O"+"\t");
				
				}else {
				System.out.print("X"+"\t");
				}
			
				}
		System.out.print(tot);
		System.out.println();
	}
		
		
	}

}
