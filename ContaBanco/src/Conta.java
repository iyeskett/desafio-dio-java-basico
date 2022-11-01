public class Conta {
    int numero;
    String agencia;
    String nomeCliente;
    double saldo;

    public Conta(int numero, String agencia, String nomeCliente, double saldo){
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    public String agradecimento(){
        return "Olá " + nomeCliente
        + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta "
        + numero + " e seu saldo " + saldo + " já está disponível para saque";
    }
}
