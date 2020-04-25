package EmailApp;

public class EmailApplication {
    public static void main(String[] args) {
        Email em1 = new Email("Nibir","Imtiaz");
        em1.setAlternateEmail("Nick@gmail.com");
        System.out.println("Your Alternative Email is : "+em1.getAlternateEmail());
        System.out.println(em1.ShowInfo());
    }
}
