interface LibraryUser{
    void registerAccount();
    void requestBook();
}
class KidUsers implements LibraryUser{
    int age;
    String bookType;
    public KidUsers(int age, String bookType){
        this.age = age;
        this.bookType = bookType;
    }
    public void registerAccount(){
        if(age < 12){
            System.out.println("You have successfully registered under a Kids Account");
        }
        else{
            System.out.println("Sorry,Age must be less than 12 to register as a kid");
        }
    }
    public void requestBook(){
        if(bookType.equals("Kids")){
            System.out.println("Book Issued successfully, please return the book within 10 days");
        }
        else{
            System.out.println("Oops, you are allowed to take only kids books");
        }
    }
}
class AdultUser implements LibraryUser{
    int age;
    String bookType;
    public AdultUser(int age, String bookType){
        this.age = age;
        this.bookType = bookType;
    }
    public void registerAccount(){
        if(age > 12){
            System.out.println("You have successfully registered under an Adult Account");
        }
        else{
            System.out.println("Sorry, Age must be greater than 12 to register as an adult");
        }
    }
    public void requestBook(){
        if(bookType.equals("Fiction")){
            System.out.println("Book Issued successfully, please return the book within 7 days");
        }
        else{
            System.out.println("Oops, you are allowed to take only adult Fiction books");
        }
    }
}
class LibraryInterfaceDemo{
    public static void main(String[] args){
        KidUsers k1 = new KidUsers(10, "Kids");
        k1.registerAccount();
        k1.requestBook();
        System.out.println();

        KidUsers k2 = new KidUsers(18, "Fiction");
        k2.registerAccount();
        k2.requestBook();
        System.out.println();

        AdultUser a1 = new AdultUser(5, "Kids");
        a1.registerAccount();
        a1.requestBook();
        System.out.println();

        AdultUser a2 = new AdultUser(23, "Fiction");
        a2.registerAccount();
        a2.requestBook();
        System.out.println();
    }
}