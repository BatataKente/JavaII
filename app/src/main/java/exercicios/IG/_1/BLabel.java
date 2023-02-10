/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios.IG._1;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 *
 * @author Daniel
 */
public class BLabel extends JLabel {
    public BLabel(String text, Font font, Color color) {
        setHorizontalAlignment(SwingConstants.CENTER);
        setForeground(color);
        setFont(font);
        setText(text);
    }
    public BLabel(String text, int style, int size, Color color) {
        setHorizontalAlignment(SwingConstants.CENTER);
        setForeground(color);
        setFont(Default.font(style, size));
        setText(text);
    }
    public BLabel(String text, int size) {
        setHorizontalAlignment(SwingConstants.CENTER);
        setForeground(Color.WHITE);
        setFont(Default.font(size));
        setText(text);
    }
    public BLabel() {
        setHorizontalAlignment(SwingConstants.CENTER);
        setForeground(Color.WHITE);
        setFont(Default.FONT);
    }
}
