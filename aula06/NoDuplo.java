

 class NoDuplo<T> {
    private T dado;
    private NoDuplo<T> anteriorNo;
    private NoDuplo<T> proximoNo;

    public NoDuplo(T dado){
        this.dado = dado;
        this.anteriorNo = null;
        this.proximoNo = null;
    }

    public T getDado(){
        return this.dado;
    }

    public NoDuplo<T> getProximoNo(){
        return this.proximoNo;
    }

    public NoDuplo<T> getAnteriorNo(){
        return this.anteriorNo;
    }

    public void setDado(T dado){
        this.dado = dado;
    }

    public void setProximoNo(NoDuplo<T> proximoNo){
        this.proximoNo = proximoNo;
    }

    public void setAnteriorNo(NoDuplo<T> anteriorNo){
        this.anteriorNo = anteriorNo;
    }

    
    @Override
    public String toString(){
        return "{" + getDado() + "}";
    }
}
