package view;

import javax.swing.JOptionPane;

import controller.TabelaLojaControlle;
import model.Loja;

public class Main {

	public static void main(String[] args) 
	{
		
		int op = -1;
		TabelaLojaControlle controllDep = new TabelaLojaControlle();
		
		while(op != 9)
		{
			op = Integer.parseInt(JOptionPane.showInputDialog("Digite as opcoes desejadas: \n"
															+ "1 - Adicionar Nova Loja.\n"
															+ "2 - Consultar Loja.\n"
															+ "3 - Excluir loja.\n"
															+ "9 - Sair do sistema."));
			try {
				switch(op)
				{
				case 1:
					
					int andar = Integer.parseInt(JOptionPane.showInputDialog("Digite o anda de que deseja(0 a 3): "));
					
					if (andar < 0 || andar > 3)
					{
						JOptionPane.showMessageDialog(null, "Andar invalido, selecione a opcao novamente.", "Erro", JOptionPane.ERROR_MESSAGE);
						break;
					}
					
					Loja novaLoja = new Loja(andar,
											 JOptionPane.showInputDialog("Digite o nome da loja: "),
											 JOptionPane.showInputDialog("Digite a descricao da loja: "));
					controllDep.addDep(novaLoja);
					break;
				case 2:
					Loja consultLoja = new Loja(0, JOptionPane.showInputDialog("Digite o nome da loja: "), null);
					controllDep.consultDep(consultLoja);
					break;
				case 3:
					Loja excluiLoja = new Loja(0, JOptionPane.showInputDialog("Digite o nome da loja: "), null);
					controllDep.removerDep(excluiLoja);
					break;
				case 9:
					JOptionPane.showMessageDialog(null, "Obrigado por utilizar nosso Sistema!");
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opcao invalida!\nDigite novamente.", "Erro", JOptionPane.ERROR_MESSAGE);
				}
			} catch (Exception e) {
				System.err.println(e);
			}
		}
		
		
		
			
			
			
		
	}

}
