public class ExemploBreakContinue {
  public static void main(String[] args) {
    String alunos[] = { "Ana", "Bruno", "Carlos", "Diana", "Eduardo" };

    for (String aluno : alunos) {
      if (aluno.equals("Carlos")) {
        System.out.println("Aluno: " + aluno);
        break; // Encerra o loop quando encontra "Carlos"
      }
      System.out.println("Aluno: " + aluno);
    }
    System.out.println("Total de alunos: " + alunos.length);

    for (String aluno : alunos) {
      if (aluno.equals("Carlos")) {
        continue; // Pula a iteração quando encontra "Carlos"
      }
      System.out.println("Aluno: " + aluno);
    }
    System.out.println("Total de alunos: " + alunos.length);
  }
}
