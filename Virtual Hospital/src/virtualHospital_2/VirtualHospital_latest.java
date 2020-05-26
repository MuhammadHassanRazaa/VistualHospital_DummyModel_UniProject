
package virtualHospital_2;



/**
 *
 * @author sshth
 */
public class VirtualHospital_latest {

 

    public static void main(String[] args) {

        System.out.printf("%50s\n", "VIRTUAL HOSPITAL");
        BasicFunctions.print("Enter Number of Patients: ");
        String[] Details;
        int DetailsCheckChoice;
        boolean exit = false;
        int Attempts = BasicFunctions.readInt();
        int x = 0;
        while (exit == false && x != Attempts) {
            BasicFunctions.println("\t\tPatient # " + (x+1));
            BasicFunctions.print("Welcome to Helpdesk......\nI'm a Virtual agent. How may I assist you?  \n1: Consult to any of our Department\n2: About Us\n3: Exit\nChoose one from above to proceed on....");
            int HelpDeskChoice = BasicFunctions.readInt();
            switch (HelpDeskChoice) {
                case 1:
                    BasicFunctions.println("Please fill out our information Form to proceed on...");
                    Details = Details();
                    BasicFunctions.println("Thank You For Giving your Personal Data\nLet's move on...");
                    DetailsCheckChoice = DetailsCheck(Details);
                    switch (DetailsCheckChoice) {
                        case 1: {
                            boolean Dd = false;
                            while (Dd == false) {
                                BasicFunctions.print("Departmnets in which we are dealing: \n1: Eye\n2: ENT \n3: Gastroenterology(Dijestion)\n4: Respiratory Diseases\n5: Neurology \n6: Cardiology\n7: Urology\n8: Dermatology\n9: Gynaecology\n10: Skeletal Diseases\n11: Muscular Disease");
                                BasicFunctions.print("Choose your Relevant Department by entering relevent number\nPress 0 if your Department is not the list");
                               int  DepartmentChoice = BasicFunctions.readInt();
                                switch (DepartmentChoice) {
                                    case 1:
                                       // Eye();
                                        Dd = true;
                                        break;
                                    case 2:
                                       // Ent();
                                        Dd = true;
                                        break;
                                    case 3:
                                       // Gastroenterlogy();
                                        Dd = true;
                                        break;
                                    case 4:
                                       // Respiratory();
                                        Dd = true;
                                        break;
                                    case 5:
                                      //  Neourology();
                                        Dd = true;
                                        break;
                                    case 6:
                                        //Cardiology();
                                        Dd = true;
                                        break;
                                    case 7:
                                       // Urology();
                                        Dd = true;
                                        break;
                                    case 8:
                                      //  Dermatology();
                                        Dd = true;
                                        break;
                                    case 9:
                                       // GYnaecology();
                                        Dd = true;
                                        break;
                                    case 10:
                                       // Skeletal();
                                        Dd = true;
                                        break;
                                    case 11:
                                      //  Muscular();
                                        Dd = true;
                                        break;
                                    case 0:
                                        Dd = true;
                                        
                                       //will add now...

                                        break;
                                    default:
                                        BasicFunctions.error("Illegal Input.");
                                        Dd = false;

                                        break;
                                }
                            }
                        }
                        break;

                        case 2:
                            //error in detials
                           Details= DetailsOverwrite();
                            break;
                    }

                    break;
                case 2:
                    BasicFunctions.println("AboutUs");
                    exit = true;
                    break;
                case 3:
                    exit = true;
                    break;

                default:
                    BasicFunctions.error("Sorry!!! You have not choosen a valid choice...\nPlease Choose a valid option");

            }
            x++;
        }
    }

    public static String[] Details() {
      
        BasicFunctions.print("Enter patient Name: ");
        String Name = BasicFunctions.readString();
        BasicFunctions.print("Enter Father Name: ");
        String FatherName = BasicFunctions.readString();

        int g = gender();
        String Gender = (g == 1) ? "Male" : (g == 2) ? "Feamle" : "Non-Specified";
        BasicFunctions.print("Enter Your Age: ");
        String Age = BasicFunctions.readInt() + "";

        BasicFunctions.print("Enter your Complete Address: ");
        String Address = BasicFunctions.readCOmpleteString();
      BasicFunctions.  print("Enter your Contact Number: +92");
        String ContactNumber = "+92" +BasicFunctions. readContact();
        String RefNum = "HVH" + (int) (Math.random() * 10000000);

        String Details[] = {RefNum,Name, FatherName, Gender, Age, Address, ContactNumber};
        return Details;
    }

    public static int gender() {
        int Gender = 0;
        while (Gender != 1 && Gender != 2 && Gender != 3) {
          BasicFunctions.  print("Select Your Gender: \n1: Male\n2: Female \n3: Non-Specified\nChoose Any valid Option...");
            Gender =BasicFunctions. readInt();
            if (Gender < 1 || Gender > 3) {
               BasicFunctions. error("Wrong Choice");
            }
        }
        return Gender;
    }

    public static int DetailsCheck(String[] a) {
      BasicFunctions.  println("Before we move on first review your details.");
        int DetailsCheckChoice = 0;
        DetailsPrinting(a);
        boolean Dd = true;
        while (Dd == true) {
         BasicFunctions.   print("1: All Details are correct \n2: There is an error in my details\nChoose any one option from above...");

            DetailsCheckChoice = BasicFunctions.readInt();
            switch (DetailsCheckChoice) {
                case 1:
                    Dd = false;
                   BasicFunctions. print("Let's move on....");
                    break;

                case 2:
                    Dd = false;
                    break;

                default:
                   BasicFunctions. error("Invalid Input");
            }
        }
        return DetailsCheckChoice;

    }

    public static void DetailsPrinting(String a[]) {
        String Details[]={"Reference Number","Patient Name","Father Name","Gender","Age","Contact Number","Address"};
    for(int i=0;i<Details.length;i++){
        System.out.printf("%-31s%s\n",Details[i],a[i]);
    }
       //
        
    }

    private static String[] DetailsOverwrite() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
