package cap8;
// Declaração de classe Time1 mantém a data/hora no formato de 24 horas.

public class Time1 {
	private int hour; // 0 - 23
	private int minute; // 0 - 59
	private int second; // 0 - 59
	
	// configura um novo valor de tempo usando hora universal; lança uma
	// exceção se a hora, minuto ou segundo for inválido
	public void setTime(int hour, int minute, int second) {
		// valida hora, minuto e segundo
		if(hour < 0 || hour >= 24 || minute < 0 || minute >= 60 || second < 0 || second >= 60) {
			throw new IllegalArgumentException("hour, minute and/or second whas out of range");
		}
		
		this.hour = hour;
	}
}
