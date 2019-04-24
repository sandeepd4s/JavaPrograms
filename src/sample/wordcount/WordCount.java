package sample.wordcount;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class WordCount {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		File file = new File("C:\\Users\\SRS\\Desktop\\Landlord.docx");
		FileReader reader = new FileReader(file);
		BufferedReader br = new BufferedReader(reader);
		String line = br.readLine();
		while(line!=null && line!=""){
			String[] word = line.split(" ");
			//System.out.println(line);
			for(int i=0; i<word.length;i++){
				if(map.containsKey(word[i].trim())){
					Integer j = Integer.valueOf(map.get(word[i].trim()));
					map.put(word[i].trim(), ++j);
				}else
					map.put(word[i].trim(), 1);
			}
			line = br.readLine();
		}
		Set<?> s = map.entrySet();
		Iterator<?> iter = s.iterator();
		int maxCount=0;
		String val = null;
		while(iter.hasNext()){
			@SuppressWarnings("unchecked")
			Map.Entry<String, Integer> entry = (Map.Entry<String, Integer>)iter.next();
			String k = (String)entry.getKey();
			Integer v = (Integer)entry.getValue();
			System.out.println(k+" -> "+v);
			if(v>maxCount){
				maxCount=v;
				val=k;
			}
		}
		System.out.println("Maximum Value and Keys :"+val +"---> "+maxCount);
		
		
		
	}	
}
