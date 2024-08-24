public class Principal{
    public static void main(String[] args){
        Lista<String> lista = new Lista<String>("Alunos");
        lista.addInicio("Gabriel");
        lista.addFinal("Lucio");
        lista.imprimeDados();

        lista.addInicio("Railander");
        lista.imprimeDados();

        lista.removeNoInicio();
        lista.imprimeDados();

        lista.removeNoFinal();
        lista.imprimeDados();
    }
}