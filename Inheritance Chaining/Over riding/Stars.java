class Stars{
    public static void main (String... args){
	    
	  int n=4;
	  for (int i =0; i <= n; i++) { 
            // inner loop to print space 
            for (int j = 0; j <= n - i; j++) { 
                System.out.print(" "); 
            } 
            // inner loop to print star 
            for (int j = 0; j <= i; j++) { 
                System.out.print(" *"); 
            } 
            // print new line for each row 
            System.out.println(); 
        } 
    } 
}