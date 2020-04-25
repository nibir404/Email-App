package EmailApp;

import java.util.Scanner;

public class Email {
    private String FirstName;
    private String LastName;
    private String Department;
    private String Password;
    private String AlternateEmail;
    private String email;
    private String CompanySuffix = "anycompany.com";
    private int MailboxCapacity = 500;
    private int PasswordLength = 10;

    public Email(String FirstName,String LastName){
        this.FirstName = FirstName;
        this.LastName = LastName;
        System.out.println("EMAIL CREATED: "+this.FirstName+" "+this.LastName);

        this.Department = setDepartment();
        System.out.println("Department: "+this.Department);

        this.Password = RandPass(this.PasswordLength);
        System.out.println("Your Password is "+this.Password);

        email = FirstName.toLowerCase()+"."+LastName.toLowerCase()+"@"+Department+"."+CompanySuffix;
        System.out.println("Your email is : "+email);
    }

    private String setDepartment(){
        System.out.println("DEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code : ");
        Scanner in = new Scanner(System.in);
        int deptChoice = in.nextInt();
        if (deptChoice == 1){
            return "sales";
        }
        else if (deptChoice == 2){
            return "Dev";
        }
        else if (deptChoice == 3){
            return "acct";
        }
        else {
            return "";
        }
    }

    private String RandPass(int length){
       String PasswordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*";
       char [] password = new char[length];
       for (int i = 0; i<length;i++){
           int rand=(int)(Math.random()*PasswordSet.length());
           password[i] = PasswordSet.charAt(rand);
       }
       return new String(password);
    }

    public void setMailboxCapacity(int capacity){
        this.MailboxCapacity = capacity;
    }

    public void setAlternateEmail(String altEmail){
        this.AlternateEmail = altEmail;
    }

    public void ChangePass(String password){
        this.Password = password;
    }

    public int getMailboxCapacity() {
        return MailboxCapacity;
    }
    public String getAlternateEmail(){
        return AlternateEmail;
    }
    public String getPassword(){
        return Password;
    }

    public String ShowInfo(){
        return "DISPLAY NAME : "+FirstName+" "+LastName+
                "\nCOMPANY EMAIL : "+email+
                "\nMAILBOX CAPACITY : "+MailboxCapacity+"mb";
    }
}
