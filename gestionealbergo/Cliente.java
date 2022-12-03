package gestionealbergo;

public class Cliente {

   String nome;
   String cognome;
   Boolean disabilita;
   String check_in;

   public Cliente(){}

   public Cliente(String nome, String cognome, Boolean disabilita, String check_in){

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




   public void setDisabilta(Boolean disabilita){
       this.disabilita=disabilita;
   }

   public Boolean isDisabilita(){
       return disabilita;
   }




   public void setCheckIn(String check_in){
       this.check_in=check_in;
   }

   public String getCheckIn(){
       return check_in;
   }



   public String toString(){

    if(disabilita==true)
        return "\nCognome: " + cognome + "\nNome: " + nome + "\nDisabilità: si\nCheck-in: " + check_in;

    else
        return "\nCognome: " + cognome + "\nNome: " + nome + "\nDisabilità: no\nCheck-in: " + check_in;
   }


   public String visualizzaCliente(){

    return cognome+" "+nome;
   }


}

