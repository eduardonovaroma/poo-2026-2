public class Leao extends Animal {

    public Leao(int peso, int altura) {
        super(peso, altura);
        this.peso = peso;
        this.altura = altura;
    }

    @Override 
    public void comer() {
        System.out.println("Leão comendo...");
    }

    @Override
    public void dormir() {
        System.out.println("Leão dormindo...");
    }

    @Override
    public void andar() {
        System.out.println("Leão correndo...");
    }

    @Override
    public void fazerBarulho() {
        System.out.println("Leão emitindo som...");
    }
}
