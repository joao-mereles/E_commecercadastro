package com.example;
import java.util.Scanner;
import com.cliente.Cliente;
import com.plano.Plano;

import assinatura.Assinatura;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String planoEscolhido;
       // int opcaoPlano;
       

        //Scanner input_dados= new Scanner(System.in);
       // Cliente cliente = new Cliente();
       // cliente.cadastrarCliente();

        Plano planos = new Plano();
        planos.exibircatalogoPlanos();

        Scanner input_planoContratado= new Scanner(System.in);
        planoEscolhido= input_planoContratado.nextLine();



        System.out.println("Plano Contratado: " + planoEscolhido);

        double desconto=0.2;
        double mensalidade ;


      //  if (planoEscolhido.equals("Anual")) {
          //  mensalidade = (precosPlanos[2] -2)/100;
      //  System.out.println("Você possui acesso liberado aos produtos premium!");
      //  System.out.println("Você tem direito a " + desconto*100 + "% de desconto o valor total e: R$" + (precosPlanos[2] * (1 - desconto)));
       // } else {
      //      desconto = 0.0;
        //    System.out.println("Você não possui acesso liberado aos produtos premium.");
      //  }
       // double precoFinal = precosPlanos[opcaoPlano - 1] * (1 - desconto);
          //// System.out.printf("Preço final: R$ %.2f%n", precoFinal);

     // input.close();
    }
}
