package persistencia;

import java.text.ParseException;
import java.util.List;

import model.Aluno;

public interface Gravacao {

	public boolean gravar(List<Aluno> list);

	public List<Aluno> ler() throws ParseException;

}