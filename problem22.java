//problem #22
//Using names.txt (right click and 'Save Link/Target As...'), a 46K 
//text file containing over five-thousand first names, begin by 
//sorting it into alphabetical order. Then working out the alphabetical 
//value for each name, multiply this value by its alphabetical position 
//in the list to obtain a name score.
//For example, when the list is sorted into alphabetical order, 
//COLIN, which is worth 3 + 15 + 12 + 9 + 14 = 53, is the 938th name 
//in the list. So, COLIN would obtain a score of 938  53 = 49714.
//What is the total of all the name scores in the file?
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
public class Euler {
	public static int getNameScore(String name){
		int unicodeVal = 0;
		for(int i =0; i<name.length(); i++)
			unicodeVal += Character.getNumericValue(name.charAt(i))-9;
		return unicodeVal;
	}
	public static ArrayList<String> parseFile(){
		ArrayList<String> nameList = new ArrayList<String>();
		BufferedReader br = null;
		String strLine = null;
		try {
			br = new BufferedReader(new FileReader("names.txt"));
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}	
		try {
			strLine = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		strLine = strLine.replaceAll("\"","");
		String[] temp = strLine.split(",");
		for(int i =0; i<temp.length; i++)
			nameList.add(temp[i]);
		return nameList;
	}
	public static void main(String[] args){
		int total = 0;
		ArrayList<String> nameList = parseFile();
		Collections.sort(nameList);
		for(int i =0; i<nameList.size(); i++)
			total+=getNameScore(nameList.get(i))*(i+1);
		System.out.println(total);
	}
}
