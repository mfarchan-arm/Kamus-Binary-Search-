/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

/**
 * class untuk menampilkan kosakata
 * @author Muhammad Farchan Al Rahman (G1A020008)
 */
public class Word extends javax.swing.JFrame {

    /**
     * Creates new form Word
     */
    public Word() {
        initComponents();
        this.view();
    }
    /**
        * @author Sian Nadao Sinaga (G1A020092)
        * method untuk menampilkan daftar bahasa yang belum di sorting
        * pada text area
        */
    public void view(){
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
        for(int i = 0; i < indo.length; i++){
            txaIndonesia.append(i+1 + ". "+indo[i]+"\n");
            txaEnglish.append(i+1 + ". "+english[i]+"\n");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        btnSortEnglish = new javax.swing.JButton();
        btnSortIndo = new javax.swing.JButton();
        btnEngInd = new javax.swing.JButton();
        btnIndEng = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaIndonesia = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaEnglish = new javax.swing.JTextArea();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        btnBack.setBorder(null);
        btnBack.setContentAreaFilled(false);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnSortEnglish.setBorder(null);
        btnSortEnglish.setContentAreaFilled(false);
        btnSortEnglish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSortEnglishActionPerformed(evt);
            }
        });

        btnSortIndo.setBorder(null);
        btnSortIndo.setContentAreaFilled(false);
        btnSortIndo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSortIndoActionPerformed(evt);
            }
        });

        btnEngInd.setBorder(null);
        btnEngInd.setContentAreaFilled(false);
        btnEngInd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEngIndActionPerformed(evt);
            }
        });

        btnIndEng.setBorder(null);
        btnIndEng.setContentAreaFilled(false);
        btnIndEng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIndEngActionPerformed(evt);
            }
        });

        btnExit.setBorder(null);
        btnExit.setContentAreaFilled(false);
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jScrollPane1PropertyChange(evt);
            }
        });

        txaIndonesia.setColumns(20);
        txaIndonesia.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        txaIndonesia.setRows(5);
        txaIndonesia.setBorder(null);
        txaIndonesia.setOpaque(false);
        jScrollPane1.setViewportView(txaIndonesia);

        jScrollPane2.setBorder(null);
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        txaEnglish.setColumns(20);
        txaEnglish.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        txaEnglish.setRows(5);
        txaEnglish.setBorder(null);
        txaEnglish.setOpaque(false);
        jScrollPane2.setViewportView(txaEnglish);

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Word.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(1045, 1045, 1045)
                .addComponent(btnEngInd, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(1043, 1043, 1043)
                .addComponent(btnIndEng, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(607, 607, 607)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(1041, 1041, 1041)
                .addComponent(btnSortEnglish, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(1277, 1277, 1277)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(1042, 1042, 1042)
                .addComponent(btnSortIndo, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(lblBackground)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(404, 404, 404)
                .addComponent(btnEngInd, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(btnIndEng, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(242, 242, 242)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(321, 321, 321)
                .addComponent(btnSortEnglish, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(229, 229, 229)
                .addComponent(btnSortIndo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(lblBackground)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSortEnglishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortEnglishActionPerformed
        /**
        * @author Aulia Salsabyla (G1A020076)
        */
        txaEnglish.setText("");
        txaIndonesia.setText("");
        
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
        for(int i = 0; i<english.length-1; i++){  
            for (int j = i+1; j<english.length; j++){   
                if(english[i].compareTo(english[j])>0){  
                    //swapping array elements  
                    String tempEnglish = english[i];  
                    english[i] = english[j];  
                    english[j] = tempEnglish;
                    
                    String tempIndo = indo[j];
                     indo[j]=indo[i];
                     indo[i]=tempIndo;
                }  
            }  
         }
        for(int i = 0; i < english.length; i++){
            txaIndonesia.append(i+1 + ". "+english[i]+"\n");
            txaEnglish.append(i+1 + ". "+indo[i]+"\n");
        } // method yang digunakan untuk mengurutkan kosakata A-Z berdasarkan kosakata Inggris
        txaIndonesia.setEditable(false);
        txaEnglish.setEditable(false);
    }//GEN-LAST:event_btnSortEnglishActionPerformed

    private void btnEngIndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEngIndActionPerformed
        EngInd english = new EngInd();
        english.setVisible(true);  // button untuk mebuka page translate dari Bahasa Inggris
    }//GEN-LAST:event_btnEngIndActionPerformed

    private void btnIndEngActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIndEngActionPerformed
        IndEng indo = new IndEng();
        indo.setVisible(true);  // button untuk mebuka page translate dari Bahasa Indonesia
    }//GEN-LAST:event_btnIndEngActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);        // menutup program
    }//GEN-LAST:event_btnExitActionPerformed

    private void jScrollPane1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jScrollPane1PropertyChange
        jScrollPane2.setVerticalScrollBar(jScrollPane1.getVerticalScrollBar());
        //membuat text area dapat di scroll
    }//GEN-LAST:event_jScrollPane1PropertyChange

    private void btnSortIndoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortIndoActionPerformed
        /**
        * @author Aulia Salsabyla (G1A020076)
        */
        txaEnglish.setText("");
        txaIndonesia.setText("");
        
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
                if(indo[i].compareTo(indo[j])>0)   
                {  
                    //swapping array elements  
                    String tempIndo = indo[i];  
                    indo[i] = indo[j];  
                    indo[j] = tempIndo;
                    
                    String tempEnglish = english[j];
                     english[j]=english[i];
                     english[i]=tempEnglish;
                }  
            }  
        }

        for(int i = 0; i < indo.length; i++){
            txaIndonesia.append(i+1 + ". "+indo[i]+"\n");
            txaEnglish.append(i+1 + ". "+english[i]+"\n");
        }// method yang digunakan untuk mengurutkan kosakata A-Z berdasarkan kosakata Indonesia
        txaIndonesia.setEditable(false);
        txaEnglish.setEditable(false);
    }//GEN-LAST:event_btnSortIndoActionPerformed

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
            java.util.logging.Logger.getLogger(Word.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Word.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Word.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Word.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Word().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnEngInd;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnIndEng;
    private javax.swing.JButton btnSortEnglish;
    private javax.swing.JButton btnSortIndo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JTextArea txaEnglish;
    private javax.swing.JTextArea txaIndonesia;
    // End of variables declaration//GEN-END:variables
}
