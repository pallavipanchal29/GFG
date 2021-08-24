package array.basic;

import java.util.*;

//Completed GFG - correct
public class SortingEmployees
{
    static class node
    {
        int salary;
        String name;
        public void setSalary(int a)
        {
            this.salary=a;
        }
        public void setName(String s)
        {
            this.name=s;
        }
    }
    public static void main(String[] args)
    {
        node node1 = new node();
        node1.setName("xbnnskd");
        node1.setSalary(100);

        node node2 = new node();
        node2.setName("geek");
        node2.setSalary(50);

        node[] nodeArray = new node[2];
        nodeArray[0] = node1;
        nodeArray[1] = node2;

        sortRecords(nodeArray,nodeArray.length);

        for(int i = 0;i<nodeArray.length;i++)
            System.out.println(nodeArray[i].name+" "+nodeArray[i].salary);

    }
    static void sortRecords(node arr[],int n)
    {
        List<node> tempList = new ArrayList<>(Arrays.asList(arr));
        Collections.sort(tempList, (o1, o2) -> {
            if(o1.salary == o2.salary)
            {
                return o1.name.compareTo(o2.name);
            }
            else
            {
                if(o1.salary > o2.salary)
                    return 1;
                else
                    return -1;
            }
        });
        for(int i = 0;i<tempList.size();i++)
            arr[i] = tempList.get(i);
    }
}
