package digital.bank.client

class Client(nome:String,conta:String,saldo:Double){
   private var nome:String? = null
   private var conta:String? = null
   private var saldo:Double = 0.0

    init {
        this.nome = nome
        this.conta = conta
        this.saldo = saldo
    }

    fun saque(value:Double = 0.0):Double{
        var value2:Double
        if(saldo == 0.0){
            println("Voce não tem saldo em conta: Efetue um deposito para poder sacar")
        }
        value2 = saldo - value
        saldo = value2
       return saldo
    }
    override fun toString(): String {
        return "Cliente "+nome+" Conta: "+conta+" Saldo em conta: R$"+saldo
    }

}