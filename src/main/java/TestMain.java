
import java.util.*;
/**
 * TestMain sinifi
 */
public class TestMain 
{
    public static void main(String[] args) 
    {
        /*---------------------------PART 1-----------------------------------*/
        System.out.println("\nPART 1");
        
        Stack<Integer>tower1=new Stack<>();
        Stack<Integer>tower2=new Stack<>();
        Stack<Integer>tower3=new Stack<>();
        
        Part1TowerOfHanoi part1=new Part1TowerOfHanoi();
        part1.TowerOfHanoi(3,tower1,tower3,tower2);
        
        /*---------------------------PART 2-----------------------------------*/
        System.out.println("\n\nPART 2"); 
        Part2<Integer> part2=new Part2<>();
        
        part2.add(1);part2.add(6);part2.add(5);part2.add(6);
        part2.add(6);part2.add(6);part2.add(1);
        
        System.out.println("Ilk Hali==>"+part2.toString());
        part2.remove(6);
        System.out.println("Son Hali==>"+part2.toString());
        
        /*---------------------------PART 3-----------------------------------*/    
        System.out.println("\n\nPART 3");
        Part3 part3=new Part3(); 
        List<Integer> interSection=new ArrayList<>();
        List<Integer> union=new ArrayList<>();
        boolean altkume_mi;
        
        interSection=part3.intersectionOfLists();
        union=part3.unionOfLists();
        altkume_mi=part3.isSubset();
        
        System.out.println("Kesisim==>"+interSection.toString());
        System.out.println("Birlesim==>"+union.toString());
        
        if(altkume_mi==true)
            System.out.println("List2,List1'in alt kumesi.");
        else
            System.out.println("List2,List1'in alt kumesi degil.");    
    }    
}

