public class Main {
    public static void main(String[] args) {
        ListaTAD lista = new ListaTAD();
        lista.insereFinal(10);
        lista.insereFinal(30);
        lista.insereFinal(70);
        lista.insereFinal(90);
        lista.insereFinal(15);
        lista.insereInicio(100);
        //lista.removeInicio();
        //lista.removeFinal();
        lista.altera(1,20);
        lista.imprime();
        System.out.println("\n"+lista.pesquisa(100));

        System.out.println(lista.acessa(1));
        System.out.println(lista.tamanho());
        lista.imprimeReverso();
        System.out.println();
        lista.insere(1,10);
        lista.imprime();



    }
}