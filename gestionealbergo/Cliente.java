package gestionealbergo;
import java.util.*;

public class Cliente {

   String nome;
   String cognome;
   String disabilita;
   String check_in;

   public Cliente(){}

   public Cliente(String nome, String cognome, String disabilita, String check_in){

       this.nome=nome;
       this.cognome=cognome;
       this.disabilita=disabilita;
       this.check_in=check_in;
   }




   public void setNome(String nome){
       this.nome=nome;
   }

   public void setCognome(String cognome){
       this.cognome=cognome;
   }

   public String getNome(){
       return nome;
   }

   public String getCognome(){
       return cognome;
   }




   public void setDisabilta(String disabilita){
       this.disabilita=disabilita;
   }

   public String getDisabilita(){
       return disabilita;
   }




   public void setCheckIn(String check_in){
       this.check_in=check_in;
   }

   public String getCheckIn(){
       return check_in;
   }



   @Override

   public String toString(){
       return "\nCognome: " + cognome + "\nNome: " + nome + "\nDisabilità: " + disabilita + "\nCheck-in: " + check_in;
   }



   /*private String inserimentoCognome(){                //metodo inserimento cognome
       System.out.println("\nInserire il cognome: ");
       cognome=input.nextString();
       return cognome;
   }

   private String inserimentoNome(){                   //inserimento nome
       System.out.println("\nInserire il nome: ");
       nome=input.nextString();
       return nome;
   }

   private String inserimentoDisabilita(){            //inserimento disabilità
       System.out.println("\nHa qualche disabilità? \nRisponda scrivendo si oppure no: ");
       disabilita=input.nextString();
       return disabilita;
   }

   private String inserimentoCheckIn(){                //inserimento check_in

       int giorno;
       String mese;
       int anno;

       System.out.println("\nInserire il giorno: ");
       giorno=input.nextInt();
       System.out.println("\nInserire il mese: ");
       mese=input.nextString();
       System.out.println("\nInserire l'anno: ");
       anno=input.nextInt();

       return check_in;

   }*/
}

