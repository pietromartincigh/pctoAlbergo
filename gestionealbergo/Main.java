package gestionealbergo;
import java.util.Scanner;


public class Main {
    
    private static int n_servizi;

    public static void setNServizi(int n_servizi){
        Main.n_servizi=n_servizi;
    }

    public static int getNServizi(){
        return n_servizi;
    }

    public static void main(String[] args){
        int n_piani;
        int nStanza;
        int prezzoStanza;
        int tipoStanza;
        int contatoreStanze;

        Scanner input=new Scanner(System.in);
        
        System.out.println("Inserire numero di piani: ");
        n_piani=input.nextInt();
        Main.setN_piani(n_piani);

        Stanza[] stanze=new Stanza[n_piani*100];

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
        }

        



    }


