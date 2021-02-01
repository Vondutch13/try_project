/**
 * @(#)ForLogin.java
 *
 *
 * @author 
 * @version 1.00 2017/10/9
 */

import java.util.*;
public class ForLogin extends Lagin{
		
	Admin sulodsaadmin = new Admin();
	
    public ForLogin() {
    }
    
     public void Login(){
     			String Username="Admin", Password="Admin",
     			Cashier_One="CashWan",PassCashOne="CashWan",
     			Cashier_Two="CashTwo", PassCashTwo="CashTwo",
     			 Un, Pass;
     			
     			
     			do{
    
    	Scanner input = new Scanner(System.in);
    	
    	System.out.println("Enter your Username");
    	Un = input.nextLine();
    
    	
    	System.out.println("Enter your Password");
    	Pass = input.nextLine();  
    		
    	if(Un.equals("Admin")&& Pass.equals("Admin")){
    			System.out.println("Log-in successful!");
    			sulodsaadmin.AdminChoice();
    			
    			break;
    		}
    	else if(Un.equals("CashWan")&& Pass.equals("CashWan")){
    			Waf kuha = new Waffletwo();
    			kuha.WaffleTaym();
    	
    		}
    	else if(Un.equals("CashTwo")&& Pass.equals("CashTwo")){
    			Waf kuha = new Waffletwo();
    			kuha.WaffleTaym();
    			break;
    		}	
    			
    	else{
    			System.out.println("");
    			System.out.println("");
    			System.out.println("Access denied!");
    			System.out.println("");
    			System.out.println("");
    		}	
    	
    	
    	}while(Username != Un && Password != Pass);	
     	}
    
}