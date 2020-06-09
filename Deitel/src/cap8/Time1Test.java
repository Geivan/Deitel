package cap8;
// objeto Time1 utilizado em um aplicativo.

public class Time1Test {
	// cria e inicializa um objeto Time1
	Time1 time = new Time1(); // invoca o construtor Time1
	
	// gera saída de representações de string da data/hora
	displayTime("After time object is created, time");
	System.out.println();
	
	// altera a data/hora e gera saída da data/hora atualizada
	time.setTime(13, 27,  6);
	displayTime("After calling setTime", time);
	System.out.println();
	
	// tenta definir data/hora com valores inválidos
}
