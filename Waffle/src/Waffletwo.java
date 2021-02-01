/**
 * @(#)Waffletwo.java
 *
 *
 * @author 
 * @version 1.00 2017/7/29
 */
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
public class Waffletwo extends Waf {
	
	Baligya pra = new Baligya();
		

    public Waffletwo() {
    }
    
   	String nem1 = "SlurpeeSmall", nem2="SlurpeeMedium", nem3="SlurpeeLarge", nem4="CityBlendsSMALL",
   			nem5="CityBlendsMEDIUM", nem6="CityBlendsLarge", nem7="GulpSmall", nem8="GulpMedium", nem9="GulpLarge", nem10="BigChickenCheese",
   			nem11="Big Bacon", nem12="BigPizza", nem13="BigChilly", nem14="BigPotato", GetOrder;	
   			
   			
   
    int slurpeeS=0,slurpeeSqty=100,
    		slurpeeM=0,slurpeeMqty=100,
    		slurpeeL=0,slurpeeLqty=100,
    		CityS=0,CitySqty=100,
    		CityM=0, CityMqty=100,
    		CityL=0, CityLqty=100,
    		GulpS=0,GulpSqty=100,
    		GulpM=0, GulpMqty=100,
    		GulpL=0,GulpLqty=100,
    		BigChickenCheese=0,BigChickenCheeseqty=100,
    		BigBacon=0,BigBaconqty=100,
    		BigPizza=0,BigPizzaqty=100,
    		BigChilly=0,BigChillyqty=100,
    		BigPotato=0, BigPotatoqty=100,
    		qty=0,Wtotal=0,newWtotal=0,
    		order,
    		order1,
    		order2,
    		add,
    		cash,out, karent, newqty;
    		double vat=0.11;

    
    public void WaffleTaym(){

 			
		 
		 
		 System.out.println("");
		 
		 pra.products();
		 
		 Scanner oi= new Scanner(System.in);
		 
		 
		 do{
		 System.out.println("Costumer order(s)");
		 order = oi.nextInt();
		 System.out.println("Quantity");
		 qty = oi.nextInt();
		 
		 System.out.println("");
		 if(order==1){
		 		Wtotal= slurpeeS + 18 * qty;
		 		slurpeeSqty= slurpeeSqty - qty;
		 		GetOrder=nem1;
		 	} 		
		 else if(order == 2){
		 		Wtotal= slurpeeM + 14 *qty;
		 		slurpeeMqty= slurpeeMqty - qty;
		 		GetOrder=nem2;
		 	}	
		 else if(order == 3){
		 		Wtotal= slurpeeL + 20 *qty;
		 		slurpeeLqty= slurpeeLqty - qty;
		 		GetOrder=nem3;
		 	}
		 else if(order == 4){
		 		Wtotal= CityS + 20 *qty;
		 		CitySqty= CitySqty - qty;
		 		GetOrder=nem4;
		 	}
		 else if(order == 5){
		 		Wtotal= CityM + 20 *qty;
		 		CityMqty= CityMqty - qty;
		 		GetOrder=nem5;
		 	}
		 else if(order == 6){
		 		Wtotal= CityL + 20 *qty;
		 		CityLqty= CityLqty - qty;
		 		GetOrder=nem6;
		 	}
		 else if(order == 7){
		 		Wtotal= GulpS + 14 *qty;
		 		GulpSqty= GulpSqty - qty;
		 		GetOrder=nem7;
		 	}
		 else if(order == 8){
		 		Wtotal= GulpM + 14 *qty;
		 		GulpMqty= GulpMqty - qty;
		 		GetOrder=nem8;
		 	}
		 else if(order == 9){
		 		Wtotal= GulpL + 14 *qty;
		 		GulpLqty= GulpLqty - qty;
		 		GetOrder=nem9;
		 	}
		 else if(order == 11){
		 		Wtotal= BigChickenCheese + 12 *qty;
		 		BigChickenCheeseqty= BigChickenCheese - qty;
		 		GetOrder=nem10;
		 	}
		 else if(order == 12){
		 		Wtotal= BigBacon + 18 *qty;
		 		BigBaconqty= BigBaconqty - qty;
		 		GetOrder=nem11;
		 	}
		 else if(order == 13){
		 		Wtotal= BigChilly + 14 *qty;
		 		BigChillyqty= BigChillyqty - qty;
		 		GetOrder=nem12;
		 	}
		 else if(order == 14){
		 		Wtotal= BigPizza + 16 *qty;
		 		BigPizzaqty= BigPizzaqty - qty;
		 		GetOrder=nem13;
			}
		 	
		 												
		newWtotal= Wtotal + newWtotal;
	
	
		System.out.println("Add more orders? [1] Yes or [2] No");
		add= oi.nextInt();
		 }while(add==1);
		System.out.println("Customer Cash");
		cash=oi.nextInt();
		System.out.println("Cash: " + cash + " pesos");	
		System.out.println("Total: " + newWtotal + " pesos");	
		System.out.println("Change:" + (cash - newWtotal) + " pesos" );
		
		System.out.println("==========================================");
		System.out.println("==========================================");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		/* RESIBO */
		
		pra.logo();
		System.out.println("");
		System.out.println("");
		System.out.println("\t \t \t \t   Philippine Seven Corporation");
		System.out.println("\t \t \t \t  VATREGTIN #000-390-189-1171");
		System.out.println("\t \t \t \t  PUROk 7, POBLACION, VALENCIA,");
		System.out.println("\t \t \t \t \t  BUKIDNON PHILIPPINES");
		System.out.println("\t \t \t \t \t \t TEL # (02)0000000");
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
			LocalDateTime now = LocalDateTime.now();
			System.out.println("\t \t \t \t \t \t" + dtf.format(now));
			
		System.out.println("");	
		System.out.println("--------------------------------------------------------");
		System.out.println("Total (" +newWtotal+")" + newWtotal+ "Pesos");
		System.out.println("CASH \t \t \t \t"+cash );
		System.out.println("CHANGE\t \t \t \t" + (cash-newWtotal));	
		System.out.println("");	
		System.out.println("");	
		System.out.println("VAT TABLE \t \t \t "  + (newWtotal-(newWtotal*vat)));
		System.out.println("VAT_TAX TABLE \t \t \t " + (newWtotal*vat));
		System.out.println("");
		
					
		System.out.println("Sold to:____________________");
		System.out.println("Name: ______________________");
		System.out.println("Address:____________________");
		System.out.println("TIN:________________________");
		System.out.println("");
		
		System.out.println("\t \t \t PHLIPPINE Seven Corporation");
		System.out.println("\t \t \t 7th Floor The Colomobia Tower");
		System.out.println("\t \t \t   Ortigas Avenue, Mandaluyong City");
		
		System.out.println("");
		
		
		System.out.println("\t \t \t AccrDate: 04/03/2017/ - 12/31/2030");
		System.out.println("\t \t \t THIS SHALL BE VALID");	
		System.out.println(" \t \t \t FIVE (5) YEARS FROM THE DATE ");
		System.out.println("\t \t \t PERMIT TO USE");		
		System.out.println("");
		System.out.println("\t \t \t \t Join the Awesome Ride");
		System.out.println("\t \t \t E-raffle Promo with Every P50");
		System.out.println("\t \t \t \t worth of paricipating");	
		System.out.println("\t \t \t Beverages products using your");
		System.out.println("\t \t \t \t CLIQQ App DTI-FIEB Permit#9671");
		System.out.println("\t \t \t faceboook.com/7eleven Philippines");	
		System.out.println("");
		System.out.println("");
		
		
		Scanner stx= new Scanner(System.in);	
		System.out.println("Go to current stocks? [1]YES [2]NO");
		karent=stx.nextInt();
		System.out.println("");
		System.out.println("");
		
		if(karent==1){
			halin();
			
		}
		else if(karent==2){
			System.out.println("Thank you for logging in");
		}
		else if(karent>2){
			System.out.println("INVALID INPUT");
		}
			
		
			
									
		System.out.println("");
		System.out.println("");
		System.out.println("");
			
		
    }
    
    public void salin(){
    		
    	}
    public void halin(){
    		System.out.println("Your total sales as of now is: " + newWtotal + "Pesos");
    		System.out.println("");
    		System.out.println("");
    		System.out.println("YOUR CURRENT STOCKS ARE");
    		
    		System.out.println(nem1 + "=  "+ slurpeeSqty);
    		System.out.println(nem2 + "=  " + slurpeeMqty);
    		System.out.println(nem3 + "=  " + slurpeeLqty);
    		System.out.println(nem4 + "=  " +CitySqty);
    		System.out.println(nem5 + "=  " +CityMqty);
    		System.out.println(nem6 + "=  " +CityLqty);
    		System.out.println(nem7 + "=  " +GulpSqty);
    		System.out.println(nem8 + "=  " +GulpMqty);
    		System.out.println(nem9 + "=  " +GulpLqty);
    		System.out.println(nem10 + "=  " +BigChickenCheeseqty);
    		System.out.println(nem11 + "=  " +BigBaconqty);
    		System.out.println(nem12 + "=  " +BigPizzaqty );
    		System.out.println(nem13 + "=  " +BigChillyqty);
    		System.out.println(nem14 + "=  " +BigPotatoqty);
    	}
   
    
    
}