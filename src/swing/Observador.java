package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Observador {
    public static void main(String[] args) {

        JFrame janela = new JFrame("Observador");
        janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        janela.setSize(600, 200);

        janela.setLayout(new FlowLayout());
        janela.setLocationRelativeTo(null);//Centraliza a tela em relação ao monitor e
        // não como o padrã que é referente a aplição

        JButton botao = new JButton("Clicar");
        janela.add(botao);

        botao.addActionListener((ActionEvent e) -> {
            System.out.println("Evento ocorreu!!!");
        });
        janela.setVisible(true);
    }
}
