

public class GoogleBillboard {
	public final static String e = "2.7182818284590452353602874713526624977572470936999595749669676277240766303535475945713821785251664274274663919320030599218174135966290435";  
	public static void main(final String[] args) {
		for (int i = 2; i < e.length()-10; i++) { 
			if (isPrime(Double.parseDouble(e.substring(i, i+10))) == true) {
			  System.out.println(e.substring(i, i+10));
			  break;
			}
		  }
	}
	

	//Finish this function
	public static boolean isPrime(double d){
	if (d >= 2) {
    	for (int i = 2; i <= Math.sqrt(d); i++) {
      		if (d % i == 0) {
        		return false;
      		}
    	}
  	} else {
    return false;
  	}
  	return true;
	}

}

