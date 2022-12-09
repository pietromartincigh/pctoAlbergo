package gestionealbergo;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Stanza{

    private int numero;
    private int piano;
    private int prezzo;
    private int tipo_stanza;
    private ArrayList <Servizio> servizi = new ArrayList <Servizio>();
    private boolean disponibilita;
    private String checkin;
    private String checkout;
    private Data data = new Data();
    private ArrayList <Cliente> clienti = new ArrayList <Cliente>();
    private int durata_alloggiamento;



    public Stanza(){

    }
//crea la stanza di base vuota
    public Stanza(int numero, int prezzo, int tipo_stanza){

        if(numero<0 || numero>100)
            throw new IllegalArgumentException("Numero stanza non disponibile;");

        if((int)numero/100<0 || (int)numero/100>Main.getNPiani())
            throw new IllegalArgumentException("Numero piano non disponibile;");

        if(prezzo<0)
            throw new IllegalArgumentException("Il prezzo deve essere maggiore di 0;");

        if(tipo_stanza<1 || tipo_stanza>4)
            throw new IllegalArgumentException("Il tipo di stanza può essere: 1 singola, 2 doppia, 3 tripla, 4 quadrupla");

        this.numero=numero;
        this.piano=(int)numero/100;
        this.prezzo=prezzo;
        this.tipo_stanza=tipo_stanza;
        this.disponibilita=true;
    }


//numero + piano
    public void setNumero(int numero){

        if(numero<0 || numero>100)
            throw new IllegalArgumentException("Numero stanza non disponibile;");

        if((int)numero/100<0 || (int)numero/100>Main.getNPiani())
            throw new IllegalArgumentException("Numero piano non disponibile;");

        this.numero=numero;
        this.piano=(int)numero/100;
    }

    public int getNumero(){
        return numero;
    }

        public int getPiano(){
        return piano;
    }


//prezzo
    public void setPrezzo(int prezzo){
        if(prezzo<0)
            throw new IllegalArgumentException("Il prezzo deve essere maggiore di 0;");

        this.prezzo=prezzo;
    }

    public int getPrezzo(){
        return prezzo;
    }


//tipo stanza
    public void setTipoStanza(int tipo_stanza){
        if(tipo_stanza<1 || tipo_stanza>4)
        throw new IllegalArgumentException("Il tipo di stanza può essere: 1 singola, 2 doppia, 3 tripla, 4 quadrupla");

        this.tipo_stanza=tipo_stanza;
    }

    public int getTipoStanza(){
        return tipo_stanza;
    }


//servizi
    public void setServizi(Servizio servizi[]){

        for(int i=0; i< Main.getNServizi(); i++)
        this.servizi.add(servizi[i]);
    }

    public ArrayList getServizi(){
        return servizi;
    }
    
    
//disponibilità
    public void setDisabilta(Boolean disponibilita){
        this.disponibilita=disponibilita;
    }
    
    public Boolean getDisponibilita(){
        return disponibilita;
    }


//checkin
    public String getCheckIn(){
        return checkin;
    }


//checkout
    public String getCheckOut(){
        return checkout;
    }


//durata alloggiamento
    public int getDurataAll(){
        return durata_alloggiamento;
    }


//to String
    public String toString(){
        return "Stanza n° "+numero+" piano "+piano;
    }
    
    
    
//permette di prendere la stanza per il giorno corrente
    public void accettazioneStanza(Cliente[] clienti, int durata_alloggiamento){

        this.data=Main.getDataAttuale();

        if(durata_alloggiamento<0)
            throw new IllegalArgumentException("La durata del alloggiamento non può essere negativo");

        this.checkin=Main.getDataAttualeString();
        this.disponibilita=false;
        this.checkout=data.aggiungiGiorni(durata_alloggiamento);

        //aggiunge i clienti
        for(int i=0; i < tipo_stanza; i++)
        this.clienti.add(clienti[i]);
    }



/*//permette di prenotare una stanza per una data successiva
    public void prenotazioneStanza(Cliente[] clienti, int durata_alloggiamento, Data data2){

        if(durata_alloggiamento<0)
            throw new IllegalArgumentException("La durata del alloggiamento non può essere negativo");

        for(int i=0; i < tipo_stanza; i++)
        this.clienti.add(clienti[i]);

        this.checkin=data2.toString();
        this.disponibilita=false;
        this.checkout=data2.aggiungiGiorni(durata_alloggiamento);
    }*/



//libera la stanza
    public void liberaStanza(){

        this.checkin="";
        this.checkout="";
        this.disponibilita=true;
        clienti.clear();
    }


//visualizza tutta la stanza
    public String visualizzaStanza(){

        return "Stanza n°"+numero+", piano "+piano+", prezzo: "+prezzo+"e/notte, tipo stanza: "+tipo_stanza;
     }



//visualizza se la stanza è occupata o meno (nel caso di clienti ritorna data entrata e uscita)
    public String visualizzaPrenotazione(){

        if(disponibilita==false)
        return "Stanza "+numero+" occupata dal "+checkin+" al "+checkout+" ("+durata_alloggiamento+" giorni);";

        return "La stanza "+numero+" è libera";
    }



//visualizza i clienti nella stanza
    public String visualizzaClienti(){

        if(disponibilita==true)
        return "La stanza "+numero+" è libera";

        String stringa="Clienti stanza "+numero+": \n";

        for(int i=0; i < tipo_stanza; i++)
        stringa+=clienti.get(i).visualizzaCliente()+"\n";

        return stringa;
    }



//visualizza tutti i servizi presenti nella stanza
    public String visualizzaServizi(){

        String stringa="Servizi stanza "+numero+": \n";

        for(int i=0; i < servizi.size(); i++)
        stringa+=servizi.get(i).toString()+"\n";

        return stringa;
    }


//aggiunge un servizio nella stanza
    public void aggiungiServizio(Servizio servizio){

        servizi.add(servizio);
    }



//aggiunge giorni alla data di uscita (solo se la stanza è attualmente occupata)
    public void aggiungiGiorni(int giorni_agg){

        if(disponibilita==false)
        throw new IllegalArgumentException("La stanza è libera;");
        
        else{
        this.durata_alloggiamento+=giorni_agg;
        this.checkout=data.aggiungiGiorni(durata_alloggiamento);
        }
    }


//calcola il prezzo della stanza
    public int calcolaPrezzo(){

        return prezzo*durata_alloggiamento;
    }



//controlla se la data attuale è uguale a quella di fine alloggiamento
    public Boolean fineAlloggiamento(GregorianCalendar data_attaule){
            // confronta il checkout con la data attuale
        return checkout.equals(data_attaule.toString());
    }





}