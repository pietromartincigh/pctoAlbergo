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



   public String toString(){
       return "\nCognome: " + cognome + "\nNome: " + nome + "\nDisabilità: " + disabilita + "\nCheck-in: " + check_in;
   }


   public String visualizzaCliente(){

    return cognome+" "+nome;
   }


}

