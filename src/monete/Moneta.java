package monete;

import java.util.Objects;

public class Moneta {
	
	private String nome;
	private double valore;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getValore() {
		return valore;
	}
	public void setValore(double valore) {
		this.valore = valore;
	}
	public Moneta(String nome, double valore) {
		super();
		this.nome = nome;
		this.valore = valore;
	}
	 @Override
	    public boolean equals(Object obj) {
	        if (this == obj)
	            return true;
	        if (obj == null || getClass() != obj.getClass())
	            return false;
	        Moneta other = (Moneta) obj;
	        return Double.compare(other.valore, valore) == 0;
	    }
}
