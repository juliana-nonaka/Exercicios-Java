package Familia58;

import java.util.Scanner;

public class Ex_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int n1,n2,n3; {
    	
    	Scanner leia = new Scanner(System.in);
    	
    	System.out.println("\nEscreva o primeiro n�mero: ");
    	n1 = leia.nextInt();
    	System.out.println("\nEscreva o segundo n�mero: ");
    	n2 = leia.nextInt();
    	System.out.println("\nEscreva o terceiro n�mero: ");
    	n3 = leia.nextInt();
    	
    	if(n1>=n2 && n1>=n3){
    		System.out.println("\n O maior n�mero �: "+ n1);
    	}
    			
    		
    		else if (n2>=n1 && n2>=n3) {
    		System.out.println("\nO maior n�mero �: "+n2);
    		}
    	
    		else{
    			
    			System.out.println("\nO maior n�mero �: "+n3);
    		}
    }
    
   
    
    
    
	}

}
