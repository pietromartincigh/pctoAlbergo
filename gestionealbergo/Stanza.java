package gestionealbergo;

import java.util.ArrayList;

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
    public Stanza(int numero, int prezzo, Servizio servizio[], int tipo_stanza){

        if(numero<0 || numero>100)
            throw new IllegalArgumentException("Numero stanza non disponibile;");

        if((int)numero/100<0 || (int)numero/100>Main.getNServizi())
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

        if((int)numero/100<0 || (int)numero/100>Main.getNServizi())
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
    
    
    
//permette di prendere la stanza per il giorno corrente
    public void accettazioneStanza(Cliente[] clienti, int durata_alloggiamento){

        if(durata_alloggiamento<0)
            throw new IllegalArgumentException("La durata del alloggiamento non può essere negativo");

        this.checkin=data.toString();
        this.disponibilita=false;
        this.checkout=data.aggiungiGiorni(durata_alloggiamento);

        //aggiunge i clienti
        for(int i=0; i < tipo_stanza; i++)
        this.clienti.add(clienti[i]);
    }




    public void prenotazioneStanza(Cliente[] clienti, int durata_alloggiamento, Data data2){

        if(durata_alloggiamento<0)
            throw new IllegalArgumentException("La durata del alloggiamento non può essere negativo");

        for(int i=0; i < tipo_stanza; i++)
        this.clienti.add(clienti[i]);

        this.checkin=data2.toString();
        this.disponibilita=false;
        this.checkout=data2.aggiungiGiorni(durata_alloggiamento);
    }


    public void liberaStanza(){

        this.checkin="";
        this.checkout="";
        this.disponibilita=true;
        clienti.clear();
    }



    public String visualizzaPrenotazione(){

        if(disponibilita==false)
        return "Stanza "+numero+" occupata dal "+checkin+" al "+checkout;

        return "La stanza "+numero+" è libera";
    }


    public String visualizzaClienti(){

        if(disponibilita==true)
        return "La stanza "+numero+" è libera";

        String stringa="Clienti stanza "+numero+": ";

        for(int i=0; i < tipo_stanza; i++)
        stringa+=clienti[i].get
    }


}