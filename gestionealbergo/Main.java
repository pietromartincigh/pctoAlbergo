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

//prende la data del giorno attuale
    public static String getDataAttuale(){
        return data_attuale.toString();
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

        Scanner input=new Scanner(System.in);
        
        System.out.println("Inserire numero di piani: ");
        n_piani=input.nextInt();
        setNPiani(n_piani);

        Stanza[] stanze=new Stanza[n_piani*100];
        ArrayList <Servizio> servizi = new ArrayList <Servizio>();

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
            
            System.out.println("0 procedi in modo ordinato;");
            System.out.println("1 aggiungi stanza;");
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

            switch(scelta){
                int variabile;
                Servizio temp=new Servizio();

                case 1:

                
                System.out.println("inserire nome servizio: ");
                nomeServizio=input.nextLine();
                temp.setnome(nomeServizio);
                
                System.out.println("inserire prezzo: ");
                prezzoServizio=input.nextDouble();
                temp.setPrezzo(prezzoServizio);
                temp.setDisponibilita(true);

                servizi.add(temp);
                break;

                case 2:
                    int a;
                         for(int i=0; i<servizi.size();i++){
                            System.out.println((i+1)+" "+servizi.get(i).toString());
                         }    
                          System.out.println("scegliere quale modificare: ");
                          variabile=input.nextInt();

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
                          
                          servizi.get(i)=temp();
                          break;
                
            }
        }
        }
        
       
        



    }


