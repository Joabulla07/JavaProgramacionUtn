import javax.swing.*;
	class Apli_cola{
		public static void main(String [] args){
			cola col=new cola();
			byte xn;
			do{
				xn=Byte.parseByte(JOptionPane.showInputDialog("1.-Meter datos a la Cola \n2.-Sacar datos de la Cola \n3.-Ver Cola \n0.-Salir"));
				if(xn==1){
					if(col.esLlena()==true){
						JOptionPane.showMessageDialog(null,"Ya no hay espacio");
					}
					else{
					byte xd=Byte.parseByte(JOptionPane.showInputDialog("Ingresa Dato"));
					col.meter(xd);	
					}
				}
				if(xn==2){
					if(col.esVacia()==true){
						JOptionPane.showMessageDialog(null, "La Cola esta vacia");
					}
					else{
						JOptionPane.showMessageDialog(null,"Numero sacado: "+col.sacar());
					}
				}
				if(xn==3){
					JTextArea js=new JTextArea(col.toString());
					JOptionPane.showMessageDialog(null,js);
				}
				
			}while(xn!=0);
		}
	}