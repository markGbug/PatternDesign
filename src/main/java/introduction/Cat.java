package introduction;

/**
 * @author zhangbj
 * @version 1.0
 * @Type Cat
 * @Desc
 * @data 2017/6/20
 */

public class Cat extends AbstractAimal{

    public void makeSound(){
        meow();
    }

    public void meow(){
        System.out.println("meow");
    }
}
