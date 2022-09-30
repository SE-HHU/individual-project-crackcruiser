package pm;
import java.io.*;
import java.util.*;

public class pupil_killer {
	public static void main(String args[]) throws IOException {
		/*int i;
		int j = 0;
		Scanner in = new Scanner(System.in);
		i = in.nextInt();
		String[] judgemental = new String[i];
		int[] answer1 = new int[i];
		National_Day_gift_package[] doomday1 =  new National_Day_gift_package[i];
		for(j = 0; j < i; j++) {
			National_Day_gift_package x = new National_Day_gift_package();
			doomday1[j] = x;
			judgemental[j] = new String(doomday1[j].moneycode);
			answer1[j] = doomday1[j].sol;
			//int n;
			n = 0;                                                              //
			for(int k = 0; k < j; k++){//
				if(judgemental[j].equals(judgemental[k])) {//
					n++;//
				}//
			}//
			while(n!=0) {//
				doomday1[j].remake();//
				judgemental[j] = new String(doomday1[j].moneycode);//
				answer1[j] = doomday1[j].sol;//
				System.out.println(doomday1[j].pain);//
				n = 0;//
				for(int k = 0; k < j; k++){//
					if(judgemental[j].equals(judgemental[k])) {//
						n++;//
					}//
				}//
				//
			}//
		}
		HashSet<String> set = new HashSet<>();
		set.add(doomday1[0].moneycode);
		for(j = 1; j < i; j++) {
			if(set.contains(doomday1[j].moneycode)) {
				doomday1[j].remake();
				judgemental[j] = new String(doomday1[j].moneycode);
				answer1[j] = doomday1[j].sol;
				System.out.println(doomday1[j].pain);
			}
		}
		File file1 = new File("D:/java/E/syntax/src/pm/Exercises.txt");
		File file2 = new File("D:/java/E/syntax/src/pm/Answer.txt");
		BufferedWriter b1 = new BufferedWriter(new FileWriter("D:/java/E/syntax/src/pm/Exercises.txt"));
		BufferedWriter b2 = new BufferedWriter(new FileWriter("D:/java/E/syntax/src/pm/Answer.txt"));
		
		b1.write("1、四则运算题目一");
		b2.write("1、四则运算题目一答案");
		for(j = 0; j < i; j++) {
			BufferedWriter bw1 = new BufferedWriter(new FileWriter("D:/java/E/syntax/src/pm/Exercises.txt"));
			BufferedWriter bw2 = new BufferedWriter(new FileWriter("D:/java/E/syntax/src/pm/Answer.txt"));
			String s = doomday1[j].pain;
			int ans = answer1[j];
			bw1.write(s);
			bw1.newLine();
			bw2.write(ans);
			bw2.newLine();
			//
			//
			System.out.println(s);
			System.out.println(ans);
			bw1.flush();
			bw2.flush();
			bw1.close();
			bw2.close();
		}
		b1.close();
		b2.close();
		*/
		Scanner in = new Scanner(System.in);
		int i = in.nextInt();
		File file1 = new File("Exercises.txt");
		File file2 = new File("Answer.txt");
        file1.delete();
        file2.delete();
        file1.createNewFile();
        file2.createNewFile();
		
		
		write1(1);
		write2(1);
		eposide eposide1 = new eposide(i);
		
		write1(2);
		write2(2);
		eposide eposide2 = new eposide(i);
		
		
	}

