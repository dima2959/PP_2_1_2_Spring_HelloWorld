import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println("Сообщение: " + bean.getMessage() + " Объект с хэшом: " + bean);
        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("helloworld");

        System.out.println("Сообщение: " + bean1.getMessage() + " Объект с хэшом: " + bean1);
        System.out.println("Сравнение по ссылке = " + (bean == bean1));

        Cat beanCat = (Cat) applicationContext.getBean("cat");
        System.out.println("Сообщение: " + beanCat.getMessage() + " Объект с хэшом: " + beanCat);
        Cat beanCat1 = (Cat) applicationContext.getBean("cat");

        System.out.println("Сообщение: " + beanCat1.getMessage() + " Объект с хэшом: " + beanCat1);
        System.out.println("Сравнение по ссылке = " + (beanCat == beanCat1));
    }
}