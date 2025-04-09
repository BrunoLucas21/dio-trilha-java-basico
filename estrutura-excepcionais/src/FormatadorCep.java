public class FormatadorCep {
  public static void main(String[] args) {
    try {
      String cepFormatado = formatarCep("12345678");
      System.out.println("CEP formatado: " + cepFormatado);
    } catch (CapInvalidoException e) {
      System.err.println("O CEP não corresponde ao padrão esperado: " + e.getMessage());
    }
  }

  static String formatarCep(String cep) throws CapInvalidoException {
      if (cep == null || cep.length() != 8) {
        throw new CapInvalidoException();
      }
      return String.format("%s-%s", cep.substring(0, 5), cep.substring(5));
    }
}
