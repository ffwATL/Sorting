package sortedOne.linkedList;


public class ListTester {

    public static void main(String[] args){
        SingleList<Integer> singleList= listGen(0);
        /*singleList.add(1072);
        singleList.add(1);*/
        System.out.println(singleList);
        /*System.out.println(SingleListUtil.sum(singleList.getTail()));*/
        System.out.println(SingleListUtil.sum(null));

    }

    public static SingleList<Integer> listGen(int i){
        SingleList<Integer> list = new SingleList<>();
        for(int k=0; k<i; k++){
            list.add(k);
        }
        return list;
    }
}
