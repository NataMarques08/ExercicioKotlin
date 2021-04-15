package mykotlin.bank.digitalbank

import java.util.*
import digital.bank.client.Client as Client


fun main() {
    val  sc = Scanner(System.`in`)
    var obj:Client


    println("Ola")
    print("Digite seu nome:")
    val name = sc.nextLine()
    print("Digite o numero da conta:")
    val conta = sc.nextLine()
    obj = Client(name,conta,0.0)

    println("----------------------------------------")
    print("Deseja fazer um deposito inicial[s/n]?")
    val option:Char = sc.next().single()
    if(option == 's') {
        print("Qual valor deseja depositar:")
        val value = sc.nextDouble()
        obj = Client(name, conta , value)

    }else if(option == 'n'){
        obj = Client(name,conta,0.0)
        println("Obrigado por usar nossos serviços")
    }else{
        println("Opcao invalida! Fechando o aplicativo...")
    }
    println("------------------------------------------")
    print("Deseja realizar um saque?[s/n]:")
    val option2:Char = sc.next().single()
    if(option2 == 's'){
        print("Informe o valor para saque:")
        val value = sc.nextDouble()
        obj.saque(value)
    }else if(option == 'n'){
        print("Obrigado por usar nossos serviços")
    }else{
        print("Operação invalida!")
    }
    println("----------------------------------------")
    println()
    println(obj)
    sc.close()
}