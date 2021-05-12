package main;

import java.io.FileNotFoundException;
import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

import model.Aluno;
import model.ListaAlunos;
import model.Pessoa;

import persistencia.Gravacao;
import persistencia.GravarJSON;
import persistencia.GravarCSV;
import persistencia.GravarXML;
import persistencia.Persistencia;



public class main {

	public static void main(String[] args) throws FileNotFoundException, ParseException {
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		GravarCSV csv = new GravarCSV();
		GravarJSON json = new GravarJSON();
		GravarXML xml = new GravarXML();

		Persistencia pers = new Persistencia(csv);
		Persistencia pers2 = new Persistencia(xml);
		Persistencia pers3 = new Persistencia(json);

		Aluno aluno = new Aluno();
		
		aluno.setNome("Jefferson");
		aluno.setMatricula(70854517);
		aluno.setCpf(1088601958);
		aluno.setDataNasc(ListaAlunos.retornaData("12/01/2000"));
		aluno.setEmail("guichato@gmail.com");
		
		alunos.add(aluno);
		
		pers.gravar(alunos);
		pers2.gravar(alunos);
		pers3.gravar(alunos);
		
	}

}
