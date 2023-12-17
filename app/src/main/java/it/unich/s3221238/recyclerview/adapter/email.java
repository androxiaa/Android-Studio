package it.unich.s3221238.recyclerview.adapter;

public class email {
    private  String mittente;
    private String oggetto;
    private String messaggio;

    public email(String mittente, String oggetto, String messaggio) {
        this.mittente = mittente;
        this.oggetto = oggetto;
        this.messaggio = messaggio;


    }


    public String getMittente() {
        return mittente;
    }

    public void setMittente(String mittente) {
        this.mittente = mittente;
    }

    public String getOggetto() {
        return oggetto;
    }

    public void setOggetto(String oggetto) {
        this.oggetto = oggetto;
    }

    public String getMessaggio() {
        return messaggio;
    }

    public void setMessaggio(String messaggio) {
        this.messaggio = messaggio;
    }


}