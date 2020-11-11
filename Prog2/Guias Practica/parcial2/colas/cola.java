class cola{
	private byte [] datos;
	private byte frente,atras;
	
	public cola(){
		datos=new byte [5];
		frente=0;
		atras=0;
	}
	public boolean esVacia(){
		if(frente==atras){
			return true;
		}
		return false;
	}
	public boolean esLlena(){
		if(atras==datos.length){
			return true;
		}
		return false;
	}
	public void meter(byte d){
		if(esLlena()==false){
			datos[atras]=d;
			atras++;
		}
	}
	public byte sacar(){
		if(esVacia()==false){
			byte temp = datos[frente];
			int i = 0;
			while((i+1)<5){
				System.out.println(i);
				datos[i] = datos[i+1];
				i++;
			}
			atras--;
			return temp;	
		}
		return -1;
	}
	public String toString(){
		String cadena="";
		//for(int i=frente; i<atras; i++){
			for(int i=0; i<atras; i++){
			cadena+=datos[i]+"\n";
		}
		return cadena;
	}
}