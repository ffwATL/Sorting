package sortedOne.SoftServ;


import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Handler implements Serializable{

    private static final double HOURLY_RATE=15;
    private static final double MONTHLY_RATE=1500.0;
    private static final Wage hourlyWage = new HourlyWage(HOURLY_RATE);
    private static final Wage monthlyWage = new FixedWage(MONTHLY_RATE);

    private static File file = new File("D://askme.sav");

    public static void main(String[] args) throws IOException {
        List<Employee> list = new ArrayList<Employee>();
        list.add(new Employee("Sander",18,new HourlyWage(11),4001));
        list.add(new Employee("John",26,new HourlyWage(13),1002));
        list.add(new Employee("Alex",23,monthlyWage,7876));
        list.add(new Employee("Boby",19,hourlyWage,5634));
        Collections.sort(list);
        System.out.println(list);
        /*infoFromFirst(2,list);*/
        getIdFromLast(3,list);
       /* saveToFile(list,file);*/
        System.out.println(loadFromFile(file));

    }

    public static void infoFromFirst(int n, List<Employee> list){
        n = checkForRange(n, list.size());
        for(int i=0; i < n; i++){
            System.out.println(list.get(i));
        }
    }

    private static int checkForRange(int n, int size){
        if(n > size) return size;
        return n;
    }

    public static void getIdFromLast(int n, List<Employee> list){
        n = checkForRange(n,list.size());
        int f =list.size()-1;
        for(int i = f; i > f-n; i--){
            System.out.println(list.get(i).getId());
        }
    }

    public static void saveToFile(List<Employee> list, File file) {
        if(FileFilterExt.accept(file,"sav")){
            try(OutputStream out = new FileOutputStream(file);
                ObjectOutputStream obj = new ObjectOutputStream(out)){
                obj.writeObject(list);
            }catch(IOException ex){
                ex.printStackTrace();
            }
        } else System.out.println("Wrong file was chosen");
    }

    public static List<Employee> loadFromFile(File file){
        if (FileFilterExt.accept(file,"sav")){
            try (FileInputStream fis = new FileInputStream(file);
                 ObjectInputStream ois = new ObjectInputStream(fis)){
                Object  obj = ois.readObject();
                return (List<Employee>) obj;
            }catch (FileNotFoundException | ClassNotFoundException  ex){
                ex.printStackTrace();
            }catch (IOException ex){
                ex.printStackTrace();
            }
        } else System.out.println("Wrong file extension!!");
        return null;

    }

    private static class FileFilterExt {

        public static boolean accept(File file, String extension){
            if(file.getAbsolutePath().endsWith(extension)) return true;
            else return false;
        }


    }
}
