// Classe NoDuplo que representa um nó da lista duplamente encadeada
public class NoDuplo<T> {
    private T dado;
    private NoDuplo<T> proximoNo;
    private NoDuplo<T> anteriorNo;
    private int indice;

    public NoDuplo(T dado, int indice) {
        this.dado = dado;
        this.indice = indice;
        this.proximoNo = null;
        this.anteriorNo = null;
    }

    public T getDado() {
        return dado;
    }

    public int getIndice(){
        return indice;
    }

    public void setDado(T dado) {
        this.dado = dado;
    }

    public void setIndice(int indice){
        this.indice = indice;
    }

    public NoDuplo<T> getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(NoDuplo<T> proximoNo) {
        this.proximoNo = proximoNo;
    }

    public NoDuplo<T> getAnteriorNo() {
        return anteriorNo;
    }

    public void setAnteriorNo(NoDuplo<T> anteriorNo) {
        this.anteriorNo = anteriorNo;
    }

    @Override
    public String toString(){
        return "{ " + "Indice: " + getIndice() + ", Dado: " + getDado() + " }";
    }
}