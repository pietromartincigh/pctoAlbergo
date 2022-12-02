package gestionealbergo;

import java.util.GregorianCalendar;

import java.util.*;

public class Data {

    String month[] = { "Gennaio", "Febbraio", "Marzo", "Aprile", "Maggio", "Giugno", "Luglio", "Agosto", "Settembre", "Ottobre", "Novembre", "Dicembre" };

    private GregorianCalendar data = new GregorianCalendar();

    public Data(){
    }


    public Data(int giorno, int mese, int anno){

        data = new GregorianCalendar(anno, mese, giorno);
    }



    public String toString(){

        return data.get(Calendar.DATE)+ "/"+month[data.get(Calendar.MONTH)]+"/" +data.get(Calendar.YEAR);
    }


    public String aggiungiGiorni( int giorni){

        data.add(GregorianCalendar.DAY_OF_MONTH, giorni);

        return data.toString();
        
    }
}
