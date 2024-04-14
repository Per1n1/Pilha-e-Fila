import java.util.*;


public class Fila {
    private LinkedList<Integer> elementos;

    
    public Fila() {
        elementos = new LinkedList<>();
    }


    public void enfileirar(int elemento) {
        elementos.add(elemento);
    }

    
    public int desenfileirar() {
        if (elementos.isEmpty()) {
            throw new NoSuchElementException("A fila esta vazia.");
        }
        return elementos.removeFirst();
    }

    
    public int primeiro() {
        if (elementos.isEmpty()) {
            throw new NoSuchElementException("A fila esta vazia.");
        }
        return elementos.getFirst();
    }

    
    public boolean estaVazia() {
        return elementos.isEmpty();
    }

    
    public int tamanho() {
        return elementos.size();
    }

    
    public void listar() {
        System.out.println("Elementos da fila:");
        for (int elemento : elementos) {
            System.out.println(elemento);
        }
    }

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Fila fila = new Fila();

        int opcao;
        do {
            System.out.println("Menu:");
            System.out.println("1. Enfileirar elemento");
            System.out.println("2. Desenfileirar elemento");
            System.out.println("3. Obter primeiro elemento");
            System.out.println("4. Verificar se a fila esta vazia");
            System.out.println("5. Obter tamanho da fila");
            System.out.println("6. Listar elementos");
            System.out.println("7. Sair");
            System.out.print("Escolha uma opcao: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o elemento a ser enfileirado: ");
                    int elementoEnfileirar = scanner.nextInt();
                    fila.enfileirar(elementoEnfileirar);
                    System.out.println("Elemento enfileirado com sucesso!");
                    break;
                case 2:
                    try {
                        int elementoDesenfileirado = fila.desenfileirar();
                        System.out.println("Elemento desenfileirado: " + elementoDesenfileirado);
                    } catch (NoSuchElementException e) {
                        System.out.println("A fila esta vazia, nao e possivel desenfileirar elementos.");
                    }
                    break;
                case 3:
                    try {
                        System.out.println("Primeiro elemento da fila: " + fila.primeiro());
                    } catch (NoSuchElementException e) {
                        System.out.println("A fila esta vazia.");
                    }
                    break;
                case 4:
                    System.out.println("A fila esta vazia? " + fila.estaVazia());
                    break;
                case 5:
                    System.out.println("Tamanho da fila: " + fila.tamanho());
                    break;
                case 6:
                    fila.listar();
                    break;
                case 7:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opcao invalida!");
            }
        } while (opcao != 7);

        scanner.close();
    }
}
