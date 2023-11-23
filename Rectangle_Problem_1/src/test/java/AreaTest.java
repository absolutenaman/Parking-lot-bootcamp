import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AreaTest {
    @Test
    void shoudlreturn50AsAreaWhenLengthis10AndBreadthIs5(){
        Rectangle temp=new Rectangle(10,5);
        Assertions.assertEquals(50,temp.Area());
    }
    @Test
    void shoudlreturn0AsAreaWhenLengthis10AndBreadthIs0(){
        Rectangle temp=new Rectangle(10,0);
        Assertions.assertEquals(0,temp.Area());
    }
    @Test
    void shoudlreturn30AsPermieterWhenLengthis10AndBreadthIs5(){
        Rectangle temp=new Rectangle(10,5);
        Assertions.assertEquals(30,temp.Perimeter());
    }
    @Test
    void shoudlreturn20AsPermieterWhenLengthis10AndBreadthIs5(){
        Rectangle temp=new Rectangle(10,0);
        Assertions.assertEquals(20,temp.Perimeter());
    }
}

