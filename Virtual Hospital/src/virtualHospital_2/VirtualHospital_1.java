package virtualHospital_2;

import java.util.*;

/**
 *
 * @author Muhammad Hassan Raza
 */
public class VirtualHospital_1 {

    static String Name, FatherName, Address, RefNum, ContactNumber, DepartmentNOtInList;
    static int Attempts, Scaring, Redness, Burning, EyeWatering, EyeItching, EyeIrritation, IllegelInputInDepartmentCHoice, Age, Gender, HelpDeskChoice, DepartmentChoice, DetailsCheckChoice, AirBorneDiseasesCatagoriesChoice, DetailsOverWriteChoice, ReAnnounceOverwriteChoice;
    static boolean Eye1, Eye2, Eye3, Eye4, Eye5, Eye6, Eye7, Eye8, Eye9, Eye10, Eye11, Eye12,Iritation,Etching_on_eyelids ,Etching, Watering, Buurning, Reedness,itching_on_eye_lids_margins, scaring_of_eye_lids,painfullSwellingOnMargins,swalloingoneyelides,subconjunctivalHemorrhage,ConjunctivalCongestion,ConjunctivalOedma,Seveare_pain , photophobia ;

    // static Scanner scan = new Scanner(System.in);
    public static int readInt() {// for inputting a int
        Scanner scan = new Scanner(System.in);
        int integerreader = scan.nextInt();
        return integerreader;
    }

    public static String readString() {//for input a string
        Scanner scan = new Scanner(System.in);

        String stringreader = scan.nextLine();
        return stringreader;
    }

    public static void error(String a) {//prrint error
        System.err.println(a);
    }

    public static void print(String a) {// for printing
        System.out.println(a);
    }

    public static void printwithoutline(String a) {//print withour new line
        System.out.print(a);
    }

    public static void main(String[] args) {

        print("                            Virtual Hospital");
        print("Enter Number of Patients");
        boolean exit = false;
        Attempts = readInt();
        int x = 0;
        while (exit == false && x != Attempts) {
            print("Patient # " + (x + 1));
            print("Welcome to Helpdesk......\nI'm a Virtual agent. How may I assist you?  \n1: Consult to any of our Department\n2: About Us\n3: Exit\nChoose one from above to proceed on....");
            HelpDeskChoice = readInt();
            switch (HelpDeskChoice) {
                case 1:
                    print("Please fill out our information Form to proceed on....");
                    Details();
                    print("Thank You For Giving your Personal Data\nLet's move on...");
                    DetailsCheck();
                    exit = true;

                    break;
                case 2:
                    print("AboutUs");
                    exit = true;
                    break;
                case 3:
                    exit = true;
                    break;

                default:
                    error("Sorry!!! You have not choosen a valid choice...\nPlease Choose a valid option");

            }
            x++;
        }
    }

    public static void Details() {
        String a = "Enter patient Name: ";
        printwithoutline(a);
        Name = readString();
        printwithoutline("Enter Father Name: ");
        FatherName = readString();

        gender();
        //gender();
        printwithoutline("Enter Your Age: ");
        Age = readInt();
        printwithoutline("Enter your Complete Address: ");
        Address = readString();
        printwithoutline("Enter your Contact Number \n+");
        ContactNumber = readString();
        RefNum = "HVH" + (int) (Math.random() * 10000000);

    }

    public static void gender() {
        while (Gender != 1 && Gender != 2 && Gender != 3) {
            printwithoutline("Select Your Gender: \n1: Male\n2: Female \n3: Non-Specified\nChoose Any valid Option...");
            Gender = readInt();
            if (Gender < 1 || Gender > 3) {
                error("Wrong Choice");
            }
        }
    }

    public static void Departments() {
        boolean Dd = false;
        while (Dd == false) {
            print("Departmnets in which we are dealing: \n1: Eye\n2: ENT \n3: Gastroenterology(Dijestion)\n4: Respiratory Diseases\n5: Neurology \n6: Cardiology\n7: Urology\n8: Dermatology\n9: Gynaecology\n10: Skeletal Diseases\n11: Muscular Disease");
            print("Choose your Relevant Department by entering relevent number\nPress 0 if your Department is not the list");
            DepartmentChoice = readInt();
            switch (DepartmentChoice) {
                case 1:
                    Eye();
                    Dd = true;
                    break;
                case 2:
                    Ent();
                    Dd = true;
                    break;
                case 3:
                    Gastroenterlogy();
                    Dd = true;
                    break;
                case 4:
                    Respiratory();
                    Dd = true;
                    break;
                case 5:
                    Neourology();
                    Dd = true;
                    break;
                case 6:
                    Cardiology();
                    Dd = true;
                    break;
                case 7:
                    Urology();
                    Dd = true;
                    break;
                case 8:
                    Dermatology();
                    Dd = true;
                    break;
                case 9:
                    GYnaecology();
                    Dd = true;
                    break;
                case 10:
                    Skeletal();
                    Dd = true;
                    break;
                case 11:
                    Muscular();
                    Dd = true;
                    break;
                case 0:
                    Dd = true;
                    print("Will add when KST ");
                    Listings();

                    break;
                default:
                    error("Illegal Input");
                    Dd = false;

                    break;
            }
        }
    }

