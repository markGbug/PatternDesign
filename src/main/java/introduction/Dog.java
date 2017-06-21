package introduction;

/**
 * @author zhangbj
 * @version 1.0
 * @Type Dog
 * @Desc
 * @data 2017/6/20
 */

public class Dog extends AbstractAimal{

    public void makeSound(){
        bark();
    }


    public void bark(){
        System.out.println("bark");
    }
}
