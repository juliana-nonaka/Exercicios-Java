package POO;

public class Cliente_1 {
	private  String  nomeCliente ;
	private  String  sobrenome ;
	 idade int  privada;
	privada  dupla  altura ;

	//construtor com parâmetros
	public  cliente ( String  nomeCliente , String  sobrenome , int  idade , double  altura ) {
		
		isso . nomeCliente = nomeCliente ;
		isso . sobrenome = sobrenome ;
		isso . idade = idade ;
		isso . altura = altura ;
	}
	//declaração dos demais métodos da classe

	public  String  getNomeCliente () {
		return  nomeCliente ;
	}

	public  void  setNomeCliente ( String  nomeCliente ) {
		isso . nomeCliente = nomeCliente ;
	}

	public  String  getSobrenome () {
		return  sobrenome ;
	}

	public  void  setSobrenome ( String  sobrenome ) {
		isso . sobrenome = sobrenome ;
	}

	public  int  getIdade () {
		retornar  idade ;
	}

	public  void  setIdade ( int  idade ) {
		isso . idade = idade ;
	}

	public  double  getAltura () {
		return ( double ) altura ;
	}

	public  void  setAltura ( double  altura ) {
		isso . altura = altura ;
	}

	public  void  imprimirInfo () {
		Sistema . fora . println ( "\n" + nomeCliente + " de sobrenome " + sobrenome + " é nosso cliente, cadastrad(o/a) com os seguintes dados:\n" + idade + " anos de idade" + "\n" + altura + "metros de altura" );
		
	}


		
		

}
