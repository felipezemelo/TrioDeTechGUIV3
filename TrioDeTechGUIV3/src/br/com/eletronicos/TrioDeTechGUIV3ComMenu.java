package br.com.eletronicos;
import javax.swing.*;
import java.awt.*;

public class TrioDeTechGUIV3ComMenu extends JFrame{
    JLabel linha1, linha2;
    ImageIcon loja = new ImageIcon(".\\img\\logo-loja-de-informatica.jpg"); // Procurar imagem
    LojaEletronicosInterface lojaInter = new LojaTrioDeTech();
    JMenuBar barraDeMenu = new JMenuBar();

    public TrioDeTechGUIV3ComMenu() {
        setTitle("Loja Trio de Tech");
        setSize(1000, 1000);
        setLocation(0, 0);
        setResizable(false);
        setBackground(Color.DARK_GRAY);
        linha1 = new JLabel("Menu da Trio de Tech", JLabel.CENTER);
        linha1.setForeground(Color.white);
        linha1.setFont(new Font("Serif", Font.BOLD, 24));
        linha2 = new JLabel(loja, JLabel.CENTER);
        setLayout(new GridLayout(3, 1));
        add(linha1);
        add(linha2);
        add(new JLabel());
    }
}

