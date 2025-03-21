/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.fatec.biblioteca;

import java.util.Date;

public class Emprestimo {
    private Usuario usuario;
    private Livro livro;
    private Date dataEmprestimo;
    private Date dataDevolucao;

    public Emprestimo(Usuario usuario, Livro livro, Date dataEmprestimo, Date dataDevolucao) {
        this.usuario = usuario;
        this.livro = livro;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }

    @Override
    public String toString() {
        return usuario.getNome() + " pegou emprestado: " + livro.getTitulo() +
                " de " + dataEmprestimo + " até " + dataDevolucao;
    }
}
