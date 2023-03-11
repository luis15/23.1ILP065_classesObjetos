import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        menu(biblioteca);
        return;
    }
    public static void menu(Biblioteca biblioteca) {
        System.out.println("O que você deseja fazer?");
        System.out.println("1 - Adicionar livros");
        System.out.println("2 - Listar livros");
        System.out.println("3 - Sair");

        Scanner opcaoSelecionada = new Scanner(System.in);
        Integer opcao = opcaoSelecionada.nextInt();
    }
}