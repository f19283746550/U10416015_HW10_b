import java.util.ArrayList;
import java.util.Scanner;
public class BubbleSort {
	private static int x;
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
	    ArrayList<Integer> a=new ArrayList();
	    int total=0;
	    System.out.println("Please input a number.(or input ctrl+Z to stop input)");
	    while(input.hasNext()) {
	    	x=input.nextInt();
	    	a.add(x);
	    	total++;
	    }//輸入數字
	    for(int i=0;i<total;i++) {
	    	System.out.print(a.get(i)+",");
	    }//先印一遍使用者打的順序
	    System.out.println();
	    for(int i=1;i<=total;i++) {
	    	for(int j=0;j<total-i;j++) {
	    		if(a.get(j)>a.get(j+1)) {
	    			x=a.get(j);
	    			a.remove(j);
	    			a.add(j+1,x);
	    		}
	    	}
	    }//從小排到大
	    for(int i=0;i<total;i++) {
	    	System.out.print(a.get(i)+",");
	    }//將整理完的印出來
	}
}
