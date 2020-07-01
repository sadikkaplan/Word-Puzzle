package com.example.kelimebulmaca;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Gravity;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int seviye, aChild, score=0, gonderBtnTiklama=0;
    int high = 100;
    int highScore =0;
    SharedPreferences sharedPref;
    SharedPreferences.Editor editor;
    LinearLayout linearLayout;
    List<TextView> txtArray = new ArrayList<>();
    List<Button> buttons = new ArrayList<>();
    List<Button> btnArray = new ArrayList<>();
    TextView txtKelime, txtSeviye, txtScore, txtHigh;
    Button btnA, btnB, btnC, btnD, btnE, btnF,btnG,btnGx,btnH,btnI,btnIx,btnJ,btnK,btnL,btnN;
    Button btnM,btnO,btnOx,btnP,btnR,btnS,btnSx,btnT,btnU,btnUx,btnV,btnY,btnZ;
    Button btnCx;
    Button btnGonder;
    Button btnGeriAl, btnAtla, btnKar;
    String kelime;

    Random random;

    TextView txt1, txt2, txt3, txt4, txt5, txt6, txt7, txt8,
            txt9, txt10, txt12, txt13, txt14, txt15, txt16, txt17, txt18,
            txt19, txt11, txt20, txt23, txt24, txt25, txt26, txt27, txt28,
            txt29, txt31, txt32, txt33, txt34, txt35, txt36, txt37, txt38,
            txt39, txt41, txt42, txt43, txt44, txt45, txt46, txt47, txt48,
            txt49, txt51, txt52, txt53, txt54, txt55, txt56, txt57, txt58,
            txt59, txt61, txt62, txt63, txt64, txt21, txt22, txt30, txt40,
            txt50, txt60;
    int kontrol1 =0, kontrol2 =0, kontrol3=0, kontrol4=0, kontrol5=0, kontrol6=0, kontrol7=0;
    private TextView countdownText;
    private Button countdownButton;
    private CountDownTimer countDownTimer;
    private long timeLeftInMiliseconds=60000; //1 dakika
    private boolean timerRunning;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        countdownText = findViewById(R.id.countdown_text);
        countdownButton = findViewById(R.id.countdown_button);

        countdownButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startStop();
            }
        });
        updateTimer();
        seviye = 1;
        sharedPref = this.getPreferences(Context.MODE_PRIVATE);
        editor = sharedPref.edit();
        //editor.putInt("intValue",score);
        //editor.commit();

        random = new Random();

        linearLayout = (LinearLayout) findViewById(R.id.linearLayout);
        txt1 = (TextView) findViewById(R.id.txt1);
        txt2 = (TextView) findViewById(R.id.txt2);
        txt3 = (TextView) findViewById(R.id.txt3);
        txt4 = (TextView) findViewById(R.id.txt4);
        txt5 = (TextView) findViewById(R.id.txt5);
        txt6 = (TextView) findViewById(R.id.txt6);
        txt7 = (TextView) findViewById(R.id.txt7);
        txt8 = (TextView) findViewById(R.id.txt8);
        txt9 = (TextView) findViewById(R.id.txt9);
        txt10 = (TextView) findViewById(R.id.txt10);
        txt11 = (TextView) findViewById(R.id.txt11);
        txt12 = (TextView) findViewById(R.id.txt12);
        txt13 = (TextView) findViewById(R.id.txt13);
        txt14 = (TextView) findViewById(R.id.txt14);
        txt15 = (TextView) findViewById(R.id.txt15);
        txt16 = (TextView) findViewById(R.id.txt16);
        txt17 = (TextView) findViewById(R.id.txt17);
        txt18 = (TextView) findViewById(R.id.txt18);
        txt19 = (TextView) findViewById(R.id.txt19);
        txt20 = (TextView) findViewById(R.id.txt20);
        txt21 = (TextView) findViewById(R.id.txt21);
        txt22 = (TextView) findViewById(R.id.txt22);
        txt23 = (TextView) findViewById(R.id.txt23);
        txt24 = (TextView) findViewById(R.id.txt24);
        txt25 = (TextView) findViewById(R.id.txt25);
        txt26 = (TextView) findViewById(R.id.txt26);
        txt27 = (TextView) findViewById(R.id.txt27);
        txt28 = (TextView) findViewById(R.id.txt28);
        txt29 = (TextView) findViewById(R.id.txt29);
        txt30 = (TextView) findViewById(R.id.txt30);
        txt31 = (TextView) findViewById(R.id.txt31);
        txt32 = (TextView) findViewById(R.id.txt32);
        txt33 = (TextView) findViewById(R.id.txt33);
        txt34 = (TextView) findViewById(R.id.txt34);
        txt35 = (TextView) findViewById(R.id.txt35);
        txt36 = (TextView) findViewById(R.id.txt36);
        txt37 = (TextView) findViewById(R.id.txt37);
        txt38 = (TextView) findViewById(R.id.txt38);
        txt39 = (TextView) findViewById(R.id.txt39);
        txt40 = (TextView) findViewById(R.id.txt40);
        txt41 = (TextView) findViewById(R.id.txt41);
        txt42 = (TextView) findViewById(R.id.txt42);
        txt43 = (TextView) findViewById(R.id.txt43);
        txt44 = (TextView) findViewById(R.id.txt44);
        txt45 = (TextView) findViewById(R.id.txt45);
        txt46 = (TextView) findViewById(R.id.txt46);
        txt47 = (TextView) findViewById(R.id.txt47);
        txt48 = (TextView) findViewById(R.id.txt48);
        txt49 = (TextView) findViewById(R.id.txt49);
        txt50 = (TextView) findViewById(R.id.txt50);
        txt51 = (TextView) findViewById(R.id.txt51);
        txt52 = (TextView) findViewById(R.id.txt52);
        txt53 = (TextView) findViewById(R.id.txt53);
        txt54 = (TextView) findViewById(R.id.txt54);
        txt55 = (TextView) findViewById(R.id.txt55);
        txt56 = (TextView) findViewById(R.id.txt56);
        txt57 = (TextView) findViewById(R.id.txt57);
        txt58 = (TextView) findViewById(R.id.txt58);
        txt59 = (TextView) findViewById(R.id.txt59);
        txt60 = (TextView) findViewById(R.id.txt60);
        txt61 = (TextView) findViewById(R.id.txt61);
        txt62 = (TextView) findViewById(R.id.txt62);
        txt63 = (TextView) findViewById(R.id.txt63);
        txt64 = (TextView) findViewById(R.id.txt64);

        txtArray.add(txt1);
        txtArray.add(txt2);
        txtArray.add(txt3);
        txtArray.add(txt4);
        txtArray.add(txt5);
        txtArray.add(txt6);
        txtArray.add(txt7);
        txtArray.add(txt8);
        txtArray.add(txt9);
        txtArray.add(txt10);
        txtArray.add(txt11);
        txtArray.add(txt12);
        txtArray.add(txt13);
        txtArray.add(txt14);
        txtArray.add(txt15);
        txtArray.add(txt16);
        txtArray.add(txt17);
        txtArray.add(txt18);
        txtArray.add(txt19);
        txtArray.add(txt20);
        txtArray.add(txt21);
        txtArray.add(txt22);
        txtArray.add(txt23);
        txtArray.add(txt24);
        txtArray.add(txt25);
        txtArray.add(txt26);
        txtArray.add(txt27);
        txtArray.add(txt28);
        txtArray.add(txt29);
        txtArray.add(txt30);
        txtArray.add(txt31);
        txtArray.add(txt32);
        txtArray.add(txt33);
        txtArray.add(txt34);
        txtArray.add(txt35);
        txtArray.add(txt36);
        txtArray.add(txt37);
        txtArray.add(txt38);
        txtArray.add(txt39);
        txtArray.add(txt40);
        txtArray.add(txt41);
        txtArray.add(txt42);
        txtArray.add(txt43);
        txtArray.add(txt44);
        txtArray.add(txt45);
        txtArray.add(txt46);
        txtArray.add(txt47);
        txtArray.add(txt48);
        txtArray.add(txt49);
        txtArray.add(txt50);
        txtArray.add(txt51);
        txtArray.add(txt52);
        txtArray.add(txt53);
        txtArray.add(txt54);
        txtArray.add(txt55);
        txtArray.add(txt56);
        txtArray.add(txt57);
        txtArray.add(txt58);
        txtArray.add(txt59);
        txtArray.add(txt60);
        txtArray.add(txt61);
        txtArray.add(txt62);
        txtArray.add(txt63);
        txtArray.add(txt64);

        for (int i = 0; i < 64; i++) {
            txtArray.get(i).setVisibility(View.INVISIBLE);
            txtArray.get(i).setGravity(Gravity.CENTER);
            txtArray.get(i).setTextSize(20f);
            //txtArray.get(i).setBackgroundColor(Color.parseColor("#888888"));

        }

        txtKelime = (TextView) findViewById(R.id.txtKelime);
        txtSeviye = (TextView) findViewById(R.id.txtSeviye);
        txtScore = (TextView) findViewById(R.id.txtScore);
        txtHigh = (TextView) findViewById(R.id.txtHigh);
        btnA = (Button) findViewById(R.id.btnA);
        btnM = (Button) findViewById(R.id.btnM);
        btnCx = (Button) findViewById(R.id.btnCx);
        btnB = (Button) findViewById(R.id.btnB);
        btnC = (Button) findViewById(R.id.btnC);
        btnD = (Button) findViewById(R.id.btnD);
        btnE = (Button) findViewById(R.id.btnE);
        btnF = (Button) findViewById(R.id.btnF);
        btnG = (Button) findViewById(R.id.btnG);
        btnGx = (Button) findViewById(R.id.btnGx);
        btnH = (Button) findViewById(R.id.btnH);
        btnI = (Button) findViewById(R.id.btnI);
        btnIx = (Button) findViewById(R.id.btnIx);
        btnJ = (Button) findViewById(R.id.btnJ);
        btnK = (Button) findViewById(R.id.btnK);
        btnL = (Button) findViewById(R.id.btnL);
        btnN = (Button) findViewById(R.id.btnN);
        btnO = (Button) findViewById(R.id.btnO);
        btnOx = (Button) findViewById(R.id.btnOx);
        btnP = (Button) findViewById(R.id.btnP);
        btnR = (Button) findViewById(R.id.btnR);
        btnS = (Button) findViewById(R.id.btnS);
        btnSx = (Button) findViewById(R.id.btnSx);
        btnT = (Button) findViewById(R.id.btnT);
        btnU = (Button) findViewById(R.id.btnU);
        btnUx = (Button) findViewById(R.id.btnUx);
        btnV = (Button) findViewById(R.id.btnV);
        btnY = (Button) findViewById(R.id.btnY);
        btnZ = (Button) findViewById(R.id.btnZ);

        btnArray.add(btnA);
        btnArray.add(btnB);
        btnArray.add(btnC);
        btnArray.add(btnCx);
        btnArray.add(btnD);
        btnArray.add(btnE);
        btnArray.add(btnF);
        btnArray.add(btnG);
        btnArray.add(btnGx);
        btnArray.add(btnH);
        btnArray.add(btnI);
        btnArray.add(btnIx);
        btnArray.add(btnJ);
        btnArray.add(btnK);
        btnArray.add(btnL);
        btnArray.add(btnM);
        btnArray.add(btnN);
        btnArray.add(btnO);
        btnArray.add(btnOx);
        btnArray.add(btnP);
        btnArray.add(btnR);
        btnArray.add(btnS);
        btnArray.add(btnSx);
        btnArray.add(btnT);
        btnArray.add(btnU);
        btnArray.add(btnUx);
        btnArray.add(btnV);
        btnArray.add(btnY);
        btnArray.add(btnZ);

        for (int i = 0; i < 29; i++) {
            btnArray.get(i).setVisibility(View.INVISIBLE);
            btnArray.get(i).setActivated(false);
        }


        btnGonder = (Button) findViewById(R.id.btnGonder);
        btnGeriAl = (Button) findViewById(R.id.btnGeriAl);
        btnKar = (Button) findViewById(R.id.btnKar);
        btnAtla = (Button) findViewById(R.id.btnAtla);
        btnAtla.setVisibility(View.INVISIBLE);

        seviyeGetir();
    }
        public void startTimer(){
            countDownTimer=new CountDownTimer(timeLeftInMiliseconds,1000) {
                @Override
                public void onTick(long l) {
                    timeLeftInMiliseconds=l;
                    updateTimer();
                }

                @Override
                public void onFinish() {

                }
            }.start();
            countdownButton.setText("DURDUR");
            timerRunning=true;
        }
        public void stopTimer(){
            countDownTimer.cancel();
            countdownButton.setText("BAŞLA");

            timerRunning=false;
        }
        public void updateTimer(){
            int minutes=(int) timeLeftInMiliseconds/6000;
            int seconds=(int) timeLeftInMiliseconds % 6000 /1000;

            String timeLeftText;

            timeLeftText=""+minutes;
            timeLeftText=":";
            if(seconds<10) timeLeftText+="0";
            timeLeftText+=seconds;
            countdownText.setText(timeLeftText);
        }
        public void startStop(){
            if(timerRunning){
                stopTimer();
            }
            else{
                startTimer();
            }
        }


    private void seviyeGetir() {
        if(seviye == 1){ // MAÇ , ÇAM
            txtSeviye.setText("Seviye 1 - Aşama 1");
            aChild = linearLayout.getChildCount();

            btnAtla.setVisibility(View.INVISIBLE);
            for(int i=0; i<64; i++){
                txtArray.get(i).setVisibility(View.INVISIBLE);
                txtArray.get(i).setText("");
            }
            for(int i=0; i<29; i++){
                btnArray.get(i).setVisibility(View.INVISIBLE);
            }
            linearLayout.removeAllViews();
            linearLayout.addView(btnA);
            linearLayout.addView(btnM);
            linearLayout.addView(btnCx);
            btnA.setVisibility(View.VISIBLE);
            btnM.setVisibility(View.VISIBLE);
            btnCx.setVisibility(View.VISIBLE);

            txtArray.get(2).setVisibility(View.VISIBLE); // M
            txtArray.get(10).setVisibility(View.VISIBLE); // A
            txtArray.get(18).setVisibility(View.VISIBLE); // Ç
            txtArray.get(19).setVisibility(View.VISIBLE); // A
            txtArray.get(20).setVisibility(View.VISIBLE); // M
        }else if(seviye == 2){ // CAM , AMCA, AMA

            txtSeviye.setText("Seviye 1 - Aşama 2");
            aChild = linearLayout.getChildCount();

            btnAtla.setVisibility(View.INVISIBLE);

            for(int i=0; i<64; i++){
                txtArray.get(i).setVisibility(View.INVISIBLE);
                txtArray.get(i).setText("");
            }
            for(int i=0; i<29; i++){
                btnArray.get(i).setVisibility(View.INVISIBLE);
            }
            linearLayout.removeAllViews();
            linearLayout.addView(btnA);
            linearLayout.addView(btnM);
            linearLayout.addView(btnC);
            btnA.setVisibility(View.VISIBLE);
            btnM.setVisibility(View.VISIBLE);
            btnC.setVisibility(View.VISIBLE);

            txtArray.get(2).setVisibility(View.VISIBLE); // C
            txtArray.get(10).setVisibility(View.VISIBLE); // A
            txtArray.get(18).setVisibility(View.VISIBLE); // M
            txtArray.get(11).setVisibility(View.VISIBLE);  // M
            txtArray.get(12).setVisibility(View.VISIBLE); // C
            txtArray.get(13).setVisibility(View.VISIBLE); // A
            txtArray.get(21).setVisibility(View.VISIBLE); // M
            txtArray.get(29).setVisibility(View.VISIBLE); // A
        }
        else if(seviye == 3){ // ÜMİT, MİT, TİM

            txtSeviye.setText("Seviye 1 - Aşama 3");
            aChild = linearLayout.getChildCount();

            btnAtla.setVisibility(View.INVISIBLE);

            for(int i=0; i<64; i++){
                txtArray.get(i).setVisibility(View.INVISIBLE);
                txtArray.get(i).setText("");
            }
            for(int i=0; i<29; i++){
                btnArray.get(i).setVisibility(View.INVISIBLE);
            }
            linearLayout.removeAllViews();
            linearLayout.addView(btnM);
            linearLayout.addView(btnIx);
            linearLayout.addView(btnT);
            linearLayout.addView(btnUx);

            btnIx.setVisibility(View.VISIBLE);
            btnM.setVisibility(View.VISIBLE);
            btnT.setVisibility(View.VISIBLE);
            btnUx.setVisibility(View.VISIBLE);

            txtArray.get(3).setVisibility(View.VISIBLE); // M
            txtArray.get(11).setVisibility(View.VISIBLE); // İ
            txtArray.get(19).setVisibility(View.VISIBLE); // T
            txtArray.get(20).setVisibility(View.VISIBLE);  // İ
            txtArray.get(21).setVisibility(View.VISIBLE); // M
            txtArray.get(13).setVisibility(View.VISIBLE); // Ü
            txtArray.get(29).setVisibility(View.VISIBLE); // İ
            txtArray.get(37).setVisibility(View.VISIBLE); // T


        }
        else if(seviye == 4){ // AYAR, RÜYA, YAR, RAY

            txtSeviye.setText("Seviye 1 - Aşama 4");

            btnAtla.setVisibility(View.INVISIBLE);

            for(int i=0; i<64; i++){
                txtArray.get(i).setVisibility(View.INVISIBLE);
                txtArray.get(i).setText("");
            }
            for(int i=0; i<29; i++){
                btnArray.get(i).setVisibility(View.INVISIBLE);
            }
            linearLayout.removeAllViews();

            linearLayout.addView(btnA);
            linearLayout.addView(btnY);
            linearLayout.addView(btnR);
            linearLayout.addView(btnUx);
            btnA.setVisibility(View.VISIBLE);
            btnY.setVisibility(View.VISIBLE);
            btnR.setVisibility(View.VISIBLE);
            btnUx.setVisibility(View.VISIBLE);

            txtArray.get(2).setVisibility(View.VISIBLE); // A
            txtArray.get(10).setVisibility(View.VISIBLE); // Y
            txtArray.get(18).setVisibility(View.VISIBLE); // A
            txtArray.get(26).setVisibility(View.VISIBLE);  // R
            txtArray.get(11).setVisibility(View.VISIBLE); // A
            txtArray.get(12).setVisibility(View.VISIBLE); // R
            txtArray.get(20).setVisibility(View.VISIBLE); // A
            txtArray.get(28).setVisibility(View.VISIBLE); // Y
            txtArray.get(27).setVisibility(View.VISIBLE); // Ü
            txtArray.get(29).setVisibility(View.VISIBLE); // A


        }else if(seviye == 5){ // BİNA, BİN, ANİ, ABİ

            txtSeviye.setText("Seviye 1 - Aşama 5");

            btnAtla.setVisibility(View.INVISIBLE);

            for(int i=0; i<64; i++){
                txtArray.get(i).setVisibility(View.INVISIBLE);
                txtArray.get(i).setText("");
            }
            for(int i=0; i<29; i++){
                btnArray.get(i).setVisibility(View.INVISIBLE);
            }
            linearLayout.removeAllViews();

            linearLayout.addView(btnA);
            linearLayout.addView(btnN);
            linearLayout.addView(btnB);
            linearLayout.addView(btnIx);
            btnA.setVisibility(View.VISIBLE);
            btnN.setVisibility(View.VISIBLE);
            btnB.setVisibility(View.VISIBLE);
            btnIx.setVisibility(View.VISIBLE);

            txtArray.get(2).setVisibility(View.VISIBLE); // A
            txtArray.get(10).setVisibility(View.VISIBLE); // B
            txtArray.get(18).setVisibility(View.VISIBLE); // İ
            txtArray.get(13).setVisibility(View.VISIBLE);  // A
            txtArray.get(11).setVisibility(View.VISIBLE); // İ
            txtArray.get(12).setVisibility(View.VISIBLE); // N
            txtArray.get(21).setVisibility(View.VISIBLE); // N
            txtArray.get(28).setVisibility(View.VISIBLE); // B
            txtArray.get(29).setVisibility(View.VISIBLE); // İ
            txtArray.get(30).setVisibility(View.VISIBLE); // N

        }else if(seviye == 6){ // ODA, MODA, DAM
            txtSeviye.setText("Seviye 1 - Aşama 6");

            btnAtla.setVisibility(View.INVISIBLE);

            for(int i=0; i<64; i++){
                txtArray.get(i).setVisibility(View.INVISIBLE);
                txtArray.get(i).setText("");
            }
            for(int i=0; i<29; i++){
                btnArray.get(i).setVisibility(View.INVISIBLE);
            }
            linearLayout.removeAllViews();

            linearLayout.addView(btnM);
            linearLayout.addView(btnD);
            linearLayout.addView(btnA);
            linearLayout.addView(btnO);
            btnM.setVisibility(View.VISIBLE);
            btnD.setVisibility(View.VISIBLE);
            btnA.setVisibility(View.VISIBLE);
            btnO.setVisibility(View.VISIBLE);

            txtArray.get(3).setVisibility(View.VISIBLE); // M
            txtArray.get(4).setVisibility(View.VISIBLE); // O
            txtArray.get(5).setVisibility(View.VISIBLE); // D
            txtArray.get(6).setVisibility(View.VISIBLE);  // A
            txtArray.get(12).setVisibility(View.VISIBLE); // D
            txtArray.get(19).setVisibility(View.VISIBLE); // O
            txtArray.get(20).setVisibility(View.VISIBLE); // D
            txtArray.get(21).setVisibility(View.VISIBLE); // A


        }else if(seviye == 7){ // ELÇİ, ÇİLE, ÇİL, İLÇE, İLE
            txtSeviye.setText("Seviye 2 - Aşama 1");

            btnAtla.setVisibility(View.INVISIBLE);

            for(int i=0; i<64; i++){
                txtArray.get(i).setVisibility(View.INVISIBLE);
                txtArray.get(i).setText("");
            }
            for(int i=0; i<29; i++){
                btnArray.get(i).setVisibility(View.INVISIBLE);
            }
            linearLayout.removeAllViews();

            linearLayout.addView(btnL);
            linearLayout.addView(btnE);
            linearLayout.addView(btnIx);
            linearLayout.addView(btnCx);
            btnE.setVisibility(View.VISIBLE);
            btnL.setVisibility(View.VISIBLE);
            btnCx.setVisibility(View.VISIBLE);
            btnIx.setVisibility(View.VISIBLE);

            txtArray.get(2).setVisibility(View.VISIBLE); // İ
            txtArray.get(10).setVisibility(View.VISIBLE); // L
            txtArray.get(18).setVisibility(View.VISIBLE); // Ç
            txtArray.get(26).setVisibility(View.VISIBLE);  // E
            txtArray.get(12).setVisibility(View.VISIBLE); // E
            txtArray.get(19).setVisibility(View.VISIBLE); // İ
            txtArray.get(20).setVisibility(View.VISIBLE); // L
            txtArray.get(21).setVisibility(View.VISIBLE); // E
            txtArray.get(28).setVisibility(View.VISIBLE); // Ç
            txtArray.get(35).setVisibility(View.VISIBLE); // Ç
            txtArray.get(36).setVisibility(View.VISIBLE); // İ
            txtArray.get(37).setVisibility(View.VISIBLE); // L

        }else if(seviye == 8){ // CEZA, ECZA, EZA, CAZ
            txtSeviye.setText("Seviye 2 - Aşama 2");

            btnAtla.setVisibility(View.INVISIBLE);

            for(int i=0; i<64; i++){
                txtArray.get(i).setVisibility(View.INVISIBLE);
                txtArray.get(i).setText("");
            }
            for(int i=0; i<29; i++){
                btnArray.get(i).setVisibility(View.INVISIBLE);
            }
            linearLayout.removeAllViews();

            linearLayout.addView(btnA);
            linearLayout.addView(btnC);
            linearLayout.addView(btnZ);
            linearLayout.addView(btnE);
            btnA.setVisibility(View.VISIBLE);
            btnE.setVisibility(View.VISIBLE);
            btnC.setVisibility(View.VISIBLE);
            btnZ.setVisibility(View.VISIBLE);

            txtArray.get(3).setVisibility(View.VISIBLE); // C
            txtArray.get(11).setVisibility(View.VISIBLE); // E
            txtArray.get(19).setVisibility(View.VISIBLE); // Z
            txtArray.get(27).setVisibility(View.VISIBLE); // A
            txtArray.get(12).setVisibility(View.VISIBLE); // C
            txtArray.get(13).setVisibility(View.VISIBLE); // Z
            txtArray.get(14).setVisibility(View.VISIBLE); // A
            txtArray.get(5).setVisibility(View.VISIBLE); // E
            txtArray.get(21).setVisibility(View.VISIBLE); // A
            txtArray.get(26).setVisibility(View.VISIBLE); // C
            txtArray.get(28).setVisibility(View.VISIBLE); // Z

        }else if(seviye == 9){ // KITA, TAKI, KATI, ATIK
            txtSeviye.setText("Seviye 2 - Aşama 3");

            btnAtla.setVisibility(View.INVISIBLE);

            for(int i=0; i<64; i++){
                txtArray.get(i).setVisibility(View.INVISIBLE);
                txtArray.get(i).setText("");
            }
            for(int i=0; i<29; i++){
                btnArray.get(i).setVisibility(View.INVISIBLE);
            }
            linearLayout.removeAllViews();

            linearLayout.addView(btnI);
            linearLayout.addView(btnT);
            linearLayout.addView(btnA);
            linearLayout.addView(btnK);
            btnI.setVisibility(View.VISIBLE);
            btnT.setVisibility(View.VISIBLE);
            btnA.setVisibility(View.VISIBLE);
            btnK.setVisibility(View.VISIBLE);

            txtArray.get(3).setVisibility(View.VISIBLE); // K
            txtArray.get(4).setVisibility(View.VISIBLE); // A
            txtArray.get(5).setVisibility(View.VISIBLE); // T
            txtArray.get(6).setVisibility(View.VISIBLE);  // I
            txtArray.get(11).setVisibility(View.VISIBLE); // I
            txtArray.get(13).setVisibility(View.VISIBLE); // A
            txtArray.get(18).setVisibility(View.VISIBLE); // A
            txtArray.get(19).setVisibility(View.VISIBLE); // T
            txtArray.get(20).setVisibility(View.VISIBLE); // I
            txtArray.get(21).setVisibility(View.VISIBLE); // K
            txtArray.get(27).setVisibility(View.VISIBLE); // A
            txtArray.get(29).setVisibility(View.VISIBLE); // I


        }else if(seviye == 10){ // DAM, DAMA, ADAM, ADA
            txtSeviye.setText("Seviye 2 - Aşama 4");

            btnAtla.setVisibility(View.INVISIBLE);

            for(int i=0; i<64; i++){
                txtArray.get(i).setVisibility(View.INVISIBLE);
                txtArray.get(i).setText("");
            }
            for(int i=0; i<29; i++){
                btnArray.get(i).setVisibility(View.INVISIBLE);
            }
            linearLayout.removeAllViews();

            linearLayout.addView(btnA);
            linearLayout.addView(btnM);
            linearLayout.addView(btnD);
            btnA.setVisibility(View.VISIBLE);
            btnM.setVisibility(View.VISIBLE);
            btnD.setVisibility(View.VISIBLE);

            txtArray.get(2).setVisibility(View.VISIBLE); // D
            txtArray.get(10).setVisibility(View.VISIBLE); // A
            txtArray.get(18).setVisibility(View.VISIBLE); // M
            txtArray.get(26).setVisibility(View.VISIBLE);  // A
            txtArray.get(3).setVisibility(View.VISIBLE); // A
            txtArray.get(4).setVisibility(View.VISIBLE); // M
            txtArray.get(27).setVisibility(View.VISIBLE); // D
            txtArray.get(28).setVisibility(View.VISIBLE); // A
            txtArray.get(29).setVisibility(View.VISIBLE); // M
            txtArray.get(36).setVisibility(View.VISIBLE); // D
            txtArray.get(44).setVisibility(View.VISIBLE); // A

        }else if(seviye == 11) { // YAPI, PAY, AYI, AYIP
            txtSeviye.setText("Seviye 2 - Aşama 5");

            btnAtla.setVisibility(View.INVISIBLE);

            for (int i = 0; i < 64; i++) {
                txtArray.get(i).setVisibility(View.INVISIBLE);
                txtArray.get(i).setText("");
            }
            for (int i = 0; i < 29; i++) {
                btnArray.get(i).setVisibility(View.INVISIBLE);
            }
            linearLayout.removeAllViews();

            linearLayout.addView(btnP);
            linearLayout.addView(btnY);
            linearLayout.addView(btnA);
            linearLayout.addView(btnI);

            btnP.setVisibility(View.VISIBLE);
            btnY.setVisibility(View.VISIBLE);
            btnA.setVisibility(View.VISIBLE);
            btnI.setVisibility(View.VISIBLE);

            txtArray.get(2).setVisibility(View.VISIBLE); // Y
            txtArray.get(3).setVisibility(View.VISIBLE); // A
            txtArray.get(4).setVisibility(View.VISIBLE); // P
            txtArray.get(5).setVisibility(View.VISIBLE);  // I
            txtArray.get(11).setVisibility(View.VISIBLE); // Y
            txtArray.get(19).setVisibility(View.VISIBLE); // I
            txtArray.get(27).setVisibility(View.VISIBLE); // P
            txtArray.get(28).setVisibility(View.VISIBLE); // A
            txtArray.get(21).setVisibility(View.VISIBLE); // A
            txtArray.get(29).setVisibility(View.VISIBLE); // Y
            txtArray.get(37).setVisibility(View.VISIBLE); // I

        }else if(seviye == 12) { //BOYA, BOY, OBA, BAY, OYA
            txtSeviye.setText("Seviye 2 - Aşama 6");

            btnAtla.setVisibility(View.INVISIBLE);

            for (int i = 0; i < 64; i++) {
                txtArray.get(i).setVisibility(View.INVISIBLE);
                txtArray.get(i).setText("");
            }
            for (int i = 0; i < 29; i++) {
                btnArray.get(i).setVisibility(View.INVISIBLE);
            }
            linearLayout.removeAllViews();

            linearLayout.addView(btnY);
            linearLayout.addView(btnB);
            linearLayout.addView(btnA);
            linearLayout.addView(btnO);

            btnB.setVisibility(View.VISIBLE);
            btnY.setVisibility(View.VISIBLE);
            btnA.setVisibility(View.VISIBLE);
            btnO.setVisibility(View.VISIBLE);

            txtArray.get(5).setVisibility(View.VISIBLE); // O
            txtArray.get(11).setVisibility(View.VISIBLE); // B
            txtArray.get(13).setVisibility(View.VISIBLE); // B
            txtArray.get(14).setVisibility(View.VISIBLE);  // O
            txtArray.get(15).setVisibility(View.VISIBLE); // Y
            txtArray.get(19).setVisibility(View.VISIBLE); // O
            txtArray.get(20).setVisibility(View.VISIBLE); // Y
            txtArray.get(21).setVisibility(View.VISIBLE); // A
            txtArray.get(27).setVisibility(View.VISIBLE); // Y
            txtArray.get(34).setVisibility(View.VISIBLE); // B
            txtArray.get(35).setVisibility(View.VISIBLE); // A
            txtArray.get(36).setVisibility(View.VISIBLE); // Y

        }
        else if(seviye == 13) { // SÖĞÜT, ÖĞÜT, SÜT
            txtSeviye.setText("Seviye 3 - Aşama 1");

            btnAtla.setVisibility(View.INVISIBLE);

            for (int i = 0; i < 64; i++) {
                txtArray.get(i).setVisibility(View.INVISIBLE);
                txtArray.get(i).setText("");
            }
            for (int i = 0; i < 29; i++) {
                btnArray.get(i).setVisibility(View.INVISIBLE);
            }
            linearLayout.removeAllViews();

            linearLayout.addView(btnOx);
            linearLayout.addView(btnT);
            linearLayout.addView(btnS);
            linearLayout.addView(btnGx);
            linearLayout.addView(btnUx);

            btnOx.setVisibility(View.VISIBLE);
            btnT.setVisibility(View.VISIBLE);
            btnS.setVisibility(View.VISIBLE);
            btnUx.setVisibility(View.VISIBLE);
            btnGx.setVisibility(View.VISIBLE);

            txtArray.get(2).setVisibility(View.VISIBLE); // S
            txtArray.get(3).setVisibility(View.VISIBLE); // Ö
            txtArray.get(4).setVisibility(View.VISIBLE); // Ğ
            txtArray.get(5).setVisibility(View.VISIBLE);  // Ü
            txtArray.get(6).setVisibility(View.VISIBLE); // T
            txtArray.get(11).setVisibility(View.VISIBLE); // Ğ
            txtArray.get(18).setVisibility(View.VISIBLE); // S
            txtArray.get(19).setVisibility(View.VISIBLE); // Ü
            txtArray.get(20).setVisibility(View.VISIBLE); // T
            txtArray.get(27).setVisibility(View.VISIBLE); // T

        }
        else if(seviye == 14) { // KÖPEK, KEK, PEK, KÖK
            txtSeviye.setText("Seviye 3 - Aşama 2");

            btnAtla.setVisibility(View.INVISIBLE);

            for (int i = 0; i < 64; i++) {
                txtArray.get(i).setVisibility(View.INVISIBLE);
                txtArray.get(i).setText("");
            }
            for (int i = 0; i < 29; i++) {
                btnArray.get(i).setVisibility(View.INVISIBLE);
            }
            linearLayout.removeAllViews();

            linearLayout.addView(btnOx);
            linearLayout.addView(btnK);
            linearLayout.addView(btnP);
            linearLayout.addView(btnE);

            btnOx.setVisibility(View.VISIBLE);
            btnK.setVisibility(View.VISIBLE);
            btnE.setVisibility(View.VISIBLE);
            btnP.setVisibility(View.VISIBLE);

            txtArray.get(2).setVisibility(View.VISIBLE); // K
            txtArray.get(10).setVisibility(View.VISIBLE); // E
            txtArray.get(18).setVisibility(View.VISIBLE); // K
            txtArray.get(19).setVisibility(View.VISIBLE);  // Ö
            txtArray.get(20).setVisibility(View.VISIBLE); // P
            txtArray.get(21).setVisibility(View.VISIBLE); // E
            txtArray.get(22).setVisibility(View.VISIBLE); // K
            txtArray.get(28).setVisibility(View.VISIBLE); // E
            txtArray.get(36).setVisibility(View.VISIBLE); // K
            txtArray.get(30).setVisibility(View.VISIBLE); // Ö
            txtArray.get(38).setVisibility(View.VISIBLE); // K
        }
        else if(seviye == 15) { // BİTKİ, BİTİK, BİT, TİK
            txtSeviye.setText("Seviye 3 - Aşama 3");

            btnAtla.setVisibility(View.INVISIBLE);

            for (int i = 0; i < 64; i++) {
                txtArray.get(i).setVisibility(View.INVISIBLE);
                txtArray.get(i).setText("");
            }
            for (int i = 0; i < 29; i++) {
                btnArray.get(i).setVisibility(View.INVISIBLE);
            }
            linearLayout.removeAllViews();

            linearLayout.addView(btnB);
            linearLayout.addView(btnIx);
            linearLayout.addView(btnK);
            linearLayout.addView(btnT);

            btnIx.setVisibility(View.VISIBLE);
            btnB.setVisibility(View.VISIBLE);
            btnT.setVisibility(View.VISIBLE);
            btnK.setVisibility(View.VISIBLE);

            txtArray.get(3).setVisibility(View.VISIBLE); // B
            txtArray.get(6).setVisibility(View.VISIBLE); // B
            txtArray.get(10).setVisibility(View.VISIBLE); // B
            txtArray.get(11).setVisibility(View.VISIBLE);  // İ
            txtArray.get(12).setVisibility(View.VISIBLE); // T
            txtArray.get(13).setVisibility(View.VISIBLE); // K
            txtArray.get(14).setVisibility(View.VISIBLE); // İ
            txtArray.get(19).setVisibility(View.VISIBLE); // T
            txtArray.get(22).setVisibility(View.VISIBLE); // T
            txtArray.get(27).setVisibility(View.VISIBLE); // İ
            txtArray.get(33).setVisibility(View.VISIBLE); // T
            txtArray.get(34).setVisibility(View.VISIBLE); // İ
            txtArray.get(35).setVisibility(View.VISIBLE); // K

        }
        else if(seviye == 16) { // MİLYON, İYON, LİMON, MİL, YOL,
            txtSeviye.setText("Seviye 3 - Aşama 4");

            btnAtla.setVisibility(View.INVISIBLE);

            for (int i = 0; i < 64; i++) {
                txtArray.get(i).setVisibility(View.INVISIBLE);
                txtArray.get(i).setText("");
            }
            for (int i = 0; i < 29; i++) {
                btnArray.get(i).setVisibility(View.INVISIBLE);
            }
            linearLayout.removeAllViews();

            linearLayout.addView(btnO);
            linearLayout.addView(btnN);
            linearLayout.addView(btnY);
            linearLayout.addView(btnM);
            linearLayout.addView(btnIx);
            linearLayout.addView(btnL);

            btnO.setVisibility(View.VISIBLE);
            btnN.setVisibility(View.VISIBLE);
            btnM.setVisibility(View.VISIBLE);
            btnIx.setVisibility(View.VISIBLE);
            btnY.setVisibility(View.VISIBLE);
            btnL.setVisibility(View.VISIBLE);

            txtArray.get(3).setVisibility(View.VISIBLE); //
            txtArray.get(5).setVisibility(View.VISIBLE); //
            txtArray.get(6).setVisibility(View.VISIBLE); //
            txtArray.get(7).setVisibility(View.VISIBLE);  //
            txtArray.get(11).setVisibility(View.VISIBLE); //
            txtArray.get(14).setVisibility(View.VISIBLE); //
            txtArray.get(19).setVisibility(View.VISIBLE); //
            txtArray.get(20).setVisibility(View.VISIBLE); //
            txtArray.get(21).setVisibility(View.VISIBLE); //
            txtArray.get(22).setVisibility(View.VISIBLE); //
            txtArray.get(23).setVisibility(View.VISIBLE); //
            txtArray.get(27).setVisibility(View.VISIBLE); //
            txtArray.get(30).setVisibility(View.VISIBLE); //
            txtArray.get(34).setVisibility(View.VISIBLE); //
            txtArray.get(35).setVisibility(View.VISIBLE); //
            txtArray.get(36).setVisibility(View.VISIBLE); //
            txtArray.get(43).setVisibility(View.VISIBLE); //

        }
        else if(seviye == 17) { // SORUN, SORU, ONUR, RUS, SON, SUR
            txtSeviye.setText("Seviye 3 - Aşama 5");

            btnAtla.setVisibility(View.INVISIBLE);

            for (int i = 0; i < 64; i++) {
                txtArray.get(i).setVisibility(View.INVISIBLE);
                txtArray.get(i).setText("");
            }
            for (int i = 0; i < 29; i++) {
                btnArray.get(i).setVisibility(View.INVISIBLE);
            }
            linearLayout.removeAllViews();

            linearLayout.addView(btnO);
            linearLayout.addView(btnN);
            linearLayout.addView(btnS);
            linearLayout.addView(btnR);
            linearLayout.addView(btnU);

            btnO.setVisibility(View.VISIBLE);
            btnN.setVisibility(View.VISIBLE);
            btnS.setVisibility(View.VISIBLE);
            btnR.setVisibility(View.VISIBLE);
            btnU.setVisibility(View.VISIBLE);

            txtArray.get(3).setVisibility(View.VISIBLE); // S
            txtArray.get(11).setVisibility(View.VISIBLE); // O
            txtArray.get(13).setVisibility(View.VISIBLE); // O
            txtArray.get(17).setVisibility(View.VISIBLE);  // S
            txtArray.get(18).setVisibility(View.VISIBLE); // O
            txtArray.get(19).setVisibility(View.VISIBLE); // R
            txtArray.get(20).setVisibility(View.VISIBLE); // U
            txtArray.get(21).setVisibility(View.VISIBLE); // N
            txtArray.get(25).setVisibility(View.VISIBLE); // O
            txtArray.get(27).setVisibility(View.VISIBLE); // U
            txtArray.get(29).setVisibility(View.VISIBLE); // U
            txtArray.get(33).setVisibility(View.VISIBLE); // N
            txtArray.get(37).setVisibility(View.VISIBLE); // R
            txtArray.get(38).setVisibility(View.VISIBLE); // U
            txtArray.get(39).setVisibility(View.VISIBLE); // S
            txtArray.get(47).setVisibility(View.VISIBLE); // U
            txtArray.get(55).setVisibility(View.VISIBLE); // R

        }
        else if(seviye == 18) { // ARİTMİ, RİTİM, MART, İRİ, TAMİR, AMİR
            txtSeviye.setText("Seviye 3 - Aşama 6");

            btnAtla.setVisibility(View.INVISIBLE);

            for (int i = 0; i < 64; i++) {
                txtArray.get(i).setVisibility(View.INVISIBLE);
                txtArray.get(i).setText("");
            }
            for (int i = 0; i < 29; i++) {
                btnArray.get(i).setVisibility(View.INVISIBLE);
            }
            linearLayout.removeAllViews();

            linearLayout.addView(btnR);
            linearLayout.addView(btnA);
            linearLayout.addView(btnT);
            linearLayout.addView(btnM);
            linearLayout.addView(btnIx);

            btnR.setVisibility(View.VISIBLE);
            btnA.setVisibility(View.VISIBLE);
            btnT.setVisibility(View.VISIBLE);
            btnM.setVisibility(View.VISIBLE);
            btnIx.setVisibility(View.VISIBLE);


            txtArray.get(9).setVisibility(View.VISIBLE); //
            txtArray.get(10).setVisibility(View.VISIBLE); //
            txtArray.get(11).setVisibility(View.VISIBLE); //
            txtArray.get(12).setVisibility(View.VISIBLE); //
            txtArray.get(13).setVisibility(View.VISIBLE); //
            txtArray.get(18).setVisibility(View.VISIBLE); //
            txtArray.get(21).setVisibility(View.VISIBLE); //
            txtArray.get(24).setVisibility(View.VISIBLE); //
            txtArray.get(25).setVisibility(View.VISIBLE); //
            txtArray.get(26).setVisibility(View.VISIBLE); //
            txtArray.get(29).setVisibility(View.VISIBLE); //
            txtArray.get(34).setVisibility(View.VISIBLE); //
            txtArray.get(37).setVisibility(View.VISIBLE); //
            txtArray.get(42).setVisibility(View.VISIBLE); //
            txtArray.get(45).setVisibility(View.VISIBLE); //
            txtArray.get(48).setVisibility(View.VISIBLE); //
            txtArray.get(49).setVisibility(View.VISIBLE); //
            txtArray.get(50).setVisibility(View.VISIBLE); //
            txtArray.get(51).setVisibility(View.VISIBLE); //

        }

    }

    public void oyna(){
        if(seviye==1){
            gonderBtnTiklama++;
            score = high - (2*gonderBtnTiklama);

            if(txtKelime.getText().equals("MAÇ")){
                Toast.makeText(getApplicationContext(), "Tebrikler", Toast.LENGTH_LONG).show();
                txtArray.get(2).setText("M");
                txtArray.get(10).setText("A");
                txtArray.get(18).setText("Ç");

                btnCx.setEnabled(true);
                btnM.setEnabled(true);
                btnA.setEnabled(true);
                txtKelime.setText("");
                kontrol1++;
            }
            else if(txtKelime.getText().equals("ÇAM")){
                Toast.makeText(getApplicationContext(), "Tebrikler", Toast.LENGTH_LONG).show();
                txtArray.get(18).setText("Ç");
                txtArray.get(19).setText("A");
                txtArray.get(20).setText("M");
                btnCx.setEnabled(true);
                btnM.setEnabled(true);
                btnA.setEnabled(true);
                txtKelime.setText("");
                kontrol2++;
            }else if(!txtKelime.getText().equals("")){
                Toast.makeText(getApplicationContext(),"TEKRAR DENE !", Toast.LENGTH_LONG).show();

            }
            if(kontrol1 != 0 && kontrol2 != 0){
                seviye = 2 ;
                kontrol1=0;
                kontrol2=0;
                editor.putInt("Score", score);
                editor.commit();
                gonderBtnTiklama =0;

                highScore += score;
                txtScore.setText("Score: "+Integer.toString(sharedPref.getInt("Score",0)));
                txtHigh.setText("HighScore: "+highScore);
                btnAtla.setVisibility(View.VISIBLE);
            }
        }
        if(seviye==2){
            gonderBtnTiklama++;
            score = high - (2*gonderBtnTiklama);

            if(txtKelime.getText().equals("CAM")){
                Toast.makeText(getApplicationContext(), "Tebrikler", Toast.LENGTH_LONG).show();
                txtArray.get(2).setText("C");
                txtArray.get(10).setText("A");
                txtArray.get(18).setText("M");

                btnC.setEnabled(true);
                btnM.setEnabled(true);
                btnA.setEnabled(true);
                txtKelime.setText("");
                kontrol1++;
            }
            else if(txtKelime.getText().equals("AMA")){
                Toast.makeText(getApplicationContext(), "Tebrikler", Toast.LENGTH_LONG).show();
                txtArray.get(13).setText("A");
                txtArray.get(21).setText("M");
                txtArray.get(29).setText("A");
                btnC.setEnabled(true);
                btnM.setEnabled(true);
                btnA.setEnabled(true);
                txtKelime.setText("");
                kontrol2++;
            }
            else if(txtKelime.getText().equals("AMCA")){
                Toast.makeText(getApplicationContext(), "Tebrikler", Toast.LENGTH_LONG).show();
                txtArray.get(10).setText("A");
                txtArray.get(11).setText("M");
                txtArray.get(12).setText("C");
                txtArray.get(13).setText("A");
                btnC.setEnabled(true);
                btnM.setEnabled(true);
                btnA.setEnabled(true);
                txtKelime.setText("");
                kontrol3++;
            }else{
                Toast.makeText(getApplicationContext(),"TEKRAR DENE !", Toast.LENGTH_LONG).show();
            }
            if(kontrol1 != 0 && kontrol2 != 0 && kontrol3 != 0){
                seviye = 3 ;
                kontrol1=0;
                kontrol2=0;
                kontrol3=0;
                editor.putInt("Score", score);
                editor.commit();
                gonderBtnTiklama =0;

                highScore += score;
                txtScore.setText("Score: "+Integer.toString(sharedPref.getInt("Score",0)));
                txtHigh.setText("HighScore: "+highScore);

                btnAtla.setVisibility(View.VISIBLE);
            }
        }
        if(seviye==3){
            gonderBtnTiklama++;
            score = high - (2*gonderBtnTiklama);
            if(txtKelime.getText().equals("MİT")){
                Toast.makeText(getApplicationContext(), "Tebrikler", Toast.LENGTH_LONG).show();
                txtArray.get(3).setText("M");
                txtArray.get(11).setText("İ");
                txtArray.get(19).setText("T");

                btnM.setEnabled(true);
                btnIx.setEnabled(true);
                btnT.setEnabled(true);
                txtKelime.setText("");
                kontrol1++;
            }
            else if(txtKelime.getText().equals("TİM")){
                Toast.makeText(getApplicationContext(), "Tebrikler", Toast.LENGTH_LONG).show();
                txtArray.get(19).setText("T");
                txtArray.get(20).setText("İ");
                txtArray.get(21).setText("M");
                btnT.setEnabled(true);
                btnIx.setEnabled(true);
                btnM.setEnabled(true);
                txtKelime.setText("");
                kontrol2++;
            }
            else if(txtKelime.getText().equals("ÜMİT")){
                Toast.makeText(getApplicationContext(), "Tebrikler", Toast.LENGTH_LONG).show();
                txtArray.get(13).setText("Ü");
                txtArray.get(21).setText("M");
                txtArray.get(29).setText("İ");
                txtArray.get(37).setText("T");
                btnUx.setEnabled(true);
                btnM.setEnabled(true);
                btnIx.setEnabled(true);
                btnT.setEnabled(true);
                txtKelime.setText("");
                kontrol3++;
            }
            else{
                Toast.makeText(getApplicationContext(),"TEKRAR DENE !", Toast.LENGTH_LONG).show();
            }
            //Toast.makeText(getApplicationContext(), "k1: "+kontrol1+" k2: "+kontrol2, Toast.LENGTH_LONG).show();
            if(kontrol1 != 0 && kontrol2 != 0 && kontrol3 != 0){
                seviye = 4 ;
                kontrol1=0;
                kontrol2=0;
                kontrol3=0;
                editor.putInt("Score", score);
                editor.commit();
                gonderBtnTiklama =0;

                highScore += score;
                txtScore.setText("Score: "+Integer.toString(sharedPref.getInt("Score",0)));
                txtHigh.setText("HighScore: "+highScore);
                btnAtla.setVisibility(View.VISIBLE);
            }

        }
        if(seviye==4){
            gonderBtnTiklama++;
            score = high - (2*gonderBtnTiklama);
            if(txtKelime.getText().equals("RÜYA")){
                Toast.makeText(getApplicationContext(), "Tebrikler", Toast.LENGTH_LONG).show();
                txtArray.get(26).setText("R");
                txtArray.get(27).setText("Ü");
                txtArray.get(28).setText("Y");
                txtArray.get(29).setText("A");

                btnR.setEnabled(true);
                btnUx.setEnabled(true);
                btnY.setEnabled(true);
                btnA.setEnabled(true);
                txtKelime.setText("");
                kontrol1++;
            }
            else if(txtKelime.getText().equals("AYAR")){
                Toast.makeText(getApplicationContext(), "Tebrikler", Toast.LENGTH_LONG).show();
                txtArray.get(2).setText("A");
                txtArray.get(10).setText("Y");
                txtArray.get(18).setText("A");
                txtArray.get(26).setText("R");

                btnA.setEnabled(true);
                btnY.setEnabled(true);
                btnR.setEnabled(true);
                txtKelime.setText("");
                kontrol2++;
            }
            else if(txtKelime.getText().equals("YAR")){
                Toast.makeText(getApplicationContext(), "Tebrikler", Toast.LENGTH_LONG).show();
                txtArray.get(10).setText("Y");
                txtArray.get(11).setText("A");
                txtArray.get(12).setText("R");

                btnY.setEnabled(true);
                btnA.setEnabled(true);
                btnR.setEnabled(true);
                txtKelime.setText("");
                kontrol3++;
            }
            else if(txtKelime.getText().equals("RAY")){
                Toast.makeText(getApplicationContext(), "Tebrikler", Toast.LENGTH_LONG).show();
                txtArray.get(12).setText("R");
                txtArray.get(20).setText("A");
                txtArray.get(28).setText("Y");

                btnY.setEnabled(true);
                btnA.setEnabled(true);
                btnR.setEnabled(true);
                txtKelime.setText("");
                kontrol4++;
            }
            else{
                Toast.makeText(getApplicationContext(),"TEKRAR DENE !", Toast.LENGTH_LONG).show();
            }
            //Toast.makeText(getApplicationContext(), "k1: "+kontrol1+" k2: "+kontrol2, Toast.LENGTH_LONG).show();
            if(kontrol1 != 0 && kontrol2 != 0 && kontrol3 != 0 && kontrol4 != 0){
                seviye = 5 ;
                kontrol1=0;
                kontrol2=0;
                kontrol3=0;
                kontrol4=0;
                editor.putInt("Score", score);
                editor.commit();
                gonderBtnTiklama =0;

                highScore += score;
                txtScore.setText("Score: "+Integer.toString(sharedPref.getInt("Score",0)));
                txtHigh.setText("HighScore: "+highScore);
                btnAtla.setVisibility(View.VISIBLE);
            }

        }
        if(seviye==5){
            gonderBtnTiklama++;
            score = high - (2*gonderBtnTiklama);
            if(txtKelime.getText().equals("BİNA")){
                Toast.makeText(getApplicationContext(), "Tebrikler", Toast.LENGTH_LONG).show();
                txtArray.get(10).setText("B");
                txtArray.get(11).setText("İ");
                txtArray.get(12).setText("N");
                txtArray.get(13).setText("A");

                btnB.setEnabled(true);
                btnIx.setEnabled(true);
                btnN.setEnabled(true);
                btnA.setEnabled(true);
                txtKelime.setText("");
                kontrol1++;
            }
            else if(txtKelime.getText().equals("BİN")){
                Toast.makeText(getApplicationContext(), "Tebrikler", Toast.LENGTH_LONG).show();
                txtArray.get(28).setText("B");
                txtArray.get(29).setText("İ");
                txtArray.get(30).setText("N");

                btnB.setEnabled(true);
                btnIx.setEnabled(true);
                btnN.setEnabled(true);
                txtKelime.setText("");
                kontrol2++;
            }
            else if(txtKelime.getText().equals("ABİ")){
                Toast.makeText(getApplicationContext(), "Tebrikler", Toast.LENGTH_LONG).show();
                txtArray.get(2).setText("A");
                txtArray.get(10).setText("B");
                txtArray.get(18).setText("İ");

                btnB.setEnabled(true);
                btnA.setEnabled(true);
                btnIx.setEnabled(true);
                txtKelime.setText("");
                kontrol3++;
            }
            else if(txtKelime.getText().equals("ANİ")){
                Toast.makeText(getApplicationContext(), "Tebrikler", Toast.LENGTH_LONG).show();
                txtArray.get(13).setText("A");
                txtArray.get(21).setText("N");
                txtArray.get(29).setText("İ");

                btnA.setEnabled(true);
                btnN.setEnabled(true);
                btnIx.setEnabled(true);
                txtKelime.setText("");
                kontrol4++;
            }
            else{
                Toast.makeText(getApplicationContext(),"TEKRAR DENE !", Toast.LENGTH_LONG).show();
            }
            //Toast.makeText(getApplicationContext(), "k1: "+kontrol1+" k2: "+kontrol2, Toast.LENGTH_LONG).show();
            if(kontrol1 != 0 && kontrol2 != 0 && kontrol3 != 0 && kontrol4 != 0){
                seviye = 6 ;
                kontrol1=0;
                kontrol2=0;
                kontrol3=0;
                kontrol4=0;
                editor.putInt("Score", score);
                editor.commit();
                gonderBtnTiklama =0;

                highScore += score;
                txtScore.setText("Score: "+Integer.toString(sharedPref.getInt("Score",0)));
                txtHigh.setText("HighScore: "+highScore);
                btnAtla.setVisibility(View.VISIBLE);
            }

        }
        if(seviye==6){
            gonderBtnTiklama++;
            score = high - (2*gonderBtnTiklama);
            if(txtKelime.getText().equals("MODA")){
                Toast.makeText(getApplicationContext(), "Tebrikler", Toast.LENGTH_LONG).show();
                txtArray.get(3).setText("M");
                txtArray.get(4).setText("O");
                txtArray.get(5).setText("D");
                txtArray.get(6).setText("A");

                btnM.setEnabled(true);
                btnD.setEnabled(true);
                btnO.setEnabled(true);
                btnA.setEnabled(true);
                txtKelime.setText("");
                kontrol1++;
            }
            else if(txtKelime.getText().equals("ODA")){
                Toast.makeText(getApplicationContext(), "Tebrikler", Toast.LENGTH_LONG).show();
                txtArray.get(4).setText("O");
                txtArray.get(12).setText("D");
                txtArray.get(20).setText("A");

                btnA.setEnabled(true);
                btnO.setEnabled(true);
                btnD.setEnabled(true);
                txtKelime.setText("");
                kontrol2++;
            }
            else if(txtKelime.getText().equals("DAM")){
                Toast.makeText(getApplicationContext(), "Tebrikler", Toast.LENGTH_LONG).show();
                txtArray.get(19).setText("D");
                txtArray.get(20).setText("A");
                txtArray.get(21).setText("M");

                btnD.setEnabled(true);
                btnA.setEnabled(true);
                btnM.setEnabled(true);
                txtKelime.setText("");
                kontrol3++;
            }

            else{
                Toast.makeText(getApplicationContext(),"TEKRAR DENE !", Toast.LENGTH_LONG).show();
            }
            if(kontrol1 != 0 && kontrol2 != 0 && kontrol3 != 0){
                seviye = 7 ;
                kontrol1=0;
                kontrol2=0;
                kontrol3=0;
                kontrol4=0;
                editor.putInt("Score", score);
                editor.commit();
                gonderBtnTiklama =0;

                highScore += score;
                txtScore.setText("Score: "+Integer.toString(sharedPref.getInt("Score",0)));
                txtHigh.setText("HighScore: "+highScore);
                btnAtla.setVisibility(View.VISIBLE);
            }

        }
        if(seviye==7){
            gonderBtnTiklama++;
            score = high - (2*gonderBtnTiklama);
            if(txtKelime.getText().equals("İLÇE")){
                Toast.makeText(getApplicationContext(), "Tebrikler", Toast.LENGTH_LONG).show();
                txtArray.get(2).setText("İ");
                txtArray.get(10).setText("L");
                txtArray.get(18).setText("Ç");
                txtArray.get(26).setText("E");

                btnCx.setEnabled(true);
                btnIx.setEnabled(true);
                btnL.setEnabled(true);
                btnE.setEnabled(true);
                txtKelime.setText("");
                kontrol1++;
            }
            else if(txtKelime.getText().equals("ELÇİ")){
                Toast.makeText(getApplicationContext(), "Tebrikler", Toast.LENGTH_LONG).show();
                txtArray.get(12).setText("E");
                txtArray.get(20).setText("L");
                txtArray.get(28).setText("Ç");
                txtArray.get(36).setText("İ");

                btnCx.setEnabled(true);
                btnIx.setEnabled(true);
                btnL.setEnabled(true);
                btnE.setEnabled(true);
                txtKelime.setText("");
                kontrol2++;
            }
            else if(txtKelime.getText().equals("ÇİL")){
                Toast.makeText(getApplicationContext(), "Tebrikler", Toast.LENGTH_LONG).show();
                txtArray.get(35).setText("Ç");
                txtArray.get(36).setText("İ");
                txtArray.get(37).setText("L");

                btnCx.setEnabled(true);
                btnL.setEnabled(true);
                btnIx.setEnabled(true);
                txtKelime.setText("");
                kontrol3++;
            }
            else if(txtKelime.getText().equals("ÇİLE")){
                Toast.makeText(getApplicationContext(), "Tebrikler", Toast.LENGTH_LONG).show();
                txtArray.get(18).setText("Ç");
                txtArray.get(19).setText("İ");
                txtArray.get(20).setText("L");
                txtArray.get(21).setText("E");

                btnCx.setEnabled(true);
                btnIx.setEnabled(true);
                btnL.setEnabled(true);
                btnE.setEnabled(true);
                txtKelime.setText("");
                kontrol4++;
            }
            else {
                Toast.makeText(getApplicationContext(),"TEKRAR DENE !", Toast.LENGTH_LONG).show();
            }
            if(kontrol1 != 0 && kontrol2 != 0 && kontrol3 != 0 && kontrol4 != 0){
                seviye = 8 ;
                kontrol1=0;
                kontrol2=0;
                kontrol3=0;
                kontrol4=0;
                editor.putInt("Score", score);
                editor.commit();
                gonderBtnTiklama =0;

                highScore += score;
                txtScore.setText("Score: "+Integer.toString(sharedPref.getInt("Score",0)));
                txtHigh.setText("HighScore: "+highScore);
                btnAtla.setVisibility(View.VISIBLE);
            }

        }
        if(seviye==8){ // CEZA, ECZA, EZA, CAZ
            gonderBtnTiklama++;
            score = high - (2*gonderBtnTiklama);

            if(txtKelime.getText().equals("CEZA")){
                Toast.makeText(getApplicationContext(), "Tebrikler", Toast.LENGTH_LONG).show();
                txtArray.get(3).setText("C");
                txtArray.get(11).setText("E");
                txtArray.get(19).setText("Z");
                txtArray.get(27).setText("A");

                btnC.setEnabled(true);
                btnE.setEnabled(true);
                btnZ.setEnabled(true);
                btnA.setEnabled(true);
                txtKelime.setText("");
                kontrol1++;
            }
            else if(txtKelime.getText().equals("ECZA")){
                Toast.makeText(getApplicationContext(), "Tebrikler", Toast.LENGTH_LONG).show();
                txtArray.get(11).setText("E");
                txtArray.get(12).setText("C");
                txtArray.get(13).setText("Z");
                txtArray.get(14).setText("A");

                btnC.setEnabled(true);
                btnE.setEnabled(true);
                btnZ.setEnabled(true);
                btnA.setEnabled(true);
                txtKelime.setText("");
                kontrol2++;
            }
            else if(txtKelime.getText().equals("CAZ")){
                Toast.makeText(getApplicationContext(), "Tebrikler", Toast.LENGTH_LONG).show();
                txtArray.get(26).setText("C");
                txtArray.get(27).setText("A");
                txtArray.get(28).setText("Z");

                btnC.setEnabled(true);
                btnE.setEnabled(true);
                btnZ.setEnabled(true);
                btnA.setEnabled(true);
                txtKelime.setText("");
                kontrol3++;
            }
            else if(txtKelime.getText().equals("EZA")){
                Toast.makeText(getApplicationContext(), "Tebrikler", Toast.LENGTH_LONG).show();

                txtArray.get(5).setText("E");
                txtArray.get(13).setText("Z");
                txtArray.get(21).setText("A");

                btnC.setEnabled(true);
                btnE.setEnabled(true);
                btnZ.setEnabled(true);
                btnA.setEnabled(true);
                txtKelime.setText("");
                kontrol4++;
            }
            else {
                Toast.makeText(getApplicationContext(),"TEKRAR DENE !", Toast.LENGTH_LONG).show();
            }
            //Toast.makeText(getApplicationContext(), "k1: "+kontrol1+" k2: "+kontrol2, Toast.LENGTH_LONG).show();
            if(kontrol1 != 0 && kontrol2 != 0 && kontrol3 != 0 && kontrol4 != 0){
                seviye = 9 ;
                kontrol1=0;
                kontrol2=0;
                kontrol3=0;
                kontrol4=0;
                editor.putInt("Score", score);
                editor.commit();
                gonderBtnTiklama =0;

                highScore += score;
                txtScore.setText("Score: "+Integer.toString(sharedPref.getInt("Score",0)));
                txtHigh.setText("HighScore: "+highScore);
                btnAtla.setVisibility(View.VISIBLE);
            }
        }
        if(seviye==9){ // KITA, TAKI, KATI, ATIK
            gonderBtnTiklama++;
            score = high - (2*gonderBtnTiklama);
            if(txtKelime.getText().equals("KITA")){
                Toast.makeText(getApplicationContext(), "Tebrikler", Toast.LENGTH_LONG).show();
                txtArray.get(3).setText("K");
                txtArray.get(11).setText("I");
                txtArray.get(19).setText("T");
                txtArray.get(27).setText("A");

                btnK.setEnabled(true);
                btnI.setEnabled(true);
                btnT.setEnabled(true);
                btnA.setEnabled(true);
                txtKelime.setText("");
                kontrol1++;
            }
            else if(txtKelime.getText().equals("KATI")){
                Toast.makeText(getApplicationContext(), "Tebrikler", Toast.LENGTH_LONG).show();
                txtArray.get(3).setText("K");
                txtArray.get(4).setText("A");
                txtArray.get(5).setText("T");
                txtArray.get(6).setText("I");

                btnK.setEnabled(true);
                btnI.setEnabled(true);
                btnT.setEnabled(true);
                btnA.setEnabled(true);
                txtKelime.setText("");
                kontrol2++;
            }
            else if(txtKelime.getText().equals("ATIK")){
                Toast.makeText(getApplicationContext(), "Tebrikler", Toast.LENGTH_LONG).show();
                txtArray.get(18).setText("A");
                txtArray.get(19).setText("T");
                txtArray.get(20).setText("I");
                txtArray.get(21).setText("K");

                btnK.setEnabled(true);
                btnI.setEnabled(true);
                btnT.setEnabled(true);
                btnA.setEnabled(true);
                txtKelime.setText("");
                kontrol3++;
            }
            else if(txtKelime.getText().equals("TAKI")){
                Toast.makeText(getApplicationContext(), "Tebrikler", Toast.LENGTH_LONG).show();

                txtArray.get(5).setText("T");
                txtArray.get(13).setText("A");
                txtArray.get(21).setText("K");
                txtArray.get(29).setText("I");

                btnK.setEnabled(true);
                btnI.setEnabled(true);
                btnT.setEnabled(true);
                btnA.setEnabled(true);
                txtKelime.setText("");
                kontrol4++;
            }
            else {
                Toast.makeText(getApplicationContext(),"TEKRAR DENE !", Toast.LENGTH_LONG).show();
            }
            if(kontrol1 != 0 && kontrol2 != 0 && kontrol3 != 0 && kontrol4 != 0){
                seviye = 10 ;
                kontrol1=0;
                kontrol2=0;
                kontrol3=0;
                kontrol4=0;
                editor.putInt("Score", score);
                editor.commit();
                gonderBtnTiklama =0;

                highScore += score;
                txtScore.setText("Score: "+Integer.toString(sharedPref.getInt("Score",0)));
                txtHigh.setText("HighScore: "+highScore);
                btnAtla.setVisibility(View.VISIBLE);
            }

        }

        if(seviye==10){ // DAM, DAMA, ADAM, ADA
            gonderBtnTiklama++;
            score = high - (2*gonderBtnTiklama);

            if(txtKelime.getText().equals("DAMA")){
                Toast.makeText(getApplicationContext(), "Tebrikler", Toast.LENGTH_LONG).show();
                txtArray.get(2).setText("D");
                txtArray.get(10).setText("A");
                txtArray.get(18).setText("M");
                txtArray.get(26).setText("A");

                btnD.setEnabled(true);
                btnM.setEnabled(true);
                btnA.setEnabled(true);
                txtKelime.setText("");
                kontrol1++;
            }
            else if(txtKelime.getText().equals("ADAM")){
                Toast.makeText(getApplicationContext(), "Tebrikler", Toast.LENGTH_LONG).show();
                txtArray.get(26).setText("A");
                txtArray.get(27).setText("D");
                txtArray.get(28).setText("A");
                txtArray.get(29).setText("M");

                btnD.setEnabled(true);
                btnM.setEnabled(true);
                btnA.setEnabled(true);
                txtKelime.setText("");
                kontrol2++;
            }
            else if(txtKelime.getText().equals("DAM")){
                Toast.makeText(getApplicationContext(), "Tebrikler", Toast.LENGTH_LONG).show();
                txtArray.get(2).setText("D");
                txtArray.get(3).setText("A");
                txtArray.get(4).setText("M");

                btnD.setEnabled(true);
                btnM.setEnabled(true);
                btnA.setEnabled(true);
                txtKelime.setText("");
                kontrol3++;
            }
            else if(txtKelime.getText().equals("ADA")){
                Toast.makeText(getApplicationContext(), "Tebrikler", Toast.LENGTH_LONG).show();

                txtArray.get(28).setText("A");
                txtArray.get(36).setText("D");
                txtArray.get(44).setText("A");

                btnD.setEnabled(true);
                btnM.setEnabled(true);
                btnA.setEnabled(true);
                txtKelime.setText("");
                kontrol4++;
            }
            else {
                Toast.makeText(getApplicationContext(),"TEKRAR DENE !", Toast.LENGTH_LONG).show();
            }
            if(kontrol1 != 0 && kontrol2 != 0 && kontrol3 != 0 && kontrol4 != 0){
                seviye = 11 ;
                kontrol1=0;
                kontrol2=0;
                kontrol3=0;
                kontrol4=0;
                editor.putInt("Score", score);
                editor.commit();
                gonderBtnTiklama =0;

                highScore += score;
                txtScore.setText("Score: "+Integer.toString(sharedPref.getInt("Score",0)));
                txtHigh.setText("HighScore: "+highScore);
                btnAtla.setVisibility(View.VISIBLE);
            }

        }
        if(seviye==11){
            gonderBtnTiklama++;
            score = high - (2*gonderBtnTiklama);
            if(txtKelime.getText().equals("YAPI")){
                Toast.makeText(getApplicationContext(), "Tebrikler", Toast.LENGTH_LONG).show();
                txtArray.get(2).setText("Y");
                txtArray.get(3).setText("A");
                txtArray.get(4).setText("P");
                txtArray.get(5).setText("I");

                btnY.setEnabled(true);
                btnP.setEnabled(true);
                btnA.setEnabled(true);
                btnI.setEnabled(true);
                txtKelime.setText("");
                kontrol1++;
            }
            else if(txtKelime.getText().equals("AYIP")){
                Toast.makeText(getApplicationContext(), "Tebrikler", Toast.LENGTH_LONG).show();
                txtArray.get(3).setText("A");
                txtArray.get(11).setText("Y");
                txtArray.get(19).setText("I");
                txtArray.get(27).setText("P");

                btnY.setEnabled(true);
                btnP.setEnabled(true);
                btnA.setEnabled(true);
                btnI.setEnabled(true);
                txtKelime.setText("");
                kontrol2++;
            }
            else if(txtKelime.getText().equals("AYI")){
                Toast.makeText(getApplicationContext(), "Tebrikler", Toast.LENGTH_LONG).show();
                txtArray.get(21).setText("A");
                txtArray.get(29).setText("Y");
                txtArray.get(37).setText("I");

                btnY.setEnabled(true);
                btnA.setEnabled(true);
                btnI.setEnabled(true);
                txtKelime.setText("");
                kontrol3++;
            }
            else if(txtKelime.getText().equals("PAY")){
                Toast.makeText(getApplicationContext(), "Tebrikler", Toast.LENGTH_LONG).show();
                txtArray.get(27).setText("P");
                txtArray.get(28).setText("A");
                txtArray.get(29).setText("Y");

                btnY.setEnabled(true);
                btnP.setEnabled(true);
                btnA.setEnabled(true);
                txtKelime.setText("");
                kontrol4++;
            }
            else {
                Toast.makeText(getApplicationContext(),"TEKRAR DENE !", Toast.LENGTH_LONG).show();
            }
            if(kontrol1 != 0 && kontrol2 != 0 && kontrol3 != 0 && kontrol4 != 0){
                seviye = 12 ;
                kontrol1=0;
                kontrol2=0;
                kontrol3=0;
                kontrol4=0;
                editor.putInt("Score", score);
                editor.commit();
                gonderBtnTiklama =0;

                highScore += score;
                txtScore.setText("Score: "+Integer.toString(sharedPref.getInt("Score",0)));
                txtHigh.setText("HighScore: "+highScore);
                btnAtla.setVisibility(View.VISIBLE);
            }

        }
        if(seviye==12){ //BOYA, BOY, OBA, BAY, OYA
            gonderBtnTiklama++;
            score = high - (2*gonderBtnTiklama);
            if(txtKelime.getText().equals("BOYA")){
                Toast.makeText(getApplicationContext(), "Tebrikler", Toast.LENGTH_LONG).show();
                txtArray.get(11).setText("B");
                txtArray.get(19).setText("O");
                txtArray.get(27).setText("Y");
                txtArray.get(35).setText("A");

                btnB.setEnabled(true);
                btnO.setEnabled(true);
                btnY.setEnabled(true);
                btnA.setEnabled(true);
                txtKelime.setText("");
                kontrol1++;
            }
            else if(txtKelime.getText().equals("OBA")){
                Toast.makeText(getApplicationContext(), "Tebrikler", Toast.LENGTH_LONG).show();
                txtArray.get(5).setText("O");
                txtArray.get(13).setText("B");
                txtArray.get(21).setText("A");

                btnO.setEnabled(true);
                btnB.setEnabled(true);
                btnA.setEnabled(true);
                txtKelime.setText("");
                kontrol2++;
            }
            else if(txtKelime.getText().equals("OYA")){
                Toast.makeText(getApplicationContext(), "Tebrikler", Toast.LENGTH_LONG).show();
                txtArray.get(19).setText("O");
                txtArray.get(20).setText("Y");
                txtArray.get(21).setText("A");

                btnY.setEnabled(true);
                btnA.setEnabled(true);
                btnO.setEnabled(true);
                txtKelime.setText("");
                kontrol3++;
            }
            else if(txtKelime.getText().equals("BOY")){
                Toast.makeText(getApplicationContext(), "Tebrikler", Toast.LENGTH_LONG).show();
                txtArray.get(13).setText("B");
                txtArray.get(14).setText("O");
                txtArray.get(15).setText("Y");

                btnY.setEnabled(true);
                btnB.setEnabled(true);
                btnO.setEnabled(true);
                txtKelime.setText("");
                kontrol4++;
            }
            else if(txtKelime.getText().equals("BAY")){
                Toast.makeText(getApplicationContext(), "Tebrikler", Toast.LENGTH_LONG).show();
                txtArray.get(34).setText("B");
                txtArray.get(35).setText("A");
                txtArray.get(36).setText("Y");

                btnY.setEnabled(true);
                btnB.setEnabled(true);
                btnA.setEnabled(true);
                txtKelime.setText("");
                kontrol5++;
            }
            else {
                Toast.makeText(getApplicationContext(),"TEKRAR DENE !", Toast.LENGTH_LONG).show();
            }
            if(kontrol1 != 0 && kontrol2 != 0 && kontrol3 != 0 && kontrol4 != 0 && kontrol5 != 0){
                seviye = 13;
                kontrol1=0;
                kontrol2=0;
                kontrol3=0;
                kontrol4=0;
                kontrol5=0;
                editor.putInt("Score", score);
                editor.commit();
                gonderBtnTiklama =0;

                highScore += score;
                txtScore.setText("Score: "+Integer.toString(sharedPref.getInt("Score",0)));
                txtHigh.setText("HighScore: "+highScore);
                btnAtla.setVisibility(View.VISIBLE);
            }

        }
        if(seviye==13){
            gonderBtnTiklama++;
            score = high - (2*gonderBtnTiklama);
            if(txtKelime.getText().equals("SÖĞÜT")){
                Toast.makeText(getApplicationContext(), "Tebrikler", Toast.LENGTH_LONG).show();
                txtArray.get(2).setText("S");
                txtArray.get(3).setText("Ö");
                txtArray.get(4).setText("Ğ");
                txtArray.get(5).setText("Ü");
                txtArray.get(6).setText("T");

                btnS.setEnabled(true);
                btnOx.setEnabled(true);
                btnGx.setEnabled(true);
                btnUx.setEnabled(true);
                btnT.setEnabled(true);
                txtKelime.setText("");
                kontrol1++;
            }
            else if(txtKelime.getText().equals("ÖĞÜT")){
                Toast.makeText(getApplicationContext(), "Tebrikler", Toast.LENGTH_LONG).show();
                txtArray.get(3).setText("Ö");
                txtArray.get(11).setText("Ğ");
                txtArray.get(19).setText("Ü");
                txtArray.get(27).setText("T");

                btnS.setEnabled(true);
                btnOx.setEnabled(true);
                btnGx.setEnabled(true);
                btnUx.setEnabled(true);
                btnT.setEnabled(true);
                txtKelime.setText("");
                kontrol2++;
            }
            else if(txtKelime.getText().equals("SÜT")){
                Toast.makeText(getApplicationContext(), "Tebrikler", Toast.LENGTH_LONG).show();
                txtArray.get(18).setText("S");
                txtArray.get(19).setText("Ü");
                txtArray.get(20).setText("T");

                btnS.setEnabled(true);
                btnOx.setEnabled(true);
                btnGx.setEnabled(true);
                btnUx.setEnabled(true);
                btnT.setEnabled(true);
                txtKelime.setText("");
                kontrol3++;
            }

            else {
                Toast.makeText(getApplicationContext(),"TEKRAR DENE !", Toast.LENGTH_LONG).show();
            }
            if(kontrol1 != 0 && kontrol2 != 0 && kontrol3 != 0 ){
                seviye = 14 ;
                kontrol1=0;
                kontrol2=0;
                kontrol3=0;
                kontrol4=0;
                editor.putInt("Score", score);
                editor.commit();
                gonderBtnTiklama =0;

                highScore += score;
                txtScore.setText("Score: "+Integer.toString(sharedPref.getInt("Score",0)));
                txtHigh.setText("HighScore: "+highScore);
                btnAtla.setVisibility(View.VISIBLE);
            }

        }
        if(seviye==14){ // KÖPEK, KEK, PEK, KÖK
            gonderBtnTiklama++;
            score = high - (2*gonderBtnTiklama);

            if(txtKelime.getText().equals("KÖPEK")){
                Toast.makeText(getApplicationContext(), "Tebrikler", Toast.LENGTH_LONG).show();
                txtArray.get(18).setText("K");
                txtArray.get(19).setText("Ö");
                txtArray.get(20).setText("P");
                txtArray.get(21).setText("E");
                txtArray.get(22).setText("K");

                btnK.setEnabled(true);
                btnOx.setEnabled(true);
                btnP.setEnabled(true);
                btnE.setEnabled(true);
                txtKelime.setText("");
                kontrol1++;
            }
            else if(txtKelime.getText().equals("KÖK")){
                Toast.makeText(getApplicationContext(), "Tebrikler", Toast.LENGTH_LONG).show();
                txtArray.get(22).setText("K");
                txtArray.get(30).setText("Ö");
                txtArray.get(38).setText("K");

                btnK.setEnabled(true);
                btnOx.setEnabled(true);
                btnE.setEnabled(true);
                txtKelime.setText("");
                kontrol2++;
            }
            else if(txtKelime.getText().equals("KEK")){
                Toast.makeText(getApplicationContext(), "Tebrikler", Toast.LENGTH_LONG).show();
                txtArray.get(2).setText("K");
                txtArray.get(10).setText("E");
                txtArray.get(18).setText("K");

                btnK.setEnabled(true);
                btnE.setEnabled(true);
                txtKelime.setText("");
                kontrol3++;
            }
            else if(txtKelime.getText().equals("PEK")){
                Toast.makeText(getApplicationContext(), "Tebrikler", Toast.LENGTH_LONG).show();
                txtArray.get(20).setText("P");
                txtArray.get(28).setText("E");
                txtArray.get(36).setText("K");

                btnK.setEnabled(true);
                btnP.setEnabled(true);
                btnE.setEnabled(true);
                txtKelime.setText("");
                kontrol4++;
            }

            else {
                Toast.makeText(getApplicationContext(),"TEKRAR DENE !", Toast.LENGTH_LONG).show();
            }
            if(kontrol1 != 0 && kontrol2 != 0 && kontrol3 != 0 && kontrol4 != 0 ){
                seviye = 15;
                kontrol1=0;
                kontrol2=0;
                kontrol3=0;
                kontrol4=0;
                editor.putInt("Score", score);
                editor.commit();
                gonderBtnTiklama =0;

                highScore += score;
                txtScore.setText("Score: "+Integer.toString(sharedPref.getInt("Score",0)));
                txtHigh.setText("HighScore: "+highScore);
                btnAtla.setVisibility(View.VISIBLE);
            }

        }
        if(seviye==15){ // BİTKİ, BİTİK, BİT, TİK
            gonderBtnTiklama++;
            score = high - (2*gonderBtnTiklama);
            if(txtKelime.getText().equals("BİTKİ")){
                Toast.makeText(getApplicationContext(), "Tebrikler", Toast.LENGTH_LONG).show();
                txtArray.get(10).setText("B");
                txtArray.get(11).setText("İ");
                txtArray.get(12).setText("T");
                txtArray.get(13).setText("K");
                txtArray.get(14).setText("İ");

                btnB.setEnabled(true);
                btnIx.setEnabled(true);
                btnT.setEnabled(true);
                btnK.setEnabled(true);
                txtKelime.setText("");
                kontrol1++;
            }
            else if(txtKelime.getText().equals("BİTİK")){
                Toast.makeText(getApplicationContext(), "Tebrikler", Toast.LENGTH_LONG).show();
                txtArray.get(3).setText("B");
                txtArray.get(11).setText("İ");
                txtArray.get(19).setText("T");
                txtArray.get(27).setText("İ");
                txtArray.get(35).setText("K");

                btnB.setEnabled(true);
                btnIx.setEnabled(true);
                btnT.setEnabled(true);
                btnK.setEnabled(true);
                txtKelime.setText("");
                kontrol2++;
            }
            else if(txtKelime.getText().equals("TİK")){
                Toast.makeText(getApplicationContext(), "Tebrikler", Toast.LENGTH_LONG).show();
                txtArray.get(33).setText("T");
                txtArray.get(34).setText("İ");
                txtArray.get(35).setText("K");

                btnT.setEnabled(true);
                btnIx.setEnabled(true);
                btnK.setEnabled(true);
                txtKelime.setText("");
                kontrol3++;
            }
            else if(txtKelime.getText().equals("BİT")){
                Toast.makeText(getApplicationContext(), "Tebrikler", Toast.LENGTH_LONG).show();
                txtArray.get(6).setText("B");
                txtArray.get(14).setText("İ");
                txtArray.get(22).setText("T");

                btnT.setEnabled(true);
                btnIx.setEnabled(true);
                btnK.setEnabled(true);
                txtKelime.setText("");
                kontrol4++;
            }

            else {
                Toast.makeText(getApplicationContext(),"TEKRAR DENE !", Toast.LENGTH_LONG).show();
            }
            if(kontrol1 != 0 && kontrol2 != 0 && kontrol3 != 0 && kontrol4 != 0 ){
                seviye = 16;
                kontrol1=0;
                kontrol2=0;
                kontrol3=0;
                kontrol4=0;
                editor.putInt("Score", score);
                editor.commit();
                gonderBtnTiklama =0;

                highScore += score;
                txtScore.setText("Score: "+Integer.toString(sharedPref.getInt("Score",0)));
                txtHigh.setText("HighScore: "+highScore);
                btnAtla.setVisibility(View.VISIBLE);
            }

        }
        if(seviye==16){ // MİLYON, İYON, LİMON, MİL, YOL,
            gonderBtnTiklama++;
            score = high - (2*gonderBtnTiklama);

            if(txtKelime.getText().equals("MİLYON")){
                Toast.makeText(getApplicationContext(), "Tebrikler", Toast.LENGTH_LONG).show();
                txtArray.get(3).setText("M");
                txtArray.get(11).setText("İ");
                txtArray.get(19).setText("L");
                txtArray.get(27).setText("Y");
                txtArray.get(35).setText("O");
                txtArray.get(43).setText("N");

                btnM.setEnabled(true);
                btnIx.setEnabled(true);
                btnL.setEnabled(true);
                btnY.setEnabled(true);
                btnO.setEnabled(true);
                btnN.setEnabled(true);
                txtKelime.setText("");
                kontrol1++;
            }
            else if(txtKelime.getText().equals("LİMON")){
                Toast.makeText(getApplicationContext(), "Tebrikler", Toast.LENGTH_LONG).show();
                txtArray.get(19).setText("L");
                txtArray.get(20).setText("İ");
                txtArray.get(21).setText("M");
                txtArray.get(22).setText("O");
                txtArray.get(23).setText("N");

                btnM.setEnabled(true);
                btnIx.setEnabled(true);
                btnL.setEnabled(true);
                btnY.setEnabled(true);
                btnO.setEnabled(true);
                btnN.setEnabled(true);
                txtKelime.setText("");
                kontrol2++;
            }
            else if(txtKelime.getText().equals("İYON")){
                Toast.makeText(getApplicationContext(), "Tebrikler", Toast.LENGTH_LONG).show();
                txtArray.get(6).setText("İ");
                txtArray.get(14).setText("Y");
                txtArray.get(22).setText("O");
                txtArray.get(30).setText("N");

                btnIx.setEnabled(true);
                btnY.setEnabled(true);
                btnO.setEnabled(true);
                btnN.setEnabled(true);
                txtKelime.setText("");
                kontrol3++;
            }
            else if(txtKelime.getText().equals("MİL")){
                Toast.makeText(getApplicationContext(), "Tebrikler", Toast.LENGTH_LONG).show();
                txtArray.get(5).setText("M");
                txtArray.get(6).setText("İ");
                txtArray.get(7).setText("L");

                btnM.setEnabled(true);
                btnIx.setEnabled(true);
                btnL.setEnabled(true);
                txtKelime.setText("");
                kontrol4++;
            }
            else if(txtKelime.getText().equals("YOL")){
                Toast.makeText(getApplicationContext(), "Tebrikler", Toast.LENGTH_LONG).show();
                txtArray.get(34).setText("Y");
                txtArray.get(35).setText("O");
                txtArray.get(36).setText("L");

                btnO.setEnabled(true);
                btnY.setEnabled(true);
                btnL.setEnabled(true);
                txtKelime.setText("");
                kontrol5++;
            }

            else {
                Toast.makeText(getApplicationContext(),"TEKRAR DENE !", Toast.LENGTH_LONG).show();
            }
            if(kontrol1 != 0 && kontrol2 != 0 && kontrol3 != 0 && kontrol4 != 0 && kontrol5 != 0 ){
                seviye = 17;
                kontrol1=0;
                kontrol2=0;
                kontrol3=0;
                kontrol4=0;
                kontrol5 =0;
                editor.putInt("Score", score);
                editor.commit();
                gonderBtnTiklama =0;

                highScore += score;
                txtScore.setText("Score: "+Integer.toString(sharedPref.getInt("Score",0)));
                txtHigh.setText("HighScore: "+highScore);
                btnAtla.setVisibility(View.VISIBLE);
            }

        }
        if(seviye==17){ // SORUN, SORU, ONUR, RUS, SON, SUR
            gonderBtnTiklama++;
            score = high - (2*gonderBtnTiklama);

            if(txtKelime.getText().equals("SORUN")){
                Toast.makeText(getApplicationContext(), "Tebrikler", Toast.LENGTH_LONG).show();
                txtArray.get(17).setText("S");
                txtArray.get(18).setText("O");
                txtArray.get(19).setText("R");
                txtArray.get(20).setText("U");
                txtArray.get(21).setText("N");

                btnS.setEnabled(true);
                btnO.setEnabled(true);
                btnR.setEnabled(true);
                btnU.setEnabled(true);
                btnN.setEnabled(true);
                txtKelime.setText("");
                kontrol1++;
            }
            else if(txtKelime.getText().equals("SORU")){
                Toast.makeText(getApplicationContext(), "Tebrikler", Toast.LENGTH_LONG).show();
                txtArray.get(3).setText("S");
                txtArray.get(11).setText("O");
                txtArray.get(19).setText("R");
                txtArray.get(27).setText("U");

                btnS.setEnabled(true);
                btnO.setEnabled(true);
                btnR.setEnabled(true);
                btnU.setEnabled(true);
                txtKelime.setText("");
                kontrol2++;
            }
            else if(txtKelime.getText().equals("ONUR")){
                Toast.makeText(getApplicationContext(), "Tebrikler", Toast.LENGTH_LONG).show();
                txtArray.get(13).setText("O");
                txtArray.get(21).setText("N");
                txtArray.get(29).setText("U");
                txtArray.get(37).setText("R");

                btnO.setEnabled(true);
                btnR.setEnabled(true);
                btnU.setEnabled(true);
                btnN.setEnabled(true);
                txtKelime.setText("");
                kontrol3++;
            }
            else if(txtKelime.getText().equals("SON")){
                Toast.makeText(getApplicationContext(), "Tebrikler", Toast.LENGTH_LONG).show();
                txtArray.get(17).setText("S");
                txtArray.get(25).setText("O");
                txtArray.get(33).setText("N");

                btnS.setEnabled(true);
                btnO.setEnabled(true);
                btnN.setEnabled(true);
                txtKelime.setText("");
                kontrol4++;
            }
            else if(txtKelime.getText().equals("RUS")){
                Toast.makeText(getApplicationContext(), "Tebrikler", Toast.LENGTH_LONG).show();
                txtArray.get(37).setText("R");
                txtArray.get(38).setText("U");
                txtArray.get(39).setText("S");

                btnR.setEnabled(true);
                btnU.setEnabled(true);
                btnS.setEnabled(true);
                txtKelime.setText("");
                kontrol5++;
            }
            else if(txtKelime.getText().equals("SUR")){
                Toast.makeText(getApplicationContext(), "Tebrikler", Toast.LENGTH_LONG).show();
                txtArray.get(39).setText("S");
                txtArray.get(47).setText("U");
                txtArray.get(55).setText("R");

                btnR.setEnabled(true);
                btnU.setEnabled(true);
                btnS.setEnabled(true);
                txtKelime.setText("");
                kontrol6++;
            }

            else {
                Toast.makeText(getApplicationContext(),"TEKRAR DENE !", Toast.LENGTH_LONG).show();
            }
            if(kontrol1 != 0 && kontrol2 != 0 && kontrol3 != 0 && kontrol4 != 0 && kontrol5 != 0 && kontrol6 !=0){
                seviye = 18;
                kontrol1=0;
                kontrol2=0;
                kontrol3=0;
                kontrol4=0;
                kontrol5 =0;
                kontrol6 =0;
                editor.putInt("Score", score);
                editor.commit();
                gonderBtnTiklama =0;

                highScore += score;
                txtScore.setText("Score: "+Integer.toString(sharedPref.getInt("Score",0)));
                txtHigh.setText("HighScore: "+highScore);
                btnAtla.setVisibility(View.VISIBLE);
            }

        }
        if(seviye==18){
            gonderBtnTiklama++;
            score = high - (2*gonderBtnTiklama);

            if(txtKelime.getText().equals("ARİTMİ")){
                Toast.makeText(getApplicationContext(), "Tebrikler", Toast.LENGTH_LONG).show();
                txtArray.get(10).setText("A");
                txtArray.get(18).setText("R");
                txtArray.get(26).setText("İ");
                txtArray.get(34).setText("T");
                txtArray.get(42).setText("M");
                txtArray.get(50).setText("İ");

                btnA.setEnabled(true);
                btnIx.setEnabled(true);
                btnR.setEnabled(true);
                btnT.setEnabled(true);
                btnM.setEnabled(true);
                txtKelime.setText("");
                kontrol1++;
            }
            else if(txtKelime.getText().equals("RİTİM")){
                Toast.makeText(getApplicationContext(), "Tebrikler", Toast.LENGTH_LONG).show();
                txtArray.get(13).setText("R");
                txtArray.get(21).setText("İ");
                txtArray.get(29).setText("T");
                txtArray.get(37).setText("İ");
                txtArray.get(45).setText("M");

                btnIx.setEnabled(true);
                btnR.setEnabled(true);
                btnT.setEnabled(true);
                btnM.setEnabled(true);
                txtKelime.setText("");
                kontrol2++;
            }

            else if(txtKelime.getText().equals("TAMİR")){
                Toast.makeText(getApplicationContext(), "Tebrikler", Toast.LENGTH_LONG).show();
                txtArray.get(9).setText("T");
                txtArray.get(10).setText("A");
                txtArray.get(11).setText("M");
                txtArray.get(12).setText("İ");
                txtArray.get(13).setText("R");

                btnT.setEnabled(true);
                btnA.setEnabled(true);
                btnM.setEnabled(true);
                btnIx.setEnabled(true);
                btnR.setEnabled(true);
                txtKelime.setText("");
                kontrol3++;
            }
            else if(txtKelime.getText().equals("İRİ")){
                Toast.makeText(getApplicationContext(), "Tebrikler", Toast.LENGTH_LONG).show();
                txtArray.get(24).setText("İ");
                txtArray.get(25).setText("R");
                txtArray.get(26).setText("İ");

                btnR.setEnabled(true);
                btnIx.setEnabled(true);
                txtKelime.setText("");
                kontrol4++;
            }
            else if(txtKelime.getText().equals("AMİR")){
                Toast.makeText(getApplicationContext(), "Tebrikler", Toast.LENGTH_LONG).show();
                txtArray.get(48).setText("A");
                txtArray.get(49).setText("M");
                txtArray.get(50).setText("İ");
                txtArray.get(51).setText("R");

                btnR.setEnabled(true);
                btnA.setEnabled(true);
                btnIx.setEnabled(true);
                btnM.setEnabled(true);
                txtKelime.setText("");
                kontrol5++;
            }

            else {
                Toast.makeText(getApplicationContext(),"TEKRAR DENE !", Toast.LENGTH_LONG).show();
            }
            if(kontrol1 != 0 && kontrol2 != 0 && kontrol3 != 0 && kontrol4 != 0 && kontrol5 != 0 ){
                seviye = 100;
                kontrol1=0;
                kontrol2=0;
                kontrol3=0;
                kontrol4=0;
                kontrol5 =0;
                kontrol6 =0;
                editor.putInt("Score", score);
                editor.commit();
                gonderBtnTiklama =0;

                highScore += score;
                txtScore.setText("Score: "+Integer.toString(sharedPref.getInt("Score",0)));
                txtHigh.setText("HighScore: "+highScore);
                btnAtla.setVisibility(View.VISIBLE);
                btnAtla.setText("BİTİR");
            }

        }
    }
    public void btnA(View v){
        kelime = txtKelime.getText().toString();
        txtKelime.setText(kelime+"A");
        kelime = txtKelime.getText().toString();
        //btnA.setEnabled(false);
    }
    public void btnM(View v){
        kelime = txtKelime.getText().toString();
        txtKelime.setText(kelime+"M");
        kelime = txtKelime.getText().toString();
        //btnM.setEnabled(false);
    }
    public void btnCx(View v){
        kelime = txtKelime.getText().toString();
        txtKelime.setText(kelime+"Ç");
        kelime = txtKelime.getText().toString();
        //btnCx.setEnabled(false);
    }
    public void btnB(View v){
        kelime = txtKelime.getText().toString();
        txtKelime.setText(kelime+"B");
        kelime = txtKelime.getText().toString();
        //btnB.setEnabled(false);
    }
    public void btnC(View v){
        kelime = txtKelime.getText().toString();
        txtKelime.setText(kelime+"C");
        kelime = txtKelime.getText().toString();
        //btnC.setEnabled(false);
    }
    public void btnD(View v){
        kelime = txtKelime.getText().toString();
        txtKelime.setText(kelime+"D");
        kelime = txtKelime.getText().toString();
        //btnD.setEnabled(false);
    }
    public void btnE(View v){
        kelime = txtKelime.getText().toString();
        txtKelime.setText(kelime+"E");
        kelime = txtKelime.getText().toString();
        //btnE.setEnabled(false);
    }
    public void btnF(View v){
        kelime = txtKelime.getText().toString();
        txtKelime.setText(kelime+"F");
        kelime = txtKelime.getText().toString();
        //btnF.setEnabled(false);
    }
    public void btnG(View v){
        kelime = txtKelime.getText().toString();
        txtKelime.setText(kelime+"G");
        kelime = txtKelime.getText().toString();
        //btnG.setEnabled(false);
    }
    public void btnGx(View v){
        kelime = txtKelime.getText().toString();
        txtKelime.setText(kelime+"Ğ");
        kelime = txtKelime.getText().toString();
        //btnGx.setEnabled(false);
    }
    public void btnH(View v){
        kelime = txtKelime.getText().toString();
        txtKelime.setText(kelime+"H");
        kelime = txtKelime.getText().toString();
        //btnH.setEnabled(false);
    }
    public void btnI(View v){
        kelime = txtKelime.getText().toString();
        txtKelime.setText(kelime+"I");
        kelime = txtKelime.getText().toString();
        //btnI.setEnabled(false);
    }
    public void btnIx(View v){
        kelime = txtKelime.getText().toString();
        txtKelime.setText(kelime+"İ");
        kelime = txtKelime.getText().toString();
        //btnIx.setEnabled(false);
    }
    public void btnJ(View v){
        kelime = txtKelime.getText().toString();
        txtKelime.setText(kelime+"J");
        kelime = txtKelime.getText().toString();
        //btnJ.setEnabled(false);
    }
    public void btnK(View v){
        kelime = txtKelime.getText().toString();
        txtKelime.setText(kelime+"K");
        kelime = txtKelime.getText().toString();
        //btnK.setEnabled(false);
    }
    public void btnL(View v){
        kelime = txtKelime.getText().toString();
        txtKelime.setText(kelime+"L");
        kelime = txtKelime.getText().toString();
        //btnL.setEnabled(false);
    }
    public void btnN(View v){
        kelime = txtKelime.getText().toString();
        txtKelime.setText(kelime+"N");
        kelime = txtKelime.getText().toString();
        //btnN.setEnabled(false);
    }
    public void btnO(View v){
        kelime = txtKelime.getText().toString();
        txtKelime.setText(kelime+"O");
        kelime = txtKelime.getText().toString();
        //btnO.setEnabled(false);
    }
    public void btnOx(View v){
        kelime = txtKelime.getText().toString();
        txtKelime.setText(kelime+"Ö");
        kelime = txtKelime.getText().toString();
        //btnOx.setEnabled(false);
    }
    public void btnP(View v){
        kelime = txtKelime.getText().toString();
        txtKelime.setText(kelime+"P");
        kelime = txtKelime.getText().toString();
        //btnP.setEnabled(false);
    }
    public void btnR(View v){
        kelime = txtKelime.getText().toString();
        txtKelime.setText(kelime+"R");
        kelime = txtKelime.getText().toString();
        //btnR.setEnabled(false);
    }
    public void btnS(View v){
        kelime = txtKelime.getText().toString();
        txtKelime.setText(kelime+"S");
        kelime = txtKelime.getText().toString();
        //btnS.setEnabled(false);
    }
    public void btnSx(View v){
        kelime = txtKelime.getText().toString();
        txtKelime.setText(kelime+"Ş");
        kelime = txtKelime.getText().toString();
        //btnSx.setEnabled(false);
    }
    public void btnT(View v){
        kelime = txtKelime.getText().toString();
        txtKelime.setText(kelime+"T");
        kelime = txtKelime.getText().toString();
        //btnT.setEnabled(false);
    }
    public void btnU(View v){
        kelime = txtKelime.getText().toString();
        txtKelime.setText(kelime+"U");
        kelime = txtKelime.getText().toString();
        //btnU.setEnabled(false);
    }
    public void btnUx(View v){
        kelime = txtKelime.getText().toString();
        txtKelime.setText(kelime+"Ü");
        kelime = txtKelime.getText().toString();
        //btnUx.setEnabled(false);
    }
    public void btnV(View v){
        kelime = txtKelime.getText().toString();
        txtKelime.setText(kelime+"V");
        kelime = txtKelime.getText().toString();
        //btnV.setEnabled(false);
    }
    public void btnY(View v){
        kelime = txtKelime.getText().toString();
        txtKelime.setText(kelime+"Y");
        kelime = txtKelime.getText().toString();
        //btnY.setEnabled(false);
    }
    public void btnZ(View v){
        kelime = txtKelime.getText().toString();
        txtKelime.setText(kelime+"Z");
        kelime = txtKelime.getText().toString();
        //btnZ.setEnabled(false);
    }

    public void btnGeriAl(View view){
        if(!txtKelime.getText().equals("")){
            int a = kelime.length();
            String c = kelime.substring(a-1,a);
            kelime = kelime.substring(0, kelime.length()-1);
            txtKelime.setText(kelime);
            /* if(c.equals("A")){
                kelime = kelime.substring(0,a-1);
                txtKelime.setText(kelime);
                btnA.setEnabled(true);
            }else if(c.equals("M")){
                kelime = kelime.substring(0,a-1);
                txtKelime.setText(kelime);
                btnM.setEnabled(true);
            } else if(c.equals("Ç")){
                kelime = kelime.substring(0,a-1);
                txtKelime.setText(kelime);
                btnCx.setEnabled(true);
            }  */
        }

    }
    public void btnGonder(View view){

        oyna();
    }
    public void btnAtla(View view){

        txtKelime.setText("");
        if(btnAtla.getText().equals("BİTİR")){
            Toast.makeText(getApplicationContext(),"TEBRİKLER OYUN BİTTİ", Toast.LENGTH_LONG).show();
        }
        if(seviye != 100){
            seviyeGetir();
        }


    }
    public void btnKaristir(View view){
        int i = 0;
        aChild = linearLayout.getChildCount();

        List<Button> buttons2 = new ArrayList<>();
        for(i=0; i<aChild; i++){
            int count = random.nextInt(aChild-i);
            buttons2.add(i, (Button) linearLayout.getChildAt(count));
            //buttons.add((Button) linearLayout.getChildAt(count));
            linearLayout.removeViewAt(count);
        }
        linearLayout.removeAllViews();
        for (int k = 0; k<aChild ; k++){
            linearLayout.addView(buttons2.get(k));
        }
    }

}
