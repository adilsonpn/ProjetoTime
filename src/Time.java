
public class Time{
	private int hora;
	private int minuto;
	private int segundo;

	public void Time(int hora, int minuto, int segundo){
	
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}
	public String exibirHoraUniversal() {
		String strHora = hora+":"+minuto+";"+segundo;
		return strhora;
	}
	
	
}
