package view;

import javax.swing.JOptionPane;

import controller.Killcontroller;

public class Main {

		public static void main(String[] args) {
			
		    Killcontroller cont = new Killcontroller();
            cont.os();
		
        int mtprocess = 0;
		
		do{
			mtprocess = Integer.parseInt(JOptionPane.showInputDialog(null, ("Deseja matar o processo por: \n 1 - Exibir \n 2 - Matar processo \n 3 - Finalizar")));
		
		switch (mtprocess) {
		case 1: 
			String process = "TASKLIST /FO TABLE";
		    cont.readProcess(process);
			   
			break;
		case 2: 
			String process1 = "cmd.exe";
			cont.killProcess(process1);
			System.out.println("\n O processo foi morto!!");
			break;
			
		case 3: 
			System.out.println("\n Execu��o finalizada!!");
			break;
		}
		}while ((mtprocess != 2) && (mtprocess != 3));
		
    }
}
