package stringsDemos;

public class main {

	public static void main(String[] args) {
		// LESSON 17-18
		String mesagge="JAVA IS PERFECT.";
		System.out.println(mesagge);
		System.out.println("Number of elements :" + mesagge.length()); // mesajin eleman sayisi
		System.out.println(mesagge.concat(" Thanks for course."));     // mesajin sonuna string ekler
		System.out.println(mesagge.startsWith("B"));                   // mesaj B ile mi başlıyor
		System.out.println(mesagge.endsWith("."));                     // mesaj . ile mi bitiyor
		
		char [] characters = new char[5];                              
		mesagge.getChars(0, 4, characters, 0);                         // karakterlerin 0 dan başla 4 üne kadar mesajın 0 dan başlayarak yaz
		System.out.println(characters);                               
		
		System.out.println(mesagge.indexOf("A"));                      // A mesajın baştan kaçıncı karekteri
		System.out.println(mesagge.lastIndexOf("F"));                  // F mesajın sondan kaçıncı karakteri

		
		String newMesagge = mesagge.replace(' ','-');                  // ' ' yerine '-' yaz
		System.out.println(newMesagge);                             
		System.out.println(mesagge.substring(2,4));                    // mesajın 2. elamanından 5. elemanına kadar olanları ayır yaz.
	    
		for (String word : mesagge.split(" ")) {                       // word değişkenine mesajın içindekini boşluğa kadar yaz ve döngüye sok.
		    System.out.println(word);    
		
	}
		System.out.println(mesagge.toLowerCase());                     // mesajın tüm harflerini küçük harfle yaz
		System.out.println(mesagge.toUpperCase());                     // mesajın tüm harflerini büyük harfle yaz
	}

}
