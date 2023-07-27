import java.util.Scanner;

public class ListaTarefas {
  private String user;
  private String tarefascriadas;

  Scanner input = new Scanner(System.in);
  Tarefas tarefas = new Tarefas();  

  //inicio do programa
  public void iniciarLista(){
    System.out.println("LISTA DE TAREFAS 🖉"); //nome do programa
    System.out.println();
    System.out.println("Oi! Digite o seu nome:");
    user = input.next();
    tarefas.setUser(user);
    System.out.println();
    System.out.println("Olá " + tarefas.getUser() + "! Aperte Enter para continuar.");
    input.nextLine();
    System.out.println("Pressione Enter para pular a linha e Tab para salvar.");
    //inicio das tarefas
    tarefas.setListaTarefa(tarefascriadas);
    //fim das tarefas
    tarefas.criarTxt();

    //TESTE
    System.out.println("Leitura do arquivo Tarefas.txt");
    System.out.println();
    tarefas.Teste();
  }

}