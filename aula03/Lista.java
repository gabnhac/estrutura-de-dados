class Lista<T> {
    private No<T> primeiroNo;
    private No<T> ultimoNo;
    private String nomeLista;

    public Lista() {
        this("Lista");
    }

    public Lista(String nomeLista) {
        this.primeiroNo = null;
        this.ultimoNo = null;
        this.nomeLista = nomeLista;
    }

    public void addInicio(T data) {
        No<T> novoNo = new No(data);
        if (primeiroNo == null) {
            primeiroNo = novoNo;
            ultimoNo = novoNo;
        } else {
            novoNo.setAux(primeiroNo);
            primeiroNo = novoNo;
        }
    }

    public void addFinal(T data) {
        No<T> novoNo = new No(data);
        if (ultimoNo == null) {
            primeiroNo = ultimoNo = novoNo;
        } else {
            ultimoNo.setAux(novoNo);
            ultimoNo = novoNo;
        }
    }

    public void removeNoInicio() {
        if (primeiroNo == null) {
            System.out.println("Não tem elementos na lista");
        } else {
            System.out.printf("Dado: {%s} foi removido da lista", primeiroNo.getDado());
            primeiroNo = primeiroNo.getAux();
        }
    }

    public void removeNoFinal() {
        if (ultimoNo == null) {
            System.out.println("Não tem elementos na lista");
        } else {
            No<T> auxUltimo = primeiroNo;
            while (auxUltimo.getAux() != ultimoNo) {
                auxUltimo = auxUltimo.getAux();
            }
            System.out.printf("Dado: {%s} foi removido da lista", ultimoNo.getDado());
            ultimoNo = auxUltimo;
            ultimoNo.setAux(null);
        }

    }

    public void imprimeDados() {
        if (primeiroNo == null) {
            System.out.println("Lista vazia");
        } else {
            System.out.printf("Dados da lista %s:\n", nomeLista);

            No<T> aux = primeiroNo;
            while (aux != null) {
                System.out.printf("{%s}\n", aux.getDado());
                aux = aux.getAux();
            }
        }
    }
}