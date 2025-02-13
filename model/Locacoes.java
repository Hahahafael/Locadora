package model;

import java.time.LocalDate;

public class Locacoes {
    private int idLocacao;
    private int idFuncionario; // Supondo que você tenha um ID de funcionário
    private int idCliente; // Supondo que você tenha um ID de cliente
    private String placaVeiculo; // Placa do veículo
    private LocalDate dataInicio;
    private LocalDate dataTermino;
    private String formaPagamento; // Forma de pagamento
    private double valorPago; // Valor pago

    // Construtor
    public Locacoes(int idFuncionario, int idCliente, String placaVeiculo, LocalDate dataInicio, LocalDate dataTermino, String formaPagamento, double valorPago) {
        this.idFuncionario = idFuncionario;
        this.idCliente = idCliente;
        this.placaVeiculo = placaVeiculo;
        this.dataInicio = dataInicio;
        this.dataTermino = dataTermino;
        this.formaPagamento = formaPagamento;
        this.valorPago = valorPago;
    }

    // Getters
    public int getIdLocacao() {
        return idLocacao;
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public String getPlacaVeiculo() {
        return placaVeiculo;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public LocalDate getDataTermino() {
        return dataTermino;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public double getValorPago() {
        return valorPago;
    }
}
