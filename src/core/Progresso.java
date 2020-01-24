package core;

public class Progresso {
	private byte experiencia;
	private byte ultimaExp;
	private String estagio;
	private byte progresso;
	
	public Progresso() {
		experiencia = 0;
		ultimaExp = 0;
		setEstagio();
		setProgresso();
	}
	
	public Progresso(int experiencia) throws IllegalArgumentException {
		if(experiencia > 0 && experiencia < 250)
			ultimaExp = (byte) experiencia;
		else throw new IllegalArgumentException("Valor  de 'experiencia' � inv�lido");
		this.experiencia = ultimaExp;
		
		setEstagio();
		setProgresso(experiencia);
	}
	
	public void addExperiencia(int experiencia) throws IllegalArgumentException {
		if(experiencia > 0 && experiencia < 250) {
			ultimaExp = this.experiencia;
			this.experiencia = ultimaExp;
		} else throw new IllegalArgumentException("Valor  de 'experiencia' � inv�lido");
		
		setEstagio();
		setProgresso();
	}
	
	public byte getExperiencia() {
		return experiencia;
	}
	
	private final void setEstagio() {
		if(experiencia >= 0 && experiencia < 20)
			estagio = "Novato";
		
		else if (experiencia >= 20 && experiencia < 40)
			estagio = "Experiente";
		
		else if (experiencia >= 20 && experiencia < 60)
			estagio = "Veterano";
		
		else if (experiencia >= 60 && experiencia < 80)
			estagio = "Her�ico";
		
		else if (experiencia >= 80)
			estagio = "Lend�rio";
	}
	
	public String getEstagio() {
		return estagio;
	}
	
	private final void setProgresso() {
		byte exp = (byte) (experiencia - ultimaExp);
		progresso += exp / 5;
	}
	
	private final void setProgresso(int exp) {
		progresso += exp / 5;
	}
	
	public void subtractProgresso(int val) {
		if(val < 0) throw new IllegalArgumentException("'val' deve ser positivo");
		else if (progresso - val < 0) throw new exception.NotAvailablePointsLeftException("N�o h� pontos de progresso suficientes dispon�veis");
		else progresso -= (byte) val;
	}
	
	public byte getPontosProgresso() {
		return progresso;
	}
	
	
}
