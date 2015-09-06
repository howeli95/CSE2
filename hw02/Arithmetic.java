//Yunhao LI
//hw2
//Sept 5, 2015
//CSE 002
//Arithmetic Program

//  define a class
public class Arithmetic {
    //main method required for every Java program
    public static void main (String [] args){
        
    //Number of pairs of socks
    int nSocks = 3;
    //Cost per pair of socks
    //(‘$’ is part of the variable name)
    double sockCost$ = 2.58;
    
    //Number of drinking glasses
    int nGlasses = 6;
    //Cost per glass
    double glassCost$ = 2.29;
    
    //Number of boxes of envelopes
    int nEnvelopes = 1;
    //cost per box of envelopes
    double envelopeCost$ = 3.25;
    
    double taxPercent = 0.06;
    
    double totalSockCostPreTax$ = nSocks * sockCost$; //total cost of socks before tax
    double totalSockTax$ = totalSockCostPreTax$ * taxPercent; //tax for socks
    
    double totalGlassCostPreTax$ = nGlasses * glassCost$; //total cost of glasses before tax
    double totalGlassTax$ = totalGlassCostPreTax$ * taxPercent; // tax for glasses
    
    double totalEnvelopeCostPreTax$ = nEnvelopes * envelopeCost$; //total cost of envelope before tax
    double totalEnvelopeTax$ = totalEnvelopeCostPreTax$ * taxPercent; //tax for envelopes
    
    double totalCostPreTax = totalSockCostPreTax$ + totalGlassCostPreTax$ + totalEnvelopeCostPreTax$;
    //total cost of all items pre tax
    double totalTax = totalSockTax$ + totalGlassTax$ + totalEnvelopeTax$;
    //total tax of all items
    double totalCost = totalCostPreTax + totalTax;
    //total cost including tax
    
    System.out.println(nSocks + " socks were bought, which cost " + sockCost$ + " each.");
    //print item name, numbers and unit cost
    System.out.println(nGlasses + " glasses were bought, which cost " + glassCost$ + " each.");
    //print item name, numbers and unit cost
    System.out.println(nEnvelopes + " envelope was bought, which cost " + envelopeCost$ + " each.");
    //print item name, numbers and unit cost
    
    System.out.println("Socks cost " + totalSockCostPreTax$ + " pre tax, and the tax is " + ((int)(totalSockTax$ * 100)) / 100.0);
    //print out total cost of this item pre tax, and the tax for this item with 2 decimal places
    System.out.println("Glsses cost " + totalGlassCostPreTax$ + " pre tax, and the tax is " + ((int)(totalGlassTax$ * 100)) / 100.0);
    //print out total cost of this item pre tax, and the tax for this item with 2 decimal places
    System.out.println("Envelopes cost " + totalEnvelopeCostPreTax$ + " pre tax, and the tax is " + ((int)(totalEnvelopeTax$ * 100)) / 100.0);
    //print out total cost of this item pre tax, and the tax for this item with 2 decimal places
    
    System.out.println("Total cost of purchases pre tax is " + totalCostPreTax);
    //print out cost of purchases pre tax
    System.out.println("Total sales tax is " + ((int)(totalTax * 100)) / 100.0);
    //print out total sales tax
    System.out.println("Total cost of purchases is " + ((int)(totalCost * 100)) / 100.0);
    //print out total cost of purchases including tax
    }
}