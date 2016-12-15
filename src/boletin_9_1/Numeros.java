package boletin_9_1;

import javax.swing.JOptionPane;

public class Numeros {

    public void bucles() {
        int neg = 0;
        int pos = 0;
        int cero = 0;
        int i = 0;
        do {
            int n = Integer.parseInt(JOptionPane.showInputDialog("Da valores"));
            i++;

            if (n < 0) {
                neg = neg + 1;
            } else if (n > 0) {
                pos = pos + 1;
            } else {
                cero = cero + 1;
            }

        } while (i < 10);

        System.out.println("Hay " + pos + " números positivos " + "Hay " + neg + " números negativos " + "Hay " + cero + " ceros");
    }
}
