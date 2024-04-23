
import org.h2.jdbcx.JdbcDataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.elengaupt.beans.Beans;
import ru.elengaupt.geometry.Line;
import ru.elengaupt.utils.Utils;

import java.util.Date;
import java.util.function.Predicate;

import static java.lang.Math.pow;
import static java.lang.Integer.parseInt;

public class execution {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        ApplicationContext ac = new AnnotationConfigApplicationContext();
        System.out.println(ac.getBean("random"));
    }
}
