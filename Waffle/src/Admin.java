/**
 * @(#)Admin.java
 *
 *
 * @author 
 * @version 1.00 2017/10/10
 */
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Admin {
	Waffletwo estak = new Waffletwo();
	
    public Admin() {
    }
    
    public void AdminChoice(){
    		int choices;
    		
    		
    		
    		Scanner type = new Scanner(System.in);
    		
    		System.out.println("");
    		System.out.println("");
    		System.out.println("");
    		System.out.println("");
    		
    		System.out.println("**************************************************");
    		System.out.println("*****************WELCOME ADMIN********************");
    		System.out.println("**************************************************");
    		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
			LocalDateTime now = LocalDateTime.now();
			System.out.println("**************" + dtf.format(now) + "*****************");
    		
    		System.out.println("**************************************************");
    		System.out.println("");
    		
    		
    		System.out.println("[1]	CURRENT STOCKS");
    		System.out.println("[2]	INCOME");
    		System.out.println("[3] EXIT");
    		
    		choices = type.nextInt();
    		
    		if(choices==1){
    			
    			estak.salin();
    			
    		}
    		else{
    			
    		}
    		
    	}
    
}