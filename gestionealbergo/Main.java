package gestionealbergo;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    
    private static int n_servizi;
    private static int n_piani;
    private static Data data_attuale;


//numero servizi
    public static void setNServizi(int n_servizi){
        Main.n_servizi=n_servizi;
    }

    public static int getNServizi(){
        return n_servizi;
    }

//numero piani
    public static void setNPiani(int n_piani){
        Main.n_piani=n_piani;
    }

    public static int getNPiani(){
        return n_piani;
    }

//prende la data del giorno attuale in string
    public static String getDataAttualeString(){
        return data_attuale.toString();
    }
//ritorna la data attuale in classe data
    public static Data getDataAttuale(){
        return data_attuale;
}
//aumenta di uno il giorno attuale (come se sia cambiato il giorno)
    public static void procediData(){
        Main.data_attuale.aggiungiGiorni(1);
    }





    public static void main(String[] args){


        int n_piani;
        int nStanza;
        int prezzoStanza;
        int tipoStanza;
        int contatoreStanze=0;
        String nomeServizio;
        double prezzoServizio;
        String nome;
        String cognome;
        int durataAlloggio;


        Scanner input=new Scanner(System.in);
        
        System.out.println("Inserire numero di piani: ");
        n_piani=input.nextInt();
        setNPiani(n_piani);

        Stanza[] stanze=new Stanza[n_piani*100];
        ArrayList <Servizio> servizi = new ArrayList <Servizio>();

        ArrayList <Cliente> cliente = new ArrayList <Cliente>();


        for(int i=0;i<n_piani*100;i++){
            stanze[i]=new Stanza(); 
        }



        System.out.println("\nInserire una stanza: ");
        System.out.println("\nInserire numero stanza: ");
        nStanza=input.nextInt();
        stanze[0].setNumero(nStanza);
        System.out.println("\nInserire prezzo stanza: ");
        prezzoStanza=input.nextInt();
        stanze[0].setPrezzo(prezzoStanza);
        
        System.out.println("tipo 1(singola)");
        System.out.println("tipo2(doppia)");
        System.out.println("tipo (terzetto)");
        System.out.println("tipo 4(quartetto)");
        System.out.println("\nInserire tipo stanza: ");
        tipoStanza=input.nextInt();
        stanze[0].setTipoStanza(tipoStanza);
        System.out.println("\n");
        contatoreStanze+=1;

        int scelta=0;

        do{
            

            System.out.println("0 procedere;");
            System.out.println("1 aggiungi un ulteriore stanza;");

            System.out.print("\nscelta: ");
            scelta=input.nextInt();

            switch(scelta){
                case 1:
                System.out.println("\nInserire una stanza: ");
                System.out.println("\nInserire numero stanza: ");
                nStanza=input.nextInt();
                stanze[contatoreStanze].setNumero(nStanza);
                System.out.println("\nInserire prezzo stanza: ");
                prezzoStanza=input.nextInt();
                stanze[contatoreStanze].setPrezzo(prezzoStanza);
                
                System.out.println("tipo 1(singola)");
                System.out.println("tipo2(doppia)");
                System.out.println("tipo (terzetto)");
                System.out.println("tipo 4(quartetto)");
                System.out.println("\nInserire tipo stanza: ");
                tipoStanza=input.nextInt();
                stanze[contatoreStanze].setTipoStanza(tipoStanza);
                System.out.println("\n");
                contatoreStanze+=1;
                break;
            }
        }while(scelta!=0);


    
        do{
            
                int variabile;
                Servizio temp=new Servizio();
                
              switch(scelta){
               

                case 1:

        //menù servizi

        switch(scelta){
               

            case 1://inserimento servizio
                
                System.out.println("inserire nome servizio: ");
                nomeServizio=input.nextLine();
                temp.setnome(nomeServizio);
                
                System.out.println("inserire prezzo: ");
                prezzoServizio=input.nextDouble();
                temp.setPrezzo(prezzoServizio);
                temp.setDisponibilita(true);

                servizi.add(temp);
            break;

            case 2://modificare servizio

                int a;

                for(int i=0; i<servizi.size();i++){
                    System.out.println((i+1)+" "+servizi.get(i).toString());
                }   

                System.out.println("scegliere quale modificare: ");
                variabile=input.nextInt()-1;

                System.out.println("inserire nome servizio: ");
                nomeServizio=input.nextLine();
                temp.setnome(nomeServizio);
                          
                System.out.println("inserire prezzo: ");
                prezzoServizio=input.nextDouble();
                temp.setPrezzo(prezzoServizio);

                System.out.println("inserire disponibilità\n(1=si)\n(2=no): ");
                a=input.nextInt();
                          
                if(a==1){
                    temp.setDisponibilita(true);
                }
                else{
                    temp.setDisponibilita(false);
                }
                          
                servizi.set(variabile,temp);
            break;
                      
            
            case 3://nuova stanza
                System.out.println("\nInserire una stanza: ");

                System.out.println("\nInserire numero stanza: ");
                nStanza=input.nextInt();
                stanze[contatoreStanze].setNumero(nStanza);

                System.out.println("\nInserire prezzo stanza: ");
                prezzoStanza=input.nextInt();
                stanze[contatoreStanze].setPrezzo(prezzoStanza);

        
                System.out.println("tipo 1(singola)");
                System.out.println("tipo2(doppia)");
                System.out.println("tipo (terzetto)");
                System.out.println("tipo 4(quartetto)");
                System.out.println("\nInserire tipo stanza: ");
                tipoStanza=input.nextInt();
                stanze[contatoreStanze].setTipoStanza(tipoStanza);
                System.out.println("\n");
                contatoreStanze+=1; 
            break;

                    
            case 4://modifica stanza
                for(int i=0; i<n_piani*100;i++){
                    System.out.println((i+1)+" "+stanze[i].toString());
                }    
                        
                System.out.println("scegliere quale modificare: ");
                variabile=input.nextInt()-1;
                          
                System.out.print("\nInserire numero stanza: ");
                nStanza=input.nextInt();
                stanze[variabile].setNumero(nStanza);

                System.out.print("\nInserire prezzo stanza: ");
                prezzoStanza=input.nextInt();
                stanze[variabile].setPrezzo(prezzoStanza);

        
                    System.out.println("tipo 1(singola)");
                    System.out.println("tipo2(doppia)");
                    System.out.println("tipo (terzetto)");
                    System.out.println("tipo 4(quartetto)");
                    System.out.println("\nInserire tipo stanza: ");
                    tipoStanza=input.nextInt();
                    stanze[contatoreStanze].setTipoStanza(tipoStanza);
                    System.out.println("\n");
                    contatoreStanze+=1; 
                    break;
                    
                case 4:
                        for(int i=0; i<n_piani*100;i++){
                            System.out.println((i+1)+" "+stanze[i].toString());
                         }    
                        
                        System.out.println("scegliere quale modificare: ");
                          variabile=input.nextInt();
                          
                          System.out.println("\nInserire una stanza: ");
                 System.out.println("\nInserire numero stanza: ");
                    nStanza=input.nextInt();
                    stanze[variabile-1].setNumero(nStanza);
                    System.out.println("\nInserire prezzo stanza: ");
                prezzoStanza=input.nextInt();
                 stanze[variabile-1].setPrezzo(prezzoStanza);
        
                    System.out.println("tipo 1(singola)");
                    System.out.println("tipo2(doppia)");
                    System.out.println("tipo (terzetto)");
                    System.out.println("tipo 4(quartetto)");
                    System.out.println("\nInserire tipo stanza: ");
                    tipoStanza=input.nextInt();
                    stanze[variabile-1].setTipoStanza(tipoStanza);
                    System.out.println("\n");
                    break;



            case 5://aggiunge servizi ad una stanza 

                int j=0;
                    
                for(int i=0; i<n_piani*100;i++){
                    System.out.println((i+1)+" "+stanze[i].toString());
                }    
                    
                System.out.println("scegliere a quale stanza aggiungere dei servizi: ");
                variabile=input.nextInt()-1;

                do{
                    System.out.println("0: uscire;");
                    for(int i=0; i<servizi.size(); i++)
                    System.out.print("\n"+(i+1)+" "+servizi.get(i).toString());

                    System.out.print("\nServizio scelto: ");
                    int tempor=input.nextInt()-1;

                    if(tempor>0)
                    stanze[variabile].aggiungiServizio(servizi.get(tempor));

                }while(j!=0);


            break;
            
            case 6:

                    int disabilita;
                    int sceltaCliente;
                    int tempStanza;

                    System.out.println("tipo 1(singola)");
                    System.out.println("tipo 2(doppia)");
                    System.out.println("tipo 3(terzetto)");
                    System.out.println("tipo 4(quartetto)");
                    System.out.println("inserire tipi di stanza:");
                    tempStanza=input.nextInt();

                    Cliente[] clienti=new Cliente[tempStanza];

                    for(int i=0; i<n_piani*100;i++){
                        if(stanze[i].getDisponibilita()==true && stanze[i].getTipoStanza()==tempStanza)
                        System.out.println((i+1)+" "+stanze[i].visualizzaStanza());
                     }    

                    System.out.println("Scegliere il tipo di stanza che vuole il cliente:");
                    sceltaCliente=input.nextInt()-1;

                    for(int i=0;i<tempStanza;i++){

                    System.out.println("Inserire nome cliente: ");
                    nome=input.next();
                    clienti[i].setNome(nome);

                    System.out.println("Inserire cognome cliente: ");
                    cognome=input.next();
                    clienti[i].setCognome(cognome);

                    System.out.println("Inserire disabilita(1=si, 0=no)");
                    disabilita=input.nextInt();
                    if(disabilita==0){
                        clienti[i].setDisabilta(false);
                    }
                    if(disabilita==1){
                        clienti[i].setDisabilta(true); 
                    }

                    System.out.println("Inserire durata alloggio del cliente : ");
                    durataAlloggio=input.nextInt();

                    cliente.add(clienti[i]);
                    stanze[sceltaCliente].accettazioneStanza(clienti, durataAlloggio);
                    

                }

                    break;


            case 7://visualizza stanze
                
                for(int i=0; i<contatoreStanze; i++)
                System.out.println(stanze[i].visualizzaStanza());

            break;


            case 8://visualizza disponibilità stanze
                
                for(int i=0; i<contatoreStanze; i++)
                System.out.println(stanze[i].visualizzaPrenotazione());

            break;


            case 9://visualizza clienti nella struttura
                
                for(int i=0; i<contatoreStanze; i++)
                System.out.println(stanze[i].visualizzaClienti());

            break;

            

                
                
            }
        }while(scelta!=0);



        for(int i=0; i<contatoreStanze; i++){

            if(Main.getDataAttualeString().equals(stanze[i].getCheckOut())==true);
            stanze[i].liberaStanza();

        }
        
        }


    }