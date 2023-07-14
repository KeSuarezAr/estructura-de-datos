package org.uide.listasenlasadas;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.LinkedList;

public class JuegoListas extends javax.swing.JFrame implements KeyListener, Runnable {

    private final LinkedList<Punto> lista = new LinkedList<Punto>();
    private int columna, fila;
    private int colfruta, filfruta;
    private boolean juegoactivo;
    private Direccion direccion = Direccion.up;
    private final Thread hilo;
    private int longitudVibora;
    private Image imagen;
    private Graphics graficos;

    @Override
    public void run() {
        while (juegoactivo) {
            try {
                Thread.sleep(100);
                switch (direccion) {
                    case left:
                        columna--;
                        break;
                    case right:
                        columna++;
                        break;
                    case up:
                        fila--;
                        break;
                    case down:
                        fila++;
                        break;
                }
                repaint();
                sePisa();
                if (comeFruta() == false && longitudVibora == 0) {
                    lista.removeLast();
                    longitudVibora--;
                } else {
                    if (longitudVibora > 0) {
                        longitudVibora--;
                    }
                }
                System.out.println(columna + " " + fila);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            if (direccion != Direccion.right) {
                direccion = Direccion.left;
            }
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            if (direccion != Direccion.left) {
                direccion = Direccion.right;
            }
        }
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            if (direccion != Direccion.down)
                direccion = Direccion.up;
        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            if (direccion != Direccion.up)
                direccion = Direccion.down;
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    private enum Direccion {
        up, down, left, right
    }

    private void sePisa() {
        for (int i = 1; i < lista.size(); i++) {
            if (lista.get(i).getColumna() == columna && lista.get(i).getFila() == fila) {
                juegoactivo = false;
                setTitle("Perdiste :(");
            }
        }
    }

    private boolean comeFruta() {
        if (columna == colfruta && fila == filfruta) {
            colfruta = (int) (Math.random() * 50);
            filfruta = (int) (Math.random() * 50);
            this.longitudVibora = 10;
            return true;
        } else {
            return false;
        }
    }

    public void paint(Graphics g) {
        super.paint(g);
        if (!lista.isEmpty()) {
            if (imagen == null) {
                imagen = createImage(this.getSize().width, this.getSize().height);
                graficos = imagen.getGraphics();
            }

            graficos.clearRect(0, 0, getSize().width, getSize().height);
            graficos.setColor(Color.RED);
            graficos.drawRect(20, 50, 500, 500);
            for (Punto punto : lista) {
                graficos.fillRect(punto.getColumna() * 10 + 20, punto.getFila() * 10 + 20, 8, 8);
            }
            graficos.setColor(Color.YELLOW);
            graficos.fillRect(colfruta * 10 + 20, filfruta * 10 + 20, 8, 8);
            g.drawImage(imagen, 0, 0, this);
        }

    }

    public JuegoListas() {
        initComponents();

        this.addKeyListener(this);
        lista.add(new Punto(3, 20));
        lista.add(new Punto(2, 20));
        lista.add(new Punto(1, 20));

        columna = 30;
        fila = 20;

        colfruta = (int) (Math.random() * 40);
        filfruta = (int) (Math.random() * 40);

        hilo = new Thread(this);
        hilo.start();

        juegoactivo = true;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 400, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 300, Short.MAX_VALUE));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JuegoListas.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JuegoListas.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JuegoListas.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JuegoListas.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JuegoListas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
