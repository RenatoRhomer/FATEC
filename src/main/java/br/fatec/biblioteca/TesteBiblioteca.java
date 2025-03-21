/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.fatec.biblioteca;

import java.util.Date;

public class TesteBiblioteca {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Renato Rhomer", "2021001", "Sistemas para Internet");
        Professor professor = new Professor("Marcos de Souza", "P123", "Fatec São Roque");

        Livro livro1 = new Livro("Codigo Limpo", "Robert C. Martin");
        Livro livro2 = new Livro("Design Patterns", "Erich Gamma", 1994);
        Livro livro3 = new Livro("Java: Como Programar", "Paul Deitel", 2016);

        Date hoje = new Date();
        Date devolucaoAluno = new Date(hoje.getTime() + (7 * 24 * 60 * 60 * 1000)); // 7 dias depois
        Date devolucaoProfessor = new Date(hoje.getTime() + (14 * 24 * 60 * 60 * 1000)); // 14 dias depois

        Emprestimo emprestimoAluno = new Emprestimo(aluno, livro1, hoje, devolucaoAluno);
        Emprestimo emprestimoProfessor = new Emprestimo(professor, livro2, hoje, devolucaoProfessor);

        System.out.println("=== Informações dos Usuários ===");
        System.out.println(aluno);
        System.out.println(professor); 
        System.out.println();

        System.out.println("=== Informações dos Livros ===");
        System.out.println(livro1);
        System.out.println(livro2);
        System.out.println(livro3);
        System.out.println();

        System.out.println("=== Informações dos Empréstimos ===");
        System.out.println(emprestimoAluno);
        System.out.println(emprestimoProfessor);
        System.out.println();

        System.out.println("=== Simulação de Devolução ===");
        System.out.println("Livro devolvido: " + livro1.getTitulo());
        System.out.println("Data de devolução: " + devolucaoAluno);
        System.out.println();

        aluno.setCurso("Sistemas para Internet"); 
        professor.setDepartamento("Fatec São Roque");

        // Exibindo informações atualizadas
        System.out.println("=== Informações Atualizadas ===");
        System.out.println(aluno);
        System.out.println(professor);
    }
}