package calculator;
public class Core
{
    private int num1;
    private int num2;
    private String match;
    public Core(int num1,int num2)
    {
        this.num1=num1;
        this.num2=num2;
    }
    public Core(String selected)
    {
        match=selected;
        int math=0;
        //2+3
        if(!selected.contains("("))//simple
        {
            math=Integer.valueOf(match);
            System.out.println(math);
        }
    }
    public Core()
    {
        num1=0;
        num2=0;
    }
    public int getNum1()
    {
        return num1;
    }
    public int getNum2()
    {
        return num2;
    }
    public int add(int num1,int num2)//Addition
    {
        int result =num1+num2;
        return result;
    }
    public int subtratct(int num1,int num2)//Subtraction
    {
        int result =num1-num2;
        return result;
    }
    public int multiply(int num1,int num2)
    {
        int result =num1*num2;
        return result;
    }    
    public int divide(int num1,int num2)
    {
        int result =num1/num2;
        return result;
    }
    public int square(int num1)
    {
        return num1*num1;
    }
    public int power(int num,int power)
    {
        int result = 1;
        for (int i = 0; i < power; i++) {
            result*=num;
            System.out.println(result);
        }
        return result;
    }
    public void help()
    {
        System.out.println("All of the possible functions are \n add \n subtract \n multiply \n divide \n square \n power");
    }

}