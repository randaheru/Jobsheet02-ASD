public class DragonMain25 {
    public static void main(String[] args) {
       
        Dragon25 dragon = new Dragon25(5, 5, 10, 10);

        
        dragon.printPosition();

        dragon.moveLeft();
        dragon.printPosition();

        dragon.moveUp();
        dragon.printPosition();

        dragon.moveRight();
        dragon.printPosition();

        dragon.moveDown();
        dragon.printPosition();

        dragon.moveLeft();
        dragon.printPosition();
    }
}