    public static void DetailsCheck() {
        print("Before we move on first review your details.");
        DetailsPrinting();
        boolean Dd = true;
        while (Dd == true) {
            print("1: All Details are correct \n2: There is an error in my details\nChoose any one option from above...");

            DetailsCheckChoice = readInt();
            switch (DetailsCheckChoice) {
                case 1:
                    Dd = false;
                    print("Let's move on....");
                    Departments();
                    break;
                case 2:
                    Dd = false;
                    DetailsOverwrite();
                    break;
                default:
                    error("Invalid Input");
            }
        }
    }

    public static void DetailsOverwrite() {
        boolean Dd = true;
        while (Dd == true) {
            print("1: Patient Name\n2: Father Name\n3: Gender\n4: Age\n5: Contact\n6: Address\nPlease Select which field is not Correct So that we can correct it for you: ");
            DetailsOverWriteChoice = readInt();
            switch (DetailsOverWriteChoice) {
                case 1:
                    Dd = false;
                    printwithoutline("Enter Patient Name: ");
                    Name = readString();
                    ReAnnouceToOverwrite();
                    break;
                case 2:
                    Dd = false;
                    printwithoutline("Enter Father Name: ");
                    FatherName = readString();
                    ReAnnouceToOverwrite();
                    break;
                case 3:
                    Dd = false;
                    gender();
                    ReAnnouceToOverwrite();
                    break;
                case 4:
                    Dd = false;
                    printwithoutline("Enter Your Age: ");
                    Age = readInt();
                    ReAnnouceToOverwrite();
                    break;
                case 5:
                    Dd = false;
                    printwithoutline("Enter your Contact Number \n+");
                    ContactNumber = readString();
                    ReAnnouceToOverwrite();
                    break;
                case 6:
                    Dd = false;
                    printwithoutline("Enter your Complete Address: ");
                    Address = readString();
                    ReAnnouceToOverwrite();
                    break;
                default:
                    Dd = true;
                    error("Invalid Input");

            }
        }
    }

    public static void DetailsPrinting() {
        print("Refence Number:                " + RefNum);
        print("Patient Name:                  " + Name);
        print("Father's Name:                 " + FatherName);
        printwithoutline("Gender                         ");
        print((Gender == 1) ? "Male" : (Gender == 2) ? "Feamle" : "Non-Specified");
        print("Age:                           " + Age);
        print("Contact Number:                " + ContactNumber);
        print("Address:                       " + Address);
    }

    public static void ReAnnouceToOverwrite() {
        boolean Dd = true;
        while (Dd == true) {
            print("Is There anyother field which is incorrect \n1: Yes\n2: No\n Choose one option from above");

            ReAnnounceOverwriteChoice = readInt();
            switch (ReAnnounceOverwriteChoice) {
                case 1:
                    Dd = false;
                    DetailsOverwrite();
                    break;
                case 2:
                    Dd = false;
                    print("Ok!! Then Verify your details one more time..");
                    DetailsCheck();
                    break;
                default:
                    Dd = true;
                    break;
            }
        }
    }

    
    public static void Eye() {
        print("\t\t\t Welcome to Eye Department");
        print("If you know your Disease then Press 1 and \nif you want us to diagnose your Disease then press 2");
        int UPloadORnot;boolean a=false;
        UPloadORnot=readInt();
        while(a==false){
            switch (UPloadORnot) {
                case 1:
                    a=true;
                    print("Listen, We cannot Give you medicine only trusting on your words\nYou have to give us a proper Medical certificate\nwhich shows Physician told you your disease");
                    print("So,KInldy Upload your Documnet");
                    //added when KST
                    print("Sorry This Section is UnderConstruction and will be added lator on..\nNow if you want to exit then press 1 \notherwise press 2");
                    int FIle=readInt();
                    boolean b=true;
                    while(b==true){
                switch (FIle) {
                    case 1:
                        b=false;
                        break;
                    case 2:
                        b=false;
                        a=true;
                    print("For diagnosing your disease, I have to take your symptoms.\nIn this session I will ask some question from you according to my diseases database\nPlease answer them:");
                    
                    eyeSymptoms();
                        break;
                    default:
                        b=true;
                        a=true;
                        break;
                }
                    }   break;
                case 2:
                    a=true;
                    print("For diagnosing your disease, I have to take your symptoms.\nIn this session I will ask some question from you according to my diseases database\nPlease answer them:");
                    
                    eyeSymptoms();
                    break;
                default:
                    a=false;
                    break;
            }
        }
        
        
    }