	public static void write1(int i) throws IOException{
		int n = i - 1;
		String[] s = new String[10];
		s[0] = "一";
		s[1] = "二";
		s[2] = "三";
		s[3] = "四";
		s[4] = "五";
		s[5] = "六";
		s[6] = "七";
		s[7] = "八";
		s[8] = "九";
		s[9] = "十";
		System.out.println(String.valueOf(i) + "、四则运算题目" + s[n]);
		FileWriter bxs1 = new FileWriter("Exercises.txt", true);
		bxs1.write("\n");
		bxs1.write(String.valueOf(i) + "、四则运算题目" + s[n]);
		bxs1.close();
		
	}
	public static void write2(int i) throws IOException{
		int n = i - 1;
		String[] s = new String[10];
		s[0] = "一";
		s[1] = "二";
		s[2] = "三";
		s[3] = "四";
		s[4] = "五";
		s[5] = "六";
		s[6] = "七";
		s[7] = "八";
		s[8] = "九";
		s[9] = "十";
		System.out.println(String.valueOf(i) + "、四则运算题目" + s[n] + "答案");
		FileWriter bxs2 = new FileWriter("Answer.txt", true);
		bxs2.write("\n");
		bxs2.write(String.valueOf(i) + "、四则运算题目" + s[n] + "答案");
		bxs2.close();
	}
}
class National_Day_gift_package{
	public int a, b;
	public int d, e;
	public double c, x, k;
	public String sOo1, sOo2, pain;
	public int sol = 0;
	public String moneycode; 
    public void pain_generating(){
    	a = (int)(99*Math.random()+1);
    	b = (int)(99*Math.random()+1);
    	c = Math.random();
    	x = Math.random();
    	if(x>0.5) {
    		sOo1 = "-";
    	}else {
    		sOo1 = "+";
    	}
    	if(c>0.5) {
    		d = (int)(99*Math.random()+1);
    		k = Math.random();
    		if(k>0.5) {
    			sOo2 = "-";
    		}else {
    			sOo2 = "+";
    		}
    		e = 3;
    	}else {
    		e = 2;
    	}
    }
    public void pain_releasing() {
    	if(c>0.5) {
    		pain = String.valueOf(a)+sOo1+String.valueOf(b)+sOo2+String.valueOf(d);
    	}else {
    		pain = String.valueOf(a)+sOo1+String.valueOf(b);
    	}
    }
    public int solve() {
    	sol = 0;
    	sol += a;
    	if(c>0.5) {
    		if(x>0.5) {
    			sol -= b;
    		}else {
    			sol += b;
    		}
    		if(k>0.5) {
    			sol -= d;
    		}else {
    			sol += d;
    		}
    	}
    	else{
    		if(x>0.5) {
    			sol -= b;
    		}else {
    			sol += b;
    		}
    	}
    	return sol;
    }
    /*@Override
    public boolean equals(Object obj) {
    	
    	return false;
    }*/
    public National_Day_gift_package(){
    	pain_generating();
    	pain_releasing();
    	solve();
    	create();
    }
    public void remake() {
    	pain_generating();
    	pain_releasing();
    	solve();
    	create();
    }
    public void create() {
    	int def = e;
    	if(def == 3) {
    		if(sOo1.equals(sOo2)&&sOo1.equals("+")) {
    		    int[] s1 = {a, b, d};
    		    Arrays.sort(s1);
    		    String s = String.valueOf(s1[0])+"p"+String.valueOf(s1[1])+"p"+String.valueOf(s1[2]);
    		    moneycode = new String(s);
    		    
    		}else if(sOo1.equals(sOo2)&&sOo1.equals("-")) {
    			int[] s2 = {b, d};
    			Arrays.sort(s2);
    			String s = String.valueOf(a)+"p"+String.valueOf(s2[0])+"p"+String.valueOf(s2[1]);
    			moneycode = new String(s);
    		    
    		}else{
    			int[] s3 = new int[3];
    			if(sOo1.equals("-")) {
    				s3[0] = a;
    				s3[1] = d;
    				s3[2] = b;
    			}else{
    				s3[0] = a;
    				s3[1] = b;
    				s3[2] = d;
    			}
    			String s = String.valueOf(s3[0])+"p"+String.valueOf(s3[1])+"m"+String.valueOf(s3[2]);
    			moneycode = new String(s);
    			
    		}
    		
    	}else {
    		if(sOo1.equals("+")) {
    			int s1[] = {a, b};
    			Arrays.sort(s1);
    			String s = String.valueOf(s1[0])+"p"+String.valueOf(s1[1]);
    			moneycode = new String(s);
    			
    		}else {
    			String s = String.valueOf(a)+"m"+String.valueOf(b);
    			moneycode = new String(s);
    			
    		}
    	}
    	
    }
}
class eposide{
	public eposide(int ax) throws IOException{    
	    int i = ax;
		int j = 0;
		
		
		String[] judgemental = new String[i];
		int[] answer1 = new int[i];
		National_Day_gift_package[] doomday1 =  new National_Day_gift_package[i];
		for(j = 0; j < i; j++) {
			National_Day_gift_package x = new National_Day_gift_package();
			doomday1[j] = x;
			judgemental[j] = new String(doomday1[j].moneycode);
			answer1[j] = doomday1[j].sol;
			
				
			
		}
		HashSet<String> set = new HashSet<>();
		set.add(doomday1[0].moneycode);
		for(j = 1; j < i; j++) {
			if(set.contains(doomday1[j].moneycode)) {
				doomday1[j].remake();
				judgemental[j] = new String(doomday1[j].moneycode);
				answer1[j] = doomday1[j].sol;
				System.out.println(doomday1[j].pain);
				System.out.println("remake");
			}
		}
        FileWriter bw1 =new FileWriter("Exercises.txt",true);
        FileWriter bw2 =new FileWriter("Answer.txt",true);
        bw1.write("\n");
		bw2.write("\n");
		for(j = 0; j < i; j++) {
			
			String s = doomday1[j].pain;
			int ans = answer1[j];
			String x = String.valueOf(ans);
			bw1.write("\n");
			bw1.write(s);
			bw2.write("\n");
			bw2.write(x);
			
			//
			//
			System.out.println(s);
			System.out.println(ans);
			
			
		}
		bw1.write("\n");
		bw2.write("\n");
		bw1.close();
		bw2.close();
	} 
}
