class Fila<T> {
    private No<T> primeiroNo;
    private No<T> ultimoNo;
    private String nomeFila;

    public Fila() {
        this.nomeFila = "Fila";
    }

    public Fila(String nomeFila){
        this.nomeFila = nomeFila;
        this.primeiroNo = null;
        this.ultimoNo = null;
    }

    public void enfileirar(T data){
        No<T> novoNo = new No(data);

        if (ultimoNo == null){
            this.ultimoNo = novoNo;
            this.primeiroNo = novoNo;
        }else{
            ultimoNo.setNextNo(novoNo);
            ultimoNo = novoNo;
        }
    }

    public T desenfileirar(){
        T dado = primeiroNo.getDado();
        if(primeiroNo == null){
            System.out.println("Não há nada na fila");
        }else if(primeiroNo.getNextNo() == null){
            primeiroNo = null;
            ultimoNo = null;        
        }else{
            primeiroNo = primeiroNo.getNextNo();
        }
        return dado;
    }

    public void printarFila(){
        if(primeiroNo == null){
            System.out.println("Vazia");
        }else{
            No<T> No = primeiroNo;
            while(No != null){
                System.out.printf("{%s}\n", No.getDado());
                No = No.getNextNo();
            }
            System.out.printf("Fim\n");
        }
    }
}
