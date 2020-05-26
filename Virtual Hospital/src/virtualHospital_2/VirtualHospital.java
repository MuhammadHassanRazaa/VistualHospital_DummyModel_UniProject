package virtualHospital_2;

import java.util.*;

/**
 *
 * @author Muhammad Hassan Raza
 */
public class VirtualHospital {

    static String Name, FatherName, Address, RefNum, ContactNumber, DepartmentNOtInList;
    static int Scaring,Redness,Burning,EyeWatering,EyeItching,EyeIrritation, IllegelInputInDepartmentCHoice, Age, Gender, HelpDeskChoice, DepartmentChoice, DetailsCheckChoice, AirBorneDiseasesCatagoriesChoice, DetailsOverWriteChoice, ReAnnounceOverwriteChoice;
    static boolean Eye1,Eye2,Eye3,Eye4,Eye5,Eye6,Eye7,Eye8,Eye9,Eye10,Eye11,Eye12;
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

        HelpDesk();

    }

    public static void HelpDesk() {
        print("Welcome to Helpdesk......\nI'm a Virtual agent. How may I assist you?  \n1: Consult to any of our Department\n2: About Us\n3: Exit\nChoose one from above to proceed on....");
        HelpDeskChoice = readInt();
        switch (HelpDeskChoice) {
            case 1:
                print("Please fill out our information Form to proceed on....");
                Details();
                print("Thank You For Giving your Personal Data\nLet's move on...");
                DetailsCheck();

                break;
            case 2:
                print("AboutUs");
                break;
            case 3:
                System.exit(1);
            default:
                error("Sorry!!! You have not choosen a valid choice...\nPlease Choose a valid option");
                HelpDesk();
                break;
        }

    }

    public static void Details() {
        String a = "Enter patient Name: ";
        printwithoutline(a);
        Name = readString();
        printwithoutline("Enter Father Name: ");
        FatherName = readString();
        gender();
        printwithoutline("Enter Your Age: ");
        Age = readInt();
        printwithoutline("Enter your Complete Address: ");
        Address = readString();
        printwithoutline("Enter your Contact Number \n+");
        ContactNumber = readString();
        RefNum = "HVH" + (int) (Math.random() * 10000000);

    }

    public static void gender() {
        printwithoutline("Select Your Gender: \n1: Male\n2: Female \n3:Non-Specified\nChoose Any valid Option...");
        Gender = readInt();
        if (Gender < 1 || Gender > 3) {
            error("Wrong Choice");
            gender();
        }
    }

    public static void Departments() {
        DepartmentsSelection();
    }

    public static void DepartmentsSelection() {
        print("Departmnets in which we are dealing: \n1: Eye\n2: ENT \n3: Gastroenterology(Dijestion)\n4: Respiratory Diseases\n5: Neurology \n6: Cardiology\n7: Urology\n8: Dermatology\n9: Gynaecology\n10: Skeletal Diseases\n11: Muscular Disease");
        print("Choose your Relevant Department by entering relevent number\nPress 0 if your Department is not the list");
        DepartmentChoice = readInt();
        switch (DepartmentChoice) {
            case 1:
                Eye();
                break;
            case 2:
                Ent();
                break;
            case 3:
                Gastroenterlogy();
                break;
            case 4:
                Respiratory();
                break;
            case 5:
                Neourology();
                break;
            case 6:
                Cardiology();
                break;
            case 7:
                Urology();
                break;
            case 8:
                Dermatology();
                break;
            case 9:
                GYnaecology();
                break;
            case 10:
                Skeletal();
                break;
            case 11:
                Muscular();
                break;
            case 0:
                print("Enter your Desired Department: ");
                //will update according to KST
                DepartmentNOtInList = readString();
                String[] ListOfDepartments = new String[]{"Eye", "Ent", "Dijestion", "Respiratory", "Neurology", "Cardiology", "Urology", "Dermatology", "GYnaecology", "Skeletal", "Muscular"};
                for (int i = 0; i < (ListOfDepartments.length); i++) {
                    if (ListOfDepartments[i].equalsIgnoreCase(DepartmentNOtInList)) {

                    }
                }
                break;
            default:
                error("Illegal Input");
                print("Do you want to input again:\n1: Yes\n2: No, Exit me from the System");
                IllegelInputInDepartmentCHoice = readInt();
                if (IllegelInputInDepartmentCHoice == 1) {
                    DepartmentsSelection();

                } else {
                    System.exit(1);

                }
                break;
        }

    }

    public static void DetailsCheck() {
        print("Before we move on first review your details.");
        DetailsPrinting();
        print("1: All Details are correct \n2: There is an error in my details\nChoose any one option from above...");
        DetailsCheckChoice = readInt();
        DetailsCorrectOrNot();
    }

    public static void DetailsCorrectOrNot() {
        switch (DetailsCheckChoice) {
            case 1:
                print("Let's move on....");
                Departments();
                break;
            case 2:
                DetailsOverwrite();
                break;
            default:
                error("Invalid Input");
                DetailsCorrectOrNot();
                break;
        }

    }

    public static void DetailsOverwrite() {
        print("1: Patient Name\n2: Father Name\n3: Gender\n4: Age\n5: Contact\n6: Address\nPlease Select which field is not Correct So that we can correct it for you: ");
        DetailsOverWriteChoice = readInt();
        switch (DetailsOverWriteChoice) {
            case 1:
                printwithoutline("Enter Patient Name: ");
                Name = readString();
                ReAnnouceToOverwrite();
                break;
            case 2:
                printwithoutline("Enter Father Name: ");
                FatherName = readString();
                ReAnnouceToOverwrite();
                break;
            case 3:
                gender();
                ReAnnouceToOverwrite();
                break;
            case 4:
                printwithoutline("Enter Your Age: ");
                Age = readInt();
                ReAnnouceToOverwrite();
                break;
            case 5:

                printwithoutline("Enter your Contact Number \n+");
                ContactNumber = readString();
                ReAnnouceToOverwrite();
                break;
            case 6:
                printwithoutline("Enter your Complete Address: ");
                Address = readString();
                ReAnnouceToOverwrite();
                break;
            default:

                error("Invalid Input");
                DetailsOverwrite();
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
        print("Is There anyother field which is incorrect \n1: Yes\n2: No\n Choose one option from above");

        ReAnnounceOverwriteChoice = readInt();
        switch (ReAnnounceOverwriteChoice) {
            case 1:
                DetailsOverwrite();
                break;
            case 2:
                print("Ok!! Then Verify your details one more time..");
                DetailsCheck();
                break;
            default:
                ReAnnouceToOverwrite();
                break;
        }
    }

    public static void Eye() {
        print("\t\t\t Welcome to Eye Department");
        print("For diagnosing your disease, I have to take your symptoms.\nIn this session I will ask some question from you according to my diseases database\nPlease answer them:");
        EyeIrritation();
        MedicationReport();
    }

    public static void EyeIrritation() {
        print("Do you have irritation in eyes?\nPress 1 for Yes and Press 2 for No");
        EyeIrritation = readInt();
        if (EyeIrritation == 1) {
            EyeItching();

        } else if (EyeIrritation == 2) {

        } else {
            error("Invalid Input");
            EyeIrritation();
        }
    }

    public static void EyeItching() {
        print("Do you have Itching in eyes?\nPress 0 for Itching in Eyes,Press 1 for Itching on eye lids margins and Press 2 for No");
        EyeItching=readInt();
        if(EyeItching==0){
            WateringInEyes();
        }
        else if(EyeItching==1){
             Scaring();
        }
        else if (EyeItching==2){
            
        }
        else{
            error("Invalid Input");
            EyeItching();
        }
    }
    public static void WateringInEyes() {
        print("Do you have Watering in eyes?\nPress 1 for Yes and Press 2 for No");
        EyeWatering=readInt();
        if(EyeWatering==1){
            Burning();
        }
        else if (EyeWatering==2){
            
        }
        else{
            error("Invalid Input");
            WateringInEyes();
        }
    }
    public static void Burning() {
        print("Do you have Burning in eyes?\nPress 1 for Yes and Press 2 for No");
        Burning=readInt();
        if(Burning==1){
            Redness();
        }
        else if (Burning==2){
            
        }
        else{
            error("Invalid Input");
            Burning();
        }
    }
public static void Redness() {
        print("Do you have Redness in eyes?\nPress 1 for Yes and Press 2 for No");
        Redness=readInt();
        if(Redness==1){
            print("Your Disease is found, Now I can prescribe you medicine.");
            Eye1=true;
            
            
        }
        else if (Redness==2){
            
        }
        else{
            error("Invalid Input");
            Redness();
        }
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

    private static void MedicationReport() {
        print("Following is your Complete Report.Take a print of this and take medicine from chemist accordingly: ");
        DetailsPrinting();
        SymptomsPrinting();
        DiseasePrinting();
        
        
    }

    private static void SymptomsPrinting() {
        if(Eye1){
            print("Symptoms are: \n>>Irritation\n>>Itching\n>>Watering\n>>Burning Sensation in eyes\n>>Redness in Eyes");  
            print("Medicines best for you:\n");
            print("HISTAZOLINE EYE DROPS and TOBRAMYCINE EYE DROPS three times a day\n");
        }
        else if(Eye2){
            print("Symptoms are: \n>>Irritation\n>>Itching on eye lids margins\n>>Scaring on Eye lids margins");  
            print("Medicines best for you:\n");
            print("TOBRAMYCINE EYE DROPS three times a day and NIBRA EYE OINTMENT two times a day\n");
        }
        
    }

    private static void DiseasePrinting() {
        if(Eye1){
            print("Your Disease is:               Conjunctivitis");
            
            print("\n\nYou can also come back to us for any problem but we will suggest you to visit our verified Pyhsician.\n Details of our physician are given below: ");
            print("DR. ISHRAT ALI\n"
                    + "Chaudhry Rehmat Ali Memorial Trust Hospital\n"
                    + "Phone Number +92425151345");
            print("\t\t\t Thank You\n-------------------------------------------------------");
        }
        if(Eye2){
            print("Your Disease is:               Blepharitis");
            
            print("\n\nYou can also come back to us for any problem but we will suggest you to visit our verified Pyhsician.\n Details of our physician are given below: ");
            print("DR. ISHRAT ALI\n"
                    + "Chaudhry Rehmat Ali Memorial Trust Hospital\n"
                    + "Phone Number +92425151345");
            print("\t\t\t Thank You\n-------------------------------------------------------");
        }
    }

    private static void Scaring() {
print("Do you have Scaring on eye lid margins?\nPress 1 for Yes and Press 2 for No");
        Scaring=readInt();
        if(Scaring==1){
            print("Your Disease is found, Now I can prescribe you medicine.");
            Eye2=true;
            
            
        }
        else if (Scaring==2){
            
        }
        else{
            error("Invalid Input");
            Scaring();
        }
    }

}
