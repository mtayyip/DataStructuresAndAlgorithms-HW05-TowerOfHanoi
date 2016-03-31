/**
 * Recursion la bir LinkedList'te ki duplicate olan elemanlari silen sinif.
 * @author Muhammet
 * @param <E> Generics tip
 */
public class Part2<E extends Comparable<E>>
{
    /** The list head**/
    private Node<E> headNode;
    
    /**LinkedList i dolasmak icin temp i headNode la yani yeri gosteriyorum.**/
    private Node<E> temp;//add metodu icinde basa eklemede temp=headNode yapiyorum.
    
    /**Silinmek istenen eleman duplicate olup olmadigina bakmak icin**/
    private  static int sayac=0;
    
    /**LinkedListRec sinifindan alindi.*/
    private static class Node<E> 
    {
        // Data Fields
        /** The reference to the data.**/
        private E data;
        /** The reference to the next node.**/
        private Node next;

        // Constructors
        /** Creates a new node with a null next field.
        @param dataItem The data stored
        */
        
        /** Creates a new node that references another node.
        @param dataItem The data stored
        @param nodeRef The node referenced by new node
        */
        private Node(E dataItem){
            data = dataItem;
            next = null;}

        private Node(E dataItem,Node<E>nodeRef){
            data = dataItem;
            next = nodeRef;}
    } //end class Node
    
    
    /**
     * Wrapper metot recursive metodu cagiriyorum.
     * @param outData silinmek istenen eleman.
     * @return eleman siliniemediyse false,silindiyse true.
     */
    public boolean remove(E outData)
    {
        System.out.println("Kaldirilmak istenen eleman==>"+outData);
        
        /*Sileinmek istenen elemanin linkedlistte kac defa gectigine bakiyorum.*/
        while(temp!=null){
            if(temp.data.compareTo(outData)==0)
                sayac++;            
            temp=temp.next;}       
        
        /*linkedlist bossa false return ediyorum.*/
        if(headNode==null)
            return false;
        
        /*linkedlistin ilk elemani silinmek istenen elemansa silip oyle recursive cagiriyorum*/
        else if(headNode.data.compareTo(outData)==0){
            headNode=headNode.next;
            return remove(headNode,headNode,outData);}
        
        /*linkedlistin ilk elemani silinmek istenen eleman degilse recursive cagiriyorum*/
        return remove(headNode,headNode,outData);
    }
    
    
    /**
     * Recursive metot.silinmek istenen eleman duplicate ise silme islemi yapiliyor.  
     * @param head listenin basini gosteren node.
     * @param pred head'in onceki nodenu gosteren node
     * @param outData silinmek istenen eleman.
     * @return eleman siliniemediyse false,silindiyse true.
     */
    private boolean remove(Node<E>head,Node<E>pred,E outData)
    {
        if(sayac>=2){
            if (head==null)
                return false;
            else if (head.data.compareTo(outData)==0){       
                if(pred.data.compareTo(outData)==0)
                    headNode=headNode.next;
                else
                    pred.next=head.next;
                
                head=head.next;
                remove(head,pred,outData);
                return true;}           
            else
                return remove(head.next,head,outData);
        }
        
        else if(sayac==0){
                System.out.println("Kaldirilmak istenen eleman bulunamadi.");
                return false;}
            
        else{
                System.out.println("Kaldirilmak istenen eleman Duplicate degil.");
                return false;}   
    }

    
    /** LinkedListRec sinifindan alindi.
     *Adds a new node to the end of a list.
     * @param head The head of the current list
     * @param data The data for the new node
     */
    private void add(Node<E>head, E data) 
    {
        if (head.next == null)
            head.next = new Node<E>(data);
        else
            add(head.next, data); // Add to rest of list.
    }
    

    /** LinkedListRec sinifindan alindi.
     * Wrapper method for adding a new node to the end of a list.
     * @param data The data for the new node
     */
    public void add(E data) 
    {
        if (headNode == null){
            headNode = new Node<E>(data);
            temp=headNode;}
        else
            add(headNode, data);
    }
    
    

    /** LinkedListRec sinifindan alindi.
     *  Returns the string representation of a list.
     * @param head
     * @return The state of the current list
     */
    private String toString(Node<E> head) 
    {
        if (head == null)
            return "";
        else
            return head.data + " " + toString(head.next);
    }

    

    /** LinkedListRec sinifindan alindi.
     * Wrapper method for returning the string representation of a list.
     * @return The string representation of the list
     */
    @Override
    public String toString() 
    {
        return toString(headNode);
    } 
}