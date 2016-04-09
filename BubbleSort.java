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
	    }
	    for(int i=0;i<total;i++) {
	    	System.out.print(a.get(i)+",");
	    }
	    System.out.println();
	    for(int i=1;i<=total;i++) {
	    	for(int j=0;j<total-i;j++) {
	    		if(a.get(j)>a.get(j+1)) {
	    			x=a.get(j);
	    			a.remove(j);
	    			a.add(j+1,x);
	    		}
	    	}
	    }
	    for(int i=0;i<total;i++) {
	    	System.out.print(a.get(i)+",");
	    }
	}
}