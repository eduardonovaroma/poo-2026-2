public class App {
    public static void main(String[] args) throws Exception {
        
        Animal animal = new Animal(10, 2);
        animal.comer();
        animal.dormir();
        animal.andar();
        animal.fazerBarulho();

        System.out.println(animal);

        Leao leao = new Leao(20, 5);
        leao.comer();
        leao.dormir();
        leao.andar();
        leao.fazerBarulho();
        System.out.println(leao);


    }
}
