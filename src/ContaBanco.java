public class ContaBanco {
    //ATRIBUTOS
    public int nunConta;
    protected String tipoConta;
    private String dono;
    private float saldo;
    private boolean status;
    //METODOS PERSONALIZADOS
    public void estadoAtual(){
        System.out.println("Conta: " + this.nunConta);
        System.out.println("Tipo: " + this.tipoConta);
        System.out.println("Dono: " + this.dono);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("Status: " + this.status);
    }
    public void abrirConta(String t){
        this.setTipoConta(t);
        this.setStatus(true);
        if("CC".equals(t) ){
            this.setSaldo(50);
        }else if ("CP".equals(t)){
            this.setSaldo(150);
}
        System.out.println("Conta aberta com sucesso!");
    }
    public void fecharConta(){
        if(this.getSaldo() > 0){
            System.out.println("Nao e possivel fechar sua conta!\nSaldo atual: " + this.getSaldo());
        } else if (getSaldo()<0) {
            System.out.println("Nao e possivel fechar sua conta pois ainda tem debito!");
        }else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }
    public void depositar(float v){
        if(this.getStatus()){
            this.setSaldo(this.getSaldo()+v);
            System.out.println("Conta depositado com sucesso na conta de !" + this.getDono());
        }else {
            System.out.println("Nao e possivel depositar sua conta!Ele esta fechada!");
        }
    }
    public void sacar(float v){
        if(this.getStatus()){
            if(this.getSaldo()>=v){
                this.setSaldo(this.getSaldo()-v);
                System.out.println("Saque realizado na conta de !" + this.getDono());
            }else {
                System.out.println("Saldo insuficiente para saque!");
            }

        }else{
            System.out.println("Nao e possivel sacar de uma conta fechada!");
        }
    }
    public void pagarMensal(){
        int v;
        if(this.getTipoConta().equals("CC")){
            v = 12;
        }else if(this.getTipoConta().equals("CP")){
            v = 20;
            if (this.getStatus()){
                this.setSaldo(this.getSaldo()-v);
                System.out.println("Mensalidade paga com sucesso por !" + this.getDono());
            }else{
                System.out.println("Impossivel pagar uma conta fechada!");
            }
        }
    }
    //METODOS ESPECIAIS

    public ContaBanco() {
    this.setSaldo(0);
    this.setStatus(false);
    }

    public void setNunConta(int nunConta) {
        this.nunConta = nunConta;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getNunConta() {
        return nunConta;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public String getDono() {
        return dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public boolean getStatus() {
        return status;
    }

}
