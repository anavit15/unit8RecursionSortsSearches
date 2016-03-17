import java.util.ArrayList;

public class ListMethodsRunner
{
    public static void main(String[] args)
    {
        ArrayList<Integer> list = ListMethods.makeList(10);
        if (list.size() == 0)
        {
            System.out.println("The list is empty");
        }
        else
        {
            System.out.println(list);
        }
        System.out.println(ListMethodsRunner.reverseList(list));
    }

    public static ArrayList<Integer> reverseList(ArrayList<Integer> tList)
    {
        ArrayList<Integer> list = ListMethods.deepClone(tList);
        if (list.size()<=1)
        {
            return list;
        }
        else
        {
            int index = list.get(0);
            list.remove(0);
            list = reverseList(list);
            list.add(index);
            return list;
        }

    }
    
    public static ArrayList<Integer> even(ArrayList<Integer> tList)
    {
        ArrayList<Integer> list = ListMethods.deepClone(tList);
        if (list.size()<=1)
        {
            return list;
        }
        else
        {
            int index = list.remove(0);
            list.remove(0);
            list = even(list);
            list.add(0,index);
            return list;
        }

    }
    
    public static ArrayList<Integer> even(ArrayList<Integer> tList1,ArrayList<Integer> tList2)
    {
        ArrayList<Integer> list1=ListMethods.deepClone(tList1);
        ArrayList<Integer> list2=ListMethods.deepClone(tList2);
        ArrayList<Integer> tempList;
        if(list1.size()==0
        {
            return list2;
        }
        else if(list2.size()==0
        {
            return list1;
        }
        else 
        {
            int lastElement1=list1.get(list1.size()-1);
            int lastElement1=list1.get(list1.size()-1)
            if (lastElement2.compareTo(lastElement2)<0)
            {
                lastElement2=list2.remove(list2.size()-1);
                tempList=ListMethods.merge(list1,list2);
                tempList.add(lastElement2);
            }
            else 
            {
                lastElement1=list1.remove(list1.size()-1);
                tempList=ListMethods.merge(list1,list2);
                tempList.add(lastElement1);
            }
            return tempList;
        }
    }

}

