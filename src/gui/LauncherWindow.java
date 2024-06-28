package gui;

import java.awt.Color;
import javax.swing.JOptionPane;
import objects.JuntaApi;
import objects.LauncherJunta;

import gui.*;
import java.awt.Font;
import java.awt.Image;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.ImageIcon;
import org.json.JSONObject;
import org.json.JSONArray;
import util.LaunchMinecraft;

public class LauncherWindow extends javax.swing.JFrame {
    private JuntaApi JUNTA_API;
    private LauncherJunta LAUNCHER_CLASS;
    private String bgColor1, bgColor2, btnColor1, btnColor2, btnPlayColor, btnPlayFontString, fontColor1, fontColor2, eventTitle, LAUNCHER_VERSION;
    
    private Partners partnersWindow;
    private MinecraftSettings mcSettingsWindow;
    private LauncherSettings launcherSettingsWindow;
    private Credits creditsWindow;
    
    private LaunchMinecraft Launch_Minecraft;
    
    private JSONObject currentEvent;
    private JSONArray news;

    private ImageIcon headerIcon, userHeadIcon, eventIcon, btnPlayFontIcon, new0Icon, new1Icon, new2Icon;

    public LauncherWindow(JuntaApi JUNTA_API, LauncherJunta LAUNCHER_CLASS, String LAUNCHER_VERSION) throws MalformedURLException {
        
        this.JUNTA_API = JUNTA_API;
        this.LAUNCHER_CLASS = LAUNCHER_CLASS;
        this.LAUNCHER_VERSION = LAUNCHER_VERSION;
        
        this.partnersWindow = new Partners(JUNTA_API.getPartners(), this.JUNTA_API.getMoneyCollected());
        this.mcSettingsWindow = new MinecraftSettings(JUNTA_API, LAUNCHER_CLASS);
        this.launcherSettingsWindow = new LauncherSettings();
        this.creditsWindow = new Credits(LAUNCHER_CLASS, JUNTA_API, this);
        this.Launch_Minecraft = new LaunchMinecraft();

        this.bgColor1 = JUNTA_API.getBgColor1();
        this.bgColor2 = JUNTA_API.getGbColor2();
        this.btnColor1 = JUNTA_API.getButtonColor1();
        this.btnColor2 = JUNTA_API.getButtonColor2();
        this.btnPlayColor = JUNTA_API.getButtonPlay();
        this.btnPlayFontString = JUNTA_API.getFontPlay();
        this.fontColor1 = JUNTA_API.getFontColor1();
        this.fontColor2 = JUNTA_API.getFontColor2();
        this.currentEvent = JUNTA_API.getEvent();
        this.news = JUNTA_API.getNews();
        
        URL userHeadUrl = new URL("https://cravatar.eu/helmhead/" + LAUNCHER_CLASS.getUsername() + "/32.png");
        this.userHeadIcon = new ImageIcon(userHeadUrl);
        
        URL headerUrl = new URL(JUNTA_API.getTitleImg());
        this.headerIcon = new ImageIcon(headerUrl);
        
        System.out.println("owo ev");
        URL eventImgUrl = new URL(currentEvent.getString("img"));
        this.eventIcon = new ImageIcon(eventImgUrl);
        Image tempEventImg = eventIcon.getImage();
        tempEventImg = tempEventImg.getScaledInstance(288, 162, Image.SCALE_SMOOTH);
        this.eventIcon = new ImageIcon(tempEventImg);
        System.out.println("uwu ev");
         
        URL btnPlayFontUrl = new URL(btnPlayFontString);
        this.btnPlayFontIcon = new ImageIcon(btnPlayFontUrl);
        
        System.out.println("owo ne ");
        URL new0ImgUrl = new URL(news.getJSONObject(0).getString("img"));
        this.new0Icon = new ImageIcon(new0ImgUrl);
        Image tempNew0Img = new0Icon.getImage();
        tempNew0Img = tempNew0Img.getScaledInstance(114, 65, Image.SCALE_SMOOTH);
        this.new0Icon = new ImageIcon(tempNew0Img);
        System.out.println("uwu ne");
        //
        System.out.println("owo ne");
        URL new1ImgUrl = new URL(news.getJSONObject(1).getString("img"));
        this.new1Icon = new ImageIcon(new1ImgUrl);
        Image tempNew1Img = new1Icon.getImage();
        tempNew1Img = tempNew1Img.getScaledInstance(114, 65, Image.SCALE_SMOOTH);
        this.new1Icon = new ImageIcon(tempNew1Img);
        System.out.println("uwu ne");
        //
        System.out.println("owo ne");
        URL new2ImgUrl = new URL(news.getJSONObject(2).getString("img"));
        this.new2Icon = new ImageIcon(new2ImgUrl);
        Image tempNew2Img = new2Icon.getImage();
        tempNew2Img = tempNew2Img.getScaledInstance(114, 65, Image.SCALE_SMOOTH);
        this.new2Icon = new ImageIcon(tempNew2Img);
        System.out.println("uwu ne");
        
        initComponents();
        
        this.panelRoot.setBackground(Color.decode(bgColor1));
        this.panelMain.setBackground(Color.decode(bgColor2));
        this.newsPanel.setBackground(Color.decode(bgColor1));
        this.eventPanel.setBackground(Color.decode(bgColor1));
        
        if (LAUNCHER_CLASS.isHighQualityMode()) {
            isHighQualityModeLAbel.setText("Usando modo Calidad Alta");
        } else {
            isHighQualityModeLAbel.setText("Usando modo Baja Calidad");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRoot = new javax.swing.JPanel();
        panelMain = new javax.swing.JPanel();
        playButton = new javax.swing.JButton();
        eventPanel = new javax.swing.JPanel();
        EventTitle = new javax.swing.JLabel();
        eventDesc = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        eventImg = new javax.swing.JLabel();
        header = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        newsPanel = new javax.swing.JPanel();
        new1 = new javax.swing.JPanel();
        new_title_1 = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        new_desc_1 = new javax.swing.JTextArea();
        new_img_1 = new javax.swing.JLabel();
        new_date_0 = new javax.swing.JLabel();
        new_author_0 = new javax.swing.JLabel();
        new2 = new javax.swing.JPanel();
        new_title_2 = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        new_desc_2 = new javax.swing.JTextArea();
        new_img_2 = new javax.swing.JLabel();
        new_date_1 = new javax.swing.JLabel();
        new_author_1 = new javax.swing.JLabel();
        new3 = new javax.swing.JPanel();
        new_title_3 = new javax.swing.JLabel();
        jScrollPane14 = new javax.swing.JScrollPane();
        new_desc_3 = new javax.swing.JTextArea();
        new_img_3 = new javax.swing.JLabel();
        new_date_2 = new javax.swing.JLabel();
        new_author_2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        showUserName1 = new javax.swing.JLabel();
        showUserName = new javax.swing.JLabel();
        btn_partners = new javax.swing.JButton();
        usingRam = new javax.swing.JLabel();
        userHead = new javax.swing.JLabel();
        LauncherVersionLabelJIJIJIJIJI = new javax.swing.JLabel();
        btn_credits = new javax.swing.JButton();
        LauncherVersionLabelJIJIJIJIJI1 = new javax.swing.JLabel();
        btn_settings = new javax.swing.JButton();
        btn_settings1 = new javax.swing.JButton();
        isHighQualityModeLAbel = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("La Junta Launcher");
        setResizable(false);

        panelRoot.setBackground(new java.awt.Color(51, 51, 51));

        panelMain.setBackground(new java.awt.Color(102, 102, 102));
        panelMain.setLayout(null);

        playButton.setBackground(Color.decode(btnPlayColor));
        playButton.setIcon(btnPlayFontIcon);
        playButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        playButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        playButton.setFocusPainted(false);
        playButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playButtonActionPerformed(evt);
            }
        });
        panelMain.add(playButton);
        playButton.setBounds(178, 220, 180, 65);

        eventPanel.setBackground(new java.awt.Color(51, 51, 51));
        eventPanel.setLayout(null);

        EventTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        EventTitle.setForeground(Color.decode(fontColor1));
        EventTitle.setText(currentEvent.getString("title"));
        eventPanel.add(EventTitle);
        EventTitle.setBounds(10, 10, 290, 25);

        eventDesc.setBackground(Color.decode(bgColor1));
        eventDesc.setBorder(null);
        eventDesc.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(Color.decode(bgColor1));
        jTextArea1.setColumns(20);
        jTextArea1.setForeground(Color.decode(fontColor1));
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText(currentEvent.getString("desc") + "\n\n" + currentEvent.getString("date"));
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setDisabledTextColor(Color.decode(fontColor1));
        eventDesc.setViewportView(jTextArea1);

        eventPanel.add(eventDesc);
        eventDesc.setBounds(10, 45, 290, 135);

        eventImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eventImg.setIcon(eventIcon);
        eventImg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        eventPanel.add(eventImg);
        eventImg.setBounds(10, 185, 288, 162);

        panelMain.add(eventPanel);
        eventPanel.setBounds(530, 270, 310, 355);

        header.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        header.setIcon(headerIcon);
        header.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        panelMain.add(header);
        header.setBounds(15, 10, 820, 245);

        jScrollPane1.setBackground(Color.decode(bgColor1));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        newsPanel.setBackground(Color.decode(bgColor1));
        newsPanel.setOpaque(false);
        newsPanel.setLayout(new java.awt.GridLayout(0, 1, 0, 6));

        new1.setBackground(Color.decode(bgColor1));
        new1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        new1.setPreferredSize(new java.awt.Dimension(498, 136));

        new_title_1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        new_title_1.setForeground(Color.decode(fontColor1));
        new_title_1.setText(news.getJSONObject(0).getString("title"));

        jScrollPane12.setBackground(Color.decode(bgColor2));
        jScrollPane12.setBorder(null);
        jScrollPane12.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        new_desc_1.setEditable(false);
        new_desc_1.setBackground(Color.decode(bgColor1));
        new_desc_1.setColumns(20);
        new_desc_1.setForeground(Color.decode(fontColor1));
        new_desc_1.setLineWrap(true);
        new_desc_1.setRows(5);
        new_desc_1.setText(news.getJSONObject(0).getString("desc"));
        new_desc_1.setWrapStyleWord(true);
        new_desc_1.setBorder(null);
        jScrollPane12.setViewportView(new_desc_1);

        new_img_1.setIcon(new0Icon);
        new_img_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        new_date_0.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        new_date_0.setForeground(Color.decode(fontColor1));
        new_date_0.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        new_date_0.setText(news.getJSONObject(0).getString("date"));

        new_author_0.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        new_author_0.setForeground(Color.decode(fontColor1));
        new_author_0.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        new_author_0.setText("~"+news.getJSONObject(0).getString("author"));

        javax.swing.GroupLayout new1Layout = new javax.swing.GroupLayout(new1);
        new1.setLayout(new1Layout);
        new1Layout.setHorizontalGroup(
            new1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(new1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(new1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(new1Layout.createSequentialGroup()
                        .addComponent(new_title_1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(new1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(new1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(new_img_1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(new_date_0, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(new_author_0, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        new1Layout.setVerticalGroup(
            new1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(new1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(new1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(new1Layout.createSequentialGroup()
                        .addComponent(new_img_1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(new_date_0)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(new_author_0))
                    .addGroup(new1Layout.createSequentialGroup()
                        .addComponent(new_title_1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        newsPanel.add(new1);

        new2.setBackground(Color.decode(bgColor1));
        new2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        new2.setPreferredSize(new java.awt.Dimension(498, 136));

        new_title_2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        new_title_2.setForeground(Color.decode(fontColor1));
        new_title_2.setText(news.getJSONObject(1).getString("title"));

        jScrollPane13.setBackground(Color.decode(bgColor2));
        jScrollPane13.setBorder(null);
        jScrollPane13.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        new_desc_2.setEditable(false);
        new_desc_2.setBackground(Color.decode(bgColor1));
        new_desc_2.setColumns(20);
        new_desc_2.setForeground(Color.decode(fontColor1));
        new_desc_2.setLineWrap(true);
        new_desc_2.setRows(5);
        new_desc_2.setText(news.getJSONObject(1).getString("desc"));
        new_desc_2.setWrapStyleWord(true);
        new_desc_2.setBorder(null);
        jScrollPane13.setViewportView(new_desc_2);

        new_img_2.setIcon(new1Icon);
        new_img_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        new_date_1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        new_date_1.setForeground(Color.decode(fontColor1));
        new_date_1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        new_date_1.setText(news.getJSONObject(1).getString("date"));

        new_author_1.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        new_author_1.setForeground(Color.decode(fontColor1));
        new_author_1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        new_author_1.setText("~"+news.getJSONObject(1).getString("author"));

        javax.swing.GroupLayout new2Layout = new javax.swing.GroupLayout(new2);
        new2.setLayout(new2Layout);
        new2Layout.setHorizontalGroup(
            new2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(new2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(new2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(new2Layout.createSequentialGroup()
                        .addComponent(new_title_2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane13, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(new2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(new2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(new_img_2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(new_date_1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(new_author_1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        new2Layout.setVerticalGroup(
            new2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(new2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(new2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(new2Layout.createSequentialGroup()
                        .addComponent(new_img_2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(new_date_1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(new_author_1))
                    .addGroup(new2Layout.createSequentialGroup()
                        .addComponent(new_title_2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        newsPanel.add(new2);

        new3.setBackground(Color.decode(bgColor1));
        new3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        new3.setPreferredSize(new java.awt.Dimension(498, 136));

        new_title_3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        new_title_3.setForeground(Color.decode(fontColor1));
        new_title_3.setText(news.getJSONObject(2).getString("title"));

        jScrollPane14.setBackground(Color.decode(bgColor2));
        jScrollPane14.setBorder(null);
        jScrollPane14.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        new_desc_3.setEditable(false);
        new_desc_3.setBackground(Color.decode(bgColor1));
        new_desc_3.setColumns(20);
        new_desc_3.setForeground(Color.decode(fontColor1));
        new_desc_3.setLineWrap(true);
        new_desc_3.setRows(5);
        new_desc_3.setText(news.getJSONObject(2).getString("desc"));
        new_desc_3.setWrapStyleWord(true);
        new_desc_3.setBorder(null);
        jScrollPane14.setViewportView(new_desc_3);

        new_img_3.setIcon(new2Icon);
        new_img_3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        new_date_2.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        new_date_2.setForeground(Color.decode(fontColor1));
        new_date_2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        new_date_2.setText(news.getJSONObject(2).getString("date"));

        new_author_2.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        new_author_2.setForeground(Color.decode(fontColor1));
        new_author_2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        new_author_2.setText("~"+news.getJSONObject(2).getString("author"));

        javax.swing.GroupLayout new3Layout = new javax.swing.GroupLayout(new3);
        new3.setLayout(new3Layout);
        new3Layout.setHorizontalGroup(
            new3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(new3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(new3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(new3Layout.createSequentialGroup()
                        .addComponent(new_title_3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane14, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(new3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(new3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(new_img_3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(new_date_2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(new_author_2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        new3Layout.setVerticalGroup(
            new3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(new3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(new3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(new3Layout.createSequentialGroup()
                        .addComponent(new_img_3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(new_date_2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(new_author_2))
                    .addGroup(new3Layout.createSequentialGroup()
                        .addComponent(new_title_3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        newsPanel.add(new3);

        jScrollPane1.setViewportView(newsPanel);

        panelMain.add(jScrollPane1);
        jScrollPane1.setBounds(10, 295, 510, 330);

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));

        showUserName1.setForeground(Color.decode(fontColor1));
        showUserName1.setText("Sesion iniciada como:");
        showUserName1.setToolTipText("");

        showUserName.setForeground(Color.decode(fontColor1));
        showUserName.setText(LAUNCHER_CLASS.getUsername());

        btn_partners.setBackground(Color.decode(btnColor1));
        btn_partners.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_partners.setForeground(Color.decode(fontColor2));
        btn_partners.setText("$" + (JUNTA_API.getServerPrice() - JUNTA_API.getMoneyCollected()) + " restantes");
        btn_partners.setToolTipText("");
        btn_partners.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_partners.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_partners.setFocusPainted(false);
        btn_partners.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_partnersActionPerformed(evt);
            }
        });

        usingRam.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        usingRam.setForeground(Color.decode(fontColor2));
        usingRam.setText("Usando " + LAUNCHER_CLASS.getRam() + "GB de RAM");

        userHead.setIcon(userHeadIcon);

        LauncherVersionLabelJIJIJIJIJI.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        LauncherVersionLabelJIJIJIJIJI.setForeground(Color.decode(fontColor2));
        LauncherVersionLabelJIJIJIJIJI.setText("Launcher v" + this.LAUNCHER_VERSION);

        btn_credits.setBackground(Color.decode(btnColor1));
        btn_credits.setForeground(Color.decode(fontColor2));
        btn_credits.setText("Creditos");
        btn_credits.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_credits.setFocusPainted(false);
        btn_credits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_creditsActionPerformed(evt);
            }
        });

        LauncherVersionLabelJIJIJIJIJI1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        LauncherVersionLabelJIJIJIJIJI1.setForeground(Color.decode(fontColor2));
        LauncherVersionLabelJIJIJIJIJI1.setText("Client v" + this.LAUNCHER_CLASS.getServerVersion());

        btn_settings.setBackground(Color.decode(btnColor1));
        btn_settings.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_settings.setForeground(Color.decode(fontColor2));
        btn_settings.setText("Ajustes");
        btn_settings.setToolTipText("");
        btn_settings.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_settings.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_settings.setFocusPainted(false);
        btn_settings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_settingsActionPerformed(evt);
            }
        });

        btn_settings1.setBackground(Color.decode(btnColor1));
        btn_settings1.setForeground(Color.decode(fontColor2));
        btn_settings1.setText("Comprobar actualizaciones");
        btn_settings1.setToolTipText("");
        btn_settings1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_settings1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_settings1.setFocusPainted(false);
        btn_settings1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_settings1ActionPerformed(evt);
            }
        });

        isHighQualityModeLAbel.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        isHighQualityModeLAbel.setForeground(Color.decode(fontColor2));
        isHighQualityModeLAbel.setText("modo hq");

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout panelRootLayout = new javax.swing.GroupLayout(panelRoot);
        panelRoot.setLayout(panelRootLayout);
        panelRootLayout.setHorizontalGroup(
            panelRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRootLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addComponent(btn_partners, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                    .addComponent(usingRam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelRootLayout.createSequentialGroup()
                        .addGroup(panelRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(showUserName1)
                            .addComponent(showUserName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(userHead, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_credits, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_settings, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                    .addComponent(btn_settings1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                    .addComponent(isHighQualityModeLAbel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelRootLayout.createSequentialGroup()
                        .addGroup(panelRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LauncherVersionLabelJIJIJIJIJI)
                            .addComponent(LauncherVersionLabelJIJIJIJIJI1))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jSeparator2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelMain, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelRootLayout.setVerticalGroup(
            panelRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRootLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRootLayout.createSequentialGroup()
                        .addGroup(panelRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelRootLayout.createSequentialGroup()
                                .addComponent(showUserName1)
                                .addGap(4, 4, 4)
                                .addComponent(showUserName, javax.swing.GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE))
                            .addComponent(userHead, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_partners, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_settings, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_settings1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(usingRam)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(isHighQualityModeLAbel)
                        .addGap(323, 323, 323)
                        .addComponent(LauncherVersionLabelJIJIJIJIJI1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LauncherVersionLabelJIJIJIJIJI)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_credits, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void playButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playButtonActionPerformed
        System.out.println("Jugar");
        int exitCodeMC = Launch_Minecraft.launch(LAUNCHER_CLASS, JUNTA_API, this, LAUNCHER_CLASS.getUsername());
    }//GEN-LAST:event_playButtonActionPerformed

    private void btn_partnersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_partnersActionPerformed
        System.out.println("Ver partners");
        partnersWindow.setLocationRelativeTo(null);
        partnersWindow.setVisible(true);
    }//GEN-LAST:event_btn_partnersActionPerformed

    private void btn_creditsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_creditsActionPerformed
        creditsWindow.setLocationRelativeTo(null);
        creditsWindow.setVisible(true);
    }//GEN-LAST:event_btn_creditsActionPerformed

    private void btn_settingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_settingsActionPerformed
        try {
            mcSettingsWindow.setLocationRelativeTo(null);
            mcSettingsWindow.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Envia captura de este error: " + e, "Error Rancio", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_settingsActionPerformed

    private void btn_settings1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_settings1ActionPerformed
        try {

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Envia captura de este error: " + e, "Error Rancio", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_settings1ActionPerformed
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EventTitle;
    private javax.swing.JLabel LauncherVersionLabelJIJIJIJIJI;
    private javax.swing.JLabel LauncherVersionLabelJIJIJIJIJI1;
    private javax.swing.JButton btn_credits;
    private javax.swing.JButton btn_partners;
    private javax.swing.JButton btn_settings;
    private javax.swing.JButton btn_settings1;
    private javax.swing.JScrollPane eventDesc;
    private javax.swing.JLabel eventImg;
    private javax.swing.JPanel eventPanel;
    private javax.swing.JLabel header;
    private javax.swing.JLabel isHighQualityModeLAbel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JPanel new1;
    private javax.swing.JPanel new2;
    private javax.swing.JPanel new3;
    private javax.swing.JLabel new_author_0;
    private javax.swing.JLabel new_author_1;
    private javax.swing.JLabel new_author_2;
    private javax.swing.JLabel new_date_0;
    private javax.swing.JLabel new_date_1;
    private javax.swing.JLabel new_date_2;
    private javax.swing.JTextArea new_desc_1;
    private javax.swing.JTextArea new_desc_2;
    private javax.swing.JTextArea new_desc_3;
    private javax.swing.JLabel new_img_1;
    private javax.swing.JLabel new_img_2;
    private javax.swing.JLabel new_img_3;
    private javax.swing.JLabel new_title_1;
    private javax.swing.JLabel new_title_2;
    private javax.swing.JLabel new_title_3;
    private javax.swing.JPanel newsPanel;
    private javax.swing.JPanel panelMain;
    private javax.swing.JPanel panelRoot;
    private javax.swing.JButton playButton;
    private javax.swing.JLabel showUserName;
    private javax.swing.JLabel showUserName1;
    private javax.swing.JLabel userHead;
    private javax.swing.JLabel usingRam;
    // End of variables declaration//GEN-END:variables
}
