
public class Exam01 {

	public static void main(String[] args) {
		String dap = "2,3,4,1,2,3,1,2,4,3,2,1,4,3,2,3,1,3,3,2";
		String[]jdap = dap.split(",");
		String hak="1,aaa,2,2,1,2,3,1,2,3,4,3,1,2,3,4,3,2,3,4,2,1";
		String []hdap=hak.split(",");
		
		int tot=0;
		System.out.println("번\t이름\t1\t2\t3\t4\t5\t6\t7\t8\t9\t10\t11 12 13 14 15 16 17 18 19 20 총점");
		System.out.print(hdap[0]+"\t"+hdap[1]+"\t");
		for(int x=0;x<jdap.length;x++) {
			if(jdap[x].equals(hdap[x+2])) {
				System.out.print("O"+"\t");
				tot+=5;
			}else {
				System.out.print("X"+"\t");
			}
		}
		System.out.print(tot);
	}

}
