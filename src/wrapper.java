
public class wrapper {
    public static void main(String[] args) {

        //boxing and  unboxing achieved through the Wrapper classes:;

        int n =99999999;
        long t ;
        {
            StringBuffer sb =new StringBuffer();
        }
        int i = 10;
        Integer iref = new Integer(i); //Boxed (Constructing the Object)
        int j = iref.intValue(); //Unboxing (Extracting the value)

        //OR AutoBxing

        int kref = i;

        //AutoUnboxing

        int l = kref;

        FinalizeDemo finalizeDemo = new FinalizeDemo();
        finalizeDemo=null;
        System.gc();//garbage collector

        String str1= new String("Hello");
        StringBuilder  builder= new StringBuilder("Hello");
        StringBuffer buffer=new StringBuffer("HEllo");
         str1.concat("Hi..."); //no change bcz it is Immutable
         builder.append(" Hi..."); //Mutable
         buffer.append(" Hi...");  //Mutable

         System.out.println(str1);
         System.out.println(builder);
         System.out.println(buffer);


    }


}

class FinalizeDemo {
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object finalized...");
    }
}
