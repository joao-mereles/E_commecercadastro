package com.plano;

import java.util.Scanner;

public class Plano {
    String regraPeriodo;
    double valorBase;
    String[] plano = {"Mensal", "Semestral", "Anual"};
    double[] precosPlanos = {56.90, 169.56, 256.23};

    public void exibircatalogoPlanos() {
        System.out.println("Informe o número do plano que gostaria de contratar, temos:");
        System.out.println("1 - " + plano[0] + " R$" + precosPlanos[0]);
        System.out.println("2 - " + plano[1] + " R$" + precosPlanos[1]);
        System.out.println("3 - " + plano[2] + " R$" + precosPlanos[2]);
    }
}
