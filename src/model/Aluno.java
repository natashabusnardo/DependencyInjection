package model;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;

public class Aluno extends Pessoa {
	private int matricula;
	private int cpf;
	private Date dataNasc;
	private String email;

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public Date getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		if (email.length() > 0)
			this.email = email;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Aluno [matricula=");
		builder.append(matricula);
		builder.append(", CPF=");
		builder.append(cpf);
		builder.append(", dataNasc=");
		builder.append(dataNasc);
		builder.append(", email=");
		builder.append(email);
		builder.append("]");
		return builder.toString();
	}

}
