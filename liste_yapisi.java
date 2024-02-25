package veri_yapilari3;

public class liste_yapisi {

	node head=null;
	node tail=null;
	
	void basaekle(int x) {
		    node eleman=new node();//eklenecek düğümü oluşturduk.
			eleman.data=x;
			eleman.next=null;
			
		if(head == null) {//ilk eleman boş ise liste yoktur bu yüzden head ve tail birbirine eşittir.
			
			head=eleman;
			tail=eleman;
			System.out.println("LİSTE OLUŞTURULDU ve BAŞA ELEMAN EKLENDİ.");
		}
		else
		{
			eleman.next=head;   //başa ekleme fonksiyonumuz olduğu için eleman.next yapınca eklediğimiz elemandan sonra sahip olduğumuz
			head=eleman;//head geliyormuş gibi oluyor ve bu yüzden yeni eklediğimiz eleman head olmuş oluyor.
			System.out.println("BAŞA ELEMAN EKLENDİ.");
		}
		
	}
	
	void sonaekle(int x) {
		node eleman=new node();//ekleencek olan düğüm
		eleman.data=x;
		
		if(head == null) {
			eleman.next=null;
			head=null;
			tail=null;
			System.out.println("LİSTE OLUŞTURULDU ve İLK ELEMAN EKLENDİ.");
		}
		else
		{//eğer eleman.next null ise bu eleman son elemandır. tail.next'i elemana eşitlersek eklediğimiz eleman listenin son elemanı olur.
		eleman.next=null;//en sonda da yeni tail'imizi elemana eşitleriz.
		tail.next=eleman;
		tail=eleman;
		System.out.println("LİSTENİN SONUNA ELEMAN EKLENDİ.");
		}
	}
	
	void arayaekle(int indis,int x) {
		node eleman=new node();
		eleman.data=x;
		eleman.next=null;
		
		if(head==null && indis==0) { //eğer ilk eleman yoksa ve 0.indis seçilecekse listeyi oluşturur ve elemanı ilk eleman yapan satır 
			eleman.next=null;
			head=eleman;
			tail=eleman;
			
			System.out.println("Lİste oluşturuldu ve başa eleman eklendi.");
			
		}
		else if(head !=null && indis==0) { //eğer liste varsa ve 0.indis seçilirse en başa ekleyen satır
			eleman.next=head;
			head=eleman;
			System.out.println(indis + ".sıraya  EKLENDİ.");
		}
		
		else { //eğer elemanı son elemana yerleştirmek istersek kullanılacak satır
			int n=0;
			node temp=head;
			node temp2=head;
						
			while(temp.next != null) {
				n++;
				temp2=temp;
				temp=temp.next;
			}
			if(n == indis) {
				temp2.next=eleman;
				eleman.next=temp;
				
				System.out.println("Eleman son sıraya eklendi.");
			}
			
			else {//elemanı arada herhangi bir indise yerleştiren kod komutu
				temp=head;
				temp2=head;
				int i=0;
				while(i != indis) {
					temp2=temp; //döngü ile girilen indisinci sıraya kadar temp değişkenleri ile gidiyoruz.
					temp=temp.next;
					i++;
				}
				temp2.next=eleman;//bize verilen indis değerine gelince temp2'den sonra temp'ten önceye yerleştiriyoruz.
				eleman.next=temp;
				
				System.out.println(indis + ".sıraya eleman eklendi.");
			}
		}
	}
	
	
	void bastanSil() {
		
		if(head== null) {
			System.out.println("SİLİNECEK ELEMAN YOK.LİSTE BOŞ.");
		}
		else if(head.next==null) {
			head=null;
			tail=null;
			System.out.println("LİSTEDEKİ SON ELEMAN DA SİLİNDİ.");
		}
		else {
			head=head.next;
			System.out.println("İLK ELEMAN SİLİNDİ.");
		}
			
	}
	
