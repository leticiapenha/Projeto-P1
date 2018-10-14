
package projetop1;

import java.util.Random;

public class Veiculos {

    private  int x;
    private  int y;
    private  int tam;
    private  int dir;
    private  double vel;
    private  String cor;

    public Veiculos(int x, int y, int tam, double vel, int dir, String cor) {
        this.x = x;
        this.y = y;
        this.cor = cor;
        this.tam = tam;
        this.vel = vel;
        this.dir = dir;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getTam() {
        return tam;
    }

    public int getDir() {
        return dir;
    }

    public double getVel() {
        return vel;
    }

    public String getCor() {
        return cor;
    }
    
    /*void Direcao(){
        Random random = new Random();
        this.dir=random.nextInt(4);
    }*/
    

    
     void move() {
        if (dir == 1) {
            Cima();
        } else if (dir == 2) {
            Baixo();
        } else if (dir == 3) {
            Esquerda();
        } else if (dir == 4) {
            Direita();
        }
     }

    void Cima() {
        if (x == 1){
            x += 27;
        } else {
            x -= 1;
        }
    }

    void Baixo() {
        if (x == 28){
            x -= 27;
        } else {
            x +=1;
        }
    }

    void Esquerda() {
        if (y == 1){
            y += 57; 
        } else {
            y -= 1;
        }
    }

    void Direita() {
        if (y == 58){
            y -= 57;
        } else {
            y += 1;
        }
    }
     
        
        
        
        

    
}
        
    
    
  

