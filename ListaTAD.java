public class ListaTAD {
    int numElementos;
    Nodo inicio, fim;

    public ListaTAD() {
        numElementos = 0;
        inicio = null;
        fim = null;
    }

    public boolean estaVazia() {
        return numElementos == 0;
    }

    public void insereFinal(int elem) {
        Nodo novo = new Nodo();
        novo.elem = elem;
        novo.prox = null;
        if(estaVazia()) {
            novo.ant = null;
            inicio = novo;
        }
        else { //lista não está vazia
            novo.ant = fim;
            fim.prox = novo;
        }
        fim = novo;
        numElementos ++;
    }

    public void imprime() {
        Nodo aux = inicio;
        while(aux != null) {
            System.out.print(aux.elem + " ");
            aux = aux.prox;
        }
    }

    public void removeFinal() {
        if(estaVazia()) {
            System.out.println("Lista vazia! Não há elementos.");
        }
        else if(numElementos == 1) {
            inicio = null;
            fim = null;
            numElementos = 0;
        }
        else {
            fim = fim.ant;
            fim.prox = null;
            numElementos --;
        }
    }

    public void removeInicio() {
        if(estaVazia()) {
            System.out.println("Lista vazia! Não há elementos.");
        }
        else if(numElementos == 1) {
            inicio = null;
            fim = null;
            numElementos = 0;
        }
        else {
            inicio = inicio.prox;
            inicio.ant = null;
            numElementos --;
        }
    }

    public int acessa(int pos) {
        if(pos < 0 || pos >= numElementos) {
            throw new IndexOutOfBoundsException();
        }
        else {
            Nodo aux = inicio;
            for (int i = 0; i < pos; i++) {
                aux = aux.prox;
            }
            return aux.elem;
        }
    }
    public void altera(int pos, int valor) {
        if(pos < 0 || pos >= numElementos) {
            throw new IndexOutOfBoundsException();
        }
        else {
            Nodo aux = inicio;
            for (int i = 0; i < pos; i++) {
                aux = aux.prox;
            }
            aux.elem = valor;
        }
    }
    public void insere(int pos, int elem) {
        if(pos < 0 || pos >= numElementos) {
            throw new IndexOutOfBoundsException();
        }
        else {
            Nodo aux = inicio;
            for (int i = 0; i < pos; i++) {
                aux = aux.prox;
            }
            Nodo aux2 = inicio;
            for (int i = 0; i < pos-1; i++) {
                aux = aux.prox;
            }
            Nodo novo = new Nodo();
            novo.elem = elem;
            novo.prox = aux;
            novo.ant = aux.ant;

            aux2.prox=novo;
            aux.ant = novo;

            numElementos ++;
        }
    }

    public boolean pesquisa(int valor) {
        Nodo aux = inicio;
        for (int i = 0; i < numElementos; i++) {
            if (valor == aux.elem){
                return true;
            }
            aux = aux.prox;
        }
        return false;
    }

    public int tamanho(){
        return numElementos;
    }

    public void imprimeReverso() {
        Nodo aux = fim;
        while(aux != null) {
            System.out.print(aux.elem + " ");
            aux = aux.ant;
        }
    }

    public void insereInicio(int elem) {
        Nodo novo = new Nodo();
        novo.elem = elem;
        novo.ant = null;
        if(estaVazia()) {
            novo.ant = null;
            inicio = novo;
        }
        else { //lista não está vazia
            novo.prox = inicio;
            inicio.ant = novo;
        }
        inicio = novo;
        numElementos ++;
    }


    @Override
    public String toString() {
        return "ListaTAD{" +
                "numElementos=" + numElementos +
                ", inicio=" + inicio +
                ", fim=" + fim +
                '}';
    }
}
