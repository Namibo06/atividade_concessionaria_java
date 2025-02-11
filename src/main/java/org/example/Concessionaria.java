package org.example;

import java.util.Scanner;

public class Concessionaria {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a marca: ");
        String marca = scan.nextLine();

        System.out.println("Digite o modelo: ");
        String modelo = scan.nextLine();

        System.out.println("Digite a placa: ");
        String placa = scan.nextLine();

        System.out.println("Digite o ano: ");
        int anoModelo = scan.nextInt();

        Carro meuCarro = new Carro(marca,modelo,placa,anoModelo);
        Carro meuCarro2 = new Carro("marca","modelo","placa","anoModelo");
        meuCarro.acelerar();
        meuCarro.acelerar();
        meuCarro.acelerar();

        meuCarro.frear();
        meuCarro.frear();

        meuCarro.exibirInfo();
        System.out.println(meuCarro.equals(meuCarro2));
    }
}
