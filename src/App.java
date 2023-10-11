import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner tangentbord = new Scanner(System.in);

        System.out.println("Skriv in ett tal: ");
        int tal1 = tangentbord.nextInt();

        if(tal1<1000) //Om talet är mindre än 1000
        System.out.println("Närmaste tusental är:\"1000\""); //Skriver ut

        if(tal1>=1000){ //Om talet är mer eller lika med 1000
        tal1+=500; 
        tal1/=1000;
        tal1*=1000;
        System.out.println("Närmaste tusental är: \""+tal1+"\""); //Skriver ut
        }

        //b)
        System.out.println("Skriv in täljaren och nämnaren: "); 
        int tal2 = tangentbord.nextInt();
        int tal3 = tangentbord.nextInt();
        int talm = tal2%tal3; //Räknar ut resten av de tal användaren skrev in
        System.out.println(tal2/tal3+" "+talm+"/"+tal3); //Skriver ut


        //c)
        System.out.println("Ange antal timmar: ");
        int tim = tangentbord.nextInt();              //Antalet timmar använadren skrev in

        System.out.println("Ange antal minuter: ");
        int min = tangentbord.nextInt();              //Antalet minuter användaren skrev in

        System.out.println("Ange antal sekunder: ");
        int sek = tangentbord.nextInt();              //Antalet sekunder användaren skrev in

        double summaS = (((double)tim*3600)+((double)min*60)+sek);  //Summan av givna timmar, minuter och sekunder, i form av sekunder

        System.out.println("Tidsomvandling ger: "+summaS/3600+" h = "+summaS/60+" m = "+summaS+" s");  //Skriver ut 
    }
}
