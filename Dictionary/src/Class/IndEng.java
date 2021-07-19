/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

/**
 * class untuk menterjemahkan bahasa
 * @author Muhammad Farchan Al Rahman (G1A020008)
 */
public class IndEng extends javax.swing.JFrame {

    /**
     * membuat tampilan aplikasi
     */
    public IndEng() {
        initComponents();
    }
    /**
     * @author Salsabila Adisty(G1A020016)
     * method yang digunakan untuk
     * menerapkan algoritma
     * binary search
     */
    static int binarySearch(String[] indo, String word){
	int first = 0, last = indo.length - 1; //mengatur awal dan akhir array
	while (first <= last) { //membuat perulangan dengan kondisi nilai dari first sampai last
            int mid = first + (last - first) / 2; //mencari nilai tengah array

            int res = word.compareTo(indo[mid]); //mendapatakan hasil dari nilai tengah array

            // Check if res terdapat di tengah
            if (res == 0)
		return mid;

            // jika res lebih besar, abaikan bagian kiri dari nilai tengah
            if (res > 0)
		first = mid + 1;

            // jika res lebih kecil, abaikan bagian kanan dari nilai tengah
            else
		last = mid - 1;
            }

            return -1; //kembalikan nilai -1 jika tidak ditemukan
	}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textIndonesia = new javax.swing.JTextField();
        textEnglish = new javax.swing.JTextField();
        btnExit = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnTranslate = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        textIndonesia.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        textIndonesia.setBorder(null);
        textIndonesia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textIndonesiaActionPerformed(evt);
            }
        });

        textEnglish.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        textEnglish.setBorder(null);

        btnExit.setBorder(null);
        btnExit.setContentAreaFilled(false);
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnBack.setBorder(null);
        btnBack.setContentAreaFilled(false);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnTranslate.setBorder(null);
        btnTranslate.setContentAreaFilled(false);
        btnTranslate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTranslateActionPerformed(evt);
            }
        });

        btnRefresh.setBorder(null);
        btnRefresh.setContentAreaFilled(false);
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        lblBackground.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/IndEng.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1128, 1128, 1128)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textIndonesia, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnTranslate, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(45, 45, 45)
                .addComponent(textEnglish, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(lblBackground)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(144, 144, 144)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(textIndonesia, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(btnTranslate, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(textEnglish, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addComponent(lblBackground)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnTranslateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTranslateActionPerformed
        /**
        * @author Salsabila Adisty (G1A020016)
        * method untuk mentranslate bahasa Indonesia ke bahasa Inggris
        */
        String[] english = {"father", "sister", "brother", "grandmother", "grandfather", "cat", "dog", "duck", "horse", "bird", 
            "snake", "squirrel", "goats", "cows", "phone", "broom", "rake", "kick", "head", "throw", "love", "dirty", "nostalgic",
            "dear", "always", "usually", "before", "forget", "rice", "finger", "earth", "vegetable", "egg", "salt", "bread", 
            "impossible", "confident", "helpful", "young", "kind", "cool", "hot", "pretty", "lazy", "tall", "short", "ugly", 
            "soft", "little", "angry", "happy", "smart", "world", "information", "map", "art", "people", "computer", "cut", "meat", 
            "system", "problem", "television", "law", "knowledge", "ability", "nature", "thing", "exam", "player", "story", "movie", 
            "camera", "paper", "news", "writing", "month", "child", "different", "goal", "truth", "university", "definitely", 
            "currently", "equipment", "organization" ,"history", "way","art","available", "basic","dramatic"," eastren", "entire", 
            "environmental","famous","medical","mad","nervous", "one","two", "three", "four", "five", "six", "seven", "eight", 
            "nine" , "ten","add","adjust","admire","admit","adopt","afford","allow","announce", "apply","approach","approve",
            "argue","assume","borrow","bring","build","calculate","celebrate","come","commit","enter","establish","examine","exist",
            "expand","get","grow","happen","has","hear","know","learn","lose","apple","avocado","banana","blueberry","grape","guava",
            "lemon","lychee","mango","melon","orange","strawberry","watermelon", "office", "work", "pen", "pencil", "ruler", "eraser",
            "coat", "bag", "company", "door", "wardrobe", "drawer", "chair "," sofa "," president "," commander "," lieutenant ",
            " corporal "," captain "," soldier "," cadet "," student "," student "," teacher "," lecturer ", "college", "school", 
            "small", "big", "left", "right", "up", "down", "side", "middle", "device", "hardware", " software "," heart "," eyes ",
            " nose "," head "," ears "," hair "," eyebrows "," mouth "," teeth "," tongue "," chin "," neck "," chest ",
            " shoulder "," hand "," arm "," finger "," thumb "," index finger "," ring finger "," middle finger "," little finger ",
            " stomach ", "navel", "groin", "thigh", "knee", "foot", "foot", "brain", "skull", "throat", "esophagus", "heart", 
            "intestine", " small intestine "," large intestine "," lungs "," heart "," veins "," arterial blood vessels "," blood ",
            " red blood cells "," white blood cells "," pigments " , "photosynthesis", "radiation", "mosque","church","temple",
            "shrine","pagoda","synagogue","boy","girl","bike","motorcycle","car","eyeglasses","grass","buffalo","policeman",
            "policewoman","water","fire","wind","soil","earthquake","box","floor","help","sorry","wheels","principal","zoo",
            "zone","chain","butterfly","locust","dragonfly","pig","dog","doggy","piggy"
        };
            
            String[] indo = {"ayah", "saudara perempuan", "saudara laki-laki", "nenek", "kakek", "kucing", "anjing", "bebek", "kuda", "burung",
            "ular", "tupai", "kambing", "sapi", "telepon", "sapu", "menyapu", "tendang", "kepala", "lempar", "cinta", "kotor", "nostalgia ",
            "sayang", "selalu", "biasanya", "sebelum", "lupa", "nasi", "jari", "bumi", "sayur", "telur", "garam", "roti",
            "tidak mungkin", "percaya diri", "membantu", "muda", "baik hati", "keren", "panas", "cantik", "malas", "tinggi", "pendek", "jelek",
            "lembut", "kecil", "marah", "senang", "pintar", "dunia", "informasi", "peta", "seni", "orang", "komputer", "potong", "daging ",
            "sistem", "masalah", "televisi", "hukum", "pengetahuan", "kemampuan", "sifat", "benda", "ujian", "pemain", "cerita", "film",
            "kamera", "kertas", "berita", "tulisan", "bulan", "anak", "berbeda", "tujuan", "kebenaran", "universitas", "pasti",
            "saat ini", "peralatan", "organisasi", "sejarah", "cara", "seni", "tersedia", "dasar", "dramatis", "timur", "keseluruhan",
            "lingkungan", "terkenal", "medis", "gila", "gugup", "satu", "dua", "tiga", "empat", "lima", "enam", "tujuh", "delapan ",
            "sembilan", "sepuluh", "tambah", "sesuaikan", "kagumi", "akui", "adopsi", "beli", "izinkan", "umumkan", "terapkan", "pendekatan", 
            "setujui ","berdebat", "berasumsi", "meminjam", "membawa", "membangun", "menghitung", "merayakan", "datang", "berkomitmen", "masuk", 
            "membangun", "memeriksa", "ada ","memperluas", "mendapatkan", "tumbuh", "terjadi", "memiliki", "mendengar", "tahu", "belajar", "kalah", 
            "apel", "alpukat", "pisang", "blueberry "," anggur "," jambu biji ","lemon", "leci", "mangga", "melon", "jeruk", "stroberi", "semangka", 
            "kantor", "kantor", "pena", "pensil", "penggaris", "penghapus ","mantel", "tas", "kompi", "pintu", "lemari", "laci", "kursi", "sofa", 
            "presiden", "komandan", "letnan","kopral", "kapten", "prajurit", "kadet", "mahasiswa", "mahasiswa", "guru", "dosen", "perguruan tinggi", "sekolah",
            "kecil", "besar", "kiri", "kanan", "atas", "bawah", "samping", "tengah", "perangkat", "perangkat keras", "perangkat lunak", "hati", "mata ",
            "hidung", "kepala", "telinga", "rambut", "alis", "mulut", "gigi", "lidah", "dagu", "leher", "dada",
            "bahu", "tangan", "lengan", "jari", "ibu jari", "jari telunjuk", "jari manis", "jari tengah", "jari kelingking",
            "perut", "pusar", "selangkangan", "paha", "lutut", "kaki", "kaki", "otak", "tengkorak", "tenggorokan", "kerongkongan", "jantung",
            "usus", "usus kecil", "usus besar", "paru-paru", "jantung", "vena", "pembuluh darah arteri", "darah",
            "sel darah merah", "sel darah putih", "pigmen", "fotosintesis", "radiasi", "masjid", "gereja", "kuil",
            "kuil", "pagoda", "sinagog", "anak laki-laki", "gadis", "sepeda", "sepeda motor", "mobil", "kacamata", "rumput", "kerbau", "polisi",
            "polisi wanita", "air", "api", "angin", "tanah", "gempa bumi", "kotak", "lantai", "bantuan", "maaf", "roda", "kepala sekolah", "kebun binatang ",
            "zona", "rantai", "kupu-kupu", "belalang", "capung", "babi", "anjing", "anjing", "babi"
        };
       for(int i = 0; i<indo.length-1; i++){  
            for (int j = i+1; j<indo.length; j++){   
                if(indo[i].compareTo(indo[j])>0){  
                    //swapping array elements  
                    //swapping array elements  
                    /**
                     * dimulai dari menyimpan element array yang dimulai dari nol
                     * lalu dibandingkan dengan elemen padda array selanjutnya
                     * lalu disimpan kembali pada temporary
                     */
                    String tempIndo = indo[i];  
                    indo[i] = indo[j];  
                    indo[j] = tempIndo;
                    
                    String tempEnglish = english[j];
                     english[j]=english[i];
                     english[i]=tempEnglish;
                }  
            }  
        } // method yang digunakan untuk mengurutkan kosakata A-Z berdasarkan kosakata Indonesia  
        String indonesiaText = textIndonesia.getText();
        String word = indonesiaText.toLowerCase();
        int result = binarySearch(indo, word);
        if (result == -1)
            textEnglish.setText("Word not Present");
	else
            textEnglish.setText(english[result]);  
        //mencari kata dengan binary search
        textEnglish.setEditable(false);
    }//GEN-LAST:event_btnTranslateActionPerformed

    private void textIndonesiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textIndonesiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textIndonesiaActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        textEnglish.setText(null);
        textIndonesia.setText(null);
        //button untuk mengosongkan text area
        textEnglish.setEditable(false);
    }//GEN-LAST:event_btnRefreshActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(IndEng.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IndEng.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IndEng.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IndEng.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IndEng().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnTranslate;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JTextField textEnglish;
    private javax.swing.JTextField textIndonesia;
    // End of variables declaration//GEN-END:variables
}
