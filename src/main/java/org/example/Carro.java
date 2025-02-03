package org.example;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private double velocidadeAtual;

    public Carro(String marca,String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidadeAtual = 0;
    }

    public Carro(){}

     public void acelerar(){
        this.velocidadeAtual += 10;
    }

    public void frear(){
        this.velocidadeAtual -= 10;
    }

    public void exibirInfo(){
        System.out.println(
                "Marca: " + getMarca() + "\n" +
                "Modelo: " + getModelo() + "\n" +
                "Ano: " + getAno() + "\n" +
                "Velocidade Atual: " + getVelocidadeAtual()
        );
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(double velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }
}
