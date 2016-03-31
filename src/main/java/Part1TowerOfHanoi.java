import java.util.*;
/**
 * Towers Of Hanoi'yi iterative olarak cozen sinif
 * @author Muhammet
 */
public class Part1TowerOfHanoi 
{
    /*Default Constructor*/
    public Part1TowerOfHanoi() 
    {}
    
    /**
     * Towers Of Hanoi.Kaynak kuleden Hedef kuleye Gecici Kule yi kullanarak tasima yapiyorum.
     * @param diskSize disklerin sayisi
     * @param src kaynak kule
     * @param dst hedef hedef
     * @param aux gecici kule
     */ 
    public void TowerOfHanoi(int diskSize,Stack<Integer>src,Stack<Integer>dst,Stack<Integer>aux)
    {
        int n=diskSize;
        int hamle=(int)Math.pow(2,n)-1;
        int yeni1,yeni2,yeni3;
        
        for(int i=diskSize;0<diskSize;diskSize--)
            src.push(diskSize);
        System.out.println("Disksize="+n+"icin:");
        for(int i=1;i<=hamle;i++)
        {
            System.out.println("\nHAMLE "+i);
            /*----------------------------------------------------------------*/  
            /*Duruma gore Tower2'den Tower1'e veya Tower1'den Tower2'ye tasima yapiliyor.*/
            if(n%2==0){
                if(i%3==1){
                    if(src.isEmpty()==false)
                        yeni1=src.peek();
                    else
                        yeni1=-1;                
                
                    if(dst.isEmpty()==false)
                        yeni2=dst.peek();
                    else
                        yeni2=-1;
                    
                    if(yeni1==-1)
                    {
                        yeni2=dst.pop();
                        src.push(yeni2);
                        System.out.println(yeni2+"-->Tower2'den Tower1'e");
                    }
                    else{
                        if(dst.isEmpty()==false)
                        {
                            if(yeni1<yeni2){
                                src.pop();
                                dst.push(yeni1);
                                System.out.println(yeni1+"-->Tower1'den Tower2'ye");}
                            else{
                                dst.pop();
                                src.push(yeni2);
                                System.out.println(yeni2+"-->Tower2'den Tower1'e");}               
                        }
                        else{
                            yeni1=src.pop();
                            dst.push(yeni1);
                            System.out.println(yeni1+"-->Tower1'den Tower2'ye");}}
                }
            /*----------------------------------------------------------------*/    
            /*Duruma gore Tower3'den Tower1'e veya Tower1'den Tower3'e tasima yapiliyor.*/    
                else if(i%3==2)
                {
                    if(src.isEmpty()==false)
                        yeni1=src.peek();
                    else
                        yeni1=-1;
                
                    if(aux.isEmpty()==false)
                        yeni3=aux.peek();
                    else
                        yeni3=-1;
                
                    if(yeni1==-1)
                    {
                        yeni3=aux.pop();
                        src.push(yeni3);
                        System.out.println(yeni3+"-->Tower3'den Tower1'e");
                    }
                    else{
                        if(aux.isEmpty()==false)
                        {
                            if(yeni1<yeni3){
                                src.pop();
                                aux.push(yeni1);
                                System.out.println(yeni1+"-->Tower1'den Tower3'e");}
                            else{
                                aux.pop();
                                src.push(yeni3);
                                System.out.println(yeni3+"-->Tower3'den Tower1'e");} 
                        }
                        else{
                            yeni1=src.pop();
                            aux.push(yeni1);
                            System.out.println(yeni1+"-->Tower1'den Tower3'e");}}          
                }
            
            /*----------------------------------------------------------------*/
            /*Duruma gore Tower3'den Tower2'ye veya Tower2'den Tower3'e tasima yapiliyor.*/    
                else
                {
                    if(dst.isEmpty()==false)
                        yeni2=dst.peek();
                    else
                        yeni2=-1;
                    
                    if(aux.isEmpty()==false)
                        yeni3=aux.peek();
                    else
                        yeni3=-1;
                
                
                    if(yeni2==-1)
                    {
                        yeni3=aux.pop();
                        dst.push(yeni3);
                        System.out.println(yeni3+"-->Tower3'den Tower2'ye");
                    }
                    else{
                        if(aux.isEmpty()==false)
                        {
                            if(yeni2<yeni3){
                                dst.pop();
                                aux.push(yeni2);
                                System.out.println(yeni2+"-->Tower2'den Tower3'e");}
                            else{
                                aux.pop();
                                dst.push(yeni3);
                                System.out.println(yeni3+"-->Tower3'den Tower2'ye");} 
                        }
                        else{
                            yeni2=dst.pop();
                            aux.push(yeni2);
                            System.out.println(yeni2+"-->Tower2'den Tower3'e");}} 
                }
            }
            
          
            /*------------------------disksize Ciftse-------------------------*/  
            else
            {
                /*Duruma gore Tower3'den Tower1'e veya Tower1'den Tower3'e tasima yapiliyor.*/
                if(i%3==1){
                    if(src.isEmpty()==false)
                        yeni1=src.peek();
                    else
                        yeni1=-1;                
                
                    if(aux.isEmpty()==false)
                        yeni3=aux.peek();
                    else
                        yeni3=-1;
                    if(yeni1==-1)
                    {
                        yeni3=aux.pop();
                        src.push(yeni3);
                        System.out.println(yeni3+"-->Tower3'den Tower1'e");
                    }
                    else{
                        if(aux.isEmpty()==false)
                        {
                            if(yeni1<yeni3){
                                src.pop();
                                aux.push(yeni1);
                                System.out.println(yeni1+"-->Tower1'den Tower3'e");}
                            else{
                                aux.pop();
                                src.push(yeni3);
                                System.out.println(yeni3+"-->Tower3'den Tower1'e");}               
                        }
                        else{
                            yeni1=src.pop();
                            aux.push(yeni1);
                            System.out.println(yeni1+"-->Tower1'den Tower3'e");}}
                }
            /*----------------------------------------------------------------*/    
            /*Duruma gore Tower2'den Tower1'e veya Tower1'den Tower2'ye tasima yapiliyor.*/
                else if(i%3==2)
                {
                    if(src.isEmpty()==false)
                        yeni1=src.peek();
                    else
                        yeni1=-1;
                
                    if(dst.isEmpty()==false)
                        yeni2=dst.peek();
                    else
                        yeni2=-1;
                
                    if(yeni1==-1)
                    {
                        yeni2=dst.pop();
                        src.push(yeni2);
                        System.out.println(yeni2+"-->Tower2'den Tower1'e");
                    }
                    else{
                        if(dst.isEmpty()==false)
                        {
                            if(yeni1<yeni2){
                                src.pop();
                                dst.push(yeni1);
                                System.out.println(yeni1+"-->Tower1'den Tower2'ye");}
                            else{
                                dst.pop();
                                src.push(yeni2);
                                System.out.println(yeni2+"-->Tower2'den Tower1'e");} 
                        }
                        else{
                            yeni1=src.pop();
                            dst.push(yeni1);
                            System.out.println(yeni1+"-->Tower1'den Tower2'ye");}}          
                }
            
            /*----------------------------------------------------------------*/
            /*Duruma gore Tower2'den Tower3'e veya Tower3'den Tower2'ye tasima yapiliyor.*/
                else
                {
                    if(aux.isEmpty()==false)
                        yeni3=aux.peek();
                    else
                        yeni3=-1;
                    
                    if(dst.isEmpty()==false)
                        yeni2=dst.peek();
                    else
                        yeni2=-1;
                
                
                    if(yeni3==-1)
                    {
                        yeni2=dst.pop();
                        aux.push(yeni2);
                        System.out.println(yeni2+"-->Tower2'den Tower3'e");
                    }
                    else{
                        if(dst.isEmpty()==false)
                        {
                            if(yeni3<yeni2){
                                aux.pop();
                                dst.push(yeni3);
                                System.out.println(yeni3+"-->Tower3'den Tower2'ye");}
                            else{
                                dst.pop();
                                aux.push(yeni2);
                                System.out.println(yeni2+"-->Tower2'den Tower3'e");} 
                        }
                        else{
                            yeni3=aux.pop();
                            dst.push(yeni3);
                            System.out.println(yeni3+"-->Tower3'den Tower2'ye");}} 
                }
            }
        }   
    }
}
    
    
    


