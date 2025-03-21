/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.fatec.biblioteca;

/**
 *
 * @author rrren
 */
class Professor extends Usuario {
    private String departamento;

    public Professor(String nome, String matricula, String departamento) {
        super(nome, matricula);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return super.toString() + " | Departamento: " + departamento;
    }
}