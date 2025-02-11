package org.example;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private String placa;
    private double velocidadeAtual;

    public Carro(String marca,String modelo, String placa, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
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

    Override
    public boolean equals(Object obj){
        Carro carroTemporario = (Carro) obj;
        return this.placa.equals(carroTemporario.getPlaca());
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
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
