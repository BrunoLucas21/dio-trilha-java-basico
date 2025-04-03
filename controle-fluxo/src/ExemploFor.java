public class ExemploFor {

  public static void main(String[] args) {
    String alunos[] = { "Ana", "Bruno", "Carlos", "Diana", "Eduardo" };

    for (String aluno : alunos) {
      System.out.println("Aluno: " + aluno);
    }
    System.out.println("Total de alunos: " + alunos.length);
  }
}