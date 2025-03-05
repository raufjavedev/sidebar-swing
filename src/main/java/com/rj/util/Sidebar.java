package com.rj.util;

import java.awt.Color;
import java.util.List;
import javax.swing.*;

public class Sidebar {
    private final Color activeColor;
    private final Color defaultColor;

    public Sidebar(Color activeColor, Color defaultColor) {
        this.activeColor = activeColor;
        this.defaultColor = defaultColor;
    }

    // Método para establecer el color activo en un JLabel y el color por defecto en los demás
    public void setActiveLabel(JLabel activeLabel, List<JLabel> allLabels) {
        for (JLabel label : allLabels) {
            if (label == activeLabel) {
                label.setBackground(activeColor);
                label.setOpaque(true);
            } else {
                label.setBackground(defaultColor);
                label.setOpaque(true);
            }
        }
    }

    // Método para establecer el color activo en un JButton y el color por defecto en los demás
    public void setActiveButton(JButton activeButton, List<JButton> allButtons) {
        for (JButton button : allButtons) {
            if (button == activeButton) {
                button.setBackground(activeColor);
                button.setOpaque(true);
            } else {
                button.setBackground(defaultColor);
                button.setOpaque(true);
            }
        }
    }
}
