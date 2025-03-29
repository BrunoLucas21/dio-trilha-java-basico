import java.util.Date;

public class Transacao {
  private Date data;
  private double montante;
  private String descricao;

  public Transacao(Date data, double montante, String descricao) {
    this.data = data;
    this.montante = montante;
    this.descricao = descricao;
  }

  @Override
  public String toString() {
    return data + " - " + descricao + ": R$ " + String.format("%.2f", montante);
  }
}
