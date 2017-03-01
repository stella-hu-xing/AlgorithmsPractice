package easy_level;

/**
 * Write a function that takes a string as input and returns the string reversed.

   Example:
   Given s = "hello", return "olleh".
   
 * @author xinghu
 *
 */
public class ReverseString_344 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	// runtime:3ms beats 53.34%
	 public String reverseString1(String s) {
	   		char[] rs = new char[s.length()];
			int i = s.length();
			char[] ss= s.toCharArray();
			for(int a=0;a<i;a++){
				rs[a]= ss[i-1-a];
			}
			
		    return String.valueOf(rs);
	    }
	 
	 
	// runtime:2ms beats 84.48%
	    public String reverseString2(String a) {
	         char[] f = a.toCharArray();
		 char[] s = new char[f.length];
		
		 for(int i = 0; i<f.length;i++){	
			 s[f.length-i-1] = f[i];
		 }
		 return new String(s);
	    }
}
