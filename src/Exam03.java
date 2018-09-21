
public class Exam03 {

	public static void main(String[] args) {
		int [][]arr=new int[5][5];
		int cnt=0;//카운트용
		int mi=0;//초기값
		int ma=arr.length-1;//조건최대값
		int n=1;//증감연산
		for(int x=0;x<arr.length;x++) {
			for(int y=mi;y!=ma+n;y+=n) {
				cnt++;
				arr[x][y]=cnt;
			}
			int imsi =mi;
			mi=ma;
			ma=imsi;
			n*=-1;
		}
		for(int x=0;x<arr.length;x++) {
			for(int y=0;y<arr.length;y++) {
				System.out.print(arr[x][y]+"\t");
			}
			System.out.println();
		}
		

	}

}