    public static void eyeSymptoms() {
       
        //irritation
         boolean E=true;
        while (E == true) {
            print("Do you have irritation in eyes?\nPress 1 for Yes and Press 2 for No");
            EyeIrritation = readInt();
            switch (EyeIrritation) {
                case 1:
                    E = false;
                    Iritation = true;
                    break;
                case 2:
                    E = false;
                    Iritation = false;
                    break;
                default:
                    error("Invalid Input");
                    E = true;
                    break;
            }
        }
        //Itching
        boolean I=true;
        while (I == true) {
            print("Do you have Itching in eyes?\nPress 0 for Itching in Eyes,Press 1 for Itching on eye lids margins and Press 2 for No");
            EyeItching = readInt();
            switch (EyeItching) {
                case 1:
                    I = false;
                    Etching=true;
                    
                    break;
                case 2:
                    I = false;
                    Etching_on_eyelids= true;
                    break;
                case 0:
                    I=false;
                    Etching_on_eyelids=false; Etching=false;
                default:
                    error("Invalid Input");
                    I = true;
                    break;
            }
        }
        //watrin
         boolean W=true;
        while (W == true) {
            print("Do you have Watering in eyes?\nPress 1 for Yes and Press 2 for No");
        EyeWatering = readInt();
            switch (EyeWatering) {
                case 1:
                    W = false;
                    Watering = true;
                    break;
                case 2:
                    W = false;
                    Watering = false;
                    break;
                default:
                    error("Invalid Input");
                    W = true;
                    break;
            }
        }
        //buring
         boolean BU=true;
        while (BU == true) {
            print("Do you have Burning in eyes?\nPress 1 for Yes and Press 2 for No");
        Burning = readInt();
            switch (Burning) {
                case 1:
                    BU = false;
                    Buurning = true;
                    break;
                case 2:
                    BU = false;
                    Buurning = false;
                    break;
                default:
                    error("Invalid Input");
                    BU = true;
                    break;
            }
        }
        //redness
         boolean R=true;
        while (R == true) {
            print("Do you have Redness in eyes?\nPress 1 for Yes and Press 2 for No");
        Redness = readInt();
            switch (Redness) {
                case 1:
                    R = false;
                    Reedness = true;
                    break;
                case 2:
                    R = false;
                    Reedness = false;
                    break;
                default:
                    error("Invalid Input");
                    R = true;
                    break;
            }
        }
        //scaring
         boolean S=true;
        while (S == true) {
            print("Do you have Scaring  in eye lids margins?\nPress 1 for Yes and Press 2 for No");
        Scaring = readInt();
            switch (Scaring) {
                case 1:
                    S = false;
                    scaring_of_eye_lids = true;
                    break;
                case 2:
                    S = false;
                    scaring_of_eye_lids = false;
                    break;
                default:
                    error("Invalid Input");
                    S = true;
                    break;
            }
        }
        EyeResults();
    }

 
   

 



   
    public static void Ent() {
    }

    public static void Gastroenterlogy() {
    }

    public static void Respiratory() {
    }

    public static void Neourology() {
    }

    public static void Cardiology() {
    }

    public static void Urology() {
    }

    public static void Dermatology() {
    }

    public static void GYnaecology() {
    }

    public static void Skeletal() {
    }

    public static void Muscular() {
    }

   

    private static void SymptomsPrinting() {
                print("Following is your Complete Report.Take a print of this and take medicine from chemist accordingly: ");

        if (Eye1) {
            print("Symptoms are: \n>>Irritation\n>>Itching\n>>Watering\n>>Burning Sensation in eyes\n>>Redness in Eyes");
            print("Medicines best for you:\n");
            print("HISTAZOLINE EYE DROPS and TOBRAMYCINE EYE DROPS three times a day\n");
        } else if (Eye2) {
            print("Symptoms are: \n>>Irritation\n>>Itching on eye lids margins\n>>Scaring on Eye lids margins");
            print("Medicines best for you:\n");
            print("TOBRAMYCINE EYE DROPS three times a day and NIBRA EYE OINTMENT two times a day\n");
        }
        else {
            print("Medicines best for you:\n");
            print("TOBRAMYCINE EYE DROPS three times a day and NIBRA EYE OINTMENT two times a day\n");
        }

    }

    private static void DiseasePrinting() {
        if (Eye1) {
            print("Your Disease is:               Conjunctivitis");

            
        }
        else if (Eye2) {
            print("Your Disease is:               Blepharitis");

            
        }
        else if (Eye3){
            print("Your Disease is:               Sty");

            
        }
        print("\n\nYou can also come back to us for any problem but we will suggest you to visit our verified Pyhsician.\n Details of our physician are given below: ");
            print("DR. ISHRAT ALI\n"
                    + "Chaudhry Rehmat Ali Memorial Trust Hospital\n"
                    + "Phone Number +92425151345");
            print("\t\t\t Thank You\n-------------------------------------------------------");
    }

  

    private static void Listings() {
        //upgrade according to KST
    }
//Iritation,Etching_on_eyelids ,Etching, Watering, Buurning, Reedness,itching_on_eye_lids_margins, scaring_of_eye_lids,painfullSwel
    private static void EyeResults() {
        if(Iritation&&Etching&&Watering&&Buurning&&Reedness){
            Eye1=true;}
        else if(Iritation&&Etching_on_eyelids&&scaring_of_eye_lids){
                    Eye2=true;
                    
                    }
        else{
            Eye3=true;
        }
      SymptomsPrinting();  
      DiseasePrinting();
    }

}

