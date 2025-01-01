import java.io.*;
class Filehand{
	public static void main(String[] args){
	try{
		FileReader fr=new FileReader("input.txt");
		BufferedReader br=new BufferedReader(fr) ;
		
		
		FileWriter fw=new FileWriter("output.txt");
		BufferedWriter bw=new BufferedWriter(fw) ;
		
		String line;
		
		while((line=br.readLine()) != null){
			System.out.println(line);
			bw.write(line);
			}
		bw.close();
		fw.close();
		br.close();
		fr.close();
		
		
		}catch(IOException e){
			System.out.println(e.getMessage());
				      }
		}
    }
