public class TesteReferencia {
    public static void main(String[] args){
        Conta primeiraConta = new Conta();
        primeiraConta.getSaldo = 300;

        System.out.println("saldo primeira conta" + primeiraConta.getSaldo);
    }
}
