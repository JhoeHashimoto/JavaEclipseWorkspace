package View;

import javax.swing.JOptionPane;
import java.util.List;
import Model.Categoria;
import Repositorio.RepositorioCategoria;

public class CategoriaView {

    static RepositorioCategoria repositorio;

    public static Categoria select(Categoria categoria) {
        //@formatter:off

        List<Categoria> categorias = RepositorioCategoria.findAll();

        Categoria ret = (Categoria) JOptionPane.showInputDialog(
                null, // componente pai . Como não temos será null
                "Selecione uma categoria",
                "Menu",
                JOptionPane.QUESTION_MESSAGE,
                null, // ícone
                categorias.toArray(), // Número da opção
                categoria == null ? categorias.get(0) : categoria);

        return ret;
        //@formatter:on
    }

    public void sucesso() {
        JOptionPane.showMessageDialog(null, "Categoria foi salva com sucesso!");
    }

    public void sucesso(Categoria categoria) {
        JOptionPane.showMessageDialog(null, "Categoria " + categoria.getNome() + " foi salva com sucesso!");
    }

    public static Categoria form() {
        String nome = JOptionPane.showInputDialog(null, "Informe o nome da categoria: ");
        return new Categoria(nome);
    }
}
