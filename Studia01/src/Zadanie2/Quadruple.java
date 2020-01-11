package Zadanie2;

public class Quadruple<T1, T2, T3, T4>
{
    private T1 value1;
    private T2 value2;
    private T3 value3;
    private T4 value4;

    public Quadruple(T1 value1, T2 value2, T3 value3, T4 value4) {
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
        this.value4 = value4;
    }

    public T1 getValue1() {
        return value1;
    }

    public T2 getValue2() {
        return value2;
    }

    public T3 getValue3() {
        return value3;
    }

    public T4 getValue4() {
        return value4;
    }

    @Override
    public String toString() {
        return super.toString() + "| Value1: "+value1+" Value2: "+value2+" Value3: "+value3+" Value4: "+value4;
    }

    public static void main(String[] args)
    {
        Quadruple<String, Integer, Float, Double> quad = new Quadruple<>("one two three dot one two three", 123, 123.123f, 123.123);
        System.out.println("This is quarduple container with generic types example instance: "+quad);

    }
}
