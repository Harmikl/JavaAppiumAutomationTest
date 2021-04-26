import org.junit.Test;

public class MainTest {
    int a=5; //это переменные класса
    int b=10;
    @Test
    public void myFirstTest(){
        int a = this.multiply(5);//обьявили переменную а и присвоили ей метод с параметром 5
        System.out.println(a);
        int b= this.multiply(10,15); //обьявили переменную а и присвоили ей метод с параметарами number 10, multiplier 15;
        System.out.println(b);

    }
    public int multiply(int number){// внутри метода в скобках может быть входной параметр
        return number*2;
    }
    public int multiply (int number, int multiplier){
        return number*multiplier;
    }
    public int giveMeInt(){ // этот метод возвращает int
        return 5;
    }
}
