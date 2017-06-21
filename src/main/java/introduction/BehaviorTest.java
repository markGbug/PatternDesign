package introduction;

/**
 * @author zhangbj
 * @version 1.0
 * @Type BehaviorTest
 * @Desc
 * @data 2017/6/20
 */

public class BehaviorTest {
    public static void main(String[] args) {
        AbstractAimal aimal = new Dog();
        AbstractAimal aimal1 = new Cat();

        aimal.makeSound();
        aimal1.makeSound();
    }
}
