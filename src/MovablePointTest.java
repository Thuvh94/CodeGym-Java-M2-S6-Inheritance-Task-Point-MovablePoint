public class MovablePointTest {
    public static void main(String[] args) {
        MovablePoint movablePoint1 = new MovablePoint();
        System.out.println(movablePoint1);

        MovablePoint movablePoint2 = new MovablePoint(25.8f,15.6f);
        System.out.println(movablePoint2);

        MovablePoint movablePoint3 = new MovablePoint(10f,20f,15.2f,10.5f);
        System.out.println(movablePoint3);

        System.out.println(movablePoint3.move());
    }
}
