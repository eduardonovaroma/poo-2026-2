
public class Animal {
    protected  int peso;
    protected int altura;
    public String cor;

    public Animal(int peso, int altura) {
        this.peso = peso;
        this.altura = altura;
    }

    public void comer() {
        System.out.println("Animal comendo...");
    }

    public void dormir() {
        System.out.println("Animal dormindo...");
    }

    public void andar() {
        System.out.println("Animal correndo...");
    }

    public void fazerBarulho() {
        System.out.println("Animal emitindo som...");
    }

    public String toString() {
        return getClass().getName() + ": Peso: " + peso + " Altura: " + altura;
    }
}