class Product {

    //Attributes:
    int pid;
    String name;
    int price;

    Product() {
        System.out.println("Product class constructor");
    }

    //methods
    void setProductDetail(int pid, String name, int price) {
        this.pid = pid; //this means reference to the current objects
        this.name = name;
        this.price = price;
    }

    // to read the data :
    void showProductDetails() {
        System.out.println("----product_id--->" + pid);
        System.out.println("----name--->" + name);
        System.out.println("----price--->" + price );
    }


    void setPid(int pid) {
        this.pid = pid;
    }

    int getPid() {
        return pid;
    }
}

//cretaing a child class
class Moblie extends Product {
    String os;
    int ram;
    int sdCardSize;

    Moblie() {

    }

    //we redefined the same method based on  different inputs:
    //method overloading :same method name with different Inputs

    void setProductDetail(int pid, String name, int price, String os, int ram, int sdCardSize) {
        this.pid = pid; //this means reference to the current objects
        this.name = name;
        this.price = price;
        this.ram = ram;
        this.os = os;
        this.sdCardSize = sdCardSize;
        System.out.println("Data written in Product Object");
    }
    //Redefine the method :
    //Method overriding  we add some things here::::
    void showProductDetails() {
        System.out.println("----product_id--->" + pid);
        System.out.println("----name--->" + name);
        System.out.println("----price--->" + price );
        System.out.println("----OS--->" + os );
        System.out.println("----RAM--->" + ram );
        System.out.println("----SD CARD SIZE--->" + sdCardSize );

    }

}

public class Inhertc {
    public static void main(String[] args) {

        Product product = new Product();
        //product is ref variable
        //  System.out.println("Product is: " + product);

        //set on product detail:
        product.setProductDetail(1, "Potato", 10);
        product.showProductDetails();

        Product product2 = new Product();
        product2.setPid(100);


        Moblie moblie = new Moblie();
       // moblie.setProductDetail(200, "iphone7", 25000);
        moblie.setProductDetail(300, "iphoneX", 70000, "IOS", 4, 64);
        moblie.showProductDetails();


    }

}
