package app;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class App {
    public static void main(String[] args)  {
        Scanner scan=new Scanner(System.in);
        System.out.println("Welcome to blood bank");
        while (true) {
            System.out.println("1.Donar");
            System.out.println("2.Reciepient");
            System.out.println("3.Liv camps");
            System.out.println("4.Camp registration");
            System.out.println("5.Stock details");
            System.out.println("6.Backup contacts");
            System.out.println("Choose the number to proceed");
            int option=scan.nextInt();
            switch (option) {
                case 1:
                System.out.println("Enter name");
                String name=scan.next();
                System.out.println("Enter age");
                int age=scan.nextInt();
                System.out.println("Enter weight");
                double weight=scan.nextDouble();
                System.out.println("Enter blood group");
                String b_g=scan.next();
                System.out.println("Enter the disease");
                String disease=scan.next();
                System.out.println("Enter contact details");
                long contact=scan.nextLong();
                Donar d1=new Donar();
                d1.setAge(age);
                d1.setB_g(b_g);
                d1.setContactde(contact);
                d1.setDisease(disease);
                d1.setName(name);
                d1.setWeight(weight);
                System.out.println("Would you like to register y/n");
                char a=scan.next().charAt(0);
                if(a=='y'){
                    d1.newDonar();
                }
                else{
                    System.out.println("Please donate the blood its good for health!!!!");
                }
                break;
                case 2:
                System.out.println("enter your name ");
                String r1=scan.next();
                System.out.println("enter your blood_group ");
                String r2=scan.next();
                System.out.println("locality ");
                String r3=scan.next();
                System.out.println("quantity ");
                int r4=scan.nextInt();
                System.out.println("contact ");
                long r6=scan.nextLong();
                System.out.println("Would you like to recive alerts y/n");
                char b= scan.next().charAt(0);
                System.out.println("1.Anaemia");
                System.out.println("2.Leukemia");
                System.out.println("3.Thalassemia");
                System.out.println("enter the number");
                int n=scan.nextInt();
                Reciepient s1=new Reciepient();
                s1.setRname(r1);
                s1.setRblood_group(r2);
                s1.setRlocality(r3);
                s1.setQuantity(r4);
                s1.setContact(r6);
                
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                Calendar cal = Calendar.getInstance();
                String olddate=sdf.format(cal.getTime());
                switch(n)
		            {
		            case 1:
		            cal.add(Calendar.DAY_OF_MONTH, 55);  
		            break;
		            case 2:
		            cal.add(Calendar.DAY_OF_MONTH, 120);  
		            break;
		            case 3:
		            cal.add(Calendar.DAY_OF_MONTH, 100);  
                    
		            break;
		            default:System.out.println("others");
		            break;
                    }
                    String newDate = sdf.format(cal.getTime());
                    s1.setToday(olddate);
                    s1.setnextDate(newDate);
                    if(b=='y'){
                        s1.regularUpdate("This is the conformation message from blood bank and you will be getting regular updates about your blood recive alert");
                        s1.newrecipient();
                    }else{
                        s1.newrecipient();
                    }
                
                break;
                case 3:
                Livecamp lc=new Livecamp();
                lc.showcamps();    
                break;
                case 4:
                System.out.println("Enter the location");
                String location=scan.next();
                System.out.println("Enter the Name of the camp");
                String nameofcamp=scan.next();
                System.out.println("Enter the Head of the camp");
                String headOfTheCamp=scan.next();
                System.out.println("Enter the Phone number");
                long phoneno=scan.nextLong();
                System.out.println("Enter the Expected collection of blood");
                int expCol=scan.nextInt();
                System.out.println("Enter the Date");
                String date=scan.next();
                CampRegistration camp=new CampRegistration();
                camp.setLocation(location);
                camp.setNameOfcamp(nameofcamp);
                camp.headOfCamp(headOfTheCamp);
                camp.phoneno(phoneno);
                camp.expColl(expCol);
                camp.date(date);
                System.out.println("Would you like to register y/n");
                char c=scan.next().charAt(0);
                if(c=='y'){
                    camp.registerCamp();
                }
                else{
                    System.out.println("Please registar next time thank you");
                }
                break;
                case 5:
                Stock s=new Stock();
                s.showStock();
                break;
                case 6:
                EmgDonar emgd=new EmgDonar();
                emgd.showemgdonar();
                break;
    
                default:
                System.out.println("Enter the correct option");
                break;
            }
            
        }
       
    }
}