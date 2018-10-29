/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117088.latihan60.akatsuki;

/**
 *
 * @author Rio Yudha Pratama
 */
public class PBO310117088Latihan60Akatsuki {

/**
 * NAMA      : Rio Yudha Pratama
 * KELAS     : PBO3
 * NIM       : 10117088
 * DEKLARASI : Program ini berisi informasi akatsuki
 */
    public static void main(String[] args) {
        // TODO code application logic here
        String cloth = "Awan Merah Hitam";
        String goal = "Mengumpulkan semua Biju yang terdapat di Jinchuriki";
        
        Anggota deidara = new Anggota("Deidara", "Iwagakure", "Petir, Bumi", "S-Rank Missing Ninja", "Teknik ledakan dengan objek tanah liat, C0, C1, C2 Dragon, C3 Ohako, C4 Karura, Nendo Bunshin", "Deidara tewas setelah bertarung dengan Sasuke Uchiha", true, cloth, goal);
        Anggota sasori = new Anggota("Sasori", "Sunagakure", "Hiruko", "S-Rank Missing Ninja from Sunagakure's Puppet Brigade", "Kugutsu no Jutsu/teknik mengendalikan boneka (Hiruko, Kazekage Ketiga, 100 Puppets), Satetsu, Akahigi: Hyakki no Soen", "Sasori tewas saat bertarung dengan Chiyo dan Sakura Haruno", true, cloth, goal);
        Anggota kisame = new Anggota("Kisame Hoshigaki", "Kirigakure", "Api, Angin, Air, Bumi", "S-Rank Missing Ninja", "Pedang Samehada, memiliki chakra yang besar dan mampu menyerap chakra lawan, Daikodan no Jutsu, Dai Bakusui, Suiro no Jutsu, Mizu Bunshin, Kuchiyose", "Bunuh diri agar ia tidak diinterogasi dan informasi yang ia punya tidak didapatkan oleh musuh", true, cloth, goal);
        Anggota itachi = new Anggota("Itachi Uchiha", "Konohagakure", "Api, Angin, Air", "Anbu Captain Missing Ninja", "Sharingan, Mangekyo Sharingan, Genjutsu, Doujutsu, Izanami, Tsukuyomi, Amaterasu, Susano'o, Kuchiyose, Gokakyu no Jutsu, Bukijutsu", "Killed by his own brother", true, cloth, goal);
        Anggota orochimaru = new Anggota("Orochimaru", "Konohagakure", "Api, Angin, Air, Petir, Bumi, Kayu", "Konohagakure's Legendary Sannin", "Edo Tensei, Fushi Tensei, Juinjutsu, Kawarimi no Jutsu, Shiki Fujin, Kuchiyose, Rashomon", "-", false, cloth, goal);
        Anggota obito = new Anggota("Uchiha Obito", "Konohagakure", "Api, Angin, Air, Petir, Bumi, Kayu", "S-Rank Missing Ninja","Sharingan, Mangekyo Sharingan, Kamui, Izanagi, Genjutsu, Doujutsu, Rinnegan, Six Paths of Pain", "mengorbankan diri untuk melindungi Naruto dan Sasuke dari serangan Kaguya Otsutsuki", true, "", goal);
        Anggota zetsu = new Anggota("Zetsu", "-", "-", "-", "Transfer chakra, teknik mata-mata Kagero, Kisei Bunshin, teknik transformasi dan kloning", "", true, cloth, goal);
        Anggota hidan = new Anggota("Hidan", "Yugakure", "-", "-", "Kemampuan hidup abadi", "Hidan dikalahkan oleh Shikamaru Nara", true, cloth, goal);
        Anggota kakuzu = new Anggota("Kakuzu", "Takigakure", "Api, Angin, Air, Petir, Bumi","-", "Teknik mencuri jantung musuh untuk memperpanjang umur (Earth Grudge), transformasi lima elemen chakra", "Kakuzu yang mempunyai lima jantung tewas setelah bertarung melawan shinobi Konoha", true, cloth, goal);
        Anggota pain = new Anggota("Pain Nagato", "Amegakure", "Api, Angin, Air, Petir, Bumi", "-","Rinnegan, Six Paths of Pain/Pein Rikudo, ", "Mengorbankan diri dengan menggunakan teknik terlarang", false, cloth, goal);
        Anggota konan = new Anggota("Konan", "Amegakure", "Angin, Air, Petir", "-","Paper clone, Paper shuriken, Dance of the Shigikami, ", "Konan kemudian tewas dibunuh oleh Tobi/Obito Uchiha", false, cloth, goal);
        
        
        
        System.out.println("       BIODATA AKATSUKI");
        System.out.println("=============================");
        System.out.println();
        System.out.println("Pakian : " + deidara.getClothes());
        System.out.println("Tujuan : " + deidara.getGoals());
        System.out.println();
        
        deidara.displayMember();
        sasori.displayMember();
        kisame.displayMember();
        itachi.displayMember();
        orochimaru.displayMember();
        obito.displayMember();
        zetsu.displayMember();
        hidan.displayMember();
        kakuzu.displayMember();
        pain.displayMember();
        konan.displayMember();
                
                
    }
    
}

