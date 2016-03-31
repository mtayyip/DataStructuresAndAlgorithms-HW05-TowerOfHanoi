import java.util.*;
/**
 * Verilen 2 Listin kesisimlerini,birlesimlerini veren  ve alt kumemi degilmi diye bakan sinif.
 * @author Muhammet
 */
public class Part3
{
    /**1.metodun sonucu**/
    public List<Integer> result1=new ArrayList<>();;   
    /**2.metodun sonucu**/
    public List<Integer> result2=new ArrayList<>();
    /**3.metodun sonucu**/
    public List<Integer> result3=new ArrayList<>();      
    
    /**1.List**/
    public List<Integer> list1=new ArrayList<>();    
    /**2.List**/
    public List<Integer> list2=new ArrayList<>();
    
        
    /**Part3'un parametresiz constructor'i**/
    public Part3() 
    {
        list1.add(5);list1.add(3);list1.add(4);
        list1.add(1);list1.add(6);list1.add(2);
        
        list2.add(1);list2.add(8);list2.add(6);
        list2.add(2);list2.add(6);list2.add(10);         
        
        /*listeleri Collections.sort ile siraliyorum.*/
        Collections.sort(list1);
        Collections.sort(list2);
        
        System.out.println("List1==>"+list1.toString());
        System.out.println("List2==>"+list2.toString());
    }
    
       
    /**
     * wrapper metot 
     * @return private List intersectionOfLists(list1,list2) metodunun degeri
     */
    public List intersectionOfLists()
    {
        return intersectionOfLists(list1,list2);
    }
    
    
    /**
     * wrapper metot
     * @return  private List unionOfLists(list1,list2) metodunun degeri
     */
    public List unionOfLists()
    {
        return unionOfLists(list1, list2);
    }
    

    /**
     * wrapper metot
     * @return private boolean isSubset(list1,list2) metodunun degerini
     */
    public boolean isSubset()
    {       
        if(list1.isEmpty()==true)
            return false;
        
        return isSubset(list1,list2);
    }
    
      
    /**
     * Parametre olarak gelen List'lerin kesisimlerini bulup result1 e yazan recursive metot.
     * @param list1 ilk List
     * @param list2 ikinci List
     * @return kesisimlerini tutan List 
     */
    private List intersectionOfLists(List<Integer>list1,List<Integer>list2)
    {
        /*Base case*/
        if(list1.isEmpty()==true || list2.isEmpty()==true)
            return result1; 
        
        /*List1 in elemanlarini List2 icinde arayip varsa result1 List'ine yazip 
        List1'i de subset le kucultup tekrardan intersectionOfLists metodunu cagiriyorum.*/
        if(list2.indexOf(list1.get(0))!=-1){
            result1.add(list1.get(0));                   
            return intersectionOfLists(list1.subList(1,list1.size()),list2);}
        
        /*List1 in elemanlarini List2 icinde yoksa List1'i subset le kucultup
        tekrardan intersectionOfLists metodunu cagiriyorum.*/
        return intersectionOfLists(list1.subList(1,list1.size()),list2);
    }
    
    
    /**
     * Parametre olarak gelen List'lerin birlesimlerini bulup result2 ye yazan recursive metot.
     * @param list1 ilk List
     * @param list2 ikinci List
     * @return birlesimlerini tutan List 
     */
    private List unionOfLists(List<Integer>list1,List<Integer>list2)
    {
        /*Base case*/
        if(list1.isEmpty()==true && list2.isEmpty()==true)
            return result2; 
        
        
        /*List1'i recursive olarak result2'ye dolduruyorum.List1 bos olana kadar.
        Eger ayni eleman varsa result2 ye ekleme yapmadan List1 i subset le kucultup 
        unionOfLists metodunu tekrar cagiriyorum.*/
        if(list1.isEmpty()==false)
        {
            if(result2.indexOf(list1.get(0))==-1){
                result2.add(list1.get(0));
                return unionOfLists(list1.subList(1,list1.size()),list2);}
            else
                return unionOfLists(list1.subList(1,list1.size()),list2);
        }
        
        /*result2,List1 le dolduktan sonra List2 nin elemanlarini result2 icinde 
        arayip yoksa result2'ye yazip List2 yi subset le kucultup unionOfLists 
        metodunu tekrar cagiriyorum.Eger ayni eleman varsa result2 ye ekleme 
        yapmadan List2 yi subset le kucultup unionOfLists metodunu tekrar cagiriyorum.*/
        if(list2.isEmpty()==false)
        {
            if(result2.indexOf(list2.get(0))==-1){
                result2.add(list2.get(0));
                return unionOfLists(list1,list2.subList(1,list2.size()));}
            else
                return unionOfLists(list1,list2.subList(1,list2.size()));
        }      
        return unionOfLists(list1,list2);
    }
  
   
    /**
     * List2,List1 in alt kumesi mi diye bakan recursive metot.
     * @param list1 ilk List
     * @param list2 ikinci List
     * @return List2,List1 in alt kumesiyse true degilse false return ediyor.
     */
    private boolean isSubset(List<Integer>list1,List<Integer>list2)
    {       
        /*Base Case*/
        if(list2.isEmpty()==true)
            return true;
         
        /*List2 nin elemanlarini tek tek List1 de ariyor.Bulursa List2'yi
        kucultup tekrar isSubset i cagiriyor.Bulamazsa alt kume degil diye
        false return ediyor.*/
        if(list1.indexOf(list2.get(0))!=-1)
            return isSubset(list1,list2.subList(1,list2.size()));        
          
        return false;    
    }
}