class Principal {
    public static void main(String[] args) {
        Fila<String> fila1 = new Fila<String>("Fila da padaria");

        fila1.enfileirar("Gabriel");
        fila1.printarFila();
        fila1.desenfileirar();
        fila1.printarFila();
    }
}
