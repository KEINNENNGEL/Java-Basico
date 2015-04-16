
public class Particiapantes {
	private String participante;
	private int NumerodeBotellasTomadas;
	
	public Particiapantes (String participante,int NumerodeBotellasTomadas){
		this.participante=participante;
		this.NumerodeBotellasTomadas=NumerodeBotellasTomadas;
	}
	public String getParticipante(){
		return participante;
	}
	public int getNumerodeBotellasTomadas(){
		return NumerodeBotellasTomadas;
	}
}
