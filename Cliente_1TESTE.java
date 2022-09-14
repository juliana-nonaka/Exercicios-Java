package POO;

public class Cliente_1TESTE {

	public static void main(String[] args) {

		cliente  cliente1 = novo  cliente ( "Juliana" , "Nonaka" , 25 , 1,50 );
		cliente  cliente2 = novo  cliente ("Ana" , "Lima" , 15 , 1,65);
		cliente1 . imprimirInfo ();
		cliente2 . imprimirInfo ();
		
		Sistema . fora . println ( "\n*******TRANSFERÊNCIA DE CLIENTE********" );
		cliente2 . setNomeCliente ( "Raquel" );
		cliente2 . setSobrenome ( "Florêncio" );
		cliente2 . setIdade ( 53 );
		cliente2 . setAltura ( 1,63 );
		
		cliente2 . imprimirInfo ();
		
		}

	}
		

	}

}
