package View;

import javax.swing.JOptionPane;

public class OpcaoView {

	public static Opcao select() {
		
		Opcao ret = (Opcao) JOptionPane.showInputDialog(null, //Componente pai)
														"Selecione uma opção",
														"Menu",
														JOptionPane.QUESTION_MESSAGE,
														null, //icone
														Opcao.values(),//Numero opcao
														Opcao.CADASTRAR_PRODUTO);
		
		
		return ret != null ? ret : Opcao.ENCERRAR_SISTEMA;
	}

}
