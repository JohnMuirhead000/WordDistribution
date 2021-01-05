import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class ReadFile {

    public static String readData(){
        StringBuilder theFile = new StringBuilder();
        try {

            File myObj = new File("Data/Chapter.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                theFile.append(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return theFile.toString();
    }

    public static String editData(String s){

        String editA = s.toLowerCase();
        String editB = editA.replace(".", "");
        String editC = editB.replace(",", "");
        String editD = editC.replace(";", "");
        String editE = editD.replace("!", "");
        String editF = editE.replace("?", "");
        String editG = editF.replace(":", "");
        String editH = editG.replace("...", "");
        String editI = editH.replace(".", "");
        String editJ = editI.replace("(", "");
        String editK = editJ.replace(")", "");
        String editL = editK.replace("/", "");

        return editL;
    }
}