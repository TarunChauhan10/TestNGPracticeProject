import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PractiseStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] name= {"Tom","Moody","Bob","John","Johnny","Jonty","Abe","Peter","Mark","Cat","Douglas","Eric","Freeman"};
		
		List<String> nameList = new ArrayList<String>(Arrays.asList(name));
		
		System.out.println(nameList);
		
		for(String s: nameList)
		{
			System.out.println(s);
		}
		
		List<String> sortedNameList = (List<String>)(nameList.stream().sorted());
		
		for(String s: sortedNameList)
		{
			System.out.println(s);
		}

	}

}
