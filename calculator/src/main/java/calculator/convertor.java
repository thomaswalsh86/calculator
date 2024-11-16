package calculator;
import java.util.ArrayList;
public class convertor
{
    public static void main(String[] args) {
        String word = "2321+3324+1234+4356";
        math(convert(word));
        
        
    }
    public static int math(ArrayList<String> arrayList)
    {
        for (int i = 0; i < arrayList.size(); i++) {
            if(i%2!=0)
            {

            }
        }
        return 5;
    }
    public static ArrayList<String> convert(String selected) 
    {
        int prevPoint=-1;
        ArrayList<String> arrayList = new ArrayList<>();
        for(int i=0;i<selected.length();i++)
        {
            String sub=selected.substring(i, i+1);
            if(matches(sub))
            {
                String word=selected.substring(prevPoint+1,i);
                arrayList.add(word);
                arrayList.add(sub);
                prevPoint=i;
            }
        }
            if(prevPoint<selected.length()-1)
            {
                arrayList.add(selected.substring(prevPoint + 1));
            }
            for(String item: arrayList)
            {
                System.out.println(item);
            }
        return arrayList;
    }
    public static boolean matches(String sub)
    {
    return sub.equals("+")||sub.equals("-")||sub.equals("x")||sub.equals("/");
    }
}