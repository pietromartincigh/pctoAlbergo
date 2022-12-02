package gestionealbergo;

public class Servizio {
    
    private String nome;
    private double prezzo;
    private Boolean disponibilita;
    


    public Servizio(){}
    

    public Servizio(String servizi, double prezzo, Boolean disponibile) {
        this.servizi = servizi;
        this.prezzo = prezzo;
        this.disponibile = disponibile;
    }



    public void setServizi(String servizi) {
        this.servizi = servizi;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public void setDisponibile(Boolean disponibile) {
        this.disponibile = disponibile;
    }



    public String getServizi() {
        return servizi;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public boolean isDisponibile() {
        return disponibile;
    }


    @Override
    public String toString() {
        if(disponibile==true){
            return ("il servizio "+servizi+(" costa ")+prezzo+(" ed è disponibile"));
        }
        else{
            return ("il servizio "+servizi+(" costa ")+prezzo+("  e non è disponibile"));
        }
    }
    
    
    public String disbonibilità(){
        
        if(disponibile==true){
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

