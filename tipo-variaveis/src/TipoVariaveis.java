public class TipoVariaveis {
    public static void main(String[] args) throws Exception {
        byte idade = 123;
        short ano = 2025;
        int cep = 21070333;
        long cpf = 98765432109L;
        float pi = 3.14F;
        double salario = 1275.33;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;
    }
}
