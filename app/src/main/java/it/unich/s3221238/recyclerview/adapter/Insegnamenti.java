package it.unich.s3221238.recyclerview.adapter;

public class Insegnamenti {
    String nome;
    String docente;
    float cfu;
    int annoInsegnamento;
    String descrizioneBreve;
    boolean superato;

    public Insegnamenti(String nome, String docente, float cfu) {
        this.nome = nome;
        this.docente = docente;
        this.cfu = cfu;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocente() {
        return docente;
    }

    public void setDocente(String docente) {
        this.docente = docente;
    }

    public float getCfu() {
        return cfu;
    }

    public void setCfu(float cfu) {
        this.cfu = cfu;
    }

    public int getAnnoInsegnamento() {
        return annoInsegnamento;
    }

    public void setAnnoInsegnamento(int annoInsegnamento) {
        this.annoInsegnamento = annoInsegnamento;
    }

    public String getDescrizioneBreve() {
        return descrizioneBreve;
    }

    public void setDescrizioneBreve(String descrizioneBreve) {
        this.descrizioneBreve = descrizioneBreve;
    }

    public boolean isSuperato() {
        return superato;
    }

    public void setSuperato(boolean superato) {
        this.superato = superato;
    }
}
