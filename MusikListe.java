import java.util.ArrayList;
public class MusikListe {
  
  public static void main(String[] args) {
    
    ArrayList<Musik> musikListe=new ArrayList<Musik>();
    
    String sucheName="Sido";
    int gefunden=-1;
    double summe=0;
    
    
    
    
    
    
    musikListe.add(new Musik("Eisblumen","Sabway To Sally",4.5));
    musikListe.add(new Musik("Augen auf","Sido",3.5));
    
    Musik test=new Musik("New Age","Marlon Roudette",3.5);
    musikListe.add(test);
    
    for (int i=0;i<musikListe.size() ;i++ ) {
      musikListe.get(i).toString();
    } // end of for
    
    for (Musik a:musikListe) {
      System.out.println(a.toString());
    } // end of for
    
    
    if(musikListe.contains(test)){
      System.out.println("Ist da");      
      }else{
      System.out.println("Ist nicht da");     
    }
    
    
    for (int i=0;i<musikListe.size() ;i++ ) {
      if (sucheName==musikListe.get(i).interpret){
        gefunden=i;
        }
    } // end of for
    
    System.out.println("Das gesuchte Lied wurde an der stelle: "+gefunden+" im Array gefunden.");
    
    
    
    for (int i=0;i<musikListe.size() ;i++ ) {
      if ("adsaagag"==musikListe.get(i).interpret){
        gefunden=i;
        }
    } // end of for
    
    musikListe.remove(2);
    if(musikListe.contains(test)){
      System.out.println("Ist da");      
      }else{
      System.out.println("Ist nicht da");     
    }
    musikListe.add(test);
    if(musikListe.contains(test)){
      System.out.println("Ist da");      
      }else{
      System.out.println("Ist nicht da");     
    }
    musikListe.remove(test);
    if(musikListe.contains(test)){
      System.out.println("Ist da");      
      }else{
      System.out.println("Ist nicht da");     
    }
    
    for (int i=0;i<musikListe.size() ;i++ ) {
      summe+=musikListe.get(i).laengeMin;
    } // end of for
    
    System.out.println(summe);
  } // end of main

} // end of class MusikListe

