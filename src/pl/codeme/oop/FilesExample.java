package pl.codeme.oop;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.Savepoint;
import java.util.Properties;

public class FilesExample {

	public static void main(String[] args) {
		FilesExample filesExample = new FilesExample(); // tworzac instancje
														// mozemy wolac metode
														// static bez robienia
														// nasza statyczna
//		filesExample.ex2();
//		filesExample.writeEx1();
//		filesExample.objectWriteEx();
//		filesExample.objectReadEx();
//		filesExample.textReader();
		
//		try {
//			filesExample.inputStreamReadEx(new FileInputStream("C:\\tmp\\plik.txt"));
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println("Podaj: ");
//		filesExample.inputStreamReadEx(System.in);
//		filesExample.saveConfig();
		filesExample.loadConfig();
	}

	public void inputStreamReadEx(InputStream is) {
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		try {
			System.out.println(br.readLine());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void textReader() {
		try (FileReader fr = new FileReader("C:\\tmp\\plik.txt")){
//			while (fr.ready()){
//			System.out.print((char)fr.read());
			BufferedReader br = new BufferedReader(fr);
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	public void textReaderold() {
		try (FileReader fr = new FileReader("C:\\tmp\\plik.txt")){
			while (fr.ready()){
			System.out.print((char)fr.read());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	public void ex1() {
		try (FileInputStream fis = new FileInputStream("C:\\tmp\\plik.txt")) {
			// można za tryiem zainicjowac tylko metody implementujace interface
			// closable ( czyli posiadające metode close) wtey java wszystko
			// sama pozamyka
			// System.out.println(fis.read());// tak poda znak integer
			while (fis.available() > 0) {
				System.out.print((char) fis.read());
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	public void ex2() {
		try (FileInputStream fis = new FileInputStream("C:\\tmp\\plik.txt")) {
			DataInputStream dis = new DataInputStream(fis);
			while (dis.available()>0){
				System.out.print(dis.readChar());
			}
				

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	public void writeEx1() {
		try (FileOutputStream fos = new FileOutputStream("plik_wyjsciowy")) {
			DataOutputStream dos = new DataOutputStream(fos);
			dos.writeChars("Ala ma kota");

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

	public void objectReadEx(){
		try(FileInputStream fis = new FileInputStream("point")){
			ObjectInputStream ois = new ObjectInputStream(fis);
			Point point = (Point) ois.readObject(); // zrzutowalicmy objekt do pointa
			System.out.println("Mój punkt to: " + point.getMark());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void objectWriteEx() {
		Point p = new Point();
		p.setMark('X');
		
		try (FileOutputStream fos = new FileOutputStream("point")){
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(p);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void ex1old() {
		FileInputStream fis;
		try {
			fis = new FileInputStream("C:\\tmp\\plik.txt");
			// System.out.println(fis.read());// tak poda znak integer
			while (fis.available() > 0) {
				System.out.print((char) fis.read());
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// finally {
		// try {
		// fis.close();
		// } catch (IOException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		// }
	}
	public void saveConfig(){

		Properties props = new Properties();
		props.setProperty("max_width", "10");
		props.setProperty("max_height", "10");
		
		try {
			props.save(new FileOutputStream("config.props"), "Mój komentarz do tego pliku");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void loadConfig(){
		Properties props = new Properties();
		try {
			props.load(new FileReader("config.props"));
			for (Object key : props.keySet()){
				System.out.println(key);
			}
			System.out.println(props.getProperty("max_height"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

// przejrzeć sobie klase Files.
// Path p = Paths.get("/tmp/");
// p.

// pobawic sie files i paths 