package sortedOne.linkedList;


public class SingleListUtil {

    public static int length(Node tail){
       /* int c=0;
        for( ; tail != null; tail=tail.next(), ++c);*/
        /*return c;*/
        int c=0;
        return tail != null && ++c >0 ? c+= length(tail.next()) :c ;
    }

    public static int max(Node tail){
        /*if(tail == null) return 0;
        int c = (int) tail.getElement();
        for( ;tail != null; tail = tail.next()){
            if(c < (int)tail.getElement()) c = (int) tail.getElement();
        }
        return c;*/
        int c=0;
        return tail != null && (int) tail.getElement() > (c= max(tail.next())) ? (int)tail.getElement(): c;
    }

    public static int sum(Node tail){
        return tail!= null ? (int)tail.getElement() + sum(tail.next()) : 0;
    }
}
