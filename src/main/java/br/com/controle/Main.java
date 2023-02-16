package br.com.controle;

public class Main {
    public static void main(String[] args) {
        ControleRemoto c = new ControleRemoto(50, false, false);
        //c.ligar();
        c.maisVolume();
        c.play();
        c.abirMenu();
        c.fecharMenu();
    }
}