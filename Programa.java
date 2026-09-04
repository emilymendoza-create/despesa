//Gabriel Horn e Luiz Carlos
import java.util.Scanner;

import model.Conta;
import model.Meta;
import model.Receita;
import model.Despesa;

public class Programa {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        
        Conta conta = new Conta("1234567", "Gertrude");
        
        Meta meta = new Meta("moto", 9000, 4000);
        
        Receita receita = new Receita("Salario", 2500);
        
        Despesa despesa = new Despesa("Aluguel", 1200, "pendente");
        
        int deposito = 0;
        
        //RELATÓRIO
        System.out.println("--SISTEMA DE CONTROLE FINANCEIRO--");
        System.out.print("Cliente:" + conta.getCliente());
        System.out.println("Saldo inicial" + conta.getSaldo());
        System.out.println("----------------------------------");
        System.out.println("Deseja depositar este valor? (1 - Sim / 2 - Não)");
        deposito = sc.nextInt();
        if (deposito == 1) {
            System.out.println("Salario adicionado com sucesso.");
        }
        if (deposito == 2) {
            System.out.println("Salario não depositado.");
        }
        
        System.out.println("Deseja poupar R$300 para a meta ("+ conta.getObjetivo() + "?) [1 - sim  / 2 - não]" );
        int pouparResposta = sc.nextInt();
        if (pouparResposta == 1){
             
            if (conta.getSaldo() >= 300) {
               
               conta.setSaldo(conta.getSaldo() - 300);
               meta.setValorPoupado(meta.getvalorPoupado() + 300);
               System.out.println("Dinheiro guardado na meta com sucesso!");
               
            }else {
                
                System.out.println("ERRO! saldo insuficiente. ");
            }
        }    
        
        
        System.out.println("");
        System.out.println("");
        System.out.println("====================================");
        System.out.println("         RELATORIO FINANCEIRO       ");
        System.out.println("====================================");
        System.out.println("Conta:" + conta.getNumero() + "|Cliente" + conta.getCliente());
        System.out.println("Saldo final" + RS  + "|Limite" + conta.getLimite());
        System.out.println("Situação do aluguel:" + );
        System.out.println("Meta [Comprar moto]" + );
        System.out.println("====================================");
        
    }
}