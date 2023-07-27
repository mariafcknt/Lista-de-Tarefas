import java.util.Scanner;
import textio.TextIO;

import java.nio.file.Paths;
import java.nio.file.Path;
import java.nio.file.Files;
import java.util.List;

public class Tarefas {
  private String user;
  private String listatarefa;
  //private boolean continuar;

  Scanner input =  new Scanner(System.in);

  public void setUser(String user){
   //user = input.next();
    this.user = user;
  }
  public String getUser(){
    return this.user;
  }
  
  //campo de edição das tarefas
  public void setListaTarefa(String listatarefa){
    input.useDelimiter("\\t");
    while(true){
      System.out.println("----------------------------------------------------");
      listatarefa = input.next();
      System.out.println("----------------------------------------------------");
      System.out.println("Suas tarefas foram salvas! Até a próxima :)");
      //fim da escrita das tarefas
      System.out.println();

      
      break;
    }
    this.listatarefa = listatarefa;
  }
  

  //criar arquivo Tarefas.txt
    public void criarTxt(){
      TextIO.writeFile("Tarefas.txt");
      TextIO.putln(this.listatarefa);
    }

  public void Teste() {
          // A raiz é a primeira pasta do projeto
          String caminhoDoArquivo = "Tarefas.txt";
          Path arquivo = Paths.get(caminhoDoArquivo);
          try{
              // Realiza a leitura de todas as linhas do arquivo
              List<String> linhas = Files.readAllLines(arquivo);
              // Loop Funcional
              // Alternativas forEach, for com indices ( for de i)
              linhas.forEach(System.out::println);
          }catch(Exception e){
              // Se algo de errado acontecer
              // Arquivo não encontrado
              e.printStackTrace();
          }
      }
}
  