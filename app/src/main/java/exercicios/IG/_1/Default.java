/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios.IG._1;

import java.awt.Font;

/**
 *
 * @author Daniel
 */
public abstract class Default {
    static final Font FONT = new Font("Segoe UI", Font.BOLD, 18);
    static final Font font(int style, int size) {
        return new Font("Segoe UI", style, size);
    }
    static final Font font(int size) {
        return new Font("Segoe UI", Font.BOLD, size);
    }
}
