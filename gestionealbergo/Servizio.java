package gestionealbergo;

public class Servizio {
    
    private String nome;
    private double prezzo;
    private Boolean disponibilita;
    


    public Servizio(){}
    

    public Servizio(String nome, double prezzo, Boolean disponibilita) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.disponibilita = disponibilita;
    }



    public void setnome(String nome) {
        this.nome = nome;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public void setDisponibilita(Boolean disponibilita) {
        this.disponibilita = disponibilita;
    }



    public String getNome() {
        return nome;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public boolean isDisponibilita() {
        return disponibilita;
    }


    @Override
    public String toString() {
        if(disponibilita==true){
            return ("il servizio "+nome+(" costa ")+prezzo+(" ed è disponibile"));
        }
        else{
            return ("il servizio "+nome+(" costa ")+prezzo+("  e non è disponibile"));
        }
    }
    
    
    public String disbonibilità(){
        
        if(disponibilita==true){
            return "è disponibile";
        }
        else{
            return "non è disponibile";
        }
    }

    

/*
    
    public Servizio servizioso(){//inserisce un servizio
        
        int a;
    
    Scanner input= new Scanner(System.in);
    
    System.out.println("inserire nome servizio: ");
    servizi=input.nextLine();
    
    System.out.println("inserire prezzo: ");
    prezzo=input.nextDouble();
    
   
    System.out.println("inserire disponibilità\n(1=si)\n(2=no): ");
    a=input.nextInt();
    

    
    if(a==1){
        disponibile=true;
    }
    else{
        disponibile=false;
    }
    
    return new Servizio(servizi, prezzo, disponibile);
}
    */
    
}

