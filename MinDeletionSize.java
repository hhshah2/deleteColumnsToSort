import java.util.*;
import java.util.List;

public class deleteColumnsToSort 
{
    public List<Integer> minDeletionSize(String[] stringList)
    {
        List<Integer> index = new ArrayList<Integer>();
        boolean check= true;
        for(int i=0;i<stringList[0].length();i++)
        {
            
            if (check == true)
            {
                for(int j=0;j<stringList.length-1;j++)
                {
                    if(stringList[j].length()==stringList[j+1].length())
                    {
                        if(stringList[j].charAt(i)>stringList[j+1].charAt(i))
                        {
                            index.add(i);
                            break;
                        }
                    }
                    else
                    {
                        check = false;
                    }
                }
            }
            else
            {
                index.add(-1);
                break;
            }
        }
        return index;
    }
    
    public static void main(String [] args)
    {
        String [] characters = new String[]{"zyx","wvu","xur"}; // outputs 0,1,2
        deleteColumnsToSort sort = new deleteColumnsToSort();
        List<Integer> deletion = sort.minDeletionSize(characters);
        System.out.println(deletion.toString());
    }
}