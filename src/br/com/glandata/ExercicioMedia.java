package br.com.glandata;

public class ExercicioMedia {

	public static void main(String[] args) {
		int nota1 = 1;
		int nota2 = 10;
		int nota3 = 10;

		boolean aprovado = (nota1 + nota2 + nota3) / 3 > 6;

		System.out.println(aprovado ? "Aprovado" : "Reprovado");
	}
	
}