	void sondanSil() {
		
		
		if(tail==null) {
			System.out.println("LİSTE BOŞ.SİLİNECEK ELEMAN YOK.");
		}
		else if(head.next==null) {
			head=null;
			tail=null;
			System.out.println("LİSTEDEKİ SON ELEMAN DA SİLİNDİ.");
		}
		else {
			node temp=head;
			node temp2=head;
			
			while(temp.next !=null) {
				temp2=temp;
				temp=temp.next;
			}
			temp2.next=null;
			tail=temp2;
			
			System.out.println("SONDAN ELEMAN SİLİNDİ.");
		}
	}
	

	
	void aradanSil(int indis) {
		
		if(head==null) {//head boş ise liste yoktur.
			System.out.println("LİSTE BOŞ. SİLİNECEK ELEMAN YOK.");
		}
		else if(head.next==null && indis==0) {//head'ten sonraki boş ise ve silmek
			//istediğimiz eleman 0 ise liste tek elemanlıdır ve o elemanı da silmiş oluruz.
			head=null;
			tail=null;
			System.out.println("Listedeki son eleman da silindi.Lİste artık boş...");
		}
		else if(head.next!=null && indis==0) {//head'ten sonraki eleman null değil ise
			//listede birden fazla eleman vardır. İndiste 0'ı belirttiğimiz için ilk elemanı silmiş oluruz.
			head=head.next;
			System.out.println("Listenin ilk elemanı silindi.");
		}
		
		else {
			int i=0;
			node temp=head;
			node temp2=head;
			//LİSTEDEKİ SON ELEMANIN SİLİNMESİ OLAYI
	//temp ve temp2 değişkenlerini oluşturduk. 167 ve 179.satırlar arasında
	//while içerisinde temp'ten sonraki değer null değil ise i'yi 1 arttırırız ve temp2 temp'in değerine,
	//temp'de kendisinden sonra gelen değere eşit olmuş olur. i'nin indise eşit olduğu noktada da temp2'nin 
	//next'ini sileriz ve yeni tail'imiz temp2 olmuş olur.		
			while(temp!=null) {
				
				i++;
				temp2=temp;
				temp=temp.next;
				
			}
			
			if( i== indis) {
				temp2.next=null;
				tail=temp2;
				System.out.println("Listedeki son eleman silindi...");
			}
			
			//ARADAN ELEMAN SİLME
//temp ve temp2 tanımlarız ve head'den başlatırız. j değişkeni vererek aslında dizinin elemanları gezmiş gibi oluyoruz.
//j indis değerine eşit olana kadar temp2'yi temp'e, temp'i de kendisinden sonra gelen değere eşitleye eşitleye gideriz.
//j'nin indise eşit olduğu yerde temp2'nin next'ini temp'in next'ine eşitleyerek temp'i aradan çıkartmış oluruz.Yani
//temp'i silmiş oluruz. Böylece aradaki indiste yer alan eleman silinmiş olur.			
			else {
				temp=head;
				temp2=head;
				
				int j=0;
				
				while(j!=indis) {
					temp2=temp;
					temp=temp.next;
					j++;
				}
				temp2.next=temp.next;
				System.out.println("Belirtilen indisteki eleman silindi.");
			}
		}
		
	}
	
	
	void yazdır() {
		node temp=head;
		
		if(head==null) {
			System.out.print("liste oluşturulmadı !!!");//head boş ise yazdırılıacak bir liste yoktur. bu yüzden liste boş yazısı dmndürürüz.
		}
		
		else {
			System.out.print("ilk eleman -->");
			while(temp!=null) {//temp=head ile listenin baş elemanından başlayarak sonuçları kontrol ediyoruz.sonuç null'a eşit değilse 
				//yazdırıyoruz.
				System.out.print(temp.data + "-->");
				temp=temp.next;//burada da döngünün devam edebilmesi için temp.next ile bir sonraki elemana geçerek
				//değerini kontrol ediyoruz.Eğer null değilse yazdırıyoruz.null değer bulunduğu anda döngümüz sonlanmış olacak ve listeyi
				//yazdırmış olacağız.
			}
			System.out.println("son eleman.");
		}
	}
}
