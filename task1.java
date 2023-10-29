import java.util.*;
class task1{
    public static void main(String args[]){
        // task1 kl=new task1(12);
        Scanner inp=new Scanner(System.in);
        HashMap<String,String> login=new HashMap<String,String>();
        login.put("vivek","123");
        int coun=0;
        HashMap<Integer,Details> det=new HashMap<Integer,Details>();
        while(true){
        System.out.println("\n\n\n\t\t\t\t\t\tWELCOME TO TS RAILWAY RESERVATIONS!!!\n\n");
        System.out.print("\t\t\t\tEnter your username:::");
        String username=inp.next();
        System.out.println("");
        System.out.print("\n\t\t\t\tEnter your password::");
        String pass=inp.next();
        System.out.println();
        // String us=login.get(username);
        if(login.containsKey(username)&&login.get(username).equals(pass)){
             System.out.println("\t\t\t\t\t\t\t\t\t\tLogin Successfull!");
             while(true){
            System.out.println("-------MENU------");
            System.out.println("1.Reservation\n2.Enquiry\n3.Cancel");
            int choice=inp.nextInt();
            Random rand=new Random();
            switch(choice){
                case 1:System.out.println("Enter your name:");
                        String name=inp.next();
                        System.out.println("Enter your age::");
                        int age=inp.nextInt();
                        System.out.println("Enter your gender(M or F)::");
                        char g=inp.next().charAt(0);
                        int pnr=rand.nextInt(5000);
                        System.out.println("\t\t\t\t\t\t\t\t\tYour TicketNumber is::"+pnr);
                        System.out.println("\nPlease Note it for further reference");
                        det.put(pnr,new Details(name, age, g));
                break;
                case 3:System.out.println("Enter Your TicketNo Number:");
                int p=inp.nextInt();
                if(det.containsKey(p)){
                    Details t1=det.get(p);
                    System.out.println("Name  : "+t1.name+"\n"+"Age   : "+t1.age+"\n"+"Gender: "+t1.g);
                    det.remove(p);
                }
                else{
                       System.out.println("Invalid Ticket No.");
                }
                break;
                case 2: System.out.println("Enter your TicketNo:");
                        int en=inp.nextInt();
                        if(det.containsKey(en)){
                        Details tmp1=det.get(en);
                        System.out.println("\t\t\t\t\t\t\t\tYour Details:");
                        System.out.println("\t\t\t\t\t\tName  : "+tmp1.name+"\n\t\t\t\t\t\tAge   : "+tmp1.age+"\n\t\t\t\t\t\tGender: "+tmp1.g);
                        }
                        else{
                              System.out.println("Invalid Ticket No");
                        }
                        break;
                default:System.out.println("Enter the Correct Choice\n");
            }
             System.out.println("TO LOGOUT PRESS 1 AND TO CONTINUE PRESS 0");
            int lg=inp.nextInt();
            if(lg==1)
                break;
            coun++;
      }
         
        } 
        else{
            System.out.println("\t\t\t\t\t\t\tLogin Failed!!\n\n");
            System.out.println("\t\t\t\t\t\t\t\tSign up:\n");
            System.out.print("\t\t\t\tEnter your new username:");
            String username1=inp.next();
            System.out.print("\n\t\t\t\tEnter new Password:");
            String pass1=inp.next();
            login.put(username1,pass1);
            System.out.println("\n\n\n\t\t\t\t\t\t\t\t\tLogin Now");

        }
        if(coun>=1){
            break;
        }
    }
  }
}
class Details{
    String name="";
    int age=0;
    char g='M';
       Details(String name,int age,char g){
        this.name=name;
        this.age=age;
        this.g=g;
       }
}
