package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.LevelFuncionario;

public class Funcionario {

    private String nome;
    private LevelFuncionario level;
    private Double salarioBase;
    
    private Departamento departamento;
    private List<Contratos> contratos = new ArrayList<>(); //como um funcionário tem vários contratos,
                                                           //representamos por meio de uma lista.
                                                           //a mesma deve ser instacianda no momento da declaração.
    
    public Funcionario(String nome, LevelFuncionario level, Double salarioBase, Departamento departamento) {
        this.nome = nome;
        this.level = level;
        this.salarioBase = salarioBase;
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LevelFuncionario getLevel() {
        return level;
    }

    public void setLevel(LevelFuncionario level) {
        this.level = level;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public List<Contratos> getContratos() {
        return contratos;
    }

    public void adicionarContrato(Contratos contrato) {
        contratos.add(contrato);
    }

    public void removerContrato(Contratos contrato) {
        contratos.remove(contrato);
    }

    public double recebimento(int ano, int mes) {
        double soma = salarioBase;
        Calendar calendario = Calendar.getInstance();
        for(Contratos c : contratos) {
            calendario.setTime(c.getData());
            int c_ano = calendario.get(Calendar.YEAR);
            int c_mes = 1 + calendario.get(Calendar.MONTH);
            if(ano == c_ano && mes == c_mes) {
                soma += c.valorTotal();
            }
        }
        return soma;
    }
    
}
