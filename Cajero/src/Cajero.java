import javax.swing.JOptionPane;


public class Cajero {
	int cuenta=1000000;
	int cuenta_actual;

	public void menu1(){
		String idioma=JOptionPane.showInputDialog("Tipo de idioma");
		if(idioma.equals("español")){
			JOptionPane.showMessageDialog(null,"Idioma escogido "+idioma);
		}
		else
		if(idioma.equals("ingles")){
			JOptionPane.showMessageDialog(null,"Idioma escogido "+idioma);
		}
		else{
			JOptionPane.showMessageDialog(null,"Idioma incorrecto "+idioma);
			}
	}

	public void menu2(){
		String transaccion=JOptionPane.showInputDialog("Tipo de transaccion");
		if(transaccion.equals("deposito")){
			String c=JOptionPane.showInputDialog("Cantidad a depositar");
			int cantidad=Integer.parseInt(c);
			cuenta_actual=cuenta+cantidad;
			JOptionPane.showMessageDialog(null,"La cantidad actual es "+cuenta_actual);
                        JOptionPane.showMessageDialog(null,"Deposito Exitoso");
			}
			if(transaccion.equals("retiro")){
				String c=JOptionPane.showInputDialog("Cantidad a retirar");
				int cantidad=Integer.parseInt(c);
				cuenta_actual=cuenta-cantidad;
				if(cantidad<=500000){
				switch(cantidad){
					case 5000:
					case 10000:
					case 200000:
					case 500000:
					JOptionPane.showMessageDialog(null,"Usted retiro "+cantidad);
					JOptionPane.showMessageDialog(null,"Su saldo actual es "+cuenta_actual);
					break;
				}
				String tB=JOptionPane.showInputDialog("Tipo de billete con que desea hacer el retiro");
				int tipoBillete=Integer.parseInt(tB);
				JOptionPane.showMessageDialog(null,"Cantidad de billetes retirados es ");
					if(tipoBillete==500){
						cantidad=cantidad/500;
						JOptionPane.showMessageDialog(null,cantidad+" Billetes de 500");
                                                JOptionPane.showMessageDialog(null,"Retiro Exitoso");
					}
					else
					if(tipoBillete==200){
						cantidad=cantidad/200;
						JOptionPane.showMessageDialog(null,cantidad+" Billetes de 200");
                                                JOptionPane.showMessageDialog(null,"Retiro Exitoso");
					}
					else
					if(tipoBillete==100){
						cantidad=cantidad/100;
						JOptionPane.showMessageDialog(null,cantidad+" Billetes de 100");
                                                JOptionPane.showMessageDialog(null,"Retiro Exitoso");
					}
					else{
						JOptionPane.showMessageDialog(null,"No indico en que tipo de billete queria el retiro, o el tipo es incorrecto");
					}
				}
				else{
					JOptionPane.showMessageDialog(null,"Retiro invalido, cantidad incorrecta "+cantidad);
			}
			if(transaccion.equals("Ver saldo")){
				JOptionPane.showMessageDialog(null,"Su saldo actual es "+cuenta_actual);
			}
			if(transaccion.equals("Salir")){
				JOptionPane.showMessageDialog(null,"Usted decicio salir del programa");
			}
		}
	}
}
