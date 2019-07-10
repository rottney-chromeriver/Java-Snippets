import java.util.*;

/*
    Transposes a column into a row
    Removes quotation (") characters, if present
	Prints comma (,) character in between elements
*/

public class ColumnToRow {

    public static void main(String []args) {
        // IO
        Vector<String> vect = new Vector<String>(); 
        Scanner scan = new Scanner(System.in);

        while (scan.hasNextLine()) {
            if (scan.nextLine().compareTo("") != 0) {
                vect.add(scan.nextLine());
            }
        }
        scan.close();

        // Logic
        for (int i = 0; i < vect.size(); i++) {
            System.out.print(vect.get(i).replace("\"", ""));
            if (i < vect.size() - 1) {
                System.out.print(", ");
            }
        }
    }
}
